/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class mLogin extends javax.swing.JFrame {

    /**
     * Creates new form mLogin
     */
    public mLogin() {
        initComponents();
//        jPanel3.setFocusable(true);
//        this.setLocation(null);
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        LPegawai = new javax.swing.JRadioButton();
        LPembeli = new javax.swing.JRadioButton();
        tbSignUP = new javax.swing.JButton();
        tbLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(735, 500));
        setMinimumSize(new java.awt.Dimension(735, 500));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setMaximumSize(new java.awt.Dimension(735, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(735, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(735, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsername.setBackground(new java.awt.Color(75, 75, 75));
        txtUsername.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsername.setText("USERNAME");
        txtUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 280, 50));

        txtPassword.setBackground(new java.awt.Color(75, 75, 75));
        txtPassword.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setText("PASSWORD");
        txtPassword.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 280, 50));

        buttonGroup1.add(LPegawai);
        LPegawai.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        LPegawai.setText("Pegawai");
        jPanel1.add(LPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 311, -1, 50));

        buttonGroup1.add(LPembeli);
        LPembeli.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        LPembeli.setText("Pembeli");
        jPanel1.add(LPembeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 311, -1, 50));

        tbSignUP.setBackground(new java.awt.Color(51, 153, 0));
        tbSignUP.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        tbSignUP.setText("SIGN UP");
        tbSignUP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tbSignUP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbSignUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSignUPActionPerformed(evt);
            }
        });
        jPanel1.add(tbSignUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 220, 60));

        tbLogin.setBackground(new java.awt.Color(51, 153, 0));
        tbLogin.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        tbLogin.setText("LOGIN");
        tbLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tbLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbLoginActionPerformed(evt);
            }
        });
        jPanel1.add(tbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 220, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/transparent-black-png-3.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(600, 340));
        jLabel2.setMinimumSize(new java.awt.Dimension(600, 340));
        jLabel2.setPreferredSize(new java.awt.Dimension(600, 340));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 600, 340));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN FORM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/gLatarBelakang.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        // TODO add your handling code here:
        if(txtUsername.getText().equals("")){
            txtUsername.setText("USERNAME");
        }
        txtUsername.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        // TODO add your handling code here:
        if(txtUsername.getText().equals("USERNAME")){
            txtUsername.setText("");
        }
        txtUsername.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
        if(String.valueOf(txtPassword.getPassword()).trim().equals("PASSWORD")){
            txtPassword.setText("");
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        // TODO add your handling code here:
        if(String.valueOf(txtPassword.getPassword()).trim().equals("")){
            txtPassword.setText("PASSWORD");
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void tbSignUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSignUPActionPerformed
        // TODO add your handling code here:
        this.hide();
        regMenu daftar = new regMenu();
        daftar.setVisible(true);
    }//GEN-LAST:event_tbSignUPActionPerformed

    private void tbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbLoginActionPerformed
        
        // TODO add your handling code here:
        if(txtUsername.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Username tidak boleh kosong");
            txtUsername.requestFocus();
        }else if(txtPassword.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Password tidak boleh kosong");
        }else if(LPegawai.isSelected()){
            try{
                String sql ="SELECT * FROM pegawai WHERE "+"username_pegawai='"+txtUsername.getText()+"'";
                java.sql.Connection conn = (Connection)koneksi.koneksiDB.myDB();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet res = stm.executeQuery(sql);
                if(res.next()){
                    if(txtPassword.getText().equals(res.getString("password_pegawai"))){
                        JOptionPane.showMessageDialog(rootPane, "Telah Berhasil Login!");
                        new mLoginPegawai().show();
                        //Menu Admin new menu_pegawai().show();
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Password salah!");
                        txtPassword.setText("");
                        txtPassword.requestFocus();
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Username Salah!");
                    txtUsername.setText("");
                    txtUsername.requestFocus();
                }
            }catch(SQLException ex){
                System.out.println("Kesalahan"+ex.getMessage());
            }
        }else if(LPembeli.isSelected()){
            try{
                String sql ="SELECT * FROM pembeli WHERE "+"username_pembeli='"+txtUsername.getText()+"'";
                java.sql.Connection conn = (Connection)koneksi.koneksiDB.myDB();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet res = stm.executeQuery(sql);
                if(res.next()){
                    if(txtPassword.getText().equals(res.getString("password_pembeli"))){
                        JOptionPane.showMessageDialog(rootPane, "Telah Berhasil Login!");
                        new mLoginPembeli().show();
                        //Menu Pengunjung new menu_pembeli().show();
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Password salah!");
                        txtPassword.setText("");
                        txtPassword.requestFocus();
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Username Salah!");
                    txtUsername.setText("");
                    txtUsername.requestFocus();
                }
            }catch(SQLException ex){
                System.out.println("Kesalahan"+ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Pilih salah satu!");
        }
    }//GEN-LAST:event_tbLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton LPegawai;
    private javax.swing.JRadioButton LPembeli;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton tbLogin;
    private javax.swing.JButton tbSignUP;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
