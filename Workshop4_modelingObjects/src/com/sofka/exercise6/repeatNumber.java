package com.sofka.exercise6;
import java.util.Scanner;

/**
 * Clase repeatNumber.java, Diseñada para calcular un numero esta repetido 
 * dentro de cierta cantidad de numeros que  
 *
 * @version [1.0.0 2022-08-06, Clase corresponde a versión 1 del sistema, 
 *                      No a sufrido ningún refactoring durante la versión].
 *
 * @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
 *
 * @since [Version 1]
 *
 */

public class repeatNumber {

    public void repeatNumber() {
        
        /**
         * Solicita el numero de espacios que va a tener el array
         */
        
        System.out.println("Introduzca el número de campos del arreglo");

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        int ArrayNum1[] = new int[num1];
        
        /**
         * Recorre el vector hasta la el final de su longitud
         */
        
        for (int i = 0; i < ArrayNum1.length; i++) {

            System.out.println("Ingrese un numero: ");
            ArrayNum1[i] = sc.nextInt();
            
            /**
             * if diseñado para validar la longitud del array, 
             * si es = 0 significa que no tiene espacio se sale del programa
             */
            
            if (i != 0) {
                
                /**
                 * cuando la variable z sea igual a la longitud del programa
                 * imprime todo si no se ha cumplido la condicion del numero repetido
                 */
                
                for (int z = 0; z < i; z++) {
                    if (ArrayNum1[i] == ArrayNum1[z]) {
                        for (int j = 0; j < ArrayNum1.length; j++) {
                            System.out.print(ArrayNum1[j] + " ");
                        }
                        System.out.println("Este número esta repetido: "+ ArrayNum1[i]);
                        ArrayNum1[i] = sc.nextInt();
                            
                    }
                }
            }
        }
    }
}
