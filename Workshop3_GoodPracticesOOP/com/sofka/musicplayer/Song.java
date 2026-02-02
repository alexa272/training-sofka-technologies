package com.sofka.musicplayer;

/**
 * Clase abstracta Song genera los métodos que implementará la clase que 
 * extiende, la clase Library.
 *
 * @version [1.0.0 2022-06-06, Esta clase corresponde a la versión 1 del sistema,
 *          no ha sufrido refactorings durante la versión].
 *
 * @author [Alexandra Santa Muñoz – maalexa24@gmail.com]
 *
 * @since [Versión 1]
 *
 */

public abstract class Song {
    
    /**
     * Definición de atributo identificador de la canción
     */
    
    private int id;
    
    /**
     * Definición de atributo título de la canción
     */
    
    private String title;
    
    /**
     * Definicion de atributo artista que interpreta canción
     */
    
    private String artist;

    /**
     * Definición de atributo fecha de la canción
     */
    
    private Integer date;

    /**
     * Definición de atributo duración de la canción
     */
    
    private double duration;

    /**
     * Definición de atributo género de la canción
     */
    
    private GenreEnum genre;

    /**
     * Definición de atributo carátula de la canción
     */
    
    private String cover;

    /**
     * Definición de atributo descripción de la canción
     */
    
    private String description;

    /**
     * Creación de constructor de clase
     */
    
    public Song() {
        this.id = 0;
        this.title = "";
        this.artist = "";  
        this.date = 0;
        this.duration = 0;
        this.genre = null;
        this.cover = "";
        this.description = "";
    }

    /**
     * Método para Obtener identificador de canción
     * @return Id
     */
    
    public int getId() {
        return id;
    }

    /**
     * Método para asignar identificador de la canción
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Método para Obtener artista
     * @return artist
     */
    
    public String getArtist() {
        return artist;
    }
    
    /**
     * Método para asignar artista
     * @param artist
     */
    
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Método para Obtener titulo de canción
     * @return title
     */
    
    public String getTitle() {
        return title;
    }

    /**
     * Método para asignar titulo decanción
     * @param title 
     */
    
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Método para Obtener fecha de canción
     * @return date
     */
    
    public Integer getDate() {
        return date;
    }

    /**
     * Método para asignar fecha de canción
     * @param date
     */
    
    public void setDate(Integer date) {
        this.date = date;
    }

    /**
     * Método para Obtener duración de canción
     * @return duration
     */
    
    public double getDuration() {
        return duration;
    }

    /**
     * Método para asignar duración de canción
     * @param duration 
     */
    
    public void setDuration(double duration) {
        this.duration = duration;
    }

    /**
     * Método para Obtener género musical
     * @return genre
     */
    
    public GenreEnum getGenre() {
        return genre;
    }

    /**
     * Método para asignar género músical
     * @param genre
     */
    
    public void setGenre(GenreEnum genre) {
        this.genre = genre;
    }

    /**
     * Método para Obtener carátula la canción
     * @return cover
     */
    
    public String getCover() {
        return cover;
    }

    /**
     * Método para asignar carátula a la canción
     * @param cover 
     */
    
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * Método para obtener descripción de canción
     * @return description
     */
    
    public String getDescription() {
        return description;
    }

    /**
     * Método para asignar descripción de canción
     * @param description 
     */
    
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Métodos abstracto filtrar por genero
     */
    
    public abstract void filterGenre(GenreEnum g);
    
    /**
     * Métodos abstracto filtrar por genero
     */

    public abstract void filterYear();
    
    /**
     * Métodos abstracto filtrar por genero
     */

    public abstract void orderDuration();
    
    /**
     * Métodos abstracto filtrar por genero
     */

    public abstract void orderDate();
    
}
