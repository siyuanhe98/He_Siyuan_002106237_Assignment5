/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.customer;

import java.util.ArrayList;

/**
 *
 * @author Siyuan He
 */
public class CustomerDirectory {

    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        if (customerList == null) {
            customerList = new ArrayList<Customer>();
        }
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public boolean addDeliveryman(Customer customer) {
        for (Customer d : customerList) {
            if (customer.getUsername().equals(d.getUsername())) {
                return false;
            }
        }
        customerList.add(customer);
        return true;
    }

    public boolean modifyCustomer(int id, String username, String password, String name) {
        Customer temp = null;
        for (Customer d : customerList) {
            if (id == d.getId()) {
                temp = d;
            }
        }
        if (temp == null) {
            return false;
        } else {
            temp.setUsername(username);
            temp.setPassword(password);
            temp.setName(name);
            return true;
        }
    }

    public boolean deleteCustomer(int id) {
        for (Customer d : customerList) {
            if (id == d.getId()) {
                customerList.remove(d);
                return true;
            }
        }
        return false;
    }

    public boolean isExist(String username) {
        for (Customer m : customerList) {
            if (username.equals(m.getUsername())) {
                return true;
            }
        }
        return false;
    }

    public Customer findManager(int id) {
        for (Customer m : customerList) {
            if (id == m.getId()) {
                return m;
            }
        }
        return null;
    }
}
