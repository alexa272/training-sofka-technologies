package com.sofka.exercise1;

/**
* Clase Moon.java diseñada para mostrar atributos de la luna.
*
* @version [1.0.0 2022-11-06, Clase correspondiente a la versión 1 del sistema,
*                 no a sufrido ningún refactoring durante la versión].
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1]
*
*/

/**
 *
 * @author Alexandra Santa Mu
 */
public class Moon{
    
    /**
     * Declaración atributo id
     */
    
    private int id;
    
    /**
     * Declaración atributo tipo
     */
    
    private String type;
    
    /**
     * Declaración atributo categoria
     */ 
    
    private String category;
    
    /**
     * Declaración atributo peso
     */
    
    private int weight;
    
    /**
     * Declaración atributo tamaño
     */
    
    private int size;
    
    /**
     * Creación de constructor de clase
     */

    public Moon() {
        this.id = 9;
        this.type = "Luna";
        this.category = "Cuerpos Celestes";
        this.weight = 1000;
        this.size = 780;
    }

    /**
     * Método para mostrar Datos
     */
    
    public void showData() {
        System.out.println("ID: " + id + "\n"
                + "Tipo: " + type + "\n" 
                + "Categoria: " + category + "\n" 
                + "Peso: " + weight + "\n" 
                + "Tamaño: " + size+ "m"+ "\n"  
                + "-------------------------------------------------------");
    } 
}
