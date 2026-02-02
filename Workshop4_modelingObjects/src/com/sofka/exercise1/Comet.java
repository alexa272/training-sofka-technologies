package com.sofka.exercise1;

/**
* Clase Comet.java diseñada para mostrar atributos de un cometa
*
* @version [1.0.0 2022-11-06, Clase correspondiente a la versión 1 del sistema,
*                 no a sufrido ningún refactoring durante la versión].
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1]
*
*/

public class Comet {
    
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
    
    public Comet() {
        this.id = 5;
        this.name = "Haley";
        this.type = "Cometa";
        this.category = "Escombro Interplanetario";
        this.weight = 50;
        this.size = 157;
        this.speed = 200;
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
