package com.sofka.exercise4;
import java.util.ArrayList;

/**
* Clase Ferry.java Diseñada para extender a clases tipo ferry
*
* @version [1.0.0 2022-12-06, La clase corresponde a la versión 1 del sistema,
*               la cual no a sufrido ningún refactoring durante la versión].
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1]
*
*/

public class Ferry extends Vehicle{
    
    /**
     * Declaración de arraylist de vehiculos tipo ferry
     */
    
    private ArrayList <VehicleAssembler> fer1;
    
    /**
     * Creación de constructor
     */
    
    public Ferry() {
        fer1 = new ArrayList<>();
    }
    
    /**
     * Creación de ArrayList con tipos de ferry
     */
    
     @Override
    public void showListFerry() {

        fer1.add(new VehicleAssembler(100, 750, 100, "Vitoria", ColorEnum.WHITE, "Acuatic", "GTR25"));
        fer1.add(new VehicleAssembler(100, 600, 100, "the big Bear", ColorEnum.GREEN, "Acuatic", "LOR85"));
        fer1.add(new VehicleAssembler(100, 550, 100, "Tulips", ColorEnum.RED, "Acuatic", "DFT45"));
        fer1.add(new VehicleAssembler(100, 800, 100, "Bariloche", ColorEnum.BLACK, "Acuatic", "XFR44"));
    }
    
    /**
     * Creacion de metodo para recorrer el ArrayList tipo ferry
     */
    
    @Override
    public void showFerry(){
        showListFerry();
        for (VehicleAssembler f : fer1)
            System.out.println(f.showData()); 
    }
}

    
