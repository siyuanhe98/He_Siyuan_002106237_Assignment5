/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.restaurants;

import java.util.ArrayList;

/**
 *
 * @author Siyuan He
 */
public class RestaurantDirectory {

    private ArrayList<Restaurant> restaurantList;

    public RestaurantDirectory() {
        restaurantList = new ArrayList<Restaurant>();
        restaurantList.add(new Restaurant("KFC"));
        restaurantList.add(new Restaurant("Subway"));
        restaurantList.add(new Restaurant("Soju"));
        restaurantList.add(new Restaurant("Popeyes"));
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
    

}
