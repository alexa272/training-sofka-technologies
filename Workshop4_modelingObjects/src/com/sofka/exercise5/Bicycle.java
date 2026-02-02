package com.sofka.exercise5;
/**
* Clase Bicycle.java ha sido diseñada para crear objetos tipo bicicleta
*
* @version [1.0.0 2022-12-06, La clase corresponde a la versión 1 del sistema,
*               la cual no a sufrido ningún refactoring durante la versión
*               el último cambio fue realizado el 17 de abril de 2022]
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1]
*
*/
public class Bicycle extends Vehicle{
    /**
     * Declaración atributo numero de pasajeros
     */
    private int numberPassengers;
    /**
     * Declaración atributo numero de ruedas
     */
    private int numerWheels;
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
     * Declaración atributo tipo de bicicleta
     */
    private String typeBicycle;
    /**
     * Declaración atributo numero referencia bicicleta
     */
    private String referenceBicycle;
    
    /**
     * Creación de constructor y asignacion de valores a atributos
     */
    
    public Bicycle() {
        this.numberPassengers = 1;
        this.numerWheels = 2;
        this.weigth = 200;
        this.velocity = 25;
        this.name = "Bicicleta Electrica";
        this.color = ColorEnum.BLUE;
        this.typeBicycle = "Electrica";
        this.referenceBicycle = "ASM102";
    }

    /**
     * Método para mostrar datos de vehiculo
     */
    
    public void showData(){
        System.out.println("Vehiculo tiene: " + numberPassengers +" pasajeros"+ "\n"
                +"Numero de ruedas: " + numerWheels + "\n"
                + "Nombre: " + name + "\n"+"Peso: " + weigth + "\n"
                + "Velocidad: " + velocity + "\n" 
                + "Color: "+color+ "\n"
                + "Tipo de bicicleta: " + typeBicycle +"\n"
                + "Referencia bicicleta: " + referenceBicycle + "\n"
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

        System.out.println("Velocidad vehiculo encendido: "+velocity);
    }

    /**
     * Método para validar vehiculo apagado
     */
    
    public void turnOff() {
        velocity = 0;
        System.out.println("Velocidad vehiculo sin movimiento: "+velocity);
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
