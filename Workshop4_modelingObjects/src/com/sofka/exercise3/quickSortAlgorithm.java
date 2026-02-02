package com.sofka.exercise3;

/**
 * Clase quickSortAlgorithm.java creada para hacer un algoritmo de 
 * ordenamiento Quick Sort
 *
 * @version [1.0.0 2022-09-06, Clase correspondiente a versión N°1 del sistema,
 *                   no a sufrido ningún refactorings durante la versión].
 *
 * @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
 *
 * @since [Version 1]
 *
 */
public class quickSortAlgorithm {
    
    /**
     * Método donde se declara array para generar numero aleatorio
     */
    
    public void orderQuickSort() {
        int arrayRandom[] = new int[100];
        int randomNumber;

        for (int i = 0; i < arrayRandom.length; i++) {
            randomNumber = (int) (Math.random() * 100);
            arrayRandom[i] = randomNumber;
        }

        /**
         * Llamada Metodo de Ordenamiento QuickSort
         */
        Quicksort(arrayRandom, 0, arrayRandom.length - 1);

        /**
         * Metodo para imprimir Vector Ordenado
         */
        printArray(arrayRandom);
    }

    /**
     * Metodo de Ordenamiento QuickSort
     */
    public void Quicksort(int arrayRandom[], int left, int righ) {
        /**
         * Definición de atributo pivot para guardar numero para comparar
         */
        int pivot = arrayRandom[left];
        /**
         * Definición de atributo de puntero izquierdo
         */
        int i = left;
        /**
         * Definición de atributo de puntero derecho
         */
        int j = righ;
        /**
         * Definición de atributo auxiliar para guardar numero mientras se hace
         * intercambio de numeros
         */
        int aux;
        
        /**
         * Bucle while se encarga de hacer el recorrido de arreglo e 
         * intercambios necesarios para ordenamiento
         */
        while (i < j) {
            while (arrayRandom[i] <= pivot && i < j) {
                i++;
            }

            while (arrayRandom[j] > pivot) {
                j--;
            }

            if (i < j) {
                aux = arrayRandom[i];
                arrayRandom[i] = arrayRandom[j];
                arrayRandom[j] = aux;
            }
        }

        arrayRandom[left] = arrayRandom[j];
        arrayRandom[j] = pivot;

        if (left < j - 1) {
            Quicksort(arrayRandom, left, j - 1);
        }

        if (j + 1 < righ) {
            Quicksort(arrayRandom, j + 1, righ);
        }
    }
    /**
     * Metódo para imprimir el arreglo de numeros ya ordenado
     * @param arrayRandom 
     */
    
    public void printArray(int arrayRandom[]) {
        for (int i = 0; i < arrayRandom.length; i++) {
            System.out.print(arrayRandom[i] + " ");
        }
    }

}