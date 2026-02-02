package com.sofka.exercise1;
import java.text.DecimalFormat;

/**
* Clase Planet2.java diseñada para extender A planet.
*
* @version [1.0.0 2022-11-06, Clase correspondiente a la versión 1 del sistema,
*                 no a sufrido ningún refactoring durante la versión].
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1]
*
*/

public class Planet2 extends Planet{
    
    /**
     * Declaración atributo id
     */
    
    private int id;
    
    /**
     * Declaración atributo nombre
     */
    
    private String name;
    
    /**
     * Declaración atributo masa
     */
    
    private int massP2;
    
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
     * Declaración atributo distancia al sol
     */
    
    private double gravity;

    /**
     * Creación de constructor de clase
     */
    
    public Planet2(){
        this.id = 2;
        this.name = "Ariel";
        this.massP2 = 650;
        this.density = 88;
        this.diameter = 409;
        this.distanceSun = 128;
        this.gravity = 6.084;
    }
    
    /**
     * Método para mostrar Datos
     */
    
    @Override
    public void showData() {
       DecimalFormat f = new DecimalFormat();
        f.setMaximumFractionDigits(0);
        System.out.println("ID: " + id + "\n"
                + "Nombre: " + name + "\n"
                + "Masa de planeta 3: " + f.format(massP2) + "Kg"+"\n"
                + "Densidad: " + density + "\n" 
                + "DIAMETER: " + f.format(diameter)+ "m"+ "\n"  
                + "Distancia al sol: " + f.format(distanceSun) + "\n"
                + "Gravedad: " + gravity + "\n"
                + "-------------------------------------------------------");
    }
    
    /**
     * Método para calcular la fuerza de atracción
     */
    
    @Override
    public void calForceAttraction() {
        Planet1 plan1 = new Planet1();
        Planet3 plan3 = new Planet3();
        Planet4 plan4 = new Planet4();
        
        DecimalFormat f = new DecimalFormat();
        f.setMaximumFractionDigits(2);
        
        double massP1 = plan1.getMassP1();
        double forceA = gravity * (massP2 * massP1) / Math.pow(distanceSun, 2);
        
        double massP3 = plan3.getMassP3();
        double forceB = gravity * (massP2 * massP3) / Math.pow(distanceSun, 2);
        
        double massP4 = plan4.getMassP4();
        double forceC = gravity * (massP2 * massP4) / Math.pow(distanceSun, 2);
        
        System.out.println("Fuerza atracción entre planeta 2 y 1 es: "+f.format(forceA));
        System.out.println("Fuerza atracción entre planeta 2 y 3 es: "+f.format(forceB));
        System.out.println("Fuerza atracción entre planeta 2 y 4 es: "+f.format(forceC));
    }

    
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
     * Método para obtener masa
     * @return 
     */
    
    public int getMassP2() {
        return massP2;
    }
    
    /**
     * Método para establecer
     * @param massP4 
     */
    
    public void setMassP2(int massP2) {
        this.massP2 = massP2;
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
