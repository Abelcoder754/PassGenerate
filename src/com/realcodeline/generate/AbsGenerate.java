/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realcodeline.generate;

import java.security.SecureRandom;

/**
 * This class has the base of a password generator.
 * @author abel
 */
public abstract class AbsGenerate {
    /**
     * Attributes
     */
    private int size;
    private int init;
    private int finish;
    private int item;
    private String password;
    private boolean upcase;
    private boolean lowcase;
    private boolean number;
    private boolean symbol;
    private boolean allow;
    private static final SecureRandom RAD;
    private int random;
    
    // inciando objeto de SecureRandom.
    static {RAD = new SecureRandom();}
    
    // Construtor
    /**
     * Builder Method.
     */
    public AbsGenerate() {
        this.size = 0;
        this.init = 0;
        this.finish = 0;
        this.random = 0;
        this.password = "";
        this.upcase = false;
        this.lowcase = false;
        this.number = false;
        this.symbol = false;
    }
    
    // Getters e setters
    
    /**
     * Returns password size.
     * @return Integer.
     */
    protected int getSize() {
        return this.size;
    }

    /**
     * Inserts password size.
     * @param size integer
     */
    protected void setSize(int size) {
        this.size = size;
    }

    /**
     * Returns the interview begin.
     * @return Integer.
     */
    protected int getInit() {
        return this.init;
    }

    /**
     * Inserts the interview begin.
     * @param init Integer.
     */
    protected void setInit(int init) {
        this.init = init;
    }

    /**
     * Returns the Finish Interview.
     * @return Integer.
     */
    protected int getFinish() {
        return this.finish;
    }

    /**
     * Inserts the Finish Interview.
     * @param finish Integer.
     */
    protected void setFinish(int finish) {
        this.finish = finish;
    }
    
    /**
     * Returns the number of item selected by user.
     * @return Integer.
     */
    protected int getItem() {
        return this.item;
    }
    
    /**
     * Insert the number of item selected by user.
     * @param item Integer.
     */
    protected void setItem(int item) {
        this.item = item;
    }

    /**
     * Returns the password.
     * @return String.
     */
    protected String getPassword() {
        return this.password;
    }

    /**
     * Inserts the password.
     * @param password String.
     */
    protected void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns the state of UPCASE.
     * @return Boolean.
     */
    protected boolean isUpcase() {
        return this.upcase;
    }

    /**
     * Inserts the state of UPCASE.
     * @param upcase Boolean.
     */
    protected void setUpcase(boolean upcase) {
        this.upcase = upcase;
    }

    /**
     * Returns the state of LOWCASE.
     * @return Boolean.
     */
    protected boolean isLowcase() {
        return this.lowcase;
    }

    /**
     * Inserts the state of LOWCASE.
     * @param lowcase Boolean.
     */
    protected void setLowcase(boolean lowcase) {
        this.lowcase = lowcase;
    }

    /**
     * Returns the state of NUMBERS.
     * @return Boolean.
     */
    protected boolean isNumber() {
        return this.number;
    }

    /**
     * Inserts the state of NUMBERS.
     * @param number Boolean.
     */
    protected void setNumber(boolean number) {
        this.number = number;
    }

    /**
     * Returns the state of SYMBOL.
     * @return Boolean.
     */
    protected boolean isSymbol() {
        return this.symbol;
    }

    /**
     * Inserts the state of SYMBOL.
     * @param symbol Boolean.
     */
    protected void setSymbol(boolean symbol) {
        this.symbol = symbol;
    }
    
    /**
     * Returns the control production.
     * @return Boolean.
     */
    protected boolean isAllow() {
        return this.allow;
    }

    /**
     * Inserts the control production.
     * @param allow Boolean.
     */
    protected void setAllow(boolean allow) {
        this.allow = allow;
    }
    
    /**
     * Returns a SecureRandom Object.
     * @return SecureRandom Object. 
     */
    protected SecureRandom getRad() {
        return RAD;
    }
    
    /**
     * This method returns an integer, an auxiliary variable.
     * @return Integer.
     */
    protected int getRandom() {
        return this.random;
    }
    
    /**
     * This method inserts an integer into this variable, it is for
     * auxiliary moments at this software.
     * @param random Integer.
     */
    protected void setRandom(int random) {
        this.random = random;
    }
    
    /**
     * This method removes all data from this object instance.
     */
    protected void cleanAll() {
        this.setSize(0);
        this.setInit(0);
        this.setFinish(0);
        this.setRandom(0);
        this.setPassword("");
        this.setUpcase(false);
        this.setLowcase(false);
        this.setNumber(false);
        this.setSymbol(false);
    }
    
    /**
     * This method returns the number of option marked as true by user.
     */
    protected void howManyChoosePass() {
        int many = 0;
        // caso upcase true
        if (this.isUpcase()) {many +=1;}
        // caso lowcase true
        if (this.isLowcase()) {many +=1;}
        // caso number true
        if (this.isNumber()) {many +=1;}
        // caso symbol true
        if (this.isSymbol()) {many +=1;}
        // insert the quantity
        this.setItem(many);
    }
    
    /**
     * This method will validate the operation.
     * @param size Integer - For Password desired size.
     * @param upcase Boolean - For UpCase Letters.
     * @param lowcase Boolean - For LowCase Letters.
     * @param number Boolean - For Numbers generation.
     * @param symbol Boolean - For Symbols generation.
     */
    protected void sedingInformation(int size, boolean upcase, boolean lowcase, 
            boolean number, boolean symbol) {
        if (upcase || lowcase || number || symbol) {
            // entrando aqui, dados válidos.
            this.setSize(size);
            this.setUpcase(upcase);
            this.setLowcase(lowcase);
            this.setNumber(number);
            this.setSymbol(symbol);
            this.setAllow(true);
        } else {
            // entrando aqui, dados invalidos.
            this.setAllow(false);
        }
    }
    
    /**
     * This method is a generic form to generate a random character.
     * @return String - a generated character.
     */
    protected String characterGenerator() {
        return new String(Character.toChars(this.getInit() + 
                this.getRad().nextInt(this.getFinish())));
    }

}
