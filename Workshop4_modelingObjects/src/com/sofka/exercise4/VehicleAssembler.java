package com.sofka.exercise4;
import java.util.Scanner;
/**
* Clase VehicleAssembler.java Diseñada para crear vehiculos tipo ferry
*
* @version [1.0.0 2022-12-06, La clase corresponde a la versión 1 del sistema,
*               la cual no a sufrido ningún refactoring durante la versión].
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1]
*
*/

public class VehicleAssembler implements IVehicleProcesses{
    
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
     * Creación del constructor y asignacion de valores
     */
    
    public VehicleAssembler() {
        this.numberPassengers = 100;
        this.weigth = 0;
        this.velocity = 0;
        this.name = "";
        this.color = ColorEnum.WHITE;
        this.typeVehicle = "Ferry";
        this.plateVehicle = "";
    }
    
    /**
     * Creación de constructor
     * @param numberPassengers
     * @param weigth
     * @param velocity
     * @param name
     * @param color
     * @param typeVehicle
     * @param plateVehicle 
     */
    public VehicleAssembler(int numberPassengers, double weigth, double velocity, String name, ColorEnum color, String typeVehicle, String plateVehicle) {
        this.numberPassengers = numberPassengers;
        this.weigth = weigth;
        this.velocity = velocity;
        this.name = name;
        this.color = color;
        this.typeVehicle = typeVehicle;
        this.plateVehicle = plateVehicle;
    
    }
    
    /**
     * Metodo para creación de vehiculos
     */
    
    public void CreateVehicle() {
        System.out.println("Zona de creación de vehículos tipo ferry:"+"\n");
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 10; i++) {
            int numFerry= 1;
            
            if(i<10){
            System.out.println("Este es el número de Ferry: "+i+"\n"
                                +"-------------------"); 
            
            System.out.print("Ingresa nombre vehiculo(sin espacios): "+"\n");
            name = sc.next();  

            System.out.print("Ingresa peso vehiculo: "+ "\n");
            weigth = sc.nextDouble(); 

            System.out.print("Ingresa placa vehiculo: " + "\n");
            plateVehicle = sc.next(); 
            
            System.out.println("Crear siguiente vehiculo..."+ "\n"
                            +"_________________________");
            
            numFerry++;
            }else{
                
                System.out.println("Ha creado el número máximo de vehículos permitido!!");
                
            }
            showData();
        }
    }
    
    /**
     * Método para visualizacion de datos
     */
   
    public String showData(){
        System.out.println("Vehiculo tiene: " + numberPassengers +" pasajeros"+ "\n"
                + "Nombre: " + name + "\n" + "Color: "+ ColorEnum.WHITE + "\n"
                    + "Vehiculo: " + typeVehicle +"\n"
                    + "Numero de placa: " + plateVehicle+ "\n"
                    + "Peso: " + weigth + "\n"+
                "--------------------------------------------------------");    
        return "";
    }

    /**
     * Método para validar vehiculo encendido
     */
    public void turnOn() {
        velocity = 10;
        System.out.println("Vehículo encendido: "+velocity);
    }

    /**
     * Método para validar vehiculo apagado
     */
    
    public void turnOff() {
        velocity = 0;
        System.out.println("Vehículo apagado: "+velocity);
    }

    /**
     * Método para validar aceleracion de vehiculo
     */
    
    public void accelerate() {
        velocity = velocity+100;
        System.out.println("Aceleración del vehículo: "+velocity+"Km/h");
    }

    /**
     * Método para validar frenado de vehiculo
     */
    
    public void brake() {
        velocity = velocity-1;
        System.out.println("Frena a una velocidad de: "+velocity+"Km/h");
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