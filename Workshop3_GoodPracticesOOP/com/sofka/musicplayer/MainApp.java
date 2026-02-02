	package com.sofka.musicplayer;

	import java.util.Scanner;
	
	/**
     	 * [Clase donde inicia la aplicación, se crean las instancias de las clases
     	 *  y se hace llamado a los diferentes métodos]
     	 *
      	 * @version [1.0.0 2022-06-07, La clase corresponde a la versión 1 del sistema,
     	 *                             no ha sufrido refactorings durante la versión,
     	 *                             no se han realizado un cambios menores.
     	 *
     	 * @author [Valentina Santa Muñoz – valen_2605@hotmail.com]
     	 *
    	 * @since [Versión 1.0.0]
   	 *
     	 */

	public class MainApp {

		public static void main(String[] args) {

			/**
			 * Creación del menu principal de opciones
			 */

			System.out.println("Bienvenido al reproductor de música," + "\n" + "\n" + "Seleccione una de las opciones:"
					+ "\n" + "\n" + "1. Crear Listas de Reproducción" + "\n" + "2. Ver biblioteca de canciones" + "\n"
					+ "3. Ver canciones filtradas por género" + "\n" + "4. Ver canciones filtradas por año" + "\n"
					+ "5. Ver canciones ordenadas por duración" + "\n" + "6. Ver canciones ordenadas por fecha" + "\n"
					+ "7. Ver canciones en modo aleatorio" + "\n" + "8. Salir del programa");

			/**
			 * Solicitud por teclado de opción a validar
			 */

			Scanner entry = new Scanner(System.in);
	
			int option = entry.nextInt();
	
			String confirm = "";

			/**
			 * Creación de Switch con diferentes opciones para validar
			 */

			switch (option) {

			case 1:
				System.out.println("Ha seleccionado la opción 1. Crear listas de reproducción");
                		Library lib1 = new Library();
				PlayList pl = new PlayList(); 
				lib1.showLibrary();
				System.out.println("Dale un nombre a tu lista de reproducción(sin espacios):");              
				String name = entry.next();
				pl.setName(name);
				do {
				   System.out.println("Introduce el id de la canción que quieres añadir:");
				   int idSong = entry.nextInt();  
				   pl.createPlaylist(idSong);
				   System.out.println("¿Quieres añadir más canciones? Sí/No:");
				   confirm = entry.next();
				 } while(confirm.equalsIgnoreCase("si"));                
				   System.out.println("Ha creado su PlayList con el nombre " + pl.getName() + ",con las siguientes canciones:"); 
				   System.out.println("");
				   pl.showPL(); 
				break;

			case 2:
				System.out.println("Has seleccionado la opción 2. Ver biblioteca de canciones");
				Library lib2 = new Library();
				lib2.showLibrary();
				break;
				
			case 3:
				System.out.println("Has seleccionado la opción 3. Ver canciones por género");
				System.out.println(" ");
				System.out.println("Indique por Género desea filtrar las canciones: POP,ROCK,BALADAS,VALLENATO,TECHNO,SALSA");
				String genre = entry.next();
				GenreEnum g = null;
				if (genre.equalsIgnoreCase("pop")) {
					g = GenreEnum.POP;
				} else if (genre.equalsIgnoreCase("rock")) {
					g = GenreEnum.ROCK;
				} else if (genre.equalsIgnoreCase("baladas")) {
					g = GenreEnum.BALADAS;
				} else if (genre.equalsIgnoreCase("vallenato")) {
					g = GenreEnum.VALLENATO;
				} else if (genre.equalsIgnoreCase("techno")) {
					g = GenreEnum.TECHNO;
				} else if (genre.equalsIgnoreCase("salsa")) {
					g = GenreEnum.SALSA;
				} else {
					System.out.println("No se encontró género, volverá al menú inicial");
					System.out.println("***********************************************");
					g = null;
					MainApp.main(args);
				}
				Library lib3 = new Library();
				lib3.filterGenre(g);
				break;
			case 4:
				System.out.println("Has seleccionado la opción 4. Ver canciones por año");
				Library lib4 = new Library();
				lib4.filterYear();
				break;

			case 5:
				System.out.println("Has seleccionado la opción 5. Ver canciones ordenadas por duración");
				Library lib5 = new Library();
				lib5.orderDuration();
				break;

			case 6:
				System.out.println("Has seleccionado la opci�n 6. Ver canciones ordenadas por fecha");
				Library lib6 = new Library();
				lib6.orderDate();
				break;

			case 7:
				System.out.println("Has seleccionado la opción 7. Ver canciones en modo aleatorio");
				Library lib7 = new Library();
				lib7.randomMusic();
				break;
			case 8:
				System.out.println("Ha salido del menú");
				break;

			default:

				System.out.println("Opción incorrecta, salir del programa!");

			}

			entry.close();

		}

	}
