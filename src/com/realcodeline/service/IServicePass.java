/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realcodeline.service;

import com.realcodeline.model.PassModel;

/**
 * ServicePass' interface.
 * @author abel
 */
public interface IServicePass {
    // it is for generate a new password
    public abstract String generatePassword(PassModel model);
}
