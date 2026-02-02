/**
* Esta ruta se usa para mostrar la página de inicio de la aplicación.
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
  Definir una ruta HTTP GET para la página de inicio ('/').
  Esta ruta renderiza una vista llamada 'index' con el título 'Dice Game'.
*/
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Dice Game' });
});

// Exportar el enrutador para su uso en otras partes de la aplicación
module.exports = router;