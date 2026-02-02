package com.sofka.exercise1;
/**
* Clase Abstracta Planet.java diseñada para extender clases 
* planeta.
*
* @version [1.0.0 2022-11-06, Clase correspondiente a la versión 1 del sistema,
*                 no a sufrido ningún refactoring durante la versión].
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1]
*
*/

public abstract class Planet {
    
    /**
     * Declaración atributo id
     */
    
    private int id;
    
    /**
     * Declaración atributo nombre
     */
    
    private String name;
    
    /**
     * Declaración atributo densidad
     */
    
    private int density;
    
    /**
     * Declaración atributo diametro
     */
    
    private int diameter;
    
    /**
     * Declaración atributo distancia al sol
     */
    
    private int distanceSun;
    
    /**
     * Declaración atributo gravedad
     */
    
    private double gravity;

    /**
     * Creación de constructor de clase
     */
    
    public Planet() {
        this.id = 0;
        this.name = "";
        this.density = 0;
        this.diameter = 0;
        this.distanceSun = 0;
        this.gravity = 0;
    }

    /**
     * Método abstracto para mostrar Datos
     */
    
    public abstract void showData();
    
    /**
     * Método abstracto para calcular la fuerza de atracción gravitacional
     */
    
    public abstract void calForceAttraction();
    
    /**
     * Metodo para obtener id
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Método para establecer id
     * @param id 
     */
    
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo para obtener nombre
     * @return 
     */
    
    public String getName() {
        return name;
    }

    /**
     * Método para establecer nombre
     * @param name 
     */
    
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo para obtener densidad
     * @return 
     */
    
    public int getDensity() {
        return density;
    }

    /**
     * Método para establecer densidad
     * @param density 
     */
    
    public void setDensity(int density) {
        this.density = density;
    }

    /**
     * Metodo para obtener diametro
     * @return 
     */
    
    public int getDiameter() {
        return diameter;
    }

    /**
     * Método para establecer diametro
     * @param diameter 
     */
    
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    /**
     * Metodo para obtener distancia al sol
     * @return 
     */
    
    public int getDistanceSun() {
        return distanceSun;
    }

    /**
     * Método para establecer distancia al sol
     * @param distanceSun 
     */
    
    public void setDistanceSun(int distanceSun) {
        this.distanceSun = distanceSun;
    }

    /**
     * Metodo para obtener gravedad
     * @return 
     */
    
    public double getGravity() {
        return gravity;
    }

    /**
     * Método para establecer gravedad
     * @param gravity 
     */
    
    public void setGravity(double gravity) {
        this.gravity = gravity;
    }  
}
