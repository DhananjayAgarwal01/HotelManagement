package ui;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author dhana
 */
public class forgotPassword extends javax.swing.JFrame {

    /**
     * Creates new form forgotPassword
     */
    public forgotPassword() {   
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        femail = new javax.swing.JTextField();
        fanswer = new javax.swing.JTextField();
        newPassword = new javax.swing.JTextField();
        fsave = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        fquestion = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Forgot Password?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1370, 80));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 20, 31, 32));

        jLabel2.setBackground(new java.awt.Color(102, 0, 0));
        jLabel2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Email");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 250, 38));

        jLabel3.setBackground(new java.awt.Color(102, 0, 0));
        jLabel3.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Security Question");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 250, 38));

        jLabel4.setBackground(new java.awt.Color(102, 0, 0));
        jLabel4.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Answer");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 250, 38));

        jLabel5.setBackground(new java.awt.Color(102, 0, 0));
        jLabel5.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("New Password");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 250, 38));

        femail.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        femail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(femail, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 430, 38));

        fanswer.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        fanswer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(fanswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 430, 38));

        newPassword.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        newPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(newPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 430, 38));

        fsave.setBackground(new java.awt.Color(102, 0, 0));
        fsave.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fsave.setForeground(new java.awt.Color(255, 255, 255));
        fsave.setText("Save");
        fsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fsaveActionPerformed(evt);
            }
        });
        getContentPane().add(fsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, 179, 33));

        jButton4.setBackground(new java.awt.Color(102, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Signup");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 530, 179, 33));

        jButton5.setBackground(new java.awt.Color(102, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Login");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 530, 179, 33));

        fquestion.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        fquestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is the name of your first pet?", "Which elementary school did you attend?", "Which is your favourite colour?", "What is name of the town where you were born?" }));
        fquestion.setName("jComboBox"); // NOI18N
        fquestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fquestionActionPerformed(evt);
            }
        });
        getContentPane().add(fquestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 430, 38));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/GuestVission.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, -40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fsaveActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==fsave){

            String email=femail.getText();
            String quest=(String)fquestion.getSelectedItem();
            String ans=fanswer.getText();
            String pass=newPassword.getText();
            String query = "update signup set password=? where email=? and security_question=? and answer=?";
try {
    ConnectionProvider c = new ConnectionProvider();
    
    // Prepare the update statement
    PreparedStatement ps = c.c.prepareStatement(query); 
    ps.setString(1, pass);  // Set new password
    ps.setString(2, email);        // Set email
    ps.setString(3, quest);        // Set security question
    ps.setString(4, ans);          // Set answer
    
    int rowsAffected = ps.executeUpdate();  // Execute the update
    
    if (rowsAffected > 0) {
        JOptionPane.showMessageDialog(null, "Password Updated Successfully!");
    } else {
        JOptionPane.showMessageDialog(null, "Data Not Found! Cannot change password.");
    }
    
} catch (Exception e) {
    e.printStackTrace();
}
        }
    }//GEN-LAST:event_fsaveActionPerformed

    private void fquestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fquestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fquestionActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        signup frame = new signup();
                frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
                frame.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        AdminLogin frame = new AdminLogin();
                frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
                frame.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Exit?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }   
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(forgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                forgotPassword frame = new forgotPassword();
                frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fanswer;
    private javax.swing.JTextField femail;
    private javax.swing.JComboBox<String> fquestion;
    private javax.swing.JButton fsave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField newPassword;
    // End of variables declaration//GEN-END:variables
}
