/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import db04.DB4OUtil;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Systems;

/**
 *
 * @author Siyuan He
 */
public class LogoutPane extends javax.swing.JPanel {

    /**
     * Creates new form LogoutPane
     */
    private Systems sys;
    private DB4OUtil dB4OUtil;

    public LogoutPane(Systems sys, DB4OUtil dB4OUtil) {
        initComponents();
        this.sys = sys;
        this.dB4OUtil = dB4OUtil;
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
        lblRes = new javax.swing.JLabel();

        setBackground(new java.awt.Color(66, 66, 66));

        jButton1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jButton1.setText("Save to Database");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblRes.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        lblRes.setForeground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRes)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dB4OUtil.storeSystem(sys);
        JOptionPane.showMessageDialog(this, "Data saved in the database.");
        Date date = new Date();
        lblRes.setText("Last saved time: " + date.toString());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblRes;
    // End of variables declaration//GEN-END:variables
}
