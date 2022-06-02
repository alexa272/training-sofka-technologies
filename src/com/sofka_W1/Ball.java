package com.sofka_W1;
/**
* Class designed to create ball objects with attributes and 
* methods
*
* @version [1.0.0 2022-01-06, The class corresponds to version 1 of the system,
*               which has not undergone any refactoring during the version].
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1].
*
*/
public class Ball {
    
    /**
     * Definition of attribute weight of ball.
     */
    
    private float weight;
    
    /**
     * Definition of attribute color of ball
     */
    
    private String color;
    
    /**
     * Definition of attribute shape of ball.
     */
    
    private String shape;
    
    /**
     * Definition of attribute type of ball.
     */
    
    private String type;
    
    /**
     * Definition of attribute pressure of ball.
     */
    
    private float pressure;
    /**
     * Creation of ball class constructor.
     * @param weight 
     * @param color
     * @param shape
     * @param type
     * @param pressure 
     */
    public Ball(float weight, String color, String shape, String type, float pressure) {
        this.weight = weight;
        this.color = color;
        this.shape = shape;
        this.type = type;
        this.pressure = pressure;
    }
    /**
     * Method get Weight 
     * @return 
     */
    public float getWeight() {
        return weight;
    }
    
    /**
     * Method set Weight
     * @param weight 
     */
    
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    /**
     * Method get Color
     * @return 
     */
    
    public String getColor() {
        return color;
    }
    
    /**
     * Method set Color
     * @param color 
     */
    
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Method get Shape
     * @return 
     */
    public String getShape() {
        return shape;
    }
    
    /**
     * Method set Shape
     * @param shape 
     */
    
    public void setShape(String shape) {
        this.shape = shape;
    }
    
    /**
     * Method get Type
     * @return 
     */
    
    public String getType() {
        return type;
    }
    
    /**
     * Method get Type
     * @param type 
     */
    
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * Method get Pressure
     * @return 
     */
    
    public float getPressure() {
        return pressure;
    }
    
    /**
     * Method get Pressure
     * @param pressure 
     */
    
    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
    
    /**
     * Method bounce
     */
    public void bounce(){
        int velocity= 15;
    }
    
    /**
     * Method Shoot
     */
    
    public void shoot(){
        int velocity = 100; 
    }
}
