package com.sofka_Workshop2;

/**
 * Abstract class Spacecraft.java designed for spacecraft creation.
 * 
 * @version [1.0.0 2022-02-06, Class corresponds to version 1 of the system, 
 *                  It has not undergone any refactoring during the version].
 *
 * @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
 *
 * @since [Version 1]
 *
 */

public abstract class spaceCraft {
    
    /**
     * Definition of attribute type
     */
    
    private String type;
    
    /**
     *  Definition of attribute Propulsion system 
     */
    
    private String propSystem;
    
    /**
     *  Definition of attribute fuel Type
     */
    
    private String fuelType;
    
    /**
     * Definition of attribute power
     */
    
    private int power;
    
    /**
     * Definition of attribute speed
     */
    
    private int speed;
    
    /**
     * Definition of attribute weight
     */
    
    private float weight;

    /**
     * Create class constructor
     */
    
    
    public spaceCraft() {
    }

    /**
     * Method get Type
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * Method set Type
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Method get Prop System
     *
     * @return
     */
    public String getPropSystem() {
        return propSystem;
    }

    /**
     * Method set Prop System
     * @param propSystem
     */
    public void setPropSystem(String propSystem) {
        this.propSystem = propSystem;
    }

    /**
     * Method get Fuel Type
     * @return
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * Method set Fuel Type
     * @param fuelType
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * Method get Power
     * @return
     */
    public int getPower() {
        return power;
    }

    /**
     * Method set Power
     * @param power
     */
    
    public void setPower(int power) {
        this.power = power;
    }

    /**
     * Method get Speed
     *
     * @return
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Method set Speed
     * @param speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
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
     * abstract method show Data
     */
    public abstract void showData();

    /**
     * abstract method turn On
     */
    public abstract void turnOn();

    /**
     * abstract method turn Off
     */
    public abstract void turnOff();

    /**
     * abstract method propel
     */
    public abstract void propel();

}

