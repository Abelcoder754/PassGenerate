/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realcodeline.facade;

import com.realcodeline.model.PassModel;
import com.realcodeline.service.IServicePass;

/**
 * This class is the Facade of this project, it is used only to communicate 
 * with another classes.
 * @author abel
 */
public class Facade implements IFacade {
    private final IServicePass service;
    
    /**
     * Builder Method.
     */
    public Facade() {
        this.service = new com.realcodeline.service.ServicePass();
    }

    // ------- Generate Password Part -----------
    /**
     * It communicate with service to maybe generate a new password.
     * @param model PassModel Object.
     * @return String not empty if a new password was generated.
     */
    @Override
    public String generatePassword(PassModel model) {
        return this.service.generatePassword(model);
    }
    // ------------------------------------------
    
}
