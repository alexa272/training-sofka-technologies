	package com.sofka.musicplayer;

	import java.text.DecimalFormat;
	import java.util.Comparator;
	
	/**
     	 * [Clase PlayListLibrary con sus atributos, métodos y métodos implementados de la interfaz Comparable y Comparator]
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
	public class PlayListLibrary implements Comparable<PlayListLibrary>, Comparator<PlayListLibrary> {
		
		/**
		 * Representa el id de la canción
		 */
		private Integer id;
		
		/**
		 * Representa el título de la canción
		 */
		private String title;
		
		/**
		 * Representa al artista de la canción
		 */
		private String artist;
		
		/**
		 * Representa el género de la canción
		 */
		private GenreEnum genre;
		
		/**
		 * Representa la duración de la canción
		 */
		private double duration;
		
		/**
		 * Representa la fecha de la canción
		 */
		private Integer date;
		
		/**
		 * Representa la descripción de la canción
		 */
		private String description;
		
		/**
		 * Representa la carátula de la canción
		 */
		private String cover;
		
		/**
		 * Crea una instancia de la clase PlayListLibrary
		 */
		public PlayListLibrary() {

			this.id = 0;
			this.title = "";
			this.artist = "";
			this.genre = null;
			this.duration = 0.0;
			this.date = 0;
			this.description = "";
			this.cover = "";
		}
		
		/**
		 * 
		 * Crea una instancia de la clase PlayListLibrary con parámetros
		 * @param id identificador de la canción
		 * @param title título de la canción
		 * @param artist artista de la canción
		 * @param genre Género de la canción
		 * @param duration Duración de la canción
		 * @param date Fecha de la canción
		 * @param description Descripción de la canción
		 * @param cover Carátula de la canción
		 */
		public PlayListLibrary(Integer id, String title, String artist, GenreEnum genre, double duration, Integer date,
			String description, String cover) {

			this.id = id;
			this.title = title;
			this.artist = artist;
			this.genre = genre;
			this.duration = duration;
			this.date = date;
			this.description = description;
			this.cover = cover;
		}
		
		/**
		 * Muesta información del id de la canción
		 * @return id de la canción
		 */
		public Integer getId() {
			return id;
		}
		
		/**
		 * Asigna un id a la canción
		 * @param id identificador de la canción
		 */
		public void setId(Integer id) {
			this.id = id;
		}
		
		/**
		 * Muestra información del título
		 * @return título de la canción
		 */
		public String getTitle() {
			return title;
		}
		
		/**
		 * Asigna título a la canción
		 * @param title título de la canción
		 */
		public void setTitle(String title) {
			this.title = title;
		}
		
		/**
		 * Muestra información del artista
		 * @return artista
		 */
		public String getArtist() {
			return artist;
		}
		
		/**
		 * Asigna artista de la canción
		 * @param artist de la canción
		 */
		public void setArtist(String artist) {
			this.artist = artist;
		}
		
		/**
		 * Muestra el género de la canción
		 * @return Género de la canción
		 */
		public GenreEnum getGenre() {
			return genre;
		}
		
		/**
		 * Asigna género de la canción
		 * @param genre Género de la canción
		 */
		public void setGenre(GenreEnum genre) {
			this.genre = genre;
		}
		
		/**
		 * Muestra información de la duración de la canción
		 * @return Duración de la canción
		 */
		public double getDuration() {
			return duration;
		}
		
		/**
		 * Asigna duración a la canción
		 * @param duration
		 */
		public void setDuration(double duration) {
			this.duration = duration;
		}
		
		/**
		 * Obtiene fecha de la canción
		 * @return fecha de la canción
		 */
		public Integer getDate() {
			return date;
		}
		
		/**
		 * Asigna fecha a la canción
		 * @param date fecha de la canción
		 */
		public void setDate(Integer date) {
			this.date = date;
		}
		
		/**
		 * Muestra descripción de la canción
		 * @return Descripción de la canción
		 */
		public String getDescription() {
			return description;
		}
		
		/**
		 * Asigna descripción a la canción
		 * @param description Descripción de la canción
		 */
		public void setDescription(String description) {
			this.description = description;
		}
		
		/**
		 * Muestra información de la carátula
		 * @return Información de la carátula
		 */
		public String getCover() {
			return cover;
		}
		
		/**
		 * Asigna información de la carátula
		 * @param cover
		 */
		public void setCover(String cover) {
			this.cover = cover;
		}

		/**
		 * Creacion de método para comparar los datos del Array
		 * 
		 * @param pl1
		 * @param pl2
		 * @return
		 */
		 @Override
		 public int compare(PlayListLibrary pl1, PlayListLibrary pl2) {
			if (pl1.getDuration() > pl2.getDuration()) {
				return -1;
			} else if (pl1.getDuration() > pl2.getDuration()) {
				return 0;
			} else {
				return 1;
			}
		 }
		
		/**
		 * Creacion de método para comparar fecha para ordenar
		 * @param p
		 * @return 
		 */
		@Override
		public int compareTo(PlayListLibrary p){
			if (p.getDate() > date) {
			    return -1;
			} else if (p.getDate() > date) {
			    return 0;
			} else {
			    return 1;
			}
		    }

		/**
		 * Creación de método para visualizar Datos
		 * 
		 * @return Información completa de la canción
		 */
		 public String showData() {
			 DecimalFormat f = new DecimalFormat();
			 f.setMaximumFractionDigits(2);
			 System.out.println("ID: " + id + "\n" + "Título: " + title + "\n" + "Artista: " + artist + "\n" + "Género: "
					 + genre + "\n" + "Duración: " + f.format(duration) + " min" + "\n" + "Año: " + date + "\n"
					 + "Descripción: " + description + "\n" + "Carátula: " + cover + "\n"
					 + "-------------------------------------------------------");
			 return "";
		 }

	}
