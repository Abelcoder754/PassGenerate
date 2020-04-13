/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realcodeline.facade;

import com.realcodeline.model.PassModel;

/**
 * This class is the Facade Interface of this project.
 * @author abel
 */
public interface IFacade {
    // it is for generate a new password
    public abstract String generatePassword(PassModel model);
}
