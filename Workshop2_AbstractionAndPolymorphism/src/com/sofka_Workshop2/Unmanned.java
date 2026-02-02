package com.sofka_Workshop2;

/**
 * Class Unmanned.java designed for create space Craft manned.
 * 
 * @version [1.0.0 2022-03-06, Class corresponds to version 1 of the system, 
 *                  It has not undergone any refactoring during the version].
 *
 * @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
 *
 * @since [Version 1]
 *
 */

public class Unmanned extends spaceCraft implements ICamera{
    
        /**
         * Definition variable type
         */
    
        String type = "Manned";
        
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
        
        int power = 1500;
        
        /**
         * Definition variable speed
         */
        
        int speed = 3000; 
        
        /**
         * Definition variable weight
         */
        
        float weight = 200;
      
    /**
     * Create Constructor of class
     */
    public Unmanned() {
        
    }
    
    /**
     * Create Method showData
     */
            
    @Override
    public void showData() {
       System.out.println("type: " +type+ "\n"
                + "Propulsion System: " +propSystem+ "\n" + "Fuel Type: "+fuelType+"\n"
                + "Power: "+power+ "\n" +"Speed: "+speed+"\n" + "Weight: "+weight);
    }
    
    /**
     * Method Space craft Status
     */
    public void SpacecraftStatus(){
        turnOn();
        turnOff();
        propel();
        transport();
    }
    
    /**
     * Create Method turnOn
     */
    
    @Override
    public void turnOn() {
        boolean turnOn = true;
        System.out.println("The Ignition speed is = " +turnOn);
    }

    /**
     * Create Method TurnOff
     */
    
    @Override
    public void turnOff() {
       boolean turnOff = false;
       System.out.println("The Ignition speed is = " +turnOff);
    }

    /**
     * Create Method propel
     */
    
    @Override
    public void propel() {
       int propel= speed + power;
       System.out.println("The Spacecraft have propulsión of: " + propel +"km/h");
    }
    
    /**
     * Create Method transport
     */
    
    public void transport() {
        System.out.println("The total weight carried by the unmanned spacecraft is:" +weight);  
    }
    
    /**
     * Create Method Camera Operations
     */
    public void CameraOperations(){
        takePictures();
        recordPlanets();
    }
    
    /**
     * Create Method take Pictures
     */
    
    @Override
    public void takePictures() {
        System.out.println("The picture has been taken");
    }

    /**
     * Create Method record Planets
     */
    
    @Override
    public void recordPlanets() {
        System.out.println("images have been recorded");
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
