/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realcodeline.generate;

import com.realcodeline.model.PassModel;

/**
 * Interface for Generate class.
 * @author abel
 */
public interface IGenerate {
    public abstract void gerenciandoPassInfo(PassModel model);
    public abstract String getPasswordGenerate();
}
