/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.admin;

import model.customer.CustomerDirectory;
import model.deliveryman.DeliverymanDirectory;
import model.manager.*;

/**
 *
 * @author Siyuan He
 */
public class SystemAdministrator {

    private ManagersDirectory managersDirectory;
    private DeliverymanDirectory deliverymanDirectory;
    private CustomerDirectory customerDirectory;
    private String password = "admin";
    private String username = "admin";

    public SystemAdministrator() {
        if (managersDirectory == null) {
            managersDirectory = new ManagersDirectory();
        }
        if (deliverymanDirectory == null) {
            deliverymanDirectory = new DeliverymanDirectory();
        }
        if (customerDirectory == null) {
            customerDirectory = new CustomerDirectory();
        }
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

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
