/**
* Esta ruta contiene información sobre el ganador del juego
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
  Definir una ruta HTTP GET para '/winnerGame'.
  Esta ruta devuelve información sobre el ganador de un juego.
*/
router.get('/winnerGame', function(req, res, next) {
  // Crear un objeto JSON con información sobre el ganador del juego
  const answer = {
    id: "e5834d8e-5195-41fc-993e-c731dbce4fab", // ID del ganador
    name: "Pedro" // Nombre del ganador
  };

  // Responder con el objeto JSON como respuesta
  res.json(answer);
});

// Exportar el enrutador para su uso en otras partes de la aplicación
module.exports = router;
