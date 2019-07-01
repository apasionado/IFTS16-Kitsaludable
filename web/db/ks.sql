-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 25-06-2019 a las 22:23:55
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `ks`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alimentos`
--

CREATE TABLE IF NOT EXISTS `alimentos` (
  `id_alimentos` int(10) NOT NULL AUTO_INCREMENT,
  `nombre_alimentos` varchar(30) NOT NULL,
  `calorias` int(20) NOT NULL,
  `dietas_id` int(30) NOT NULL,
  PRIMARY KEY (`id_alimentos`),
  KEY `dietas_id` (`dietas_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `alimentos`
--

INSERT INTO `alimentos` (`id_alimentos`, `nombre_alimentos`, `calorias`, `dietas_id`) VALUES
(1, 'pizza', 500, 2),
(2, 'asado', 15000, 3),
(3, 'milanesa de carne', 400, 3),
(4, 'pastas', 130, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dietas`
--

CREATE TABLE IF NOT EXISTS `dietas` (
  `id_dietas` int(10) NOT NULL AUTO_INCREMENT,
  `nombre_dietas` varchar(50) NOT NULL,
  PRIMARY KEY (`id_dietas`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `dietas`
--

INSERT INTO `dietas` (`id_dietas`, `nombre_dietas`) VALUES
(1, 'dieta del limon'),
(2, 'dieta de harinas'),
(3, 'dieta proteica');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alimentos`
--
ALTER TABLE `alimentos`
  ADD CONSTRAINT `alimentos_ibfk_1` FOREIGN KEY (`dietas_id`) REFERENCES `dietas` (`id_dietas`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
