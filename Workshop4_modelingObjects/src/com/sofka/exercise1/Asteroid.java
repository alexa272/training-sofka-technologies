package com.sofka.exercise1;
/**
* Clase Asteroid.java diseñada para mostrar atributos de un asteroide
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
public class Asteroid {
    
    /**
     * Declaración atributo id
     */
    
    private int id;
    
    /**
     * Declaración atributo nombre
     */
    
    private String name;
    
    /**
     * Declaración atributo type
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
     * Declaración atributo velocidad
     */
    
    private int speed;   

    /**
     * Creación de constructor de clase
     */
    
    public Asteroid() {
        this.id = 6;
        this.name = "Hamlet";
        this.type = "Asteroide";
        this.category = "Escombro Interplanetario";
        this.weight = 857;
        this.size = 3687;
        this.speed = 2000;
    }
    
    /**
     * Método para mostrar Datos
     */
    
    public void showData() {
        System.out.println("ID: " + id + "\n"
                + "Nombre: " + name + "\n" 
                + "Tipo: " + type + "\n" 
                + "Categoria: " + category + "\n" 
                + "Peso: " + weight + "\n" + "Tamaño: " + size+ "m"+ "\n"  
                + "Velocidad: " + speed + "Km/h"+ "\n" 
                + "-------------------------------------------------------");
    }
}
