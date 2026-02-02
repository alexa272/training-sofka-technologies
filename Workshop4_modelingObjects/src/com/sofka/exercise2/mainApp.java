package com.sofka.exercise2;
import java.util.Scanner;
/**
* Clase principal mainApp.java diseñada para validar si es posible utilizar 
* mas de un main en un proyecto
*
* @version [1.0.0 2022-08-06, La clase corresponde a la versión 1 del sistema,
*               la cual no a sufrido ningún refactoring durante la versión].
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1]
*
*/
public class mainApp {
    /**
     * Declaración de metodo principal main
     * @param args 
     */
    public static void main(String[] args) {
        
        System.out.println("enter a number from 1 to 5");
        
        Scanner console = new Scanner(System.in);
        
        int option = console.nextInt();
        
        System.out.println("clase mainApp la opción seleccionada fue : "+option);
    }
}
