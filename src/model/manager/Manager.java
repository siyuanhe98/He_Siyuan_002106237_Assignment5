/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manager;

import java.util.ArrayList;
import java.util.Iterator;
import model.Menu;
import model.restaurants.Restaurant;

/**
 *
 * @author Siyuan He
 */
public class Manager {

    private String username;
    private String password;
    private String name;
    private int id;
    private static int count = 1;
    private Restaurant restaurant;

    public Manager() {
        id = count++;
    }

    public Manager(String username, String password, String name) {
        this.username = username;
        id = count++;
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

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public boolean deleteDish(String name) {
        if (restaurant.getMenu() == null) {
            return false;
        }
        for(String dish:restaurant.getMenu()){
            if(name.equalsIgnoreCase(dish)){
                restaurant.getMenu().remove(dish);
                return true;
            }
        }
        return false;
    }

    public boolean addDish(String name) {
        if (restaurant.getMenu() == null) {
            return false;
        }
        Iterator<String> iterator = restaurant.getMenu().iterator();
        while (iterator.hasNext()) {
            if (name.equalsIgnoreCase(iterator.next())) {
                return false;
            }
        }
        restaurant.getMenu().add(name);
        return true;
    }

    @Override
    public String toString() {
        return "Manager{" + "username=" + username + ", password=" + password + ", name=" + name + ", id=" + id + ", restaurant=" + restaurant + '}';
    }

  

}
