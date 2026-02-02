package com.sofka.exercise1;

import java.util.Scanner;

/**
 * Clase Principal MainApp.java diseñada para hacer el llamado y mostrar las
 * otras clases diseñadas en el sistema planetario
 *
 * @version [1.0.0 2022-11-06, Clase correspondiente a la versión 1 del sistema,
 * no a sufrido ningún refactoring durante la versión].
 *
 * @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
 *
 * @since [Version 1]
 *
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Instancia de clase Planet1
         */
        
        Planet1 plan1 = new Planet1();
        
        /**
         * Instancia de clase Planet2
         */
        
        Planet2 plan2 = new Planet2();
        
        /**
         * Instancia de clase Planet3
         */
        
        Planet3 plan3 = new Planet3();
        
        /**
         * Instancia de clase Planet4
         */
        
        Planet4 plan4 = new Planet4();
        
        /**
         * Instancia de clase Meteorite
         */
        
        Meteorite met = new Meteorite();
        
        /**
         * Instancia de clase Asteroid
         */
        
        Asteroid ast = new Asteroid();
        
        /**
         * Instancia de clase Comet
         */
        
        Comet com = new Comet();
        
        /**
         * Instancia de clase Sun
         */
        
        Sun sun = new Sun();
        
        /**
         * Instancia de clase Moon
         */
        
        Moon moon = new Moon();
        
        /**
         * Creación de menú principal de opciones
         */
        
        System.out.println("Welcome to our planetary system," + "\n"
                + "Select the option you want to perform:" + "\n"
                + "1. Ver sistema planetario:" + "\n"
                + "2. Fuerza atracción planeta 1:" + "\n"
                + "3. Fuerza atracción planeta 2:" + "\n"
                + "4. Fuerza atracción planeta 3:" + "\n"
                + "5. Fuerza atracción planeta 4:" + "\n"
                + "6. Salir del sistema planetario.");

        /**
         * Solicitud por teclado de opción a validar
         */
        
        Scanner cons = new Scanner(System.in);
        int option = cons.nextInt();

        /**
         * Creación de Switch con diferentes opciones para validar
         */
        
        switch (option) {

            case 1:
                System.out.println("1. Ver sistema planetario: ");

                System.out.println("Planetas: ");
                plan1.showData();
                plan2.showData();
                plan3.showData();
                plan4.showData();

                System.out.println("Escombros Interplanetarios: ");
                System.out.println("-------------------------------------------------------");
                met.showData();
                ast.showData();
                com.showData();

                System.out.println("Estrellas: ");
                System.out.println("-------------------------------------------------------");
                sun.showData();

                System.out.println("Saltelites: ");
                System.out.println("-------------------------------------------------------");
                moon.showData();
                break;

            case 2:
                System.out.println("2. Fuerza de atracción de planeta 1:");
                plan1.calForceAttraction();
                break;

            case 3:
                System.out.println("3. Fuerza de atracción de planeta 2:");
                plan2.calForceAttraction();
                break;

            case 4:
                System.out.println("3. Fuerza de atracción de planeta 3:");
                plan3.calForceAttraction();
                break;

            case 5:
                System.out.println("3. Ver fuerza de atracción de planeta 4:");
                plan4.calForceAttraction();
                break;

            case 6:
                System.out.println("Hasta la vista, ha salido del sistema planetario");
                break;

            default:
                System.out.println("Opción Incorrecta");
        }
        cons.close();
    }
}
