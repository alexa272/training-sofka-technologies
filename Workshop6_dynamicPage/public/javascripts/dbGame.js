/**
* Archivo diseñado para indicar cuándo se activa cada función al hacer clic en los botones
*
* @version [1.0.0 2023-05-09, este archivo corresponde a versión 1 del sistema,
*                             no se ha realizado ninguna refactorización durante esta versión]
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Versión 1]
*
*/

/** Hace referencia al botón "btnCreate" del archivo index.hbs  */

const btnCreate = document.getElementById("btnCreate");

/** Función que realiza una solicitud HTTP GET para crear un juego */
const createGame = () => {
    fetch("http://localhost:8080/api/v1/createGame")
    .then(response => response.json())
    .then((data) => {
        console.log(data);
    });
};

// Agregar un event listener al botón "btnCreate" para invocar la función createGame al hacer clic
btnCreate.addEventListener("click", createGame);

/** Hace referencia al botón "btnGame" del archivo index.hbs  */
const btnGame = document.getElementById("btnGame");

/** Función que realiza una solicitud HTTP GET para mostrar información sobre el juego */
const showGame = () => {
    fetch("http://localhost:8080/api/v1/game")
    .then(response => response.json())
    .then((data) => {
        console.log(data);

    });
};

/** Agregar un event listener al botón "Game" para invocar la función showGame al hacer clic */
btnGame.addEventListener("click", showGame);

/** Hace referencia al botón "btnWinner" del archivo index.hbs */
const btnWinner = document.getElementById("btnWinner");

/** Función que realiza una solicitud HTTP GET para mostrar al ganador del juego  */
const showWinner = () => {
    fetch("http://localhost:8080/api/v1/winnerGame")
    .then(response => response.json())
    .then((data) => {
        console.log(data);
    });
};

/** Agregar un event listener al botón "Winner" para invocar la función showWinner al hacer clic */ 
btnWinner.addEventListener("click", showWinner);


/** Hace referencia al botón "btnStartGame" del archivo index.hbs */
const btnStartGame = document.getElementById("btnStartGame");

/** Función que realiza una solicitud HTTP GET para iniciar un juego */ 
const startGame = () => {
    fetch("http://localhost:8080/api/v1/startGame")
    .then(response => response.json())
    .then((data) => {
        console.log(data);
    });
};

/** Agregar un event listener al botón "Start Game" para invocar la función startGame al hacer clic */
btnStartGame.addEventListener("click", startGame);

