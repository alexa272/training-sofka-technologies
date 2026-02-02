package com.sofka_W1;

/**
* Class designed to create Currency objects with attributes and 
* methods
*
* @version [1.0.0 2022-01-06, The class corresponds to version 1 of the system,
*                   which has not undergone any refactoring during the version].
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1].
*
*/

public class Coin {
    
    /**
     * Definition of attribute color
     */
    
    private String color;
    
    /**
     * Definition of attribute weight
     */
    
    private String weight;
    
    /**
     * Definition of attribute form
     */
    
    private String form;
    
    /**
     * Definition of attribute material
     */
    
    private String material;
    
    /**
     * Definition of attribute value
     */
    
    private String value;
    
    /**
     * Creation of class constructor
     * @param color
     * @param weight
     * @param form
     * @param material
     * @param value 
     */
    
    public Coin(String color, String weight, String form, String material, String value) {
        this.color = color;
        this.weight = weight;
        this.form = form;
        this.material = material;
        this.value = value;
    }
    
    /**
     * Method get Color
     * @return 
     */
    
    public String getColor() {
        return color;
    }
    
    /**
     * Method set Color
     * @param color 
     */
    
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Method get Weight
     * @return 
     */
    
    public String getWeight() {
        return weight;
    }
    
    /**
     * Method get Weight
     * @param weight 
     */
    
    public void setWeight(String weight) {
        this.weight = weight;
    }
    
    /**
     * Method get Form
     * @return 
     */
    
    public String getForm() {
        return form;
    }
    
    /**
     * Method set Form
     * @param form 
     */
    
    public void setForm(String form) {
        this.form = form;
    }

    /**
     * Method get Material
     * @return 
     */
    
    public String getMaterial() {
        return material;
    }
    
    /**
     * Method set Material
     * @param material 
     */
    
    public void setMaterial(String material) {
        this.material = material;
    }
    
    /**
     * Method get Value
     * @return 
     */
    
    public String getValue() {
        return value;
    }
    
    /**
     * Method set Value
     * @param value 
     */
    public void setValue(String value) {
        this.value = value;
    }    
}
