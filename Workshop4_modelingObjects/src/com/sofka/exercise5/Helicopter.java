package com.sofka.exercise5;

/**
* Clase Helicopter.java, Diseñada para crear objetos tipo helicoptero
*
* @version [1.0.0 2022-12-06, Clase correspondiente a la versión 1 del sistema,
*               la cual no a sufrido ningún refactoring durante la versión].
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1]
*
*/

public class Helicopter extends Vehicle{
    
    /**
     * Declaración atributo numero de pasajeros
     */
    
    private int numberPassengers;
    
    /**
     * Declaración atributo numero de propulsores
     */
    
    private int numberOfPropellers;
    
    /**
     * Declaración atributo de peso
     */
    
    private double weigth;
    
    /**
     * Declaración atributo de velocidad
     */
    
    private double velocity;
    
    /**
     * Declaración atributo nombre
     */
    
    private String name;
    
    /**
     * Declaración atributo color
     */
    
    private ColorEnum color;
    
    /**
     * Declaración atributo tipo de combustible
     */
    
    private String typeOfFuel;
    
    /**
     * Creación de constructor
     */
    
    public Helicopter() {
        this.numberPassengers = 8;
        this.numberOfPropellers = 5;
        this.weigth = 1500;
        this.velocity = 278;
        this.name = "October1988";
        this.color = ColorEnum.GREEN;
        this.typeOfFuel = "Gasoline";
    }
    
    /**
     * Método para mostrar datos de vehiculo
     */
    public void showData(){
        System.out.println("Vehiculo tiene: " + numberPassengers +" pasajeros"+ "\n"
                +"Numero de propulsores: " + numberOfPropellers + "\n"
                + "Nombre: " + name + "\n"+"Peso: " + weigth + "\n"
                + "Velocidad: " + velocity + "\n" 
                + "Nombre: " + name + "\n" + "Color: "+color+ "\n"
                + "Tipo de combustible: " + typeOfFuel +"\n"
                +"--------------------------------------------------------");    
    }
    
    /**
     * Método para mostrar caracteristicas de clase
     */
    
    public void mainFeatures(){
        turnOn();
        turnOn();
        turnOff();
        accelerate();
        brake();
    }
    
    /**
     * Método para validar vehiculo encendido
     */
    public void turnOn() {
        velocity = 20;
        System.out.println("Velocidad de encendido: "+velocity);
    }

    /**
     * Método para validar vehiculo apagado
     */
    
    public void turnOff() {
        velocity = 0;
        System.out.println("Velocidad vehiculo apagado: "+velocity);
    }

    /**
     * Método para validar aceleracion de motocicleta
     */
    
    public void accelerate() {
        velocity = velocity+50;
        System.out.println("Velocidad de aceleración: "+velocity+"Km/h");
    }

    /**
     * Método para validar frenado de vehiculo
     */
    
    public void brake() {
        velocity = velocity-5;
        System.out.println("Velocidad de Frenado: "+velocity+"Km/h");
    }
}

    
