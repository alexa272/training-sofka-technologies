/**
* Esta ruta contiene información sobre el juego, incluyendo los jugadores, el estado del juego (en progreso o no) y el ganador.
*
* @version [1.0.0 2023-05-09, este archivo corresponde a versión 1 del sistema,
*                             no se ha realizado ninguna refactorización durante esta versión]
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Versión 1]
*
*/

// Importar el módulo 'express'
var express = require('express');

// Crear una instancia de un enrutador de Express
var router = express.Router();

/* 
  Definir una ruta HTTP GET para '/game'.
  Esta ruta devuelve información sobre un juego, incluyendo sus jugadores, estado y ganador.
*/
router.get('/game', function(req, res, next) {
  // Crear un objeto JSON con información sobre el juego
  const answer = {
    id: "id: fffff-ggg-jjjjj", // ID del juego
    gamers: { 
      "5257b4d6-5c87-4871-93c3-b2b9ce04d706": { 
        id: "5257b4d6-5c87-4871-93c3-b2b9ce04d706", 
        name: "Raul Andres" 
      }, 
      "8dda6205-f54c-4643-a017-71b6f0353319": {
        id: "8dda6205-f54c-4643-a017-71b6f0353319", 
        name: "Juan"
      },
      "e5834d8e-5195-41fc-993e-c731dbce4fab": { 
        id: "e5834d8e-5195-41fc-993e-c731dbce4fab", 
        name: "Pedro" 
      } 
    },
    inProgress: false, // Indica si el juego está en progreso (falso en este caso)
    winner: { 
      id: "e5834d8e-5195-41fc-993e-c731dbce4fab", 
      name: "Pedro" // El ganador del juego
    } 
  };

  // Se obtiene un objeto JSON como respuesta
  res.json(answer);
});

// Exportar el enrutador para su uso en otras partes de la aplicación
module.exports = router;
