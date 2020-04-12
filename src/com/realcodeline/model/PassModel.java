/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realcodeline.model;

/**
 * This is the model class that will be used as initial data to generate 
 * a new password.
 * @author abel
 */
public class PassModel {
    private int size;
    private boolean upcase;
    private boolean lowcase;
    private boolean number;
    private boolean symbol;

    /**
     * Builder Method.
     */
    public PassModel() {
        this.size = 0;
        this.upcase = false;
        this.lowcase = false;
        this.number = false;
        this.symbol = false;
    }
    
    // Getter and Setter Methods

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isUpcase() {
        return upcase;
    }

    public void setUpcase(boolean upcase) {
        this.upcase = upcase;
    }

    public boolean isLowcase() {
        return lowcase;
    }

    public void setLowcase(boolean lowcase) {
        this.lowcase = lowcase;
    }

    public boolean isNumber() {
        return number;
    }

    public void setNumber(boolean number) {
        this.number = number;
    }

    public boolean isSymbol() {
        return symbol;
    }

    public void setSymbol(boolean symbol) {
        this.symbol = symbol;
    }
    
}
