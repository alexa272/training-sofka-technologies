package com.sofka.exercise5;

/**
* Clase Train.java ha sido diseñada para crear objetos tipo tren
*
* @version [1.0.0 2022-12-06, La clase corresponde a la versión 1 del sistema,
*               la cual no a sufrido ningún refactoring durante la versión].
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1]
*
*/

public class Train extends Vehicle{
    /**
     * Declaración atributo numero de pasajeros
     */
    private int numberPassengers;
    /**
     * Declaración atributo numero de vagones
     */
    private int numberOfWagons;
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
     * Declaración atributo color
     */
    
    private ColorEnum color;
    
    /**
     * Declaración atributo tipo de tren
     */
    
    private String typeTrain;
    
    /**
     * Declaración atributo tipo de combustible
     */
    
    private String typeOfFuel;
    
    /**
     * Creación de constructor
     */
    
    public Train() {
        this.numberPassengers = 100;
        this.numberOfWagons = 6;
        this.weigth = 1500;
        this.velocity = 300;
        this.name = "Sampdoria";
        this.color = ColorEnum.WHITE;
        this.typeTrain = "Pasajeros";
        this.typeOfFuel = "Gasolina";
    }
    
    /**
     * Método para mostrar datos de vehiculo
     */
    
    public void showData(){
        System.out.println("Vehiculo lleva: " + numberPassengers +" pasajeros"+ "\n"
                +"Numero de vagones: " + numberOfWagons + "\n"
                + "Nombre: " + name + "\n"+"Peso: " + weigth + "\n"
                + "Velocidad: " + velocity + "\n" 
                + "Color: "+color+ "\n"
                + "Tipo de tren: " + typeTrain +"\n"
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
        velocity = 10;
        System.out.println("Velocidad de encendido: " + velocity);
    }

    /**
     * Método para validar vehiculo apagado
     */
    
    public void turnOff() {
        velocity = 0;
        System.out.println("Velocidad vehiculo apagado: " + velocity);
    }

    /**
     * Método para validar aceleracion de motocicleta
     */
    
    public void accelerate() {
        velocity = velocity+10;
        System.out.println("Velocidad de aceleración: " + velocity + "Km/h");
    }

    /**
     * Método para validar frenado de vehiculo
     */
    
    public void brake() {
        velocity = velocity-10;
        System.out.println("Velocidad de Frenado: " + velocity + "Km/h");
    }
}
