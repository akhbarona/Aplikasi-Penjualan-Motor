

package code;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class cetak_struk extends javax.swing.JFrame {

    public cetak_struk() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tNo_Pesanan = new javax.swing.JTextField();
        tbCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        struk = new javax.swing.JTextArea();
        tbkembali = new javax.swing.JButton();
        tbPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PENCETAKAN STRUK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 50));

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("NO PESANAN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, -1));

        tNo_Pesanan.setBackground(new java.awt.Color(200, 214, 229));
        tNo_Pesanan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tNo_Pesanan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(tNo_Pesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 150, 40));

        tbCari.setBackground(new java.awt.Color(0, 0, 51));
        tbCari.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tbCari.setForeground(new java.awt.Color(255, 255, 255));
        tbCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Zoom.png"))); // NOI18N
        tbCari.setText("Cari");
        tbCari.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbCariActionPerformed(evt);
            }
        });
        getContentPane().add(tbCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 120, 40));

        struk.setColumns(20);
        struk.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        struk.setRows(5);
        jScrollPane1.setViewportView(struk);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 410, 380));

        tbkembali.setBackground(new java.awt.Color(0, 0, 51));
        tbkembali.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tbkembali.setForeground(new java.awt.Color(240, 240, 240));
        tbkembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/application-exit.png"))); // NOI18N
        tbkembali.setText("Kembali");
        tbkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbkembaliActionPerformed(evt);
            }
        });
        getContentPane().add(tbkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 190, 50));

        tbPrint.setBackground(new java.awt.Color(0, 0, 51));
        tbPrint.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tbPrint.setForeground(new java.awt.Color(240, 240, 240));
        tbPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Print.png"))); // NOI18N
        tbPrint.setText("Cetak Struk");
        tbPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbPrintActionPerformed(evt);
            }
        });
        getContentPane().add(tbPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 200, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCariActionPerformed
        if (tNo_Pesanan.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Harap masukkan nomor pesanan anda!");
            tNo_Pesanan.requestFocus();
        }else{
            try{
                String sql = "SELECT  * FROM tabel_pesan  WHERE "+ "no='" + tNo_Pesanan.getText() + "'";
                java.sql.Connection cn = (Connection)koneksi.koneksiDB.myDB();
                java.sql.Statement st = cn.createStatement();
                java.sql.ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {
                    struk.setText("                     PT. DEADLINE BERSAMA"+
                                  "\n      Jl. Ryacudu No.40, Lampung, Indonesia"+
                                  "\n                     Telp (082246606306)"+
                                  "\n======================================"+
                                  "\nNomor Pesanan\t= "+rs.getString("no")+
                                  "\nNama\t\t= " + rs.getString("first_name")+" "+ rs.getString("last_name") +
                                  "\nUsername\t\t= " + rs.getString("username_pembeli") +
                                  "\nKode Motor\t\t= " + rs.getString("kode_motor") +
                            "\nNama Motor\t\t= " + rs.getString("nama_motor") +
                            "\nWarna\t\t= " + rs.getString("warna_motor") +
                            "\nTahun\t\t= " + rs.getString("tahun") +
                            "\nHarga\t\t= "+"Rp." + rs.getString("harga_motor") +
                            "\nJumlah Unit\t\t= " + rs.getString("jumlah_dipesan") +
                            "\nTotal\t\t= "+"Rp." + rs.getString("total") +
                            "\nMetode Pembayaran\t= " + rs.getString("metode_pembayaran") +
                            "\nTotal Transfer\t\t= "+"Rp." + rs.getString("input_uang") +
                            "\nSisa\t\t= "+"Rp." + rs.getString("total_sisa") +
                            "\n======================================"+
                            "\n            Terimakasih Telah Membeli Motor Kami"
                          
                            );
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Nomor pesanan tidak ditemukan!");
                    tNo_Pesanan.requestFocus();
                    tNo_Pesanan.setText("");
                    struk.setText("");
                }
            }catch(SQLException e){
            }
        }
    }//GEN-LAST:event_tbCariActionPerformed

    private void tbkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbkembaliActionPerformed
        this.hide();
        mPesan back = new mPesan();
        back.setVisible(true);
    }//GEN-LAST:event_tbkembaliActionPerformed

    private void tbPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbPrintActionPerformed
        try{
            new cetak_struk().printComponents(null);
            struk.print();
            tNo_Pesanan.setText("");
            struk.setText("");
        }catch(PrinterException e){
            dispose();
        }
       
    }//GEN-LAST:event_tbPrintActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cetak_struk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea struk;
    private javax.swing.JTextField tNo_Pesanan;
    private javax.swing.JButton tbCari;
    private javax.swing.JButton tbPrint;
    private javax.swing.JButton tbkembali;
    // End of variables declaration//GEN-END:variables

}
