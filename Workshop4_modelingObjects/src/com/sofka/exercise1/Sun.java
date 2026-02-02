package com.sofka.exercise1;
/**
* Clase Sun.java diseñada para mostrar atributos del sol
*
* @version [1.0.0 2022-11-06, Clase correspondiente a la versión 1 del sistema,
*                 no a sufrido ningún refactoring durante la versión].
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1]
*
*/

public class Sun {
    
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
    
    public Sun() {
        this.id = 10;
        this.type = "Sol";
        this.category = "Estrella";
        this.weight = 1500;
        this.size = 487;
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
