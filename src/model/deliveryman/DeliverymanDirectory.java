/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.deliveryman;

import java.util.ArrayList;
import model.manager.Manager;
import model.restaurants.Restaurant;

/**
 *
 * @author Siyuan He
 */
public class DeliverymanDirectory {

    private ArrayList<Deliveryman> deliverymanList;

    public DeliverymanDirectory() {
        if (deliverymanList == null) {
            deliverymanList = new ArrayList<Deliveryman>();
        }
    }

    public boolean addDeliveryman(Deliveryman deliveryman) {
        for (Deliveryman d : deliverymanList) {
            if (deliveryman.getUsername().equals(d.getUsername())) {
                return false;
            }
        }
        deliverymanList.add(deliveryman);
        return true;
    }

    public boolean modifyDeliveryman(int id, String username, String password, String name) {
        Deliveryman temp = null;
        for (Deliveryman d : deliverymanList) {
            if (id == d.getId()) {
                temp = d;
            }
        }
        if (temp == null) {
            return false;
        } else {
            temp.setUsername(username);
            temp.setPassword(password);
            temp.setName(name);
            return true;
        }
    }

    public boolean deleteDeliveryman(int id) {
        for (Deliveryman d : deliverymanList) {
            if (id == d.getId()) {
                deliverymanList.remove(d);
                return true;
            }
        }
        return false;
    }

    public boolean isExist(String username) {
        for (Deliveryman m : deliverymanList) {
            if (username.equals(m.getUsername())) {
                return true;
            }
        }
        return false;
    }

    public Deliveryman findManager(int id) {
        for (Deliveryman m : deliverymanList) {
            if (id == m.getId()) {
                return m;
            }
        }
        return null;
    }

    public ArrayList<Deliveryman> getDeliverymanList() {
        return deliverymanList;
    }

    public void setDeliverymanList(ArrayList<Deliveryman> deliverymanList) {
        this.deliverymanList = deliverymanList;
    }

    @Override
    public String toString() {
        return deliverymanList + "";
    }

}
