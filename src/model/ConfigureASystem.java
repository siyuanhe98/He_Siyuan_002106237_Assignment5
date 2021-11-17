/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.admin.SystemAdministrator;

/**
 *
 * @author Siyuan He
 */
public class ConfigureASystem {

    public static Systems configure() {
        Systems system = Systems.getInstance();
        return system;
    }
}
