package com.sofka.exercise5;
import java.util.Scanner;

/**
* Clase main.java, Diseñada para mostrar los datos de los objetos 
* pertenecientes a la clase vehiculo.
*
* Debe de ingresar un numero del 1 al 4 para conocer los diferentes 
* vehiculos. 
*
* @version [1.0.0 2022-12-06, Clase correspondiente a versión 1 del sistema,
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
        System.out.println("Bienvenido a nuestro garage," + "\n"
                + "Seleccione la opción que desea realizar:" + "\n"
                + "1. Ver Motocicleta." + "\n"
                + "2. Ver Tren." +"\n"
                + "3. Ver Bicicleta." + "\n"
                + "4. Ver helicoptero." +"\n");
        
        /**
         * Solicitud por teclado de opción a validar
         */
        
        Scanner console = new Scanner(System.in);
        
        int option = console.nextInt();

        /**
         * Creación de Switch con diferentes opciones para validar
         */
        
        switch (option) {
            
            case 1:
                System.out.println("1. Ver Motocicleta:");
                Motorcycle mot = new Motorcycle();
                mot.showData();
                System.out.println("Caracteristicas principales: ");
                mot.mainFeatures();
                break;
                
            case 2:
                System.out.println("2. Ver Tren:");
                Train tra = new Train();
                tra.showData();
                System.out.println("Caracteristicas principales: ");
                tra.mainFeatures();
                break;
                
            case 3:
                System.out.println("3. Ver Bicicleta:");
                Bicycle bic = new Bicycle();
                bic.showData();
                System.out.println("Caracteristicas principales: ");
                bic.mainFeatures();
                break;
                
            case 4:
                System.out.println("4. Ver Helicoptero:");
                Helicopter Hel = new Helicopter();
                Hel.showData();
                System.out.println("Caracteristicas principales: ");
                Hel.mainFeatures();
                break;
            default:
                
                System.out.println("Opción Incorrecta, Salir!!");
                
        }
        
        console.close();
        
    }
}