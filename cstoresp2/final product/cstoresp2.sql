-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 03-03-2018 a las 17:52:14
-- Versión del servidor: 5.7.19
-- Versión de PHP: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cstoresp2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comment`
--

DROP TABLE IF EXISTS `comment`;
CREATE TABLE IF NOT EXISTS `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product` int(11) NOT NULL,
  `description` varchar(100) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `comment`
--

INSERT INTO `comment` (`id`, `product`, `description`, `date`) VALUES
(1, 1, 'Best product in the world', '2018-02-25 04:04:30'),
(2, 1, 'This suit is awesome', '2018-02-25 04:11:44'),
(4, 3, 'Great product', '2018-02-25 18:06:44');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE IF NOT EXISTS `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `description` varchar(20000) NOT NULL,
  `price` int(9) NOT NULL,
  `img` varchar(400) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `product`
--

INSERT INTO `product` (`id`, `name`, `description`, `price`, `img`) VALUES
(1, 'Navy Slim Fit Suit Center Vent', 'This notch lapel is the most widely used and most versatile.\r\nIt is accompanied with one bosom chest pocket and two flap pockets.\r\nIt features a centre vent and no pleat pants made of the super rayon, fabric.', 100, 'https://www.mensitaly.com/images/Mens-Navy-Slim-Fit-Suit-22079.jpg'),
(2, 'Bellagio Tuxedo Gold 3PC Suit ', 'test', 100, 'https://www.mensitaly.com/images/Mens-Gold-Color-Vest-Suit-34019.jpg'),
(3, 'Burgundy ~ Maroon ~ Wine Color Two Button Notch Party Suit', 'Burgundy Two Button Notch Party Suit & Tuxedo & Blazer w/ Black Lapel-100% Light Weight Polyester - very durable and easy to clean, black acetate inside body lining.\r\nNon-Adjustable Exact Waist Size Black Trousers are Paired Six Inches lower than Jacket.', 100, 'https://www.mensitaly.com/images/Two-Button-Burgundy-Color-Tuxedo-12943.jpg'),
(4, 'Lynda Couture Promotional Ladies Suits', 'test', 100, 'https://www.mensitaly.com/images/Lynda-Couture-Black-Ladies-Suits-18614.jpg'),
(5, 'Fashion Royal Blue Slim Fit Elbow Patches', 'test', 100, 'https://www.mensitaly.com/images/Royal-Blue-Slim-Fit-Blazer-37497.jpg');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
