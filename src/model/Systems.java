/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.admin.SystemAdministrator;
import model.customer.CustomerDirectory;
import model.deliveryman.DeliverymanDirectory;
import model.manager.ManagersDirectory;
import model.restaurants.RestaurantDirectory;

/**
 *
 * @author Siyuan He
 */
public class Systems {

    private static Systems sys;
    private SystemAdministrator admin;
    private ManagersDirectory managersDirectory;
    private DeliverymanDirectory deliverymanDirectory;
    private CustomerDirectory customerDirectory;
    private RestaurantDirectory restaurantDirectory;

    public Systems() {
        if (admin == null) {
            admin = new SystemAdministrator();
        }
        if (managersDirectory == null) {
            managersDirectory = new ManagersDirectory();
        }
        if (deliverymanDirectory == null) {
            deliverymanDirectory = new DeliverymanDirectory();
        }
        if (customerDirectory == null) {
            customerDirectory = new CustomerDirectory();
        }
        if (restaurantDirectory == null) {
            restaurantDirectory = new RestaurantDirectory();
        }
    }

    public static Systems getInstance() {
        if (sys == null) {
            sys = new Systems();
        }
        return sys;
    }

    public SystemAdministrator getAdmin() {
        return admin;
    }

    public void setAdmin(SystemAdministrator admin) {
        this.admin = admin;
    }

    public ManagersDirectory getManagersDirectory() {
        return managersDirectory;
    }

    public void setManagersDirectory(ManagersDirectory managersDirectory) {
        this.managersDirectory = managersDirectory;
    }

    public DeliverymanDirectory getDeliverymanDirectory() {
        return deliverymanDirectory;
    }

    public void setDeliverymanDirectory(DeliverymanDirectory deliverymanDirectory) {
        this.deliverymanDirectory = deliverymanDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public RestaurantDirectory getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }
}
