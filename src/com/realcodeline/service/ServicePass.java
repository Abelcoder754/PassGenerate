/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realcodeline.service;

import com.realcodeline.model.PassModel;

/**
 * Service that approve or not the sent data to generate.
 * @author abel
 */
public class ServicePass implements IServicePass {
    private String password;
    
    /**
     * Builder Method.
     */
    public ServicePass() {
        this.password = "";
    }
    
    /** 
     * This method is for generate a new Password if it be fine.
     * @param model PassModel Object.
     * @return String doesn't empty if everything is good.
     */
    @Override
    public String generatePassword(PassModel model) {
        this.setPassword("");
        if (this.isInvalidSize(model) || 
                !this.isOneNotFalse(model)) return this.getPassword();
        
        return this.getPassword();
    }
    
    /**
     * Verify if the size of data is valid or not.
     * @param model PassModel Object.
     * @return <true> if the size is invalid.
     */
    private boolean isInvalidSize(PassModel model) {
        return model.getSize() < 1;
    }
    
    /**
     * This method is for verify if the options sent by user,
     * are valid to generate a new password.
     * @param model PassModel Object.
     * @return <true> if it was found as true.
     */
    private boolean isOneNotFalse(PassModel model) {
        if (model.isLowcase()) return true;
        else if (model.isUpcase()) return true;
        else if (model.isNumber()) return true;
        else if (model.isSymbol()) return true;
        return false; // in case of everything be false.
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
