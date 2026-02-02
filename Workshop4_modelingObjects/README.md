# WorkShop4_modelingObjects

### Autora: Alexandra Santa Muñoz

En este repositorio se desarrolla el tema de modelado de objetos en Java. Contiene en primer instancia los siguientes paquetes:
- com.exercise1.
- com.exercise2.
- com.exercise3.
- com.exercise4.
- com.exercise5.
- com.exercise6.

## DESCRIPCION DE PAQUETES DEL REPOSITORIO:

## PACKAGE: com.exercise1: 

En este paquete se realiza un ejercicio donde se implementa un sistema planetario que consta de dos cuerpos celestes (luna y sol), tres escombros interplanetarios y cuatro planetas entre los cuales se calcula fuerza de atraccion gravitacional, se utilizaron métodos get y set para obtener y establecer los atributos declarados, estas son las clases creadas para el sistema planetario:

```
Planet.java, Planet1.java, Planet2.java, Planet3.java, Planet4.java, Meteorite.java, Moon.java, Sun.java, Asteroide.java, 
Comet.java y MainApp.java
```

Se utilizo el siguiente método en todas las clases:

**showData():**
```
Método para mostrar informacion de sistema planetario.
```
Adicionalmente, Se utilizo el siguiente método en las clases que extienden de la clase abstracta Planet.java:

**calForceAttraction():** 
```
Método para calcular fuerza de atracción.
```

## PACKAGE: com.exercise2:

**Respuesta pregunta 2:**

¿Es posible ejecutar un programa en java que contenga varias clases con métodos main? En caso positivo, ¿cómo se determina el punto de entrada a un programa?

Si es posible ejecutarlo, pero suceden varias cosas:
```
1. cuando se da clic en la flecha de la parte superior del IDE la que normalmente se utiliza para correr 
el programa, la clase con metodo main que primero se ejecuta es la clase creada por defecto con este metodo, 
es decir la primera clase creada.

2. las otras tambien funcionan pero se tiene que dar clic derecho en cada una y decirle run file para que 
ejecute con su respectivo metodo main.

3. cuando se da clic derecho, run en el paquete donde estan creadas las clases, el archivo que ejecuta es 
la clase creada por defecto con este metodo, es decir la primera clase creada.

Para resolver esta pregunta se crearon dos clases:
Ex2.java y Exercise2.java, se adjuntan en paquete com.exercise2.
```

## PACKAGE: com.exercise3:
En este ejercicio se realizan dos de los mas utilizados organizmos de ordenamiento, algoritmo de ordenamiento burbuja y ordenamiento quickSort.

***AlgoritmoBurbuja***
```
_PROCESOS:_
1. Declaracion de atributos y creacion de array
2. en un bucle for se realiza el recorrido de array que contiene numeros aleatorios
3. en un bucle for para aplicar el metodo de la burbuja.
4. en un bucle for para mostrar los datos ordenados
```
***AlgoritmoQuickSort*** 
```
_PROCESOS:_
1. Declaracion de atributos y creacion de array.
2. recorrido de array aleatorio
3. Se toma como pivote el primer valor.
4. Se definen los dos lados y un auxiliar
```
## PACKAGE: com.exercise4:

En este ejercicio vamos a desarrollar una clase para mostrar los datos de los objetos pertenecientes a la clase ferry y la creacion de vehiculos tipo ferry, se utilizaron métodos get y set para obtener y establecer los atributos declarados, adicional se utilizaron los siguientes metodos en estas tres clases:

***showListFerry()*** 
```
Metodo para crear arreglo de ferry.
```
***showFerry()*** 
```
Metodo para mostrar datos de ferry.
```

***CreateVehicle()*** 
```
Metodo para creación de vehiculos.
```
***turnOn()*** 
```
Método para validar vehiculo encendido.
```
***turnOff()*** 
```
Método para validar vehiculo apagado.
```
***accelerate()*** 
```
Método para validar aceleracion de vehiculo.
```
***brake()*** 
```
Método para validar frenado de vehiculo.
```

## PACKAGE: com.exercise5:

En este ejercicio se ha diseñado una clase vehiculo la cual ha sido diseñada para generar distintos medios de transporte como son motocicletas, bicicletas, trenes, helicopteros, se utilizaron métodos get y set para obtener y establecer los atributos declarados, adicional se utilizaron los siguientes metodos en las diferentes clases:

***showData()*** 
```
Método para mostrar datos de vehiculo.
```
***mainFeatures()*** 
```
Método para mostrar caracteristicas de clase.
```    
***turnOn()*** 
```
Método para validar vehiculo encendido.
```    
***turnOff()*** 
```
Método para validar vehiculo apagado.
```     
***accelerate()*** 
```
Método para validar aceleracion de motocicleta.
```
***brake():*** 
```
Método para validar frenado de vehiculo.
```

## PACKAGE: com.exercise6:

En este ejercicio se verifica si un numero que se introduce por teclado esta repetido. Este paquete contiene dos clases la clase MainApp.java que se utiliza para instanciar y mostrar la información del programa y la clase RepeatNumber.java que es la encargada de hacer las validaciones y encontrar el numero repetido, para ello se utiliza el siguiente metodo:

***repeatNumber():*** El cual realiza las siguientes validaciones:
```
1. Solicita el numero de espacios que va a tener el vector.
2. Recorre el vector hasta la el final de su longitud.
3. Mediante un if se valida la longitud del array, si es = 0 significa que no tiene espacio 
se sale del programa
4. Cuando la variable z sea igual a la longitud del programa imprime todo si no se ha cumplido 
la condicion del numero repetido
5. De modo contrario si esta repetido entonces imprime numero repetido e imprime la longitud 
completa del arreglo.
```
