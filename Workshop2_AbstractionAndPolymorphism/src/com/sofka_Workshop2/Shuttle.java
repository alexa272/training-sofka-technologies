package com.sofka_Workshop2;

/**
 * Class Shuttle.java designed for the execution of the program.
 *
 * @version [1.0.0 2022-02-06, Class corresponds to version 1 of the system, It
 * has not undergone any refactoring during the version].
 *
 * @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
 *
 * @since [Version 1]
 *
 */
public class Shuttle extends spaceCraft implements IShuttleOperation {

    /**
     * Definition variable type
     */
    String type = "Shuttle";

    /**
     * Definition variable propSystem
     */
    String propSystem = "Chemical Combustion";

    /**
     * Definition variable fuelType
     */
    String fuelType = "hydrogen and oxygen";

    /**
     * Definition variable power
     */
    int power = 1000;

    /**
     * Definition variable speed
     */
    int speed = 980;

    /**
     * Definition variable weight
     */
    float weight = 450;

    /**
     * Create Constructor of Class
     */
    public Shuttle() {
    }

    /**
     * Create Method showData
     */
    @Override
    public void showData() {
        System.out.println("type: " + type + "\n"
                + "Propulsion System: " + propSystem + "\n" + "Fuel Type: " + fuelType + "\n"
                + "Power: " + power + "\n" + "Speed: " + speed + "\n" + "Weight: " + weight);
    }
    /**
     * Method Space craft Status
     */
    public void SpacecraftStatus() {
        turnOn();
        turnOff();
        propel();
    }

    /**
     * Create Method turnOn
     */

    @Override
    public void turnOn() {
        boolean turnOn = true;
        System.out.println("The Ignition speed is = " + turnOn);
    }

    /**
     * Create Method TurnOff
     */
    @Override
    public void turnOff() {
        boolean turnOff = false;
        System.out.println("The shutdown speed is: " + turnOff);
    }

    /**
     * Create Method propel
     */
    @Override
    public void propel() {
        int propel = speed + power;
        System.out.println("The Spacecraft have propulsión of: " + propel + "km/h");
    }

    /**
     * Method Shuttle Operation
     */
    public void shuttleOperation() {
        transportingShips();
        supplying();
        cleaning();
        regulatinglift();
    }

    /**
     * Create Method transporting Ships
     */
    @Override
    public void transportingShips() {
        System.out.println("the weight that the Spacecraft can carry is :" + weight);
    }

    /**
     * Create Method supplying
     */
    @Override
    public void supplying() {
        System.out.println("the space Craft is supplied");
    }

    /**
     * Create Method cleaning
     */
    @Override
    public void cleaning() {
        System.out.println("the Space craft is clean");
    }

    /**
     * Create Method regulating lift
     */
    @Override
    public void regulatinglift() {
        System.out.println("the elevation of the space Craft is regulated");
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

}
