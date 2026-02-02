package com.sofka_Workshop2;
import java.util.Scanner;

/**
 * AssemblyCenter.java class designed to create a shuttle spacecraft, unmanned
 * or manned.
 *
 * You must enter a number from 1 to 3 to create a spacecraft.
 *
 * @version [1.0.0 2022-02-06, The class corresponds to version 1 of the system,
 * which has not undergone any refactoring during the version].
 *
 * @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
 *
 * @since [Version 1]
 *
 */

public class AssemblyCenter {
    
    /**
     * Attribute declaration name
     */
    
    private String name;
    
    /**
     * Attribute declaration type
     */

    private String type;

    /**
     * Attribute declaration propulsion System
     */
    private String propSystem;

    /**
     * Attribute declaration fuelType
     */
    private String fuelType;

    /**
     * Attribute declaration power
     */
    private int power;

    /**
     * Attribute declaration speed
     */
    private int speed;

    /**
     * Attribute declaration weight
     */
    private float weight;

    public AssemblyCenter() {
    }

    /**
     * Creation of method to create spacecraft
     */
    public void CreateSpaceCraft() {
        System.out.println("Welcome To espacial center Star revelation" + "\n"
                + "Here you can create your favorite spacecraft:" + "\n"
                + "1. Shuttle type spacecraft" + "\n"
                + "2. Unmanned spacecraft" + "\n"
                + "3. Manned spacecraft" + "\n");
        /**
         * Request for option to execute
         */
        Scanner consoleOption = new Scanner(System.in);
        int option = Integer.parseInt(consoleOption.nextLine());
        /**
         * Switch with options for spacecraft creation
         */
        switch (option) {
            case 1:{
                System.out.println("This is the spacecraft N° 1 (Shuttle): ");
                type = "Shuttle type spacecraft";
                propSystem = "Chemical Combustion";
                fuelType = "hydrogen and oxygen";

                System.out.println("Enter the name of your spacecraft");
                Scanner consOption1 = new Scanner(System.in);
                name = consOption1.nextLine();

                System.out.println("Power: ");
                Scanner consOption2 = new Scanner(System.in);
                power = Integer.parseInt(consOption2.nextLine());

                System.out.println("Speed: ");
                Scanner consOption3 = new Scanner(System.in);
                speed = Integer.parseInt(consOption3.nextLine());

                System.out.println("Weight: ");
                Scanner consOption4 = new Scanner(System.in);
                weight = Integer.parseInt(consOption4.nextLine());

                System.out.println("THIS IS THE SHIP CREATED:");
                System.out.println("Name: " + name + "\n" + "type: " + type + "\n"
                        + "Propulsion System: " + propSystem + "\n" + "Fuel Type: " + fuelType + "\n"
                        + "Power: " + power + "\n" + "Speed: " + speed + "\n" + "Weight: " + weight);

                System.out.println("-------------------------------");
                break;
                }
            case 2: {
                System.out.println("This is the spacecraft N° 2 (Unmanned): ");
                type = "Unmanned spacecraft";
                propSystem = "Chemical Combustion";
                fuelType = "hydrogen and oxygen";

                System.out.println("Enter the name of your spacecraft");
                Scanner consOption5 = new Scanner(System.in);
                name = consOption5.nextLine();

                System.out.println("Power: ");
                Scanner consOption6 = new Scanner(System.in);
                power = Integer.parseInt(consOption6.nextLine());

                System.out.println("Speed: ");
                Scanner consOption7 = new Scanner(System.in);
                speed = Integer.parseInt(consOption7.nextLine());

                System.out.println("Weight: ");
                Scanner consOption8 = new Scanner(System.in);
                weight = Integer.parseInt(consOption8.nextLine());

                System.out.println("THIS IS THE SHIP CREATED:");
                System.out.println("Name: " + name + "\n" + "type: " + type + "\n"
                        + "Propulsion System: " + propSystem + "\n" + "Fuel Type: " + fuelType + "\n"
                        + "Power: " + power + "\n" + "Speed: " + speed + "\n" + "Weight: " + weight);

                System.out.println("-------------------------------");
                break;
                }
            case 3:{
                System.out.println("This is the spacecraft N° 3 (Manned): ");
                type = "Manned spacecraft";
                propSystem = "Chemical Combustion";
                fuelType = "hydrogen and oxygen";

                System.out.println("Enter the name of your spacecraft");
                Scanner consOption9 = new Scanner(System.in);
                name = consOption9.nextLine();

                System.out.println("Power: ");
                Scanner consOption10 = new Scanner(System.in);
                power = Integer.parseInt(consOption10.nextLine());

                System.out.println("Speed: ");
                Scanner consOption11 = new Scanner(System.in);
                speed = Integer.parseInt(consOption11.nextLine());

                System.out.println("Weight: ");
                Scanner consOption12 = new Scanner(System.in);
                weight = Integer.parseInt(consOption12.nextLine());

                System.out.println("THIS IS THE SHIP CREATED:");
                System.out.println("Name: " + name + "\n" + "type: " + type + "\n"
                        + "Propulsion System: " + propSystem + "\n" + "Fuel Type: " + fuelType + "\n"
                        + "Power: " + power + "\n" + "Speed: " + speed + "\n" + "Weight: " + weight);

                System.out.println("-------------------------------");
                break;
            }
                default: {
                System.out.println("Wrong option");
        }   
     }
  }
}
