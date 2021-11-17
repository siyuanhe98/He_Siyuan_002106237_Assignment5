/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Systems;
import model.customer.Customer;
import model.deliveryman.Deliveryman;
import model.manager.Manager;
import model.orders.Order;

/**
 *
 * @author Siyuan He
 */
public class ManagerPane extends javax.swing.JPanel {

    /**
     * Creates new form ManagerPane
     */
    private Systems sys;
    private Manager manager;
    private ArrayList<Order> orders;
    private Order order = null;
    private Order order1 = null;

    public ManagerPane(Systems sys, Manager manager) {
        initComponents();
        this.sys = sys;
        this.manager = manager;
        populateMenu();
        lblRes.setText("Manager-- " + manager.getName() + " in charge of Restaurant-- " + manager.getRestaurant().getName());
        if (orders == null) {
            orders = new ArrayList<Order>();
        }
        getOrders();
        populateOrders();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        txtSaveDish = new javax.swing.JTextField();
        btnSaveDish = new javax.swing.JButton();
        txtDelDish = new javax.swing.JTextField();
        btnDelDish = new javax.swing.JButton();
        lblRes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        btnAccept = new javax.swing.JButton();
        btnNot = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        txtDel = new javax.swing.JTextField();
        btnDel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnFind1 = new javax.swing.JButton();

        tblMenu.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Dishes"
            }
        ));
        jScrollPane1.setViewportView(tblMenu);

        btnSaveDish.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnSaveDish.setText("Save");
        btnSaveDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDishActionPerformed(evt);
            }
        });

        btnDelDish.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnDelDish.setText("Delete");
        btnDelDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelDishActionPerformed(evt);
            }
        });

        lblRes.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        lblRes.setText("jLabel1");

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Customer", "Status", "Deliveryman", "Dish", "Tracking", "Comment"
            }
        ));
        jScrollPane2.setViewportView(tblOrder);

        btnAccept.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnAccept.setText("Accept!");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnNot.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnNot.setText("Not Accept!");
        btnNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotActionPerformed(evt);
            }
        });

        btnFind.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnFind.setText("OK");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnDel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnDel.setText("OK");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel1.setText("Add dish:");

        jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel2.setText("Delete dish:");

        jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel3.setText("Change Status with Id:");

        jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel4.setText("Choose Order with Id:");

        jLabel5.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel5.setText("Choose Deliveryman with Id:");

        btnFind1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnFind1.setText("OK");
        btnFind1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFind1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSaveDish, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSaveDish, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnDelDish, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDelDish, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(21, 21, 21)
                                .addComponent(txtId1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFind1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtDel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFind)
                                .addGap(18, 18, 18)
                                .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(lblRes)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRes)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSaveDish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDelDish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind)
                    .addComponent(btnAccept)
                    .addComponent(btnNot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(btnFind1)
                        .addComponent(btnDelDish)
                        .addComponent(btnSaveDish))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDel)))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAccept, btnFind, btnNot, jLabel3, txtId});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDel, jLabel4, txtDel, txtId1});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelDish, btnSaveDish, txtDelDish, txtSaveDish});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDishActionPerformed
        // TODO add your handling code here:
        if (txtSaveDish.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input correct Dish!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtSaveDish.setText("");
            return;
        }

        boolean addDish = manager.addDish(txtSaveDish.getText());

        if (!addDish) {
            JOptionPane.showMessageDialog(this, "Please input correct Dish!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtSaveDish.setText("");
            return;
        }

        JOptionPane.showMessageDialog(this, "Save Successful!");

        txtSaveDish.setText("");
        populateMenu();
    }//GEN-LAST:event_btnSaveDishActionPerformed

    private void btnDelDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelDishActionPerformed
        // TODO add your handling code here:
        boolean deleteDish = manager.deleteDish(txtDelDish.getText());

        if (!deleteDish) {
            JOptionPane.showMessageDialog(this, "Delete Failed!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtDelDish.setText("");
            return;
        }

        JOptionPane.showMessageDialog(this, "Delete Successful!");

        txtDelDish.setText("");
        populateMenu();
    }//GEN-LAST:event_btnDelDishActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        if (!txtId.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Please input the correct id!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtId.setText("");
            return;
        }

        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input the correct id!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtId.setText("");
            return;
        }

        int id = Integer.parseInt(txtId.getText());

        for (Order s : orders) {
            if (id == s.getId()) {
                order = s;
                break;
            }
        }

        if (order == null) {
            JOptionPane.showMessageDialog(this, "Order not Found!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtId.setText("");
            return;
        }

        JOptionPane.showMessageDialog(this, "Please select the status!");
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        order.setStatus(true);
        populateOrders();
        txtId.setText("");
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotActionPerformed
        // TODO add your handling code here:
        order.setStatus(false);
        populateOrders();
        txtId.setText("");
    }//GEN-LAST:event_btnNotActionPerformed
    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
        Deliveryman del = null;

        if (!txtDel.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Please input the correct id!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtDel.setText("");
            return;
        }

        int idD = Integer.parseInt(txtDel.getText());

        for (Deliveryman d : sys.getDeliverymanDirectory().getDeliverymanList()) {
            if (idD == d.getId()) {
                del = d;
                break;
            }
        }

        if (del == null) {
            JOptionPane.showMessageDialog(this, "Deliveryman not Found!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtDel.setText("");
            return;
        }

        order1.setDeliveryman(del);
        populateOrders();
        txtId1.setText("");
        txtDel.setText("");
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnFind1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFind1ActionPerformed
        // TODO add your handling code here:
        if (!txtId1.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Please input the correct id!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtId1.setText("");
            return;
        }

        int id = Integer.parseInt(txtId1.getText());

        for (Order s : orders) {
            if (id == s.getId()) {
                order1 = s;
                break;
            }
        }

        if (order1 == null) {
            JOptionPane.showMessageDialog(this, "Order not Found!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtId1.setText("");
        }

        if (!order1.isStatus()) {
            JOptionPane.showMessageDialog(this, "This order is not accepted!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtId1.setText("");
            return;
        }

        JOptionPane.showMessageDialog(this, "Please select the deliveryman!");
    }//GEN-LAST:event_btnFind1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnDelDish;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFind1;
    private javax.swing.JButton btnNot;
    private javax.swing.JButton btnSaveDish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblRes;
    private javax.swing.JTable tblMenu;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTextField txtDel;
    private javax.swing.JTextField txtDelDish;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtId1;
    private javax.swing.JTextField txtSaveDish;
    // End of variables declaration//GEN-END:variables

    public void populateMenu() {
        DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();
        model.setRowCount(0);
        for (String m : manager.getRestaurant().getMenu()) {
            Object[] row = new Object[1];
            row[0] = m;
            model.addRow(row);
        }
    }

    private void getOrders() {
        for (Customer c : sys.getCustomerDirectory().getCustomerList()) {
            for (Order o : c.getOrders()) {
                if (manager.getRestaurant().getName().equals(o.getRestaurant().getName())) {
                    orders.add(o);
                }
            }
        }
    }

    private void populateOrders() {
        DefaultTableModel model = (DefaultTableModel) tblOrder.getModel();
        model.setRowCount(0);
        for (Order s : orders) {
            Object[] row = new Object[7];
            row[0] = s.getId();
            row[1] = s.getCusName();
            if (s.isStatus()) {
                row[2] = "Accepted";
            } else {
                row[2] = "Not accepted";
            }
            if (s.getDeliveryman() != null) {
                row[3] = s.getDeliveryman().getName();
            }
            row[4] = s.getDish();
            if (s.isMark()) {
                row[5] = "Delivered";
            } else {
                row[5] = "Not Delivered";
            }
            row[6] = s.getComment();
            model.addRow(row);
        }
    }
}
