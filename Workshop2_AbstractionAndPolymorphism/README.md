# Workshop2_AbstractionAndPolymorphism

### Author: Alexandra Santa Muñoz

This repository develops the topic of design and programming: Abstractions, interfaces and polymorphism. It contains in first instance the following files:

AssemblyCenter.java, ICamera.java, IShuttleOperation.java, mainApp.java, Spacecraft.java,  Manned.java, Unmanned.java, Shuttle.java.
 
## REPOSITORY FILE DESCRIPTION:

***AssemblyCenter.java:*** class.

This AssemblyCenter.java class has been designed to create a spaceship, it contains the following methods:

**CreateSpaceCraft():** 
Which has a menu of options where the user can select between the three different types of spacecraft that can be created, shuttle type, manned spacecraft and unmanned spacecraft.

----------------------------------------------------------
***SpaceCraft.java:***

Abstract attributes and methods are declared to extend spaceships.

**ShowData():** Abstract method to visualize information.
**TurnOn():** Abstract method to indicate if the spacecraft is on or not.
**TurnOff():** Abstract method to indicate if spacecraft is off or not.
**transport():** Abstract method to indicate which ship is transporting.
**propel():** Abstract method to indicate the propulsion of the ship.
     
----------------------------------------------------------
***Manned.java*** , Unmanned.java, Shuttle.java

Attribute declaration and assignment, creation of the following methods:

**showData():** Abstract method to display information.
**TurnOn():** Abstract method to indicate if the ship is on or not.
**TurnOff():** Abstract method to indicate if ship is off or not.
**transport():** Abstract method to indicate which ship is transporting.
**propel():** Abstract method to indicate ship propulsion.
     

***Unmanned.java*** 

Attribute declaration and assignment, creation of the following methods and implementation of the methods of the ICamera interface are performed:

**showData():** Abstract method to visualize information.
**TurnOn():** Abstract method to indicate if the camera is on or not.
**TurnOff():** Abstract method to indicate if ship is off or not.
**transport():** Abstract method to indicate which ship is transporting.
**proppel():** Abstract method to indicate the propulsion of the ship.

***Implements ICamera interface***

**TakePictures():** Method to take pictures of celestial bodies.
**RecordPlanets():** Method to record celestial bodies and planets.     


----------------------------------
***Shuttle.java***

Attribute declaration and assignment, creation of the following methods and implementation of the methods of the ICamera interface are performed:

**showData():** Abstract method to visualize information.
**TurnOn():** Abstract method to indicate if the camera is on or not.
**TurnOff():** Abstract method to indicate if ship is off or not.
**transport():** Abstract method to indicate which ship is transporting.
**proppel():** Abstract method to indicate the propulsion of the ship.

***Implements IShuttleOperation interface***

**supplying():** Method for supplying spaces Crafts    
**cleaning():** Method for ship cleaning process.
**regulatinglift():** Method to regulate the elevation of satellites and rockets.
**studyCelestialBodies():** Method to study celestial bodies.


**INTERFACE ICAMERA:** 

**TakePictures():** Method to take pictures of celestial bodies.
**RecordPlanets():** Method to record celestial bodies and planets.

***INTERFACE ISHUTTLEOPERATION***

**supplying():** Method for supplying spaces Crafts    
**cleaning():** Method for ship cleaning process.
**regulatinglift():** Method to regulate the elevation of satellites and rockets.
**studyCelestialBodies():** Method to study celestial bodies.
