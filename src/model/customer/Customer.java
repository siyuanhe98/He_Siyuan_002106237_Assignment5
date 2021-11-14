/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.customer;

import java.util.ArrayList;
import model.orders.Order;

/**
 *
 * @author Siyuan He
 */
public class Customer {

    private String username;
    private String password;
    private String name;
    private int id;
    private static int count = 1;
    private ArrayList<Order> orders;

    public Customer() {
        if (orders == null) {
            orders = new ArrayList<Order>();
        }
        id = count++;
    }

    public Customer(String username, String password, String name) {
        id = count++;
        this.username = username;
        this.password = password;
        this.name = name;
        if (orders == null) {
            orders = new ArrayList<Order>();
        }
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" + "username=" + username + ", password=" + password + ", name=" + name + ", id=" + id + '}';
    }

}
