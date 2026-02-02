package com.sofka.exercise5;

/**
* Clase Motorcycle.java ha sido diseñada para crear objetos tipo motocicleta
*
* @version [1.0.0 2022-12-06, La clase corresponde a la versión 1 del sistema,
*               la cual no a sufrido ningún refactoring durante la versión].
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1]
*
*/

public class Motorcycle extends Vehicle{
    /**
     * Declaración atributo numero de pasajeros
     */
    private int numberPassengers;
    /**
     * Declaración atributo numero de luces
     */
    private int numberOfLights;
    /**
     * Declaración atributo numero de ruedas
     */
    private int numberWheels;
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
     * Declaración atributo tipo de vehiculo
     */
    private String typeVehicle;
    /**
     * Declaración atributo tipo de motocicleta
     */
    private String typeMotorcycle;
    /**
     * Declaración atributo placa del vehiculo
     */
    private String plateVehicle;
    
    /**
     * Creación de constructor y asignacion de valores a los atributos
     */
    
    public Motorcycle() {
        this.numberPassengers = 2;
        this.numberOfLights = 6;
        this.numberWheels = 2;
        this.weigth = 200;
        this.velocity = 60;
        this.name = "Motocicleta";
        this.color = ColorEnum.BLACK;
        this.typeVehicle = "Land";
        this.typeMotorcycle = "Scrambler";
        this.plateVehicle = "NKR568";
    }

    /**
     * Método para mostrar datos de vehiculo
     */
    
    public void showData(){
        System.out.println("Vehiculo tiene: " + numberPassengers +" pasajeros"+ "\n"
                +"Numero de luces: " + numberOfLights + "\n"
                +"Numero de ruedas: " + numberWheels + "\n"
                + "Nombre: " + name + "\n"+"Peso: " + weigth + "\n"
                + "Velocidad: " + velocity + "\n" 
                + "Color: "+color+ "\n"
                + "Tipo de vehiculo: " + typeVehicle +"\n"
                + "Tipo de motocicleta: " + typeMotorcycle +"\n"
                + "Numero de placa: " + plateVehicle+ "\n"
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
        velocity = velocity+10;
        System.out.println("Velocidad de aceleración: "+velocity+"Km/h");
    }

    /**
     * Método para validar frenado de vehiculo
     */
    
    public void brake() {
        velocity = velocity-10;
        System.out.println("Velocidad de Frenado: "+velocity+"Km/h");
    }  
}
