package com.sofka.exercise3;

/**
 * Clase bubbleAlgorithm.java creada para hacer un algoritmo de 
 * ordenamiento Burbuja
 *
 * @version [1.0.0 2022-08-06, Clase correspondiente a versión 1 del sistema,
 *              No a sufrido ningún refactoring durante versión].
 *
 * @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
 *
 * @since [Version 1]
 *
 */

public class bubbleAlgorithm {

    public void OrderBubbleAlg() {
        /**
         * Declaración de atributos y creacion de array
         */
        int arrayRandom[] = new int[100];
        int auxBox;
        int randomNumber;
        
        /**
         * for realiza el recorrido de array que contiene numeros aleatorios
         */
        for (int i = 0; i < arrayRandom.length; i++) {
            randomNumber = (int)(Math.random()*100);
            arrayRandom[i] = randomNumber; 
        }

        /**
         * bucle for para aplicar el metodo de la burbuja
         */
        for (int i = 0; i < arrayRandom.length - 1; i++) {
            for (int j = i; j < arrayRandom.length; j++) {
                if (arrayRandom[i] > arrayRandom[j]) {
                    auxBox = arrayRandom[i];
                    arrayRandom[i] = arrayRandom[j];
                    arrayRandom[j] = auxBox;
                }
            }
        }

        /**
         * bucle for para mostrar los datos ordenados
         */
        
        for (int i = 0; i < arrayRandom.length; i++) {
            System.out.print(arrayRandom[i] + " ");
        }
    }
}
