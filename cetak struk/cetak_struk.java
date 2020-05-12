

package penjualanmotor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class cetak_struk extends javax.swing.JFrame {

    public Statement st;
    public ResultSet rs;
    Connection cn = koneksi.koneksiDB.getKoneksi();
    
    public cetak_struk() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        notrans = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        struk = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("STRUK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel1)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nomor Transaksi");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        notrans.setBackground(new java.awt.Color(240, 240, 240));
        notrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notransActionPerformed(evt);
            }
        });
        getContentPane().add(notrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 150, 20));

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjualanmotor/Zoom.png"))); // NOI18N
        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 120, 20));

        struk.setColumns(20);
        struk.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        struk.setRows(5);
        jScrollPane1.setViewportView(struk);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 410, 380));

        jButton2.setBackground(new java.awt.Color(0, 0, 51));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjualanmotor/application-exit.png"))); // NOI18N
        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 190, 50));

        jButton3.setBackground(new java.awt.Color(0, 0, 51));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(240, 240, 240));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjualanmotor/Print.png"))); // NOI18N
        jButton3.setText("Cetak Struk");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 200, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (notrans.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Harap Masukkan Nomor Transaksi anda!");
            notrans.requestFocus();
        }else{
            try{
                st = cn.createStatement();
                rs = st.executeQuery("select*from transaksi where "+ "id='" + notrans.getText() + "'");
                if (rs.next()) {
                    struk.setText("                              Jual Motor Murah"+
                                  "\n           jl.ryacudu no40,bandar lampung,lampung,Indonesia"+
                                  "\n                           Telp(0812678004985)"+
                                  "\n======================================"+
                                  "\nNomor Transaksi\t= " + rs.getString("id") +
                                  "\nKode Motor\t\t= " + rs.getString("kode_motor") +
                                  "\nNama Motor\t\t= " + rs.getString("nama_motor") +
                            "\nMesin Motor\t\t= " + rs.getString("merk") +
                            "\nWarna Motor\t\t= " + rs.getString("warna") +
                            "\nHarga Motor\t\t= " +"Rp."+ rs.getString("harga") +
                            "\nJumlah Beli\t\t= " + rs.getString("jumlahbeli") +
                            "\nHarga Total\t\t= " + "Rp."+rs.getString("hargatotal") +
                            "\nPembeli\t\t= " + rs.getString("nama") +
                            "\nMembayar\t\t= " + "Rp."+rs.getString("inputuang") +
                            "\nKembalian\t\t= " +"Rp."+ rs.getString("kembalian")+
                            "\nTanggal\t\t= " + rs.getString("tanggal")+
                            "\nWaktu\t\t= " + rs.getString("waktu")+
                            "\n======================================"+
                            "\n            Terimakasih Telah Membeli Motor Kami"
                          
                            );
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Nomor transaksi tidak ditemukan!");
                    notrans.requestFocus();
                    notrans.setText("");
                    struk.setText("");
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new transaksi_motor().show();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            new cetak_struk().printComponents(null);
            struk.print();
            notrans.setText("");
            struk.setText("");
        }catch(Exception e){
            dispose();
        }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void notransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notransActionPerformed

    }//GEN-LAST:event_notransActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cetak_struk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField notrans;
    private javax.swing.JTextArea struk;
    // End of variables declaration//GEN-END:variables

}
