/*
* Este código representa la configuración básica de una aplicación web Node.js con Express y 
* muestra cómo se configuran las rutas y el manejo de errores en la misma.
*
* @version [1.0.0 2023-05-09, este archivo corresponde a versión 1 del sistema,
*                             no se ha realizado ninguna refactorización durante esta versión]
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Versión 1]
*
*/


// Importar los módulos necesarios para la aplicación Express
var createError = require('http-errors');
var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');

// Crear una instancia de la aplicación Express
var app = express();

// Configuración de la vista
app.set('views', path.join(__dirname, 'views')); // Establece la ubicación de las vistas
app.set('view engine', 'hbs'); // Establece el motor de plantillas como Handlebars (hbs)

// Configuración de middleware
app.use(logger('dev')); // Configura el registro de solicitudes HTTP en el modo "dev"
app.use(express.json()); // Habilita el análisis de solicitudes JSON
app.use(express.urlencoded({ extended: false })); // Habilita el análisis de solicitudes con datos codificados en URL
app.use(cookieParser()); // Habilita el análisis de cookies
app.use(express.static(path.join(__dirname, 'public'))); // Establece la carpeta 'public' para servir archivos estáticos

// Configuración de rutas
app.use('/', require('./routes/index')); // Ruta para la página de inicio
app.use('/users', require('./routes/users')); // Ruta para recursos de usuarios
app.use('/api/v1/', require('./routes/createGame')); // Ruta para la creación de juegos
app.use('/api/v1/', require('./routes/game')); // Ruta para ver un juego
app.use('/api/v1/', require('./routes/winnerGame')); // Ruta para ver al ganador de un juego
app.use('/api/v1/', require('./routes/startGame')); // Ruta para iniciar un juego

// Middleware para manejar errores 404 (Recurso no encontrado)
app.use(function(req, res, next) {
  next(createError(404)); // Crea un error 404 y lo pasa al siguiente middleware
});

// Middleware para manejar errores generales
app.use(function(err, req, res, next) {
  // Configura variables locales para la plantilla de error
  res.locals.message = err.message;
  res.locals.error = req.app.get('env') === 'development' ? err : {}; // Muestra detalles del error en entornos de desarrollo

  // Renderiza una página de error adecuada según el estado del error
  res.status(err.status || 500); // Establece el código de estado HTTP de respuesta
  res.render('error'); // Renderiza la vista de error
});

// Exporta la aplicación Express para su uso en otras partes de la aplicación
module.exports = app;
