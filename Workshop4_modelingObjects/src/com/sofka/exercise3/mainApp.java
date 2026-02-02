package com.sofka.exercise3;
import java.util.Scanner;

/**
 * Esta Clase MainApp.java fue creada para visualizar las dos formas de 
 * ordenar mediante algoritmo de Burbuja y quickSort.
 *
 * @version [1.0.0 2022-08-06, Clase correspondiente a la versión 1 del sistema,
 *          la cual no a sufrido ningún refactoring durante versión].
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
 
        bubbleAlgorithm bur = new bubbleAlgorithm();
        quickSortAlgorithm qui = new  quickSortAlgorithm();

        System.out.println("Select the sorting algorithm to be tested" + "\n"
                + "1. View bubble sorting algorithm:" + "\n"
                + "2. View quicksort sorting algorithm:" + "\n");

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
            System.out.println("Ordenar por Algoritmo de la burbuja:");
            bur.OrderBubbleAlg();
            
            break;

        case 2:
            System.out.println("Ordenar por el algoritmo quicksort:");
            qui.orderQuickSort();
           
            break;
        default:

            System.out.println("Opción Incorrecta, Salir del sistema!!");
    } 
            console.close();
    }
}