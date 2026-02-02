package com.sofka.musicplayer;
import java.util.ArrayList;

/**
 * Clase playList permite la creación de las listas de reproducción
 *
 * @version [1.0.0 2022-06-06, Esta clase corresponde a la versión 1 del
 * sistema, no ha sufrido refactorings durante la versión].
 *
 * @author [Alexandra Santa Muñoz – maalexa24@gmail.com]
 *
 * @since [Versión 1]
 *
 */
public class PlayList {

    /**
     * Definición de atributo nombre de la lista de reproducción
     */
    private String name;

    /**
     * Definición de arraylist con canciones
     */
    private ArrayList<PlayListLibrary> playL;

    /**
     * Creación de constructor de clase PlayList
     */
    public PlayList() {
        this.name = "";
        playL = new ArrayList<>();
    }

    /**
     * Obtiene el nombre de la PlayList
     *
     * @return información del nombre de la PlayList
     */
    public String getName() {
        return name;
    }

    /**
     * Asigna el nombre de la PlayList
     *
     * @param name Nombre de la PlayList
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para añadir canciones a la PlayList de una lista de 20 canciones
     *
     * @param id
     */
    public void createPlaylist(int id) {
   
            int idP = id;
       
            switch (idP) {
                case 1: 
                    playL.add(new PlayListLibrary(1, "Hoy Es un Buen Día", "Río Roma", GenreEnum.POP, 3.21f, 2000,
				"Lo mejor del pop", "/desktop/users/alexandra/imagenes/caratula1.jpg"));
		    break;

                case 2: 
                playL.add(new PlayListLibrary(2, "Me Enamoré de Ti", "Chayanne", GenreEnum.POP, 3.11f, 1999, "Lo mejor del pop",
				"/desktop/users/alexandra/imagenes/caratula2.jpg"));
		    break;
                    
                case 3: 
                playL.add(new PlayListLibrary(3, "Kilómetros", "Sin Bandera", GenreEnum.POP, 2.11f, 1995, "Lo mejor del pop",
				"/desktop/users/alexandra/imagenes/caratula3.jpg"));
		    break;

                case 4: 
                playL.add(new PlayListLibrary(4, "Un Nuevo Amor", "Tranzas", GenreEnum.POP, 2.11f, 2000, "Lo mejor del pop",
				"/desktop/users/alexandra/imagenes/caratula4.jpg"));
		    break;

                case 5: 
                playL.add(new PlayListLibrary(5, "Mi Historia Entre Tus Dedos", "Gianluca Grignani", GenreEnum.POP, 2.11f, 1990,
				"Lo mejor del pop", "/desktop/users/alexandra/imagenes/caratula5.jpg"));
		    break;
                
                case 6:
                playL.add(new PlayListLibrary(6, "Livin'On a prayer", "Bon Jovi", GenreEnum.ROCK, 3.21f, 1998,
				"Lo mejor de los clásicos del rock", "/desktop/users/alexandra/imagenes/caratula6.jpg"));
		    break;
                
                case 7: 
                playL.add(new PlayListLibrary(7, "Smells like teen spirit", "Nirvana", GenreEnum.ROCK, 3.40f, 1986,
				"Lo mejor de los clásicos del rock", "/desktop/users/alexandra/imagenes/caratula7.jpg"));
		    break;
                
                case 8: 
                playL.add(new PlayListLibrary(8, "Nothing else matters", "Metallica", GenreEnum.ROCK, 2.51f, 1985,
				"Lo mejor de los clásicos del rock", "/desktop/users/alexandra/imagenes/caratula8.jpg"));
		    break;
                
                case 9: 
                playL.add(new PlayListLibrary(9, "Mentira", "La Ley", GenreEnum.ROCK, 4.11f, 1999,
				"Lo mejor de los clásicos del rock", "/desktop/users/alexandra/imagenes/caratula9.jpg"));
		    break;
                
                case 10: 
                playL.add(new PlayListLibrary(10, "Flaca", "Andres Calamaro", GenreEnum.ROCK, 3.45f, 1992,
				"Lo mejor de los clásicos del rock", "/desktop/users/alexandra/imagenes/caratula10.jpg"));
		    break;
                
                case 11: 
                playL.add(new PlayListLibrary(11, "Porque te vas", "Jeanette", GenreEnum.BALADAS, 3.10f, 1990,
				"Baladas para dedicar", "/desktop/users/alexandra/imagenes/caratula11.jpg"));
		    break;
                
                case 12:
                playL.add(new PlayListLibrary(12, "Un beso y una flor", "Nino Bravo", GenreEnum.BALADAS, 4.15f, 1987,
				"Baladas para dedicar", "/desktop/users/alexandra/imagenes/caratula12.jpg"));
		    break;
                
                case 13: 
                playL.add(new PlayListLibrary(13, "La incondicional", "Luis Miguel", GenreEnum.BALADAS, 2.55f, 1993,
				"Baladas para dedicar", "/desktop/users/alexandra/imagenes/caratula13.jpg"));
		    break;
                
                case 14: 
                playL.add(new PlayListLibrary(14, "Doce Rosas", "Lorenzo Antonio", GenreEnum.BALADAS, 3.05f, 1985,
				"Baladas para dedicar", "/desktop/users/alexandra/imagenes/caratula14.jpg"));
		    break;
                
                case 15: 
                playL.add(new PlayListLibrary(15, "Momentos", "Sergio Facheli", GenreEnum.BALADAS, 3.21f, 1997,
				"Baladas para dedicar", "/desktop/users/alexandra/imagenes/caratula15.jpg"));
		    break;
                
                case 16: 
                playL.add(new PlayListLibrary(16, "Distintos Destinos", "Binomio De Oro De América", GenreEnum.VALLENATO, 3.38f,
				1991, "Los vallenatos más recordados", "/desktop/users/alexandra/imagenes/caratula16.jpg"));
		    break;
                
                case 17: 
                playL.add(new PlayListLibrary(17, "Todo Daria Por Ti", "Patricia Teherán", GenreEnum.VALLENATO, 4.10f, 1993,
				"Los vallenatos más recordados", "/desktop/users/alexandra/imagenes/caratula17.jpg"));
		    break;
                
                case 18: 
                playL.add(new PlayListLibrary(18, "Busca Un Confidente", "Los Diablitos", GenreEnum.VALLENATO, 3.55f, 1996,
				"Los vallenatos más recordados", "/desktop/users/alexandra/imagenes/caratula18.jpg"));
		    break;
                
                case 19:
                playL.add(new PlayListLibrary(19, "Acuérdate", "Los Gigantes Del Vallenato", GenreEnum.VALLENATO, 4.05f, 1999,
				"Los vallenatos más recordados", "/desktop/users/alexandra/imagenes/caratula19.jpg"));
		    break;
                
                case 20: 
                playL.add(new PlayListLibrary(20, "Olvídala", "Binomio De Oro De América", GenreEnum.VALLENATO, 3.39f, 2000,
				"Los vallenatos m�s recordados", "/desktop/users/alexandra/imagenes/caratula20.jpg"));		
		    break;
                
                case 21: 
                playL.add(new PlayListLibrary(21, "Break Through The Ground", "Marlo Avao", GenreEnum.TECHNO, 3.21f,
				1991, "The bests songs of Techno", "/desktop/users/alexandra/imagenes/caratula21.jpg"));
		    break;
                
                case 22: 
                playL.add(new PlayListLibrary(22, "Reason For Fighting", "Seven Lions", GenreEnum.TECHNO, 4.35f, 1998,
				"The bests songs of Techno", "/desktop/users/alexandra/imagenes/caratula22.jpg"));
		    break;
                
                case 23: 
                playL.add(new PlayListLibrary(23, "Frei sein", "Meli Stein", GenreEnum.TECHNO, 2.55f, 2001,
				"The bests songs of Techno", "/desktop/usersalexandra/imagenes/caratula23.jpg"));
		    break;
                
                case 24: 
                playL.add(new PlayListLibrary(24, "Spaceman", "Adam Beyer", GenreEnum.TECHNO, 5.05f, 1999,
				"The bests songs of Techno", "/desktop/users/alexandra/imagenes/caratula24.jpg"));
		    break;
                
                case 25: 
                playL.add(new PlayListLibrary(25, "Green Velvet", "Flash", GenreEnum.TECHNO, 3.59f, 2002,
				"The bests songs of Techno", "/desktop/users/alexandra/imagenes/caratula25.jpg"));		
		    break;
                
                case 26: 
                playL.add(new PlayListLibrary(26, "Vivir Mi Vida", "Marc Anthony", GenreEnum.SALSA, 2.38f,
				2007, "Lo mejor de la Salsa", "/desktop/users/alexandra/imagenes/caratula26.jpg"));
		    break;
                
                case 27: 
                playL.add(new PlayListLibrary(27, "He Tratado", "Victor Manuelle", GenreEnum.SALSA, 3.47f, 1999,
				"Lo mejor de la Salsa", "/desktop/users/alexandra/imagenes/caratula27.jpg"));
		    break;

                case 28: 
                playL.add(new PlayListLibrary(28, "Idilio", "Willie Colón", GenreEnum.SALSA, 4.55f, 2001,
				"Lo mejor de la Salsa", "/desktop/users/alexandra/imagenes/caratula28.jpg"));
		    break;       
                
                case 29: 
                playL.add(new PlayListLibrary(29, "Mi Media Mitad", "Rey Ruiz", GenreEnum.SALSA, 4.02f, 2003,
				"Lo mejor de la Salsa", "/desktop/users/alexandra/imagenes/caratula29.jpg"));
		    break;

                case 30: 
                playL.add(new PlayListLibrary(30, "Tu Con El", "Frankie Ruiz", GenreEnum.SALSA, 3.17f, 1992,
				"Lo mejor de la Salsa", "/desktop/users/alexandra/imagenes/caratula30.jpg"));
                break;

                default: 
                    System.out.println("");
                }

            
        }
    

    /**
     * Muestra la PlayList que se acaba de crear
     */
    public void showPL() {
        createPlaylist(0);
        for (PlayListLibrary e : playL) {
            System.out.println(e.showData());
        }
    }
}
