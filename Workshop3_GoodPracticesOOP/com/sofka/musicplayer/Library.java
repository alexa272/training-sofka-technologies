	package com.sofka.musicplayer;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;
	
	/**
	 * [Clase Library con sus atributos, métodos propios y métodos heredados de la
	 *  clase Song y métodos implementados de la interfaz IPlayList]
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

	public class Library extends Song implements IPlayList {
		
		/**
		 * Representa la lista de canciones de la biblioteca
		 */
		private ArrayList<PlayListLibrary> playL;
		
		/**
		 * Crea una instancia de la clase Library
		 */
		public Library() {

			playL = new ArrayList<>();
		}
		
		/**
		 * Permite crear una biblioteca de canciones
		 */
		public void showPlayList() {

			playL.add(new PlayListLibrary(1, "Hoy Es un Buen Día", "Río Roma", GenreEnum.POP, 3.21f, 2000,
					"Lo mejor del pop", "/desktop/users/valentina/imagenes/caratula1.jpg"));
			playL.add(new PlayListLibrary(2, "Me Enamoré de Ti", "Chayanne", GenreEnum.POP, 3.11f, 1999, "Lo mejor del pop",
					"/desktop/users/valentina/imagenes/caratula2.jpg"));
			playL.add(new PlayListLibrary(3, "Kilómetros", "Sin Bandera", GenreEnum.POP, 2.11f, 1995, "Lo mejor del pop",
					"/desktop/users/valentina/imagenes/caratula3.jpg"));
			playL.add(new PlayListLibrary(4, "Un Nuevo Amor", "Tranzas", GenreEnum.POP, 2.11f, 2000, "Lo mejor del pop",
					"/desktop/users/valentina/imagenes/caratula4.jpg"));
			playL.add(new PlayListLibrary(5, "Mi Historia Entre Tus Dedos", "Gianluca Grignani", GenreEnum.POP, 2.11f, 1990,
					"Lo mejor del pop", "/desktop/users/valentina/imagenes/caratula5.jpg"));
			playL.add(new PlayListLibrary(6, "Livin'On a prayer", "Bon Jovi", GenreEnum.ROCK, 3.21f, 1998,
					"Lo mejor de los clásicos del rock", "/desktop/users/valentina/imagenes/caratula6.jpg"));
			playL.add(new PlayListLibrary(7, "Smells like teen spirit", "Nirvana", GenreEnum.ROCK, 3.40f, 1986,
					"Lo mejor de los clásicos del rock", "/desktop/users/valentina/imagenes/caratula7.jpg"));
			playL.add(new PlayListLibrary(8, "Nothing else matters", "Metallica", GenreEnum.ROCK, 2.51f, 1985,
					"Lo mejor de los clásicos del rock", "/desktop/users/valentina/imagenes/caratula8.jpg"));
			playL.add(new PlayListLibrary(9, "Mentira", "La Ley", GenreEnum.ROCK, 4.11f, 1999,
					"Lo mejor de los clásicos del rock", "/desktop/users/valentina/imagenes/caratula9.jpg"));
			playL.add(new PlayListLibrary(10, "Flaca", "Andres Calamaro", GenreEnum.ROCK, 3.45f, 1992,
					"Lo mejor de los clásicos del rock", "/desktop/users/valentina/imagenes/caratula10.jpg"));
			playL.add(new PlayListLibrary(11, "Porque te vas", "Jeanette", GenreEnum.BALADAS, 3.10f, 1990,
					"Baladas para dedicar", "/desktop/users/valentina/imagenes/caratula11.jpg"));
			playL.add(new PlayListLibrary(12, "Un beso y una flor", "Nino Bravo", GenreEnum.BALADAS, 4.15f, 1987,
					"Baladas para dedicar", "/desktop/users/valentina/imagenes/caratula12.jpg"));
			playL.add(new PlayListLibrary(13, "La incondicional", "Luis Miguel", GenreEnum.BALADAS, 2.55f, 1993,
					"Baladas para dedicar", "/desktop/users/valentina/imagenes/caratula13.jpg"));
			playL.add(new PlayListLibrary(14, "Doce Rosas", "Lorenzo Antonio", GenreEnum.BALADAS, 3.05f, 1985,
					"Baladas para dedicar", "/desktop/users/valentina/imagenes/caratula14.jpg"));
			playL.add(new PlayListLibrary(15, "Momentos", "Sergio Facheli", GenreEnum.BALADAS, 3.21f, 1997,
					"Baladas para dedicar", "/desktop/users/valentina/imagenes/caratula15.jpg"));
			playL.add(new PlayListLibrary(16, "Distintos Destinos", "Binomio De Oro De América", GenreEnum.VALLENATO, 3.38f,
					1991, "Los vallenatos más recordados", "/desktop/users/valentina/imagenes/caratula16.jpg"));
			playL.add(new PlayListLibrary(17, "Todo Daria Por Ti", "Patricia Teherán", GenreEnum.VALLENATO, 4.10f, 1993,
					"Los vallenatos más recordados", "/desktop/users/valentina/imagenes/caratula17.jpg"));
			playL.add(new PlayListLibrary(18, "Busca Un Confidente", "Los Diablitos", GenreEnum.VALLENATO, 3.55f, 1996,
					"Los vallenatos más recordados", "/desktop/users/valentina/imagenes/caratula18.jpg"));
			playL.add(new PlayListLibrary(19, "Acuérdate", "Los Gigantes Del Vallenato", GenreEnum.VALLENATO, 4.05f, 1999,
					"Los vallenatos más recordados", "/desktop/users/valentina/imagenes/caratula19.jpg"));
			playL.add(new PlayListLibrary(20, "Olvídala", "Binomio De Oro De América", GenreEnum.VALLENATO, 3.39f, 2000,
					"Los vallenatos más recordados", "/desktop/users/valentina/imagenes/caratula20.jpg"));
			playL.add(new PlayListLibrary(21, "Break Through The Ground", "Marlo Avao", GenreEnum.TECHNO, 3.21f, 1991,
					"The bests songs of Techno", "/desktop/users/valentina/imagenes/caratula21.jpg"));
			playL.add(new PlayListLibrary(22, "Reason For Fighting", "Seven Lions", GenreEnum.TECHNO, 4.35f, 1998,
					"The bests songs of Techno", "/desktop/users/valentina/imagenes/caratula22.jpg"));
			playL.add(new PlayListLibrary(23, "Frei sein", "Meli Stein", GenreEnum.TECHNO, 2.55f, 2001,
					"The bests songs of Techno", "/desktop/users/valentina/imagenes/caratula23.jpg"));
			playL.add(new PlayListLibrary(24, "Spaceman", "Adam Beyer", GenreEnum.TECHNO, 5.05f, 1999,
					"The bests songs of Techno", "/desktop/users/valentina/imagenes/caratula24.jpg"));
			playL.add(new PlayListLibrary(25, "Green Velvet", "Flash", GenreEnum.TECHNO, 3.59f, 2002,
					"The bests songs of Techno", "/desktop/users/valentina/imagenes/caratula25.jpg"));
			playL.add(new PlayListLibrary(26, "Vivir Mi Vida", "Marc Anthony", GenreEnum.SALSA, 2.38f, 2007,
					"Lo mejor de la Salsa", "/desktop/users/valentina/imagenes/caratula26.jpg"));
			playL.add(new PlayListLibrary(27, "He Tratado", "Victor Manuelle", GenreEnum.SALSA, 3.47f, 1999,
					"Lo mejor de la Salsa", "/desktop/users/valentina/imagenes/caratula27.jpg"));
			playL.add(new PlayListLibrary(28, "Idilio", "Willie Colon", GenreEnum.SALSA, 4.55f, 2001,
					"Lo mejor de la Salsa", "/desktop/users/valentina/imagenes/caratula28.jpg"));
			playL.add(new PlayListLibrary(29, "Mi Media Mitad", "Rey Ruiz", GenreEnum.SALSA, 4.02f, 2003,
					"Lo mejor de la Salsa", "/desktop/users/valentina/imagenes/caratula29.jpg"));
			playL.add(new PlayListLibrary(30, "Tu Con El", "Frankie Ruiz", GenreEnum.SALSA, 3.17f, 1992,
					"Lo mejor de la Salsa", "/desktop/users/valentina/imagenes/caratula30.jpg"));
		}

		/**
		 * Método para visualizar biblioteca de canciones
		 */

		public void showLibrary() {
			showPlayList();
			for (PlayListLibrary e : playL)
				System.out.println(e.showData());
		}

		/**
		 * Método para filtrar lista de canciones por Género musical
		 */
		@Override
		public void filterGenre(GenreEnum g) {

			showPlayList();

			if (g == GenreEnum.POP) {
				playL.stream().filter(p -> p.getGenre() == GenreEnum.POP).forEach(p -> System.out.println(p.showData()));
			} else if (g == GenreEnum.ROCK) {
				playL.stream().filter(p -> p.getGenre() == GenreEnum.ROCK).forEach(p -> System.out.println(p.showData()));
			} else if (g == GenreEnum.BALADAS) {
				playL.stream().filter(p -> p.getGenre() == GenreEnum.BALADAS)
						.forEach(p -> System.out.println(p.showData()));
			} else if (g == GenreEnum.VALLENATO) {
				playL.stream().filter(p -> p.getGenre() == GenreEnum.VALLENATO)
						.forEach(p -> System.out.println(p.showData()));
			} else if (g == GenreEnum.TECHNO) {
				playL.stream().filter(p -> p.getGenre() == GenreEnum.TECHNO).forEach(p -> System.out.println(p.showData()));
			} else if (g == GenreEnum.SALSA) {
				playL.stream().filter(p -> p.getGenre() == GenreEnum.SALSA).forEach(p -> System.out.println(p.showData()));
			}
		}
	
		/**
	         * Método para filtrar lista de canciones por año
	         */

	    	@Override
	    	public void filterYear() {
		    showPlayList();
		    Scanner entry = new Scanner(System.in);
		    System.out.println("Ingrese un año entre 1980 y 2010:"); 

		    int year = entry.nextInt();

			if (year >= 1980 || year <= 1989){
		    	    playL.stream().filter(p->p.getDate().equals(1985)).forEach(p->System.out.println(p.showData()));
		            playL.stream().filter(p->p.getDate().equals(1986)).forEach(p->System.out.println(p.showData()));
		            playL.stream().filter(p->p.getDate().equals(1987)).forEach(p->System.out.println(p.showData()));

		        }else if(year >= 1990 || year <= 1999){
			    playL.stream().filter(p->p.getDate().equals(1990)).forEach(p->System.out.println(p.showData()));
			    playL.stream().filter(p->p.getDate().equals(1991)).forEach(p->System.out.println(p.showData()));
			    playL.stream().filter(p->p.getDate().equals(1992)).forEach(p->System.out.println(p.showData())); 
			    playL.stream().filter(p->p.getDate().equals(1993)).forEach(p->System.out.println(p.showData())); 
			    playL.stream().filter(p->p.getDate().equals(1995)).forEach(p->System.out.println(p.showData()));
			    playL.stream().filter(p->p.getDate().equals(1996)).forEach(p->System.out.println(p.showData()));
			    playL.stream().filter(p->p.getDate().equals(1997)).forEach(p->System.out.println(p.showData())); 
			    playL.stream().filter(p->p.getDate().equals(1998)).forEach(p->System.out.println(p.showData())); 
			    playL.stream().filter(p->p.getDate().equals(1999)).forEach(p->System.out.println(p.showData()));

			}else if(year >= 2000 || year <= 2019){

			    playL.stream().filter(p->p.getDate().equals(2000)).forEach(p->System.out.println(p.showData()));         
			    playL.stream().filter(p->p.getDate().equals(2001)).forEach(p->System.out.println(p.showData()));     
			    playL.stream().filter(p->p.getDate().equals(2002)).forEach(p->System.out.println(p.showData()));         
		            playL.stream().filter(p->p.getDate().equals(2003)).forEach(p->System.out.println(p.showData())); 
			}else{
		    	    System.out.println("Año fuera de rango");
			}
		            entry.close();
	    	    }
		
		
		/**
		 * Método para ordenar lista de canciones por Duración
		 */
		@Override
		public void orderDuration() {
			showPlayList();
			Collections.sort(playL, new PlayListLibrary());
			for (PlayListLibrary e : playL)
				System.out.println(e.showData());
		}

		/**
		 * Método para ordenar lista de canciones por fecha
		 */
		 @Override
		 public void orderDate() {
		 	showPlayList(); 
		    	Collections.sort(playL); 
			for (PlayListLibrary e : playL) 
				System.out.println(e.showData());  
		 }
		
		/**
		 * Método para ver canciones en modo aleatorio
		 */
		@Override
		public void randomMusic() {
			// TODO Auto-generated method stub
			showPlayList();
			Collections.shuffle(playL);
			for (PlayListLibrary e : playL)
				System.out.println(e.showData());
		}

	}
