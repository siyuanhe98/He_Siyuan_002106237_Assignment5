/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.admin;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Systems;
import model.manager.Manager;
import model.restaurants.Restaurant;

/**
 *
 * @author Siyuan He
 */
public class AdminManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminManJPanel
     */
    private Systems sys;
    private Manager findManager;

    public AdminManJPanel(Systems sys) {
        initComponents();
        this.sys = sys;
        populateManagers();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCremu = new javax.swing.JTextField();
        txtCremp = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCrem = new javax.swing.JButton();
        txtCremr = new javax.swing.JTextField();
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtudname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtupun = new javax.swing.JTextField();
        txtupres = new javax.swing.JTextField();
        txtuppwd = new javax.swing.JTextField();
        txtSearchId = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        jLabel14.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel14.setText("Delete Manager");

        jLabel11.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel11.setText("Username:");

        jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel4.setText("Restaurant:");

        jLabel5.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel5.setText("Id you want to delete:");

        btnCrem.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnCrem.setText("Save");
        btnCrem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCremActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel13.setText("Create Manager");

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

        tblManagers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "ID", "Restaurant", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(tblManagers);

        jLabel6.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel6.setText("Id you want to search:");

        jLabel7.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel7.setText("Name:");

        jLabel8.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel8.setText("Username:");

        jLabel9.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel9.setText("Restaurant:");

        jLabel10.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel10.setText("Password:");

        jLabel12.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Search Person");

        jLabel15.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Update Person");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel14))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnDelm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDelm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrem, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addComponent(jLabel13)
                                    .addGap(17, 17, 17))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel1))
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGap(18, 18, 18))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(14, 14, 14)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCremr)
                                        .addComponent(txtCremp, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCremu, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCremn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtupun, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtudname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtuppwd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtupres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)
                        .addGap(26, 26, 26)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtupres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDelm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(28, 28, 28)
                                .addComponent(btnDelm)
                                .addGap(75, 75, 75))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCremn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCremu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCremp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCremr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCrem)
                                .addGap(67, 67, 67))))))
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

        Restaurant res = null;
        if (txtCremr.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Restaurant!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtCremr.setText("");
            return;
        } else {
            for (Restaurant r : sys.getRestaurantDirectory().getRestaurantList()) {
                if (txtCremr.getText().equalsIgnoreCase(r.getName())) {
                    res = r;
                }
            }
            if (res == null) {
                JOptionPane.showMessageDialog(this, "Please input correct Restaurant!", "Warning", JOptionPane.ERROR_MESSAGE);
                txtCremr.setText("");
                return;
            }
        }

        Manager manager = new Manager();
        System.out.println(manager.getId());

        manager.setName(txtCremn.getText());
        manager.setUsername(txtCremu.getText());
        manager.setPassword(txtCremp.getText());

        manager.setRestaurant(res);
        boolean addManager = sys.getManagersDirectory().addManager(manager);
        System.out.println(addManager);
        if (addManager == false) {
            JOptionPane.showMessageDialog(this, "Please input correct Username!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtCremu.setText("");
            return;
        }
        JOptionPane.showMessageDialog(this, "New Manager Added.");

        txtCremn.setText("");
        txtCremu.setText("");
        txtCremp.setText("");
        txtCremr.setText("");
        System.out.println(sys.getManagersDirectory().toString());
        populateManagers();

    }//GEN-LAST:event_btnCremActionPerformed

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

        boolean find = sys.getManagersDirectory().deleteManager(Integer.parseInt(txtDelm.getText()));
        if (!find) {
            JOptionPane.showMessageDialog(this, "No Manager is Found!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtDelm.setText("");
            return;
        }
        txtDelm.setText("");
        JOptionPane.showMessageDialog(this, "Delete Successful");
        System.out.println(sys.getManagersDirectory().toString());
        populateManagers();
    }//GEN-LAST:event_btnDelmActionPerformed

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
        findManager = sys.getManagersDirectory().findManager(Integer.parseInt(txtSearchId.getText()));
        if (findManager == null) {
            JOptionPane.showMessageDialog(this, "No Manager is Found!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtSearchId.setText("");
            txtudname.setText("");
            txtupun.setText("");
            txtupres.setText("");
            txtuppwd.setText("");
            return;
        }

        System.out.println(findManager);

        txtudname.setText(findManager.getName());
        txtupun.setText(findManager.getUsername());
        txtupres.setText(findManager.getRestaurant().getName());
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

        Restaurant res = null;
        if (txtupres.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Restaurant!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtupres.setText("");
            return;
        } else {
            for (Restaurant r : sys.getRestaurantDirectory().getRestaurantList()) {
                if (txtupres.getText().equalsIgnoreCase(r.getName())) {
                    res = r;
                }
            }
            if (res == null) {
                JOptionPane.showMessageDialog(this, "Please input correct Restaurant!", "Warning", JOptionPane.ERROR_MESSAGE);
                txtupres.setText("");
                return;
            }
        }

        if (txtuppwd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Password!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtuppwd.setText("");
            return;
        }

        if (sys.getManagersDirectory().isExist(txtupun.getText())) {
            JOptionPane.showMessageDialog(this, "Please input correct Username!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtupun.setText("");
            return;
        }
        findManager.setName(txtudname.getText());
        findManager.setUsername(txtupun.getText());
        findManager.setPassword(txtuppwd.getText());
        findManager.setRestaurant(res);
        JOptionPane.showMessageDialog(this, "Update Successful.");
        populateManagers();

    }//GEN-LAST:event_btnUpdateActionPerformed


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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManagers;
    private javax.swing.JTextField txtCremn;
    private javax.swing.JTextField txtCremp;
    private javax.swing.JTextField txtCremr;
    private javax.swing.JTextField txtCremu;
    private javax.swing.JTextField txtDelm;
    private javax.swing.JTextField txtSearchId;
    private javax.swing.JTextField txtudname;
    private javax.swing.JTextField txtuppwd;
    private javax.swing.JTextField txtupres;
    private javax.swing.JTextField txtupun;
    // End of variables declaration//GEN-END:variables

    private void populateManagers() {
        DefaultTableModel model = (DefaultTableModel) tblManagers.getModel();
        model.setRowCount(0);
        for (Manager m : sys.getManagersDirectory().getManagersList()) {

            Object[] row = new Object[5];
            row[0] = m.getName();
            row[1] = m.getId();
            row[2] = m.getRestaurant().getName();
            row[3] = m.getUsername();
            row[4] = m.getPassword();
            model.addRow(row);
        }
    }
}
