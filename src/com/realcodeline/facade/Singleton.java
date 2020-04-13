/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realcodeline.facade;

/**
 * This pattern is for create only one Facade instance, (Singleton Pattern).
 * @author abel
 */
public class Singleton extends Facade {
    
    /**
     * It represents the singleton instance of this class.
     */
    private static Singleton instance;
    
    /**
     * Object monitor for synchronize.
     */
    private static final Object MONITOR = new Object();
    
    /**
     * Builder Method.
     */
    public Singleton() {
        super();
    }
    
    /**
     * Return a new instance of Facade if there's not.
     * @return 
     */
    public static Singleton getInstance() {
        synchronized (MONITOR) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }
    
}
