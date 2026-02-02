package com.sofka_Workshop2;
import java.util.Scanner;
/**
* Class mainApp.java is the main program execution
*
* @version [1.0.0 2022-03-06, Class corresponds to version 1 of the system, 
 *                  It has not undergone any refactoring during the version].
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1]
*
*/
public class mainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Main menu for Space Craft 
         */

        System.out.println("Welcome To Centro espacial Star revelation.");
        Scanner consoleOption = new Scanner(System.in);
        System.out.println("Select an option: " +
                "\n" + "1. Learn about our spacecraft."
                + "\n" + "2. Create a Spaceship. "
                + "\n" + "3. Exit System");

        int option = Integer.parseInt(consoleOption.nextLine());
        /**
         * Switch con opciones para navegar en sistema
         */
        switch (option) {
            case 1:
                
                System.out.println("This is the space Craft N° 1: ");
                Unmanned Apolo = new Unmanned();
                Apolo.showData();
                Apolo.SpacecraftStatus();
                System.out.println("UNMANNED SPACECRAFT PROCESSES: ");
                Apolo.CameraOperations();
                System.out.println("-------------------------------");

                System.out.println("This is the space Craft N° 2: ");
                Manned Spirit = new Manned();
                Spirit.showData();
                Spirit.SpacecraftStatus();
                System.out.println("-------------------------------");

                System.out.println("This is the space Craft N° 3: ");
                Manned Candy = new Manned();
                Candy.showData();
                Candy.SpacecraftStatus();
                System.out.println("-------------------------------");

                System.out.println("This is the space Craft N° 4: ");
                Shuttle Dimitria = new Shuttle();
                Dimitria.showData();
                Dimitria.SpacecraftStatus();
                Dimitria.shuttleOperation();
                System.out.println("-------------------------------");
                break;

            case 2:
                System.out.println("You Select Create a Space Craft:");
                AssemblyCenter assembly = new AssemblyCenter();
                assembly.CreateSpaceCraft();

                break;
            case 3:
                System.out.println("You have requested to leave the space center, that's all!. Bye");
                break;
            }
                System.out.println("Wrong option");
        }    
    }

