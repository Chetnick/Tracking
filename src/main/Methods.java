package main;

import static GUILook.SupportWindow.txtKontakt;
import static GUILook.SupportWindow.txtPitanje;
import static GUILook.Unos.stanjeDrop;
import static GUILook.Unos.txtAWB;
import static GUILook.Unos.txtInvoice;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFrame;
import static main.ConnSingleton.getInstance;
import static main.SupportWindowSingleton.getSWInstance;

public class Methods {

    public static ResultSet rs = null;

    //load data to JTable
    public static void updateTable() {

        try {
            Connection conn = getInstance();
            Statement statement = conn.createStatement();
            rs = statement.executeQuery("SELECT * FROM tracking");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problem sa bazom pokusajte ponovo!");
        }
    }

    //new database entry
    public static void newEntry() {
        int faktura = Integer.valueOf(txtInvoice.getText());
        int awb = Integer.valueOf(txtAWB.getText());

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd.MM.yyyy");

        try {
            Connection conn = getInstance();
            Statement statement = conn.createStatement();

            String sql = "insert into tracking (faktura, awb, time, date, stanje) "
                    + "values"
                    + "('" + faktura + "', '" + awb + "', '" + sdf1.format(cal.getTime()) + "', '" + sdf2.format(cal.getTime()) + "', '" + stanjeDrop.getSelectedItem() + "')";
            statement.execute(sql);

            txtInvoice.setText(null);
            txtAWB.setText(null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problem sa bazom pokušajte ponovo!");
        }
    }

    //support mail method
    public static void sendMail() {
        String pitanje = txtPitanje.getText();
        String kontakt = txtKontakt.getText();

        String poruka = "Pitanje:\n" + "-" + pitanje + "\n\n" + "Kontakt: " + kontakt;

        final String username = "trackingspprt@gmail.com";
        final String password = "itakademija";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("klijent"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("trackingspprt@gmail.com"));
            message.setSubject("Testing Subject");
            message.setText(poruka);

            Transport.send(message);

            //configuring JOptionPane to display on top
            JFrame f = new JFrame();
            f.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(f, "Poruka je uspešno poslata, uskoro ćemo Vas kontaktirati!");

            txtPitanje.setText(null);
            txtKontakt.setText(null);

            //closing the SupportWindow after JOptionPane closing
            getSWInstance().dispatchEvent(new WindowEvent(getSWInstance(), WindowEvent.WINDOW_CLOSING));

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

}
