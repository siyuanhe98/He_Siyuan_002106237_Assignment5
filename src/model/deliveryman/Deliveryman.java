/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.deliveryman;

import model.Role;

/**
 *
 * @author Siyuan He
 */
public class Deliveryman {

    private String username;
    private String password;
    private String name;
    private int id;
    private Role role;
    
    public Deliveryman() {

    }

    public Deliveryman(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRole(Role role) {
        this.role = role;
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
        return "Deliveryman{" + "username=" + username + ", password=" + password + ", name=" + name + ", id=" + id + '}';
    }

}
