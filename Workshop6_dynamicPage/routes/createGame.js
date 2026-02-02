/**
* Archivo diseñado para enrutar el juego creado.
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
  Definir una ruta HTTP GET para '/createGame'.
  Esta ruta devuelve información sobre un juego creado.
*/
router.get('/createGame', function(req, res, next) {
  // Crear un objeto JSON con información del juego
  const answer = {
    id: "id: fffff-ggg-jjjjj", // ID del juego
    type: "", // Tipo de juego (puede estar en blanco)
    gamers: [ 
      "Raul Andres", // Lista de jugadores
      "Pedro", 
      "Juan" 
    ]
  };

  // Responder con el objeto JSON como respuesta
  res.json(answer);
});

// Exportar el enrutador para su uso en otras partes de la aplicación
module.exports = router;