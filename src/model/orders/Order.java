/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.orders;

import model.deliveryman.Deliveryman;
import model.restaurants.Restaurant;

/**
 *
 * @author Siyuan He
 */
public class Order {
    private boolean status;
    private Deliveryman deliveryman;
    private String dish;
    private int id;
    private Restaurant restaurant;
    private static int count = 1;
    private boolean mark;
    private String cusName;
    private String comment;
    public Order() {
        id = count;
        count++;
    }

    public boolean isMark() {
        return mark;
    }

    public void setMark(boolean mark) {
        this.mark = mark;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Order(String dish,Restaurant restaurant,String cusName) {
        this.dish = dish;
        this.restaurant = restaurant;
        id = count;
        count++;
        this.cusName = cusName;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Deliveryman getDeliveryman() {
        return deliveryman;
    }

    public void setDeliveryman(Deliveryman deliveryman) {
        this.deliveryman = deliveryman;
    }

    public int getId() {
        return id;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    @Override
    public String toString() {
        return "Order{" + "dish=" + dish + ", id=" + id + '}';
    }
    
    
}
