package com.sofka_Workshop2;
/**
 * main class mainApp.java designed for the execution of the program.
 * 
 * @version [1.0.0 2022-02-06, Class corresponds to version 1 of the system, 
 *                  It has not undergone any refactoring during the version].
 *
 * @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
 *
 * @since [Version 1]
 *
 */
public interface IShuttleOperation {
    /**
     * Method to transport ships
     */
    
    public void transportingShips();
    
    /**
     * Method supplying
     * @return 
     */
    
    public void supplying();
    
    /**
     * Method cleaning
     * @return 
     */
    
    public void cleaning();
    
    /**
     * Method regulatinglift
     * @return 
     */
    public void regulatinglift();
}
