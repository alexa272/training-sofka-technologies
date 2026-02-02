package com.sofka_Workshop2;

/**
* Interface ICamera.java is an interface designed to implement 
* shuttle-type spacecraft.
*
* @version [1.0.0 2022-02-06, Class corresponds to version 1 of the system, 
 *                  It has not undergone any refactoring during the version].
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1]
*
*/

public interface ICamera {
    
    /**
     * Methods takePictures generated to take pictures of celestial 
     * bodies and planetary surfaces
     * @return 
     */
    
    public void takePictures();
    
    /**
     * Method record Planets generated for recording celestial bodies 
     * and planetary surfaces 
     * @return 
     */
    
    public void recordPlanets();
}
