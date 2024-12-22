/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class StudentRegistration extends javax.swing.JFrame {

    /**
     * Creates new form Student_Registration
     */
    public StudentRegistration() {
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

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtcourse = new javax.swing.JTextField();
        txtsemester = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtbranch = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 50, 39));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/isue.jpg"))); // NOI18N
        jLabel2.setText("Student Registration");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 420, 80));

        jLabel3.setText("Student Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 330, 50));

        jLabel4.setText("Course");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 330, 50));

        jLabel5.setText("Branch");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 330, 50));

        jLabel6.setText("Semester");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 640, 330, 50));

        jLabel7.setText("Student PRN");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 330, 50));

        txtname.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 340, 40));

        txtcourse.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        getContentPane().add(txtcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 340, 40));

        txtsemester.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        getContentPane().add(txtsemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 690, 340, 40));

        txtid.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 340, 40));

        txtbranch.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        getContentPane().add(txtbranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, 340, 40));

        btnsave.setBackground(new java.awt.Color(255, 51, 51));
        btnsave.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 690, 170, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/All Page Backgraound.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 1140, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        if (txtid.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out all the fields");
            txtid.requestFocus();
        }
        else if (txtname.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out all the fields");
            txtname.requestFocus();
        }
        else if (txtcourse.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out all the fields");
            txtcourse.requestFocus();
        }
        if (txtbranch.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out all the fields");
            txtbranch.requestFocus();
        }
        else if (txtsemester.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out all the fields");
            txtsemester.requestFocus();
        }
        else
        {
            Connection conn = Connect.ConnectToDB();
            try {
                PreparedStatement pst;
                pst = conn.prepareStatement("INSERT INTO `library_management_system`.`student`(id,name,course,branch,semester)values(?,?,?,?,?)");
                pst.setString(1, txtid.getText());
                pst.setString(2, txtname.getText());
                pst.setString(3, txtcourse.getText());
                pst.setString(4, txtbranch.getText());
                pst.setString(5, txtsemester.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record saved");
                txtid.setText("");
                txtname.setText("");
                txtcourse.setText("");
                txtbranch.setText("");
                txtsemester.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, ex);
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnsaveActionPerformed

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
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtbranch;
    private javax.swing.JTextField txtcourse;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsemester;
    // End of variables declaration//GEN-END:variables
}