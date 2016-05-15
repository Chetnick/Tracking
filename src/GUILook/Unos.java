package GUILook;

import main.CurrentTime;
import static main.Methods.newEntry;
import static main.Methods.rs;
import static main.Methods.updateTable;
import static main.SupportWindowSingleton.getSWInstance;
import net.proteanit.sql.DbUtils;

public class Unos extends javax.swing.JFrame {

    public Unos() {
        initComponents();
        setLocation(80, 50); //location of JFrame on the monitor        

        //initializing thread for current time; timeLabel
        CurrentTime ct = new CurrentTime();
        Thread t = new Thread(ct);
        t.setDaemon(true);
        t.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jlabelllll = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAWB = new javax.swing.JTextField();
        buttonUnos = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        stanjeDrop = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        txtInvoice = new javax.swing.JTextField();
        buttonSp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tracking application");
        setResizable(false);

        tabela.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabela.getTableHeader().setReorderingAllowed(false);
        updateTable();
        tabela.setModel(DbUtils.resultSetToTableModel(rs));
        jScrollPane1.setViewportView(tabela);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Invoice:");

        jlabelllll.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlabelllll.setText("AWB:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Stanje:");

        txtAWB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonUnos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonUnos.setText("Unesi");
        buttonUnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUnosActionPerformed(evt);
            }
        });

        timeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel.setText("current time");

        stanjeDrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<html></html>", "Najava", "Tranzit", "Carina", "Isporucena" }));

        txtInvoice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        buttonSp.setText("Podrška");
        buttonSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jlabelllll)
                                    .addComponent(jLabel2)))
                            .addComponent(buttonSp))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(stanjeDrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(buttonUnos)
                                            .addComponent(txtAWB))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonSp))
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelllll)
                    .addComponent(txtAWB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(stanjeDrop)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addComponent(buttonUnos)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void buttonUnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUnosActionPerformed
        newEntry(); //adding new data to the database

        //refreshing JTable with new data
        updateTable();
        tabela.setModel(DbUtils.resultSetToTableModel(rs));
    }//GEN-LAST:event_buttonUnosActionPerformed

    private void buttonSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSpActionPerformed
        getSWInstance();
    }//GEN-LAST:event_buttonSpActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Unos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSp;
    private javax.swing.JButton buttonUnos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlabelllll;
    public static javax.swing.JComboBox<String> stanjeDrop;
    public static javax.swing.JTable tabela;
    public static javax.swing.JLabel timeLabel;
    public static javax.swing.JTextField txtAWB;
    public static javax.swing.JTextField txtInvoice;
    // End of variables declaration//GEN-END:variables

}
