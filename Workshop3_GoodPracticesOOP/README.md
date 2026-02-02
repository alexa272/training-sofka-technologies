# OOP Best Practices Workshop

Music Player Project Using Object-Oriented Programming and Best Programming Practices

### MainApp

```
Main class where the program starts; contains a menu for using the music player.

```

### Library

```
Class that inherits methods and attributes from the Song class and implements methods from the IPlayList interface.

```

### PlayListLibrary

```
Class that contains song attributes. Implements the Comparator and Comparable interfaces to compare data from the ArrayList and allow sorting by duration and date.
` ... ```

### IPlayList

```
This interface allows you to define the randomMusic() method that will be used by the class implementing this interface.

``

### PlayList

```
This class has been designed to create a playlist from a library of songs (Library class). This class contains the following:

name Attribute to define the name of the playlist, to which its getter and setter methods are assigned.

ArrayList Which will allow you to create a list of songs.

createPlaylist(int id) Method that adds songs to the list according to the id received as a parameter.

showPL() Method that displays the information of the playlist that has just been created.

```

### Song

```
This abstract class, Song.java, has been designed to create and extend songs. It defines getter and setter methods and the following abstract methods to be implemented:
filterGenre() Abstract method to filter by genre
filterYear() Abstract method to filter by year
orderDuration() Abstract method to order a list of songs by duration
orderDate() Abstract method to order a list of songs by date
```

### GenreEnum

```
Genre Enum class. Contains the musical genres of the songs.

```

## Authors

* **Alexandra Santa Muñoz** - **Valentina Santa Muñoz** - *Coding and Documentation* -
