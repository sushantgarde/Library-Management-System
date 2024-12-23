/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library_management_system;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author HP
 */
public class IssueBook extends javax.swing.JFrame {

    Connection conn = Connect.ConnectToDB();
    PreparedStatement pst;
    ResultSet rs;
    /**
     * Creates new form IssueBook
     */
    public IssueBook() {
        initComponents();
        SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
        Date d = new Date();
        txtissueddate.setText(sfd.format(d));
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
        jLabel7 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtstdid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtissueddate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtduedate = new javax.swing.JTextField();
        btnSEARCH = new javax.swing.JButton();
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, 50, 39));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/isue.jpg"))); // NOI18N
        jLabel2.setText("Issue Book ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 420, 80));

        jLabel7.setText("Book Id");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 330, 50));

        txtid.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 340, 40));

        jLabel3.setText("Student Id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 330, 50));

        txtstdid.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        getContentPane().add(txtstdid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 340, 40));

        jLabel4.setText("Book Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 330, 50));

        txtname.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 340, 40));

        jLabel5.setText("Issued Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 330, 50));

        txtissueddate.setEditable(false);
        txtissueddate.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        getContentPane().add(txtissueddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, 340, 40));

        jLabel6.setText("Due Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 640, 330, 50));

        txtduedate.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        getContentPane().add(txtduedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 690, 340, 40));

        btnSEARCH.setBackground(new java.awt.Color(255, 51, 51));
        btnSEARCH.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnSEARCH.setText("SEARCH");
        btnSEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSEARCHActionPerformed(evt);
            }
        });
        getContentPane().add(btnSEARCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 170, 50));

        btnsave.setBackground(new java.awt.Color(255, 51, 51));
        btnsave.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnsave.setText("Issue");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 660, 170, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/All Page Backgraound.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1140, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSEARCHActionPerformed
        // TODO add your handling code here:
        if(txtid.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter the id and search it is available or not");
            txtid.requestFocus();
        }
        else
        {
            try {
                pst = conn.prepareStatement("SELECT * FROM BOOK WHERE ID=?");
                pst.setString(1, txtid.getText());
                rs = pst.executeQuery();
                if(rs.next()){
                    txtname.setText(rs.getString(2));
                }
            } catch (SQLException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        
    }//GEN-LAST:event_btnSEARCHActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        if (txtid.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out all the fields");
            txtid.requestFocus();
        }
        else if (txtstdid.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out all the fields");
            txtstdid.requestFocus();
        }
        else if (txtname.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out all the fields");
            txtname.requestFocus();
        }
        if (txtissueddate.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out all the fields");
            txtissueddate.requestFocus();
        }
        else if (txtduedate.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out all the fields");
            txtduedate.requestFocus();
        }
        else
        {
            try {
                pst = conn.prepareStatement("UPDATE BOOK SET STATUS=?,ISSUE_DATE=?,DUE_DATE=?,STUDENT_ID=?");
                pst.setString(1, "Issued");
                pst.setString(2, txtissueddate.getText());
                pst.setString(3, txtduedate.getText());
                pst.setString(4, txtstdid.getText());
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Book Issued");
                txtduedate.setText("");
                txtid.setText("");
                txtissueddate.setText("");
                txtname.setText("");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSEARCH;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtduedate;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtissueddate;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtstdid;
    // End of variables declaration//GEN-END:variables
}
