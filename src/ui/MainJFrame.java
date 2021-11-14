/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import db04.DB4OUtil;
import ui.admin.AdminJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Systems;
import model.customer.Customer;
import model.deliveryman.Deliveryman;
import model.manager.Manager;
import ui.admin.Customer.CustomerPane;
import ui.admin.deliveryman.DeliverymanPane;
import ui.manager.ManagerPane;

/**
 *
 * @author Siyuan He
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    private Systems sys;

    public MainJFrame() {
        initComponents();
        sys = dB4OUtil.retrieveSystem();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        viewPane = new javax.swing.JPanel();
        btnlogin = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        txtusername = new javax.swing.JTextField();
        pwdfield = new javax.swing.JPasswordField();
        creatPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnlogin.setText("jButton1");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        btnlogout.setText("jButton2");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewPaneLayout = new javax.swing.GroupLayout(viewPane);
        viewPane.setLayout(viewPaneLayout);
        viewPaneLayout.setHorizontalGroup(
            viewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPaneLayout.createSequentialGroup()
                .addGroup(viewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtusername))
                    .addGroup(viewPaneLayout.createSequentialGroup()
                        .addGroup(viewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnlogin)
                            .addComponent(btnlogout))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pwdfield, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        viewPaneLayout.setVerticalGroup(
            viewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(pwdfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlogin)
                .addGap(18, 18, 18)
                .addComponent(btnlogout)
                .addContainerGap(353, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(viewPane);

        javax.swing.GroupLayout creatPaneLayout = new javax.swing.GroupLayout(creatPane);
        creatPane.setLayout(creatPaneLayout);
        creatPaneLayout.setHorizontalGroup(
            creatPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );
        creatPaneLayout.setVerticalGroup(
            creatPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(creatPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        String userName = txtusername.getText();
        // Get Password
        char[] passwordCharArray = pwdfield.getPassword();
        String password = String.valueOf(passwordCharArray);
        boolean flag = false;

        if (userName.equals(sys.getAdmin().getUsername()) && password.equals(sys.getAdmin().getPassword())) {
            AdminJPanel adminJPanel = new AdminJPanel(sys);
            splitPane.setRightComponent(adminJPanel);
            flag = true;
        }
        Manager manager = null;
        for (Manager m : sys.getManagersDirectory().getManagersList()) {
            if (m.getUsername().equals(userName) && m.getPassword().equals(password)) {
                manager = m;
                ManagerPane managerPane = new ManagerPane(sys, manager);
                splitPane.setRightComponent(managerPane);
                flag = true;
                break;
            }
        }
        Customer customer = null;
        for (Customer m : sys.getCustomerDirectory().getCustomerList()) {
            if (m.getUsername().equals(userName) && m.getPassword().equals(password)) {
                customer = m;
                CustomerPane customerPane = new CustomerPane(sys, customer);
                splitPane.setRightComponent(customerPane);
                flag = true;
                break;
            }
        }

        Deliveryman deliveryman = null;
        for (Deliveryman m : sys.getDeliverymanDirectory().getDeliverymanList()) {
            if (m.getUsername().equals(userName) && m.getPassword().equals(password)) {
                deliveryman = m;
                DeliverymanPane deliverymanPane = new DeliverymanPane(sys, deliveryman);
                splitPane.setRightComponent(deliverymanPane);
                flag = true;
                break;
            }
        }

        if (flag == false) {
            JOptionPane.showMessageDialog(null, "Invalid User Name/ Password.");
            txtusername.setText("");
            pwdfield.setText("");
            return;
        }
        txtusername.setText("");
        pwdfield.setText("");
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        LogoutPane logoutPane = new LogoutPane();
        splitPane.setRightComponent(logoutPane);
        dB4OUtil.storeSystem(sys);
    }//GEN-LAST:event_btnlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnlogout;
    private javax.swing.JPanel creatPane;
    private javax.swing.JPasswordField pwdfield;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JTextField txtusername;
    private javax.swing.JPanel viewPane;
    // End of variables declaration//GEN-END:variables
}