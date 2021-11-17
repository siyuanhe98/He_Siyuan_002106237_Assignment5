/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.customer;

import java.util.ArrayList;
import javax.management.relation.Role;
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
    private ArrayList<Order> orders;
    private Role role;

    public Customer() {
        if (orders == null) {
            orders = new ArrayList<Order>();
        }
    }

    public Customer(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
        if (orders == null) {
            orders = new ArrayList<Order>();
        }
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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

    public void setId(int id) {
        this.id = id;
    }
}
