package com.sofka_W1;
import java.util.ArrayList;
/**
* Class designed to create vehicles objects with attributes and 
* methods
*
* @version [1.0.0 2022-01-06, The class corresponds to version 1 of the system,
*                   which has not undergone any refactoring during the version].
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1].
*
*/
public class Vehicle {
    
    /**
     * Definition of the vehicle type attribute (Bicycle, car, boat, etc).
     */
    
    private String type;
    
    /**
     * Definition of the vehicle weight attribute. 
     */
    
    private double weigth;
    
    /**
     * Definition of the attribute array of colors of the vehicles.
     */
    
    private ArrayList<String> colors;
    
    /**
     * Definition of the attribute of the number of passengers that fit in each vehicle.
     */
    
    private int numberOfPassengers;
 
    /**
     * Creation of class constructor
     * @param type
     * @param weigth
     * @param colors
     * @param numberOfPassengers 
     */
    
    public Vehicle(String type, double weigth, ArrayList<String> colors, int numberOfPassengers){
            this.type = type;
            this.weigth = weigth;
            this.colors = colors; 
            this.numberOfPassengers = numberOfPassengers;
    }

    /**
     * Method get type vehicle(Bicycle, car, boat, etc).
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * Method Set type vehicle(Bicycle, car, boat, etc).
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Method get Weigth of vehicle
     * @return 
     */
    
    public double getWeigth() {
        return weigth;
    }

    /**
     * Method set Weigth of vehicle
     * @param weigth 
     */
    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    /**
     * Method get Colors
     * @return
     */
    
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Method set Colors
     * @param colors
     */
     
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /**
     * Method get Number Of Passengers
     * @return 
     */
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    /**
     * Method set Number Of Passengers
     * @param numberOfPassengers 
     */
    
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    } 
    
    /**
     * Method of vehicle status turn On
     */
    public void turnOn(){
        int velocity = 10;
    }

    /**
     * Method of vehicle status turn Off
     */
    public void turnOff(){
       int velocity = 0; 
    }

    /**
     * Method of vehicle start
     */
    
    public void start(){
       int velocity = 200;
    }

    /**
     * Method of vehicle brake
     */
    public void brake(){
      int velocity = 0;  
    }

}