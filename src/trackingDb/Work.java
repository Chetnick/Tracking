package trackingDb;
import java.awt.HeadlessException;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

public class Work extends JFrame{
 JLabel JL_trackingNumber,JL_vreme,JL_datum,JL_id;
 JTextField JT_tarckingNumber,JT_vreme,JT_datum,JT_id;
 JButton btn_insert,btn_update,btn_delete;
 @SuppressWarnings("OverridableMethodCallInConstructor")
 public Work(){
     super("Tracking");
     JL_id = new JLabel("ProformInvoice");
     JL_trackingNumber = new JLabel("Awb:");
     JL_vreme = new JLabel("Time:");
     JL_datum = new JLabel("Date:");
     JL_id.setBounds(20, 20, 100, 20);
     JL_trackingNumber.setBounds(20, 50, 100, 20);
     JL_vreme.setBounds(20, 80, 100, 20);
     JL_datum.setBounds(20, 110, 100, 20);
     
     JT_id = new JTextField(20);
     JT_tarckingNumber = new JTextField(20);
     JT_vreme = new JTextField(20);
     JT_datum = new JTextField(20);
     JT_id.setBounds(130,20,150,20);
     JT_tarckingNumber.setBounds(130, 50, 150, 20);
     JT_vreme.setBounds(130, 80, 150, 20);
     JT_datum.setBounds(130, 110, 150, 20);
     btn_insert = new JButton("Insert");
     btn_update = new JButton("Update");
     btn_delete = new JButton("Delete");
     btn_insert.setBounds(300, 50, 80, 20);
     btn_update.setBounds(300, 80, 80, 20);
     btn_delete.setBounds(300, 110, 80, 20);
     
     
     setLayout(null);
     add(JL_id);
     add(JL_trackingNumber);
     add(JL_vreme);
     add(JL_datum);
     add(JT_id);
     add(JT_tarckingNumber);
     add(JT_vreme);
     add(JT_datum);
     add(btn_insert);
     add(btn_update);
     add(btn_delete);
     
     
   //button insert
    btn_insert.addActionListener((ActionEvent e) -> {
        try{
            theQuery("insert into tracking (tracking_id,) values('"+JT_tarckingNumber.getText()+"')");
        }
        catch(Exception ex){}
     });
    
        //button update
        btn_update.addActionListener((ActionEvent e) -> {
            try{
                
                theQuery("update tracking set tracking_id = '"+JT_tarckingNumber.getText()+"',tracking_time = '"+JT_vreme.getText()+"', tarcking_date = "+JT_datum.getText()+" where tracking_id = "+JT_id.getText());
            }
            catch(Exception ex){}
     });
       
         //button delete
        btn_delete.addActionListener((ActionEvent e) -> {
            try{
                
                theQuery("delete from tracking where id = "+JT_id.getText());
            }
            catch(Exception ex){}
     });
     
     
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setVisible(true);
     setLocationRelativeTo(null);
     setSize(500,200);
    
 }
 
 //function to execute the insert update delete query
  public void theQuery(String query){
      Connection con = null;
      Statement st = null;
      try{
          con = DriverManager.getConnection("jdbc:mysql://quince.no-ip.org/tracking","aca","qZq3TFVg");
          st = con.createStatement();
          st.executeUpdate(query);
          JOptionPane.showMessageDialog(null,"Query Executed");
      }catch(SQLException | HeadlessException ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
      }
  }
 
 
     public static void main(String[] args){
     
     Work work = new  Work();
     }
}

