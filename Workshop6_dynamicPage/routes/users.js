/**
* Esta ruta se encarga de responder en el caso de que la ruta principal no funcione, simplemente para mostrar que si hay una conexión
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
  Definir una ruta HTTP GET para '/'.
  Esta ruta se utiliza generalmente para manejar las solicitudes de la lista de usuarios.
  En este caso, simplemente responde con el texto 'respond with a resource'.
*/
router.get('/', function(req, res, next) {
  res.send('respond with a resource');
});

// Exportar el enrutador para su uso en otras partes de la aplicación
module.exports = router;

