/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Systems;
import model.manager.Manager;
import model.restaurants.Restaurant;

/**
 *
 * @author Siyuan He
 */
public class AdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form adminPane
     */
    private Systems sys;
    private String name;

    public AdminJPanel(Systems sys) {
        initComponents();
        this.sys = sys;
        addRole();
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
        createPane = new javax.swing.JPanel();
        btnM = new javax.swing.JButton();
        cmbRole = new javax.swing.JComboBox<>();
        lblRes = new javax.swing.JLabel();
        viewPane = new javax.swing.JPanel();

        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        createPane.setBackground(new java.awt.Color(47, 64, 86));

        btnM.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnM.setText("OK!");
        btnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMActionPerformed(evt);
            }
        });

        cmbRole.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N

        lblRes.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        lblRes.setForeground(new java.awt.Color(240, 240, 240));
        lblRes.setText("Dashboard of Administrator");

        javax.swing.GroupLayout createPaneLayout = new javax.swing.GroupLayout(createPane);
        createPane.setLayout(createPaneLayout);
        createPaneLayout.setHorizontalGroup(
            createPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRes)
                    .addGroup(createPaneLayout.createSequentialGroup()
                        .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnM, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(469, Short.MAX_VALUE))
        );
        createPaneLayout.setVerticalGroup(
            createPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnM))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        splitPane.setTopComponent(createPane);

        viewPane.setBackground(new java.awt.Color(210, 210, 210));

        javax.swing.GroupLayout viewPaneLayout = new javax.swing.GroupLayout(viewPane);
        viewPane.setLayout(viewPaneLayout);
        viewPaneLayout.setHorizontalGroup(
            viewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        viewPaneLayout.setVerticalGroup(
            viewPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(viewPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMActionPerformed
        // TODO add your handling code here:
        name = (String) cmbRole.getSelectedItem();

        if (name.equals("Manage Managers")) {
            AdminManJPanel adminManJPanel = new AdminManJPanel(sys);
            splitPane.setRightComponent(adminManJPanel);
        } else if (name.equals("Manage Customers")) {
            AdminCusPane adminCusPane = new AdminCusPane(sys);
            splitPane.setRightComponent(adminCusPane);
        } else if (name.equals("Manage Deliverymen")) {
            AdminDelPane adminDelJPanel = new AdminDelPane(sys);
            splitPane.setRightComponent(adminDelJPanel);
        }
    }//GEN-LAST:event_btnMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnM;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JPanel createPane;
    private javax.swing.JLabel lblRes;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel viewPane;
    // End of variables declaration//GEN-END:variables

    private void addRole() {
        cmbRole.addItem("Manage Managers");
        cmbRole.addItem("Manage Customers");
        cmbRole.addItem("Manage Deliverymen");
    }
}
