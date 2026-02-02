package com.sofka.exercise1;

/**
* Clase meteorite.java diseñada para mostrar atributos de los meteoritos.
* 
* @version [1.0.0 2022-11-06, Clase correspondiente a la versión 1 del sistema,
*                 no a sufrido ningún refactoring durante la versión].
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1]
*
*/
public class Meteorite {
    
    /**
     * Declaración atributo id
     */
    
    private int id;
    
    /**
     * Declaración atributo tipo
     */
    
    private String type;
    
    /**
     * Declaración atributo nombre
     */
    
    private String name;
    
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
    
    public Meteorite() {
        this.id = 7;
        this.type = "Meteorito";
        this.name = "Canibal";
        this.category = "Escombro Interplanetario";
        this.weight = 958;
        this.size = 310;
        this.speed = 1500;
    }

    /**
     * Método para mostrar Datos
     */
    
    public void showData() {
        System.out.println("ID: " + id + "\n"
                + "Nombre: " + name + "\n" 
                + "Tipo: " + type + "\n"         
                + "Peso: " + weight + "\n" + "Tamaño: " + size+ "m"+ "\n"  
                + "Velocidad: " + speed + "\n"
                + "-------------------------------------------------------");
    }       
}
