# Workshop4_modelingObjects

### Author: Alexandra Santa Muñoz

This repository covers object modeling in Java. It initially contains the following packages:
- com.exercise1

- com.exercise2

- com.exercise3

- com.exercise4

- com.exercise5

- com.exercise6


## REPOSITORY PACKAGE DESCRIPTION:

## PACKAGE: com.exercise1:

This package contains an exercise implementing a planetary system consisting of two celestial bodies (the moon and the sun), three interplanetary objects, and four planets. The gravitational attraction between these planets is calculated. Get and set methods were used to obtain and set the declared attributes. These are the classes created for the planetary system:

```
Planet.java, Planet1.java, Planet2.java, Planet3.java, Planet4.java, Meteorite.java, Moon.java, Sun.java, Asteroide.java, Comet.java, and MainApp.java
```

The following method was used in all classes:

**showData():**
```
Method to display information about the planetary system.

```` ```
Additionally, the following method was used in the classes that extend the abstract class Planet.java:

**calForceAttraction():**
```
Method to calculate force of attraction.
```

## PACKAGE: com.exercise2:

**Answer to question 2:**

Is it possible to run a Java program that contains several classes with main methods? If so, how is the entry point to a program determined?

It is possible to run it, but several things happen:
```
1. When you click on the arrow at the top of the IDE, which is normally used to run the program, the class with a main method that is executed first is the class created by default with this method, that is, the first class created.

2. The others also work, but you have to right-click on each one and select "Run File" for it to execute with its respective main method.


```` 3. When you right-click and select "Run" in the package where the classes are created, the file that is executed is the default class created with this method, that is, the first class created.

To answer this question, two classes were created:
Ex2.java and Exercise2.java, which are included in the com.exercise2 package.

## PACKAGE: com.exercise3: This exercise involves two of the most commonly used sorting algorithms: bubble sort and quicksort.

***BubbleSortAlgorithm***

_PROCESSES:_
1. Declaration of attributes and array creation
2. A for loop iterates through the array containing random numbers
3. A for loop applies the bubble sort method.

4. In a for loop to display the sorted data
```
***QuickSortAlgorithm***
```
_PROCESSES:_
1. Declaration of attributes and array creation.

2. Random array traversal
3. The first value is taken as the pivot.

4. The two sides and an auxiliary array are defined
```
## PACKAGE: com.exercise4:

In this exercise, we will develop a class to display the data of objects belonging to the ferry class and the creation of ferry-type vehicles. Get and set methods were used to obtain and set the declared attributes. Additionally, the following methods were used in these three classes:

***showListFerry()***
```
Method to create the ferry array.

```
***showFerry()***
```
Method to display ferry data.

```
```
```
```
```
```
```
```
``` ```

***CreateVehicle()***
```
Method for creating vehicles.

``
***turnOn()***
```
Method to validate that the vehicle is on.

``
***turnOff()***
```
Method to validate that the vehicle is off.

``
***accelerate()***
```
Method to validate that the vehicle is accelerating.

``
***brake()***
```
Method to validate that the vehicle is braking.

```
```
```
```
```
```
```
```
```
``` ```

## PACKAGE: com.exercise5:

In this exercise, a vehicle class was designed to generate different means of transportation such as motorcycles, bicycles, trains, and helicopters. Get and set methods were used to obtain and set the declared attributes. Additionally, the following methods were used in the different classes:

***showData()***
```
Method to display vehicle data.

``
***mainFeatures()***
```
Method to display class characteristics.

``
***turnOn()***
```
Method to validate that the vehicle is on.

``
***turnOff()***
```
Method to validate that the vehicle is off.

``
***accelerate()***
```
Method to validate the motorcycle's acceleration.

```
```
```
```
```
```
```
```
``` ```
***brake():***
```
Method to validate vehicle braking.
```

## PACKAGE: com.exercise6:

This exercise checks if a number entered from the keyboard is repeated. This package contains two classes: the MainApp.java class, used to instantiate and display program information, and the RepeatNumber.java class, which is responsible for performing the validations and finding the repeated number. The following method is used for this purpose:

***repeatNumber():*** This method performs the following validations:
```
1. Requests the number of spaces the vector will have.

2. Iterates through the vector.
