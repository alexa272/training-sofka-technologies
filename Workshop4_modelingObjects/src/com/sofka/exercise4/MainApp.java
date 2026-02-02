package com.sofka.exercise4;
import java.util.Scanner;

/**
* Clase MainApp.java, Diseñada para mostrar los datos de la clase ferry 
* y la creacion de vehiculo tipo ferry
*
* @version [1.0.0 2022-12-06, La clase corresponde a la versión 1 del sistema,
*               la cual no a sufrido ningún refactoring durante la versión].
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1]
*
*/

public class MainApp {

    public static void main(String[] args) {
        
        /**
         * Creación del menu principal de opciones
         */
        
        System.out.println("Bienvenido al mundo de los Ferrys," + "\n"
                + "Seleccione la opción que desea realizar: " + "\n"
                + "1. Ver Ferries" + "\n"
                + "2. Crear un nuevo vehiculo tipo Ferry");
        
        /**
         * Solicitud por teclado de opción a validar
         */
        
        Scanner console = new Scanner(System.in);
        
        int option = console.nextInt();
        Ferry fer = new Ferry();
        VehicleAssembler veh = new VehicleAssembler();
        
        /**
         * Creación de Switch con diferentes opciones para validar
         */
        
        switch (option) {
            
            case 1:
                System.out.println("1. Ver Ferries");
                fer.showFerry();
                System.out.println("Características principales: ");
                veh.turnOn();
                veh.turnOff();
                veh.accelerate();
                veh.brake();
                break;
                
            case 2:
                System.out.println("2. Crear un nuevo vehiculo");
                veh.CreateVehicle();
                break;
                
            default:
                
                System.out.println("Opción Incorrecta, Salir del programa!!");
                
        }
        
        console.close();
        
    }
}