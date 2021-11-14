/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.orders;

import java.util.ArrayList;

/**
 *
 * @author Siyuan He
 */
public class orderDirectory {
    private ArrayList<Order> orderList;

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public boolean setStatus(int id, boolean status){
        for(Order o : orderList){
            if(o.getId() == id){
                o.setStatus(status);
                return true;
            }
        }
        return false;
    }
}
