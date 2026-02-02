/**
* Esta ruta contiene información sobre el inicio del juego
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
  Definir una ruta HTTP GET para '/startGame'.
  Esta ruta devuelve información sobre el inicio de un juego, incluyendo la apuesta de cada jugador.
*/
router.get('/startGame', function(req, res, next) {
  // Crear un objeto JSON con información sobre el inicio del juego
  const answer = {
    id: "id: fffff-ggg-jjjjj", // ID del juego
    type: "", // Tipo de juego (puede estar en blanco)
    gamerBet: { 
      "5257b4d6-5c87-4871-93c3-b2b9ce04d706": 3, // Apuesta del jugador con ID '5257b4d6-5c87-4871-93c3-b2b9ce04d706'
      "8dda6205-f54c-4643-a017-71b6f0353319": 6, // Apuesta del jugador con ID '8dda6205-f54c-4643-a017-71b6f0353319'
      "e5834d8e-5195-41fc-993e-c731dbce4fab": 5  // Apuesta del jugador con ID 'e5834d8e-5195-41fc-993e-c731dbce4fab'
    } 
  };

  // Responder con el objeto JSON como respuesta
  res.json(answer);
});

// Exportar el enrutador para su uso en otras partes de la aplicación
module.exports = router;

