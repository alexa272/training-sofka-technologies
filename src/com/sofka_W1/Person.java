package com.sofka_W1;
/**
* Class designed to create a Person class with attributes and methods. 
*
* @version [1.0.0 2022-01-06, The class corresponds to version 1 of the system,
*                  which has not undergone any refactoring during the version].
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1]
* 
*/

public class Person {
    /**
     * Document attribute definition
     */
    private int document;
    /**
     * Name attribute definition
     */
    private String name;
    /**
     * Attribute definition first LastName
     */
    private String lastName1;
    /**
     * Attribute definition second LastName
     */
    private String lastName2;
    /**
     * Attribute definition date of birth
     */
    private String dateBirth;
     /**
     * Creation of the Person class constructor
     * @param document attribute Document
     * @param name attribute Name 
     * @param lastName1 Attribute first LastName
     * @param lastName2 Attribute second LastName
     * @param dateBirth Attribute date of birth
     */
    public Person(int document, String name, String lastName1, String lastName2, String dateBirth) {
        this.document = document;
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
    }
    
    /**
     * Get a person's document
     * @return  
     */
    
    public int getDocument() {
        return document;
    }
    /**
     * Set a person's document
     * @param nameBook 
     */
    public void setDocument(int document) {
        this.document = document;
    }   
    /**
     * Get a name person's
     * @return  
     */
    public String getName() {
        return name;
    }
    /**
     * Set a name person's
     * @param nameBook 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Get a person's first lastName
     * @return  
     */
    public String getLastName1() {
        return lastName1;
    }
    /**
     * Set a person's first lastname
     * @param nameBook 
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }
    /**
     * Get a person's second lastName
     * @return  
     */
    public String getLastName2() {
        return lastName2;
    }
    /**
     * Set a person's second lastname
     * @param nameBook 
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }
    /**
     * Get a person's date of birth
     * @return  
     */
    public String getDateBirth() {
        return dateBirth;
    }
    /**
     * Set date of birth of the person
     * @param dateBirth
     */
    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }
    
    /**
     * Walking method  
     */
    
    public void walk(){
       int velocity = 20;
    }
    
    /**
     * Skip Method  
     */
    
    public void jump(){
       int velocity= 50;
    }
    
    /**
     * Method Sleep  
     */
    
    public void sleep(){
       int velocity= 0;
    }
    
    /**
     * Method running  
     */
    
    public void running(){
       int velocity= 100;
    }
}
