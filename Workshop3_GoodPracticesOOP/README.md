# Taller de buenas Prácticas de POO

Proyecto reproductor de música utilizando Programación Orientada a Objetos y Buenas prácticas de programación

### MainApp

```
Clase Principal desde donde inicia el programa, contiene menú para uso del reproductor de música.
```

### Library

```
Clase que hereda métodos y atributos de la clase Song, e implementa métodos de la interfaz IPlayList.
Método de la showPlayList() para crear una biblioteca de canciones.
```

### PlayListLibrary

```
Clase que contiene atributos de una canción. Implementa Interfaz Comparator e Interfaz Comparable para 
comparar datos del ArrayList y poder ordenar por duración y ordenar por fecha.
Método compare()
Método compareTo()
Método showData() para mostrar información de la canción.
```

### IPlayList

```
Esta interfaz permite definir el método randomMusic() que usará la clase que implemente esta interfaz.
```

### PlayList

```
Esta clase ha sido diseñada para poder crear una Playlist a partir de una biblioteca de canciones (Clase Library) 
Esta clase contiene lo siguiente:

name Atributo para definir el nombre de la playList, a la cual se le asignan sus métodos getter y setter.
ArrayList Que permitira crear una lista de canciones.
createPlaylist(int id) Método que añade canciones a la lista según el id recibido por parámetro.
showPL() Método que muestra la información de la playList que se acaba de crear.

```

### Song

```
Esta clase abstracta Song.java ha sido diseñada para crear canciones y para extender, se realiza definición de métodos get 
y set y se definen los métodos abstractos a implementar: 
filterGenre() Método abstracto filtrar por genero
filterYear() Métodos abstracto filtrar por año
orderDuration() Método abstracto ordenar lista de canciones por Duración
orderDate() Método abstracto ordenar lista de canciones por fecha
```

### GenreEnum

```
Clase Enumerador por genero, Contiene los géneros musicales de las canciones.
```


## Autoras

* **Alexandra Santa Muñoz** - **Valentina Santa Muñoz** - *Codificación y Documentación* -
