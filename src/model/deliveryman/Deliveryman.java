/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.deliveryman;

/**
 *
 * @author Siyuan He
 */
public class Deliveryman {

    private String username;
    private String password;
    private String name;
    private int id;
    private static int count = 1;

    public Deliveryman() {
        id = count++;

    }

    public Deliveryman(String username, String password, String name) {
        id = count++;
        this.username = username;
        this.password = password;
        this.name = name;
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
