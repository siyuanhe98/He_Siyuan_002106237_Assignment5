/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.restaurants;

import java.util.ArrayList;
import model.orders.Order;

/**
 *
 * @author Siyuan He
 */
public class Restaurant {

    private String name;
    private ArrayList<String> menu;
    private OrderDirectory orderDirectory;

    public Restaurant(String name) {
        this.name = name;
        if(menu == null){
            menu = new ArrayList<String>();
        }
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<String> menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return name;
    }

    
}
