/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manager;

import java.util.ArrayList;

/**
 *
 * @author Siyuan He
 */
public class ManagersDirectory {

    private ArrayList<Manager> managersList;

    public ManagersDirectory() {
        if (managersList == null) {
            managersList = new ArrayList<Manager>();
        }
    }

    public boolean addManager(Manager manager) {
        for (Manager m : managersList) {
            if (manager.getUsername().equals(m.getUsername())) {
                return false;
            }
        }
        managersList.add(manager);
        return true;
    }

    public boolean isExist(String username) {
        for (Manager m : managersList) {
            if (username.equals(m.getUsername())) {
                return true;
            }
        }
        return false;
    }

    public boolean modifyManager(int id, String username, String password, String name) {
        Manager temp = null;
        for (Manager m : managersList) {
            if (id == m.getId()) {
                temp = m;
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

    public Manager findManager(int id) {
        for (Manager m : managersList) {
            if (id == m.getId()) {
                return m;
            }
        }
        return null;
    }

    public boolean deleteManager(int id) {
        for (Manager m : managersList) {
            if (id == m.getId()) {
                managersList.remove(m);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Manager> getManagersList() {
        return managersList;
    }

    public void setManagersList(ArrayList<Manager> managersList) {
        this.managersList = managersList;
    }

    @Override
    public String toString() {
        return managersList + "";
    }

}
