/**
* 
* @version [1.0.0 2022-20-06]
*
* @author [Alexandra Santa Muñoz, maalexa24@gmail.com]
*
* @since [Version 1]
*
*/

var express = require('express');
var router = express.Router();

/* GET users listing. */
router.get('/', function(req, res, next) {
  res.send('respond with a resource');
});
/**
 * se genera ruta de acceso users/cool/
 */
router.get('/cool/', function(req, res, next) {
  res.send('Eres Genial');
});
module.exports = router;
