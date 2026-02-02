package com.sofka_W1;
import java.util.ArrayList;
/**
* Class has been designed to implement the class fruit
*
* Contains its attributes and methods of the fruit class.
*
* @version [1.0.0 2022-01-06, The class corresponds to version 1 of the system,
*                   which has not undergone any refactoring during this version]
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1]
*
*/
public class Fruit {
    /**
     * Attribute definition Name
     */
    private String name;
    /**
     * Attribute definition average weight
     */
    private float averageWeight;
    /**
     * Color Array Definition
     */
    private ArrayList<String> color;
    /**
     * Size attribute definition
     */
    private float size;
    /**
     * Creation of fruit class constructor
     * @param name Name Attribute Name
     * @param averageWeight Attribute average weight
     * @param color Attribute color
     * @param size Attribute size
     */
    public Fruit(String name, float averageWeight, ArrayList<String> color, float size) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.color = color;
        this.size = size;
    }

    /**
     * Get fruit name
     * @return  
     */
    public String getName() {
        return name;
    }
    /**
     * Set fruit name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Get fruit weight
     * @return  
     */
    public float getAverageWeight() {
        return averageWeight;
    }
    /**
     * Set fruit weight
     * @param averageWeight 
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }
    /**
     * Get fruit color
     * @return  
     */
    public ArrayList<String> getColor() {
        return color;
    }
    /**
     * Set fruit color
     * @param color 
     */
    public void setColor(ArrayList<String> color) {
        this.color = color;
    }
    /**
     * get fruit size
     * @return  
     */
    public float getSize() {
        return size;
    }
    /**
     * set fruit size
     * @param colors 
     */
    public void setSize(float size) {
        this.size = size;
    }  
}
