/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.deliveryman;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Systems;
import model.customer.Customer;
import model.deliveryman.Deliveryman;
import model.orders.Order;

/**
 *
 * @author Siyuan He
 */
public class DeliverymanPane extends javax.swing.JPanel {

    /**
     * Creates new form deliveryman
     */
    private Systems sys;
    private Deliveryman deliveryman;
    private ArrayList<Order> orders;
    private Order order;

    public DeliverymanPane(Systems sys, Deliveryman deliveryman) {
        initComponents();
        this.sys = sys;
        this.deliveryman = deliveryman;
        lblRes.setText("Dashboard of Deliveryman-- " + deliveryman.getName());
        if (orders == null) {
            orders = new ArrayList<Order>();
        }
        populateOrder();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblshow = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();
        lblRes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setBackground(new java.awt.Color(210, 210, 210));

        tblshow.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        tblshow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Customer", "Restaurant", "Dish", "Tracking"
            }
        ));
        jScrollPane1.setViewportView(tblshow);

        btnSearch.setBackground(new java.awt.Color(47, 64, 86));
        btnSearch.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnSearch.setText("OK");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnFinish.setBackground(new java.awt.Color(47, 64, 86));
        btnFinish.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnFinish.setText("Delivered!");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        lblRes.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        lblRes.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel1.setText("Seclect order you finish Delivery:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRes)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFinish))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnFinish))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnFinish, btnSearch, jLabel1, txtId});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
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
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        // TODO add your handling code here:
        order.setMark(true);
        txtId.setText("");
        populateTable();
    }//GEN-LAST:event_btnFinishActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRes;
    private javax.swing.JTable tblshow;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables

    private void populateOrder() {
        for (Customer c : sys.getCustomerDirectory().getCustomerList()) {
            for (Order o : c.getOrders()) {
                if ((o.getDeliveryman() != null) && (o.getDeliveryman().getId() == deliveryman.getId())) {
                    orders.add(o);
                }
            }
        }

        System.out.println(orders);
        System.out.println(orders.size());
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblshow.getModel();
        model.setRowCount(0);
        for (Order s : orders) {
            Object[] row = new Object[5];
            row[0] = s.getId();
            row[1] = s.getCusName();
            row[2] = s.getRestaurant().getName();
            row[3] = s.getDish();
            if (s.isMark()) {
                row[4] = "Delivered";
            } else {
                row[4] = "Not Delivered";
            }
            model.addRow(row);
        }
    }
}
