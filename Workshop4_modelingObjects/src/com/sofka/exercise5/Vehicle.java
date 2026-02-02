package com.sofka.exercise5;

/**
* Clase abstracta Vehicle.java ha sido diseñada para extender a clases tipo
* ferry
*
* @version [1.0.0 2022-12-06, La clase corresponde a la versión 1 del sistema,
*               la cual no a sufrido ningún refactoring durante la versión].
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1]
*
*/

public abstract class Vehicle {
    
    /**
     * Declaración atributo numero de pasajeros
     */
    
    private int numberPassengers;
    
    /**
     * Declaración atributo peso
     */
    
    private double weigth;
    
    /**
     * Declaración atributo velocidad
     */
    
    private double velocity;
    
    /**
     * Declaración atributo nombre
     */
    
    private String name;
    
    /**
     * Declaración atributo enumerado color
     */
    
    private ColorEnum color;
    
    /**
     * Declaración atributo tipo de vehiculo
     */
    
    private String typeVehicle;
    
    /**
     * Declaración atributo placa de vehiculo
     */
    
    private String plateVehicle;
    
    /**
     * Creación de constructor
     */
    
    public Vehicle() {
        this.numberPassengers = 0;
        this.weigth = 0;
        this.velocity = 0;
        this.name = "";
        this.color = null;
        this.typeVehicle = "";
        this.plateVehicle = "";
    }
    
    /**
     * Metodo utilizado para obtener numero passageros
     * @return 
     */
    
    public int getNumberPassengers() {
        return numberPassengers;
    }
    
    /**
     * Metodo para establecer numero passageros
     * @param plateVehicle 
     */
    
    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }
    
    /**
     * Metodo utilizado para obtener peso
     * @return 
     */
    
    public double getWeigth() {
        return weigth;
    }
    
    /**
     * Metodo para establecer peso
     * @param plateVehicle 
     */
    
    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }
    
    /**
     * Metodo utilizado para obtener velocidad
     * @return 
     */
    
    public double getVelocity() {
        return velocity;
    }
    
    /**
     * Metodo para establecer velocidad
     * @param plateVehicle 
     */
    
    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }
    
    /**
     * Metodo utilizado para obtener nombre
     * @return 
     */
    
    public String getName() {
        return name;
    }
    
    /**
     * Metodo para establecer nombre
     * @param plateVehicle 
     */
    
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Metodo utilizado para obtener color
     * @return 
     */
    
    public ColorEnum getColor() {
        return color;
    }
    
    /**
     * Metodo para establecer color
     * @param plateVehicle 
     */
    
    public void setColor(ColorEnum color) {
        this.color = color;
    }
    
    /**
     * Metodo utilizado para obtener tipo de vehiculo
     * @return 
     */
    
    public String getTypeVehicle() {
        return typeVehicle;
    }
    
    /**
     * Metodo para establecer tipo de vehiculo
     * @param plateVehicle 
     */
    
    public void setType(String typeVehicle) {
        this.typeVehicle = typeVehicle;
    }
    
    /**
     * Metodo utilizado para obtener placa de vehiculo
     * @return 
     */
    
    public String getPlateVehicle() {
        return plateVehicle;
    }
    
    /**
     * Metodo para establecer placa de vehiculo
     * @param plateVehicle 
     */
    
    public void setPlateVehicle(String plateVehicle) {
        this.plateVehicle = plateVehicle;
    }
    
}
