/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Systems;
import model.deliveryman.Deliveryman;
import model.manager.Manager;

/**
 *
 * @author Siyuan He
 */
public class AdminDelPane extends javax.swing.JPanel {

    /**
     * Creates new form AdminDelPane
     */
    private Systems sys;
    private Deliveryman findManager;
    private static int count = 1;
    private int id;

    public AdminDelPane(Systems sys) {
        initComponents();
        this.sys = sys;
        populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        txtupun = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtuppwd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSearchId = new javax.swing.JTextField();
        btnCrem = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtDelm = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnDelm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCremn = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManagers = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCremu = new javax.swing.JTextField();
        txtudname = new javax.swing.JTextField();
        txtCremp = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        jLabel15.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Update Deliveryman");

        jLabel11.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel11.setText("Username:");

        jLabel5.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel5.setText("Id you want to delete:");

        txtSearchId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchIdActionPerformed(evt);
            }
        });

        btnCrem.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnCrem.setText("Save");
        btnCrem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCremActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel13.setText("Create Deliveryman");

        btnDelm.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnDelm.setText("Delete");
        btnDelm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelmActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel1.setText("Name:");

        jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel3.setText("Password:");

        tblManagers.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        tblManagers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "ID", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(tblManagers);

        jLabel6.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel6.setText("Id you want to search:");

        jLabel7.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel7.setText("Name:");

        jLabel8.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel8.setText("Username:");

        jLabel10.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel10.setText("Password:");

        jLabel12.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Search Deliveryman");

        jLabel14.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel14.setText("Delete Deliveryman");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel14))
                            .addComponent(btnDelm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtDelm))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(94, 94, 94)
                                .addComponent(txtCremp))
                            .addComponent(btnCrem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCremu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCremn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtupun, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtudname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtuppwd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(btnSearch)
                            .addGap(146, 146, 146))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(54, 54, 54)
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtudname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtupun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addGap(17, 17, 17)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtuppwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnUpdate)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtCremn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(txtCremu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtCremp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCrem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDelm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addComponent(btnDelm)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCremActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCremActionPerformed
        // TODO add your handling code here:
        if (txtCremn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Name!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtCremn.setText("");
            return;
        }

        if (txtCremu.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Username!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtCremu.setText("");
            return;
        }

        if (txtCremp.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Password!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtCremp.setText("");
            return;
        }

        Deliveryman deliveryman = new Deliveryman(txtCremu.getText(), txtCremp.getText(), txtCremn.getText());

        boolean addManager = sys.getDeliverymanDirectory().addDeliveryman(deliveryman);

        if (addManager == false) {
            JOptionPane.showMessageDialog(this, "Please input correct Username!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtCremu.setText("");
            txtCremp.setText("");
            return;
        } else {
            id = count;
            count++;
            deliveryman.setId(id);
        }

        JOptionPane.showMessageDialog(this, "New Deliveryman Added.");

        txtCremn.setText("");
        txtCremu.setText("");
        txtCremp.setText("");
        populate();
    }//GEN-LAST:event_btnCremActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (txtSearchId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Id!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtSearchId.setText("");
            return;
        } else if (!txtSearchId.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Please input Correct Id!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtSearchId.setText("");
            return;
        }

        findManager = sys.getDeliverymanDirectory().findManager(Integer.parseInt(txtSearchId.getText()));

        if (findManager == null) {
            JOptionPane.showMessageDialog(this, "No Manager is Found!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtSearchId.setText("");
            txtudname.setText("");
            txtupun.setText("");
            txtuppwd.setText("");
            return;
        }

        txtudname.setText(findManager.getName());
        txtupun.setText(findManager.getUsername());
        txtuppwd.setText(findManager.getPassword());
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (txtudname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Name!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtudname.setText("");
            return;
        }

        if (txtupun.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Username!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtupun.setText("");
            return;
        }

        if (txtuppwd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Password!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtuppwd.setText("");
            return;
        }

        if (sys.getDeliverymanDirectory().isExist(txtupun.getText())) {
            JOptionPane.showMessageDialog(this, "Please input correct Username!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtupun.setText("");
            return;
        }

        findManager.setName(txtudname.getText());
        findManager.setUsername(txtupun.getText());
        findManager.setPassword(txtuppwd.getText());

        JOptionPane.showMessageDialog(this, "Update Successful.");
        populate();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDelmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelmActionPerformed
        // TODO add your handling code here:
        if (txtDelm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Id!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtDelm.setText("");
            return;
        } else if (!txtDelm.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Please input Correct Id!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtDelm.setText("");
            return;
        }

        boolean find = sys.getDeliverymanDirectory().deleteDeliveryman(Integer.parseInt(txtDelm.getText()));

        if (!find) {
            JOptionPane.showMessageDialog(this, "No Deliveryman is Found!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtDelm.setText("");
            return;
        }

        JOptionPane.showMessageDialog(this, "Delete Successful");
        txtDelm.setText("");
        populate();
    }//GEN-LAST:event_btnDelmActionPerformed

    private void txtSearchIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrem;
    private javax.swing.JButton btnDelm;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManagers;
    private javax.swing.JTextField txtCremn;
    private javax.swing.JTextField txtCremp;
    private javax.swing.JTextField txtCremu;
    private javax.swing.JTextField txtDelm;
    private javax.swing.JTextField txtSearchId;
    private javax.swing.JTextField txtudname;
    private javax.swing.JTextField txtuppwd;
    private javax.swing.JTextField txtupun;
    // End of variables declaration//GEN-END:variables

    private void populate() {
        DefaultTableModel model = (DefaultTableModel) tblManagers.getModel();
        model.setRowCount(0);
        for (Deliveryman m : sys.getDeliverymanDirectory().getDeliverymanList()) {
            Object[] row = new Object[5];
            row[0] = m.getName();
            row[1] = m.getId();
            row[2] = m.getUsername();
            row[3] = m.getPassword();
            model.addRow(row);
        }
    }
}
