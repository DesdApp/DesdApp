-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-08-2019 a las 19:46:06
-- Versión del servidor: 10.1.30-MariaDB
-- Versión de PHP: 7.0.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `desdapp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bienes_inmuebles`
--

CREATE TABLE `bienes_inmuebles` (
  `inmueble_id` varchar(25) NOT NULL,
  `tipo_propiedad_id` tinyint(2) NOT NULL,
  `estado_id` tinyint(2) NOT NULL,
  `estado_neg_id` tinyint(2) NOT NULL,
  `cliente_id` int(10) NOT NULL,
  `direccion` varchar(150) NOT NULL,
  `zona_id` int(4) NOT NULL,
  `metro_cuadrados` varchar(30) NOT NULL,
  `descripcion_metros` varchar(250) NOT NULL,
  `cant_cuartos` int(3) NOT NULL,
  `cant_niveles` int(3) NOT NULL,
  `sotanos` tinyint(2) NOT NULL,
  `elevadores` tinyint(2) NOT NULL,
  `precio_min_venta` int(10) NOT NULL,
  `precio_sugerido` int(10) NOT NULL,
  `precio_real` int(10) NOT NULL,
  `image_id` int(10) NOT NULL,
  `cod_empleado` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `bienes_inmuebles`
--

INSERT INTO `bienes_inmuebles` (`inmueble_id`, `tipo_propiedad_id`, `estado_id`, `estado_neg_id`, `cliente_id`, `direccion`, `zona_id`, `metro_cuadrados`, `descripcion_metros`, `cant_cuartos`, `cant_niveles`, `sotanos`, `elevadores`, `precio_min_venta`, `precio_sugerido`, `precio_real`, `image_id`, `cod_empleado`) VALUES
('1', 10, 1, 1, 5, '3ra. Avenida 13-04 ', 4, '125X50', '125 metros de ancho por 50 metros de largo', 1, 1, 0, 0, 5700, 6000, 5600, 6, 1),
('10', 3, 1, 2, 14, '6ta. Calle 2-71 ', 5, '57X45', '57 metros de ancho por 41 metros de largo', 3, 1, 0, 0, 79158, 79458, 79058, 15, 1),
('11', 5, 1, 1, 15, '2da. Calle 11-67 ', 5, '96X453', '96 metros de ancho por 453 metros de largo', 2, 1, 0, 0, 4565940, 4566240, 4565840, 16, 2),
('12', 5, 4, 2, 16, '9na. Avenida 5-63 ', 3, '523X242', '523 metros de ancho por 242 metros de largo', 5, 2, 1, 0, 13289130, 13289430, 13289030, 17, 5),
('13', 3, 3, 2, 17, '31 calle 14-14 ', 14, '256X231', '256 metros de ancho por 231 metros de largo', 4, 1, 0, 0, 6445524, 6445824, 6445424, 21, 4),
('14', 3, 3, 1, 18, '8va. Avenida 17-36 ', 11, '12X31', '12 metros de ancho por 31 metros de largo', 6, 2, 0, 0, 86748, 87048, 86648, 18, 3),
('15', 2, 2, 1, 19, '3ra. Calle 23-20 ', 17, '123X123', '123 metros de ancho por 123 metros de largo', 4, 2, 0, 0, 680505, 680805, 680405, 19, 2),
('16', 6, 1, 1, 20, '20 calle 14-14 ', 14, '123X121', '123 metros de ancho por 121 metros de largo', 0, 3, 1, 1, 1562415, 1562715, 1562315, 20, 1),
('17', 3, 3, 1, 21, '1ra. Calle 4-42 ', 1, '31X21', '31 metros de ancho por 21 metros de largo', 4, 2, 0, 0, 196860, 197160, 196760, 21, 5),
('18', 4, 3, 2, 22, '6ta. Calle 6-53 ', 10, '234X123', '234 metros de ancho por 123 metros de largo', 10, 6, 2, 1, 3309630, 3309930, 3309530, 22, 3),
('19', 3, 1, 1, 23, '10ma. Calle 4-20 ', 11, '123X112', '123 metros de ancho por 112 metros de largo', 3, 1, 0, 0, 1138740, 1139040, 1138640, 23, 2),
('2', 2, 1, 2, 6, '7ma. Avenida 1-12 ', 10, '100X75', '100 metros de ancho por 75 metros de largo', 2, 1, 0, 0, 787500, 787500, 787400, 7, 2),
('20', 3, 1, 2, 24, '7ma. Calle 7-61', 18, '12X31', '12 metros de ancho por 31 metros de largo', 1, 1, 0, 0, 15696, 15996, 15596, 24, 5),
('3', 9, 1, 2, 7, '3ra. Calle 25-21 ', 10, '18X9', '18 metros de ancho por 9metros de largo', 3, 1, 0, 0, 3426, 3726, 3326, 8, 5),
('4', 3, 2, 1, 8, '1ra. Calle 20-12', 2, '300X250', '300 metros de ancho por 250 metros de largo', 2, 1, 0, 0, 5624700, 5625000, 5624600, 9, 4),
('5', 8, 2, 2, 9, '2da. Calle 03-75 ', 15, '1000X700', '1000 metros de ancho por 700 metros de largo', 30, 14, 3, 2, 15999700, 16000000, 15999600, 10, 3),
('6', 4, 2, 2, 10, '6ta. Avenida 25-21 ', 13, '30X20', '30 metros de ancho por 20 metros de largo', 5, 2, 0, 0, 6900, 7200, 6800, 11, 1),
('7', 7, 3, 1, 11, '1ra. Avenida 1-46 ', 5, '25X20', '25 metros de ancho por 20 metros de largo', 4, 2, 0, 0, 1700, 2000, 1600, 12, 4),
('8', 4, 4, 1, 12, '1ra. Calle 4-42 ', 1, '50X43', '50 metros de ancho por 43 metros de largo', 4, 2, 0, 0, 224450, 224750, 224350, 13, 2),
('9', 1, 1, 2, 13, '6ta. Calle 2-71 ', 5, '356X231', '356 metros de ancho por 231 metros de largo', 5, 2, 1, 0, 16446900, 16447200, 16446800, 14, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `cliente_id` int(10) NOT NULL,
  `persona_id` int(10) NOT NULL,
  `nombre_titular` varchar(150) NOT NULL,
  `user` varchar(15) NOT NULL,
  `password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`cliente_id`, `persona_id`, `nombre_titular`, `user`, `password`) VALUES
(5, 2, 'Raquel ', 'raqu20', 'raqu20'),
(6, 3, 'Stephanie', 'steph21', 'steph21'),
(7, 4, 'Carlos', 'carl22', 'carl22'),
(8, 5, 'Estela', 'estel23', 'estel23'),
(9, 6, 'Esteban', 'estb24', 'estb24'),
(10, 7, 'Fernanda', 'fern25', 'fern25'),
(11, 8, 'Maria', 'mar26', 'mar26'),
(12, 9, 'Jose', 'jose27', 'jose27'),
(13, 10, 'Daniela', 'dani28', 'dani28'),
(14, 11, 'Marco', 'marc29', 'marc29'),
(15, 12, 'Jeronimo', 'jer30', 'jer30'),
(16, 13, 'Estefania', 'estef31', 'estef31'),
(17, 14, 'Guillermo', 'guill32', 'guill32'),
(18, 15, 'Eliana', 'eli33', 'eli33'),
(19, 16, 'Jose', 'jos34', 'jos34'),
(20, 17, 'Marcela', 'marce35', 'marce35'),
(21, 18, 'Daniel', 'dan36', 'dan36'),
(22, 19, 'Rafael', 'raf37', 'raf37'),
(23, 20, 'Camilo', 'cam38', 'cam38'),
(24, 21, 'Santiago', 'santi39', 'santi39'),
(25, 22, 'Grace', 'grace40', 'grace40'),
(26, 23, 'Karen', 'karen41', 'karen41'),
(27, 24, 'Saul', 'saul42', 'saul42'),
(28, 25, 'Javier', 'javi43', 'javi43'),
(29, 26, 'Virginia', 'virg44', 'virg44'),
(30, 27, 'Sergio', 'ser45', 'ser45'),
(31, 28, 'Jorge', 'jorg46', 'jorg46'),
(32, 29, 'Mariana', 'mar47', 'mar47'),
(33, 30, 'Roberto', 'rob48', 'rob48');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamentos`
--

CREATE TABLE `departamentos` (
  `depto_id` int(2) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `region_id` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `departamentos`
--

INSERT INTO `departamentos` (`depto_id`, `nombre`, `region_id`) VALUES
(1, 'Guatemala', 1),
(2, 'El Progreso', 3),
(3, 'Sacatepéquez', 5),
(4, 'Chimaltenango', 5),
(5, 'Escuintla', 5),
(6, 'Santa Rosa', 4),
(7, 'Sololá', 6),
(8, 'Totonicapán', 6),
(9, 'Quetzaltenango', 6),
(10, 'Suchitepéquez', 6),
(11, 'Retalhuleu', 6),
(12, 'San Marcos', 6),
(13, 'Huehuetenango', 7),
(14, 'Quiché', 7),
(15, 'Baja Verapaz', 2),
(16, 'Alta Verapaz', 2),
(17, 'Petén', 8),
(18, 'Izabal', 3),
(19, 'Zacapa', 3),
(20, 'Chiquimula', 3),
(21, 'Jalapa', 4),
(22, 'Jutiapa', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `cod_empleado` int(10) NOT NULL,
  `persona_id` int(10) NOT NULL,
  `tipo_usuario_id` tinyint(2) NOT NULL,
  `puesto` varchar(50) NOT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_finalizacion` date DEFAULT NULL,
  `user` varchar(15) NOT NULL,
  `password` varchar(30) NOT NULL,
  `image_id` int(10) NOT NULL,
  `estado_emp_id` tinyint(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`cod_empleado`, `persona_id`, `tipo_usuario_id`, `puesto`, `fecha_inicio`, `fecha_finalizacion`, `user`, `password`, `image_id`, `estado_emp_id`) VALUES
(1, 2, 2, 'secretaria', '2014-03-20', '0000-00-00', 'ssosad1', '123', 1, 1),
(2, 3, 4, 'reportes', '2015-09-03', '0000-00-00', 'ptejadav1', '123', 2, 1),
(3, 4, 1, 'admin', '2010-01-06', '0000-00-00', 'a', 'a', 3, 1),
(4, 5, 3, 'corredor', '2018-11-29', '0000-00-00', 'eriosk1', '123', 4, 1),
(5, 6, 3, 'corredor', '2016-02-09', '0000-00-00', 'evelasquez1', '123', 5, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estados_empleados`
--

CREATE TABLE `estados_empleados` (
  `estado_emp_id` tinyint(1) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estados_empleados`
--

INSERT INTO `estados_empleados` (`estado_emp_id`, `nombre`) VALUES
(1, 'Activo'),
(2, 'Suspendido'),
(3, 'Dado de baja');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado_bien_inmueble`
--

CREATE TABLE `estado_bien_inmueble` (
  `estado_id` tinyint(2) NOT NULL,
  `nombre` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estado_bien_inmueble`
--

INSERT INTO `estado_bien_inmueble` (`estado_id`, `nombre`) VALUES
(1, 'Disponible'),
(2, 'Vendido'),
(3, 'En Proceso'),
(4, 'No definido');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `image_url`
--

CREATE TABLE `image_url` (
  `image_id` int(10) NOT NULL,
  `url` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `image_url`
--

INSERT INTO `image_url` (`image_id`, `url`) VALUES
(1, '1'),
(2, '1'),
(3, '1'),
(4, '1'),
(5, '1'),
(6, '1'),
(7, '1'),
(8, '1'),
(9, '1'),
(10, '1'),
(11, '1'),
(12, '1'),
(13, '1'),
(14, '1'),
(15, '1'),
(16, '1'),
(17, '1'),
(18, '1'),
(19, '1'),
(20, '1'),
(21, '1'),
(22, '1'),
(23, '1'),
(24, '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `municipios`
--

CREATE TABLE `municipios` (
  `muni_id` int(4) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `depto_id` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `municipios`
--

INSERT INTO `municipios` (`muni_id`, `nombre`, `depto_id`) VALUES
(101, 'Guatemala', 1),
(102, 'Santa Catarina Pinula', 1),
(103, 'San José Pinula', 1),
(104, 'San José del Golfo', 1),
(105, 'Palencia', 1),
(106, 'Chinautla', 1),
(107, 'San Pedro Ayampuc', 1),
(108, 'Mixco', 1),
(109, 'San Pedro Sacatepéquez', 1),
(110, 'San Juan Sacatépequez', 1),
(111, 'San Raymundo', 1),
(112, 'Chuarrancho', 1),
(113, 'Fraijanes', 1),
(114, 'Amatitlán', 1),
(115, 'Villa Nueva', 1),
(116, 'Villa Canales', 1),
(117, 'Petapa', 1),
(201, 'Guastatoya', 2),
(202, 'Morazán', 2),
(203, 'San Agustín Acasaguastlán', 2),
(204, 'San Cristóbal Acasaguastlán', 2),
(205, 'El Jícaro', 2),
(206, 'Sansare', 2),
(207, 'Sanarate', 2),
(208, 'San Antonio La Paz', 2),
(301, 'Antigua Guatemala', 3),
(302, 'Jocotenango', 3),
(303, 'Pastores', 3),
(304, 'Sumpango', 3),
(305, 'Sto. Domingo Xenacoj', 3),
(306, 'Santiago Sacatepéquez', 3),
(307, 'San Bartolomé Millpas Altas', 3),
(308, 'San Lucas Sacatepéquez', 3),
(309, 'Santa Lucia Milpas Altas', 3),
(310, 'Magdalena Milpas Altas', 3),
(311, 'Santa María de Jesús', 3),
(312, 'Ciudad Vieja', 3),
(313, 'San Miguel Dueñas', 3),
(314, 'Alotenango', 3),
(315, 'San Antonio Aguas Calientes', 3),
(316, 'Santa Catarina Barahona', 3),
(401, 'Chimaltenango', 4),
(402, 'San José Poaquil', 4),
(403, 'San Martín Jilotepeque', 4),
(404, 'Comalapa', 4),
(405, 'Santa Apolonia', 4),
(406, 'Tecpán Guatemala', 4),
(407, 'Patzún', 4),
(408, 'Pochuta', 4),
(409, 'Patzicia', 4),
(410, 'Santa Cruz Balanyá', 4),
(411, 'Acatenango', 4),
(412, 'Yepocapa', 4),
(413, 'San Andrés Iztapa', 4),
(414, 'Parramos', 4),
(415, 'Zaragoza', 4),
(416, 'El Tejar', 4),
(501, 'Escuintla', 5),
(502, 'Santa Lucía Cotzumalguapa', 5),
(503, 'La Democracia', 5),
(504, 'Siquinalá', 5),
(505, 'Masagua', 5),
(506, 'Tiquisate', 5),
(507, 'La Gomera', 5),
(508, 'Guanagazapa', 5),
(509, 'San José', 5),
(510, 'Iztapa', 5),
(511, 'Palín', 5),
(512, 'San Vicente Pacaya', 5),
(513, 'Nueva Concepción', 5),
(601, 'Cuilapa', 6),
(602, 'Barberena', 6),
(603, 'Santa Rosa de Lima', 6),
(604, 'Casillas', 6),
(605, 'San Rafael Las Flores', 6),
(606, 'Oratorio', 6),
(607, 'San Juan Tecuaco', 6),
(608, 'Chiquimulilla', 6),
(609, 'Taxisco', 6),
(610, 'Santa María Ixhuatán', 6),
(611, 'Guazacapán', 6),
(612, 'Santa Cruz Naranjo', 6),
(613, 'Pueblo Nuevo Viñas', 6),
(614, 'Nueva Santa Rosa', 6),
(701, 'Sololá', 7),
(702, 'San José Chacayá', 7),
(703, 'Santa María Visitación', 7),
(704, 'Santa Lucía Utatlán', 7),
(705, 'Nahualá', 7),
(706, 'Santa Catarina Ixtahuacán', 7),
(707, 'Santa Clara La Laguna', 7),
(708, 'Concepción', 7),
(709, 'San Andrés Semetabaj', 7),
(710, 'Panajachel', 7),
(711, 'Santa Catarina Palopó', 7),
(712, 'San Antonio Palopó', 7),
(713, 'San Lucas Tolimán', 7),
(714, 'Santa Cruz La Laguna', 7),
(715, 'San Pablo La Laguna', 7),
(716, 'San Marcos La Laguna', 7),
(717, 'San Juan La Laguna', 7),
(718, 'San Pedro La Laguna', 7),
(719, 'Santiago Atitlán', 7),
(801, 'Totonicapán', 8),
(802, 'San Cristóbal Totonicapán', 8),
(803, 'San Francisco El Alto', 8),
(804, 'San Andrés Xecul', 8),
(805, 'Momostenango', 8),
(806, 'Santa María Chiquimula', 8),
(807, 'Santa Lucía La Reforma', 8),
(808, 'San Bartolo Aguas Calientes', 8),
(901, 'Quetzaltenango', 9),
(902, 'Salcajá', 9),
(903, 'Olintepeque', 9),
(904, 'San Carlos Sija', 9),
(905, 'Sibilia', 9),
(906, 'Cabricán', 9),
(907, 'Cajolá', 9),
(908, 'San Miguel Siguilá', 9),
(909, 'San Juan Ostuncalco', 9),
(910, 'San Mateo', 9),
(911, 'Concepción Chiquirichapa', 9),
(912, 'San Martín Sacatepéquez', 9),
(913, 'Almolonga', 9),
(914, 'Cantel', 9),
(915, 'Huitán', 9),
(916, 'Zunil', 9),
(917, 'Colomba', 9),
(918, 'San Francisco La Unión', 9),
(919, 'El Palmar', 9),
(920, 'Coatepeque', 9),
(921, 'Génova', 9),
(922, 'Flores Costa Cuca', 9),
(923, 'La Esperanza', 9),
(924, 'Palestina de los Altos', 9),
(1001, 'Mazatenango', 10),
(1002, 'Cuyotenango', 10),
(1003, 'San Francisco Zapotitlán', 10),
(1004, 'San Bernardino', 10),
(1005, 'San José El ídolo', 10),
(1006, 'Santo Domingo Suchitepéquez', 10),
(1007, 'San Lorenzo', 10),
(1008, 'Samayac', 10),
(1009, 'San Pablo Jocopilas', 10),
(1010, 'San Antonio Suchitepéquez', 10),
(1011, 'San Miguel Panán', 10),
(1012, 'San Gabriel', 10),
(1013, 'Chicacao', 10),
(1014, 'Patulul', 10),
(1015, 'Santa Bárbara', 10),
(1016, 'San Juan Bautista', 10),
(1017, 'Santo Tomás La Unión', 10),
(1018, 'Zunilito', 10),
(1019, 'Pueblo Nuevo', 10),
(1020, 'Río Bravo', 10),
(1101, 'Retalhuleu', 11),
(1102, 'San Sebastián', 11),
(1103, 'Santa Cruz Muluá', 11),
(1104, 'San Martín Zapotitlán', 11),
(1105, 'San Felipe Retalhuleu', 11),
(1106, 'San Andrés Villa Seca', 11),
(1107, 'Champerico', 11),
(1108, 'Nuevo San Carlos', 11),
(1109, 'El Asintal', 11),
(1201, 'San Marcos', 12),
(1202, 'San Pedro Sacatepéquez', 12),
(1203, 'San Antonio Sacatepéquez', 12),
(1204, 'Comitancillo', 12),
(1205, 'San Miguel Ixtahuacán', 12),
(1206, 'Concepción Tutuapa', 12),
(1207, 'Tacaná', 12),
(1208, 'Sibinal', 12),
(1209, 'Tajumulco', 12),
(1210, 'Tejutla', 12),
(1211, 'San Rafael Pie de la Cuesta', 12),
(1212, 'Nuevo Progreso', 12),
(1213, 'El Tumbador', 12),
(1214, 'El Rodeo', 12),
(1215, 'Malacatán', 12),
(1216, 'Catarina', 12),
(1217, 'Ayutla', 12),
(1218, 'Ocós', 12),
(1219, 'San Pablo', 12),
(1220, 'El Quetzal', 12),
(1221, 'La Reforma', 12),
(1222, 'Pajapita', 12),
(1223, 'Ixchiguán', 12),
(1224, 'San José Ojetenam', 12),
(1225, 'San Cristóbal Cucho', 12),
(1226, 'Sipacapa', 12),
(1227, 'Esquipulas Palo Gordo', 12),
(1228, 'Río Blanco', 12),
(1229, 'San Lorenzo', 12),
(1301, 'Huehuetenango', 13),
(1302, 'Chiantla', 13),
(1303, 'Malacatancito', 13),
(1304, 'Cuilco', 13),
(1305, 'Nentón', 13),
(1306, 'San Pedro Necta', 13),
(1307, 'Jacaltenango', 13),
(1308, 'Soloma', 13),
(1309, 'San Idelfonso Ixtahuacán', 13),
(1310, 'Santa Bárbara', 13),
(1311, 'La Libertad', 13),
(1312, 'La Democracia', 13),
(1313, 'San Miguel Acatán', 13),
(1314, 'San Rafael La Indepencia', 13),
(1315, 'Todos Santos Cuchumatán', 13),
(1316, 'San Juan Atitán', 13),
(1317, 'Santa Eulalia', 13),
(1318, 'San Mateo Ixtatán', 13),
(1319, 'Colotenango', 13),
(1320, 'San Sebastián Huehuetenango', 13),
(1321, 'Tectitán', 13),
(1322, 'Concepción Huista', 13),
(1323, 'San Juan Ixcoy', 13),
(1324, 'San Antonio Huista', 13),
(1325, 'San Sebastián Coatán', 13),
(1326, 'Barillas', 13),
(1327, 'Aguacatán', 13),
(1328, 'San Rafael Pétzal', 13),
(1329, 'San Gaspar Ixchil', 13),
(1330, 'Santiago Chimaltenango', 13),
(1331, 'Santa Ana Huista', 13),
(1401, 'Santa Cruz del Quiché', 14),
(1402, 'Chiché', 14),
(1403, 'Chinique', 14),
(1404, 'Zacualpa', 14),
(1405, 'Chajul', 14),
(1406, 'Chichicastenango', 14),
(1407, 'Patzité', 14),
(1408, 'San Antonio Ilotenango', 14),
(1409, 'San Pedro Jocopilas', 14),
(1410, 'Cunén', 14),
(1411, 'San Juan Cotzal', 14),
(1412, 'Joyabaj', 14),
(1413, 'Nebaj', 14),
(1414, 'San Andrés Sajcabajá', 14),
(1415, 'Uspantán', 14),
(1416, 'Sacapulas', 14),
(1417, 'San Bartolomé Jocotenango', 14),
(1418, 'Canillá', 14),
(1419, 'Chicamán', 14),
(1420, 'Playa Grande -Ixcán', 14),
(1421, 'Pachalum', 14),
(1501, 'Salamá', 15),
(1502, 'San Miguel Chicaj', 15),
(1503, 'Rabinal', 15),
(1504, 'Cubulco', 15),
(1505, 'Granados', 15),
(1506, 'El Chol', 15),
(1507, 'San Jerónimo', 15),
(1508, 'Purulhá', 15),
(1601, 'Cobán', 16),
(1602, 'Santa Cruz Verapaz', 16),
(1603, 'San Cristóbal Verapaz', 16),
(1604, 'Tactic', 16),
(1605, 'Tamahú', 16),
(1606, 'Tucurú', 16),
(1607, 'Panzós', 16),
(1608, 'Senahú', 16),
(1609, 'San Pedro Carchá', 16),
(1610, 'San Juan Chamelco', 16),
(1611, 'Lanquín', 16),
(1612, 'Cahabón', 16),
(1613, 'Chisec', 16),
(1614, 'Chahal', 16),
(1615, 'Fray Bartolomé de las Casas', 16),
(1616, 'La Tinta', 16),
(1701, 'Flores', 17),
(1702, 'San José', 17),
(1703, 'San Benito', 17),
(1704, 'San Andrés', 17),
(1705, 'La Libertad', 17),
(1706, 'San Francisco', 17),
(1707, 'Santa Ana', 17),
(1708, 'Dolores', 17),
(1709, 'San Luis', 17),
(1710, 'Sayaxché', 17),
(1711, 'Melchor de Mencos', 17),
(1712, 'Poptún', 17),
(1801, 'Puerto Barrios', 18),
(1802, 'Livingston', 18),
(1803, 'El Estor', 18),
(1804, 'Morales', 18),
(1805, 'Los Amates', 18),
(1901, 'Zacapa', 19),
(1902, 'Estanzuela', 19),
(1903, 'Río Hondo', 19),
(1904, 'Gualán', 19),
(1905, 'Teculután', 19),
(1906, 'Usumatlán', 19),
(1907, 'Cabañas', 19),
(1908, 'San Diego', 19),
(1909, 'La Unión', 19),
(1910, 'Huité', 19),
(2001, 'Chiquimula', 20),
(2002, 'San José La Arada', 20),
(2003, 'San Juan Ermita', 20),
(2004, 'Jocotán', 20),
(2005, 'Camotán', 20),
(2006, 'Olopa', 20),
(2007, 'Esquipulas', 20),
(2008, 'Concepción Las Minas', 20),
(2009, 'Quetzaltepeque', 20),
(2010, 'San Jacinto', 20),
(2011, 'Ipala', 20),
(2101, 'Jalapa', 21),
(2102, 'San Pedro Pinula', 21),
(2103, 'San Luis Jilotepeque', 21),
(2104, 'San Manuel Chaparrón', 21),
(2105, 'San Carlos Alzatate', 21),
(2106, 'Monjas', 21),
(2107, 'Mataquescuintla', 21),
(2201, 'Jutiapa', 22),
(2202, 'El Progreso', 22),
(2203, 'Santa Catarina Mita', 22),
(2204, 'Agua Blanca', 22),
(2205, 'Asunción Mita', 22),
(2206, 'Yupiltepeque', 22),
(2207, 'Atescatempa', 22),
(2208, 'Jerez', 22),
(2209, 'El Adelanto', 22),
(2210, 'Zapotitlán', 22),
(2211, 'Comapa', 22),
(2212, 'Jalpatagua', 22),
(2213, 'Conguaco', 22),
(2214, 'Moyuta', 22),
(2215, 'Pasaco', 22),
(2216, 'San José Acatempa', 22),
(2217, 'Quesada', 22);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas`
--

CREATE TABLE `personas` (
  `persona_id` int(10) NOT NULL,
  `nombre` varchar(75) NOT NULL,
  `apellido` varchar(75) NOT NULL,
  `tipo_documento_id` tinyint(2) NOT NULL,
  `no_documento` varchar(25) NOT NULL,
  `nit` varchar(15) NOT NULL,
  `direccion` varchar(150) NOT NULL,
  `celular` int(8) NOT NULL,
  `telefono` int(8) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `fecha_nacimiento` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `personas`
--

INSERT INTO `personas` (`persona_id`, `nombre`, `apellido`, `tipo_documento_id`, `no_documento`, `nit`, `direccion`, `celular`, `telefono`, `correo`, `fecha_nacimiento`) VALUES
(2, 'Raquel Pamela', 'Tejada Vega', 1, '101', '74145261', 'Zona 18 Colonia \"San Maria\" calle 12-23', 50570814, 50570814, 'raquelvegajava12@gmail.com', '2002-08-20'),
(3, 'Stephanie Maria Gabriela', 'Sosa De Leon', 1, '102', '74145262', '3 calle casa #5 Resideciales \"Las Palmas\", Sanarate', 34480816, 34480816, 'stephaniemaria2401@gmail.com', '2001-09-24'),
(4, 'Carlos Estuardo', 'Zepeda Diaz', 1, '103', '74145263', 'Villa Nueva', 32355494, 32355494, 'carloszepeda1392@gmail.com', '1992-09-13'),
(5, 'Estela Carolina', 'Velasquez', 1, '104', '74145264', 'San José Pinula', 42282440, 42282440, 'ekarol1994@gmail.com', '1994-07-24'),
(6, 'Esteban Adrian', 'Rios Kirste', 2, '105', '74145265', 'Zona 18 colonia Kennedy 7 calle 7-55', 10101010, 10101010, 'erioskirste@gmail.com', '2003-09-14'),
(7, 'Fernanda Violeta', 'Gohg ', 1, '106', '74145266', 'Zona 18 colonia Kennedy 7 calle 7-56', 34764324, 34764324, 'fgogh4354@mail.com', '1992-12-21'),
(8, 'Maria Alejandra', 'Castillo Lopez', 1, '107', '74145267', 'Zona 18 colonia Kennedy 7 calle 7-57', 24052345, 24052345, 'maricas@mail.com', '2000-03-02'),
(9, 'Jose Santiago', 'Arriaza Aldana', 1, '108', '74145268', 'Zona 18 colonia Kennedy 7 calle 7-58', 34255647, 34255647, 'jarriazaa1443@mail.com', '1998-12-21'),
(10, 'Daniela Elizabeth', 'Diaz Cabrera', 1, '109', '74145269', 'Villa Nueva', 23562466, 23562466, 'ddiaz2374@mail.com', '1970-10-07'),
(11, 'Marco Gonzalo', 'Ruiz Pelaez', 1, '110', '74145270', '3 calle casa #5 Resideciales \"Las Palmas\", Sanarate', 34527689, 34527689, 'mruizp2334@mail.com', '1985-02-25'),
(12, 'Jeronimo Jorge', 'Burgos Idarraga', 1, '111', '74145271', '4 calle casa #5 Resideciales \"Las Palmas\", Sanarate', 31053976, 31053976, 'Jburgos2335@mail.com', '2002-08-20'),
(13, 'Estefania Alejandra', 'Villegas Aguirre', 2, '112', '74145272', '5 calle casa #5 Resideciales \"Las Palmas\", Sanarate', 31189997, 31189997, 'Evillegas2336@mail.com', '2001-09-24'),
(14, 'Guillermo Alejandro', 'Fernandez Carmona', 1, '113', '74145273', '31 calle 14-14 zona 14', 31326018, 31326018, 'gfernandez2337@mail.com', '1992-09-13'),
(15, 'Eliana Marisol', 'Ramirez Ospina', 2, '114', '74145274', 'San José Pinula', 31462039, 31462039, 'Eramirez2338@mail.com', '1994-07-24'),
(16, 'Jose Raul', 'Carmona Pérez', 2, '115', '74145275', 'San José Pinula', 31598060, 31598060, 'jcarmona2339@mail.com', '2003-09-14'),
(17, 'Marcela Sofia', 'De santis Cifuentes', 2, '116', '74145276', '20 calle 14-14 zona 14', 31734081, 31734081, 'mcifuentes2340@mail.com', '1992-12-21'),
(18, 'Daniela Elizabeth', 'Franco Zapeta', 2, '117', '74145277', 'Zona 18 colonia Kennedy 7 calle 7-58', 31870102, 31870102, 'dfranco2341@mail.com', '2000-03-02'),
(19, 'Rafael Felipe', 'Cortes Miramar', 1, '118', '74145278', 'Zona 18 colonia Kennedy 7 calle 7-59', 32006123, 32006123, 'rcortes2342@mail.com', '1998-12-21'),
(20, 'Camilo Sebastian', 'Berrio Escobar', 1, '119', '74145279', 'San José Pinula', 32142144, 32142144, 'cberrio2343@mail.com', '1970-10-07'),
(21, 'Francisco Tomas', 'Arias Martinez', 2, '120', '74145280', 'Zona 18 colonia Kennedy 7 calle 7-61', 32278165, 32278165, 'farias2344@mail.com', '1985-02-25'),
(22, 'Antonio Eliseo', 'Merizalde Zetino', 1, '121', '74145281', '25 calle 14-14 zona 14', 32414186, 32414186, 'amerizaldez2345@mail.com', '2002-08-20'),
(23, 'Karen Andrea', 'Restrepo Borja', 2, '122', '74145282', '26 calle 14-14 zona 14', 32550207, 32550207, 'krestrepob2346@mail.com', '2001-09-24'),
(24, 'David Saul', 'Lemus Vino', 1, '123', '74145283', 'Zona 18 Colonia \"San Maria\" calle 12-23', 35686228, 35686228, 'dlemusv2347@mail.com', '1992-09-13'),
(25, 'Javier Danilo', 'Santana Benitez', 1, '124', '74145284', 'Zona 18 Colonia \"San Maria\" calle 12-24', 32822249, 32822249, 'jsantanab2348@mail.com', '1994-07-24'),
(26, 'Virginia Fatima', 'Saldarriaga Espinoza', 2, '125', '74145285', 'San José Pinula', 32958270, 32958270, 'rgiraldoa23@mail.com', '2003-09-14'),
(27, 'Sergio Manuel', 'Posada Santos', 2, '126', '74145286', 'Zona 18 Colonia \"San Maria\" calle 12-26', 33094291, 33094291, 'sposadas2350@mail.com', '1992-12-21'),
(28, 'Jorge Agustin', 'Zea Flores', 2, '127', '74145287', '31 calle 14-14 zona 14', 43230312, 43230312, 'jzeaf2351@mail.com', '2000-03-02'),
(29, 'Mariana Cristina', 'Diaz Gutierrez', 2, '128', '74145288', '32 calle 14-14 zona 14', 33366333, 33366333, 'mriazg@mail.com', '1998-12-21'),
(30, 'Roberto Jimenez', 'Giraldo Ayala', 1, '129', '74145289', '33 calle 14-14 zona 14', 33502354, 33502354, 'rgiraldoa6413@mail.com', '1970-10-07');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `regiones`
--

CREATE TABLE `regiones` (
  `region_id` int(2) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `descripcion` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `regiones`
--

INSERT INTO `regiones` (`region_id`, `nombre`, `descripcion`) VALUES
(1, 'Metropolitana', 'Región I'),
(2, 'Norte', 'Región II'),
(3, 'NorOriental', 'Región III'),
(4, 'SurOriental', 'Región IV'),
(5, 'Central', 'Región V'),
(6, 'SurOccidental', 'Región VI'),
(7, 'NorOccidental', 'Región VII'),
(8, 'Péten', 'Región VIII');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `suscriptores`
--

CREATE TABLE `suscriptores` (
  `suscriptor_id` int(10) NOT NULL,
  `nombre` varchar(250) NOT NULL,
  `correo` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_propiedades`
--

CREATE TABLE `tipos_propiedades` (
  `tipo_propiedad_id` tinyint(2) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipos_propiedades`
--

INSERT INTO `tipos_propiedades` (`tipo_propiedad_id`, `nombre`) VALUES
(1, 'Apartamentos'),
(2, 'Bodegas'),
(3, 'Casas'),
(4, 'Edificios'),
(5, 'Fincas'),
(6, 'Locales Comerciales'),
(7, 'Oficinas'),
(8, 'Terrenos'),
(9, 'Proyectos de Residenciale'),
(10, 'Proyectos de Apartamentos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_usuarios`
--

CREATE TABLE `tipos_usuarios` (
  `tipo_usuario_id` tinyint(1) NOT NULL,
  `nombre` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipos_usuarios`
--

INSERT INTO `tipos_usuarios` (`tipo_usuario_id`, `nombre`) VALUES
(1, 'Admin'),
(2, 'Secretaria'),
(3, 'Corredor'),
(4, 'Reportes');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_documento`
--

CREATE TABLE `tipo_documento` (
  `tipo_documento_id` tinyint(2) NOT NULL,
  `nombre_documeto` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo_documento`
--

INSERT INTO `tipo_documento` (`tipo_documento_id`, `nombre_documeto`) VALUES
(1, 'DPI'),
(2, 'Pasaporte');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta_renta`
--

CREATE TABLE `venta_renta` (
  `estado_neg_id` tinyint(2) NOT NULL,
  `nombre` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `venta_renta`
--

INSERT INTO `venta_renta` (`estado_neg_id`, `nombre`) VALUES
(1, 'Venta'),
(2, 'Renta');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `zonas`
--

CREATE TABLE `zonas` (
  `zona_id` int(4) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `muni_id` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `zonas`
--

INSERT INTO `zonas` (`zona_id`, `nombre`, `muni_id`) VALUES
(1, 'Sin Zona', 101),
(2, 'Zona 0', 101),
(3, 'Zona 1', 101),
(4, 'Zona 2', 101),
(5, 'Zona 3', 101),
(6, 'Zona 4', 101),
(7, 'Zona 5', 101),
(8, 'Zona 6', 101),
(9, 'Zona 7', 101),
(10, 'Zona 8', 101),
(11, 'Zona 9', 101),
(12, 'Zona 10', 101),
(13, 'Zona 11', 101),
(14, 'Zona 12', 101),
(15, 'Zona 13', 101),
(16, 'Zona 14', 101),
(17, 'Zona 15', 101),
(18, 'Zona 16', 101),
(19, 'Zona 17', 101),
(20, 'Zona 18', 101),
(21, 'Zona 19', 101),
(22, 'Zona 21', 101),
(23, 'Zona 24', 101),
(24, 'Zona 25', 101),
(25, 'Sin Zona', 102),
(26, 'Zona 0', 102),
(27, 'Zona 1', 102),
(28, 'Zona 2', 102),
(29, 'Zona 3', 102),
(30, 'Zona 4', 102),
(31, 'Zona 5', 102),
(32, 'Zona 6', 102),
(33, 'Zona 7', 102),
(34, 'Zona 8', 102),
(35, 'Zona 9', 102),
(36, 'Zona 10', 102),
(37, 'Sin Zona', 108),
(38, 'Zona 0', 108),
(39, 'Zona 1', 108),
(40, 'Zona 2', 108),
(41, 'Zona 3', 108),
(42, 'Zona 4', 108),
(43, 'Zona 5', 108),
(44, 'Zona 6', 108),
(45, 'Zona 7', 108),
(46, 'Zona 8', 108),
(47, 'Zona 9', 108),
(48, 'Zona 10', 108),
(49, 'Zona 11', 108),
(50, 'Sin Zona', 117),
(51, 'Zona 0', 117),
(52, 'Zona 1', 117),
(53, 'Zona 2', 117),
(54, 'Zona 3', 117),
(55, 'Sin Zona', 103),
(56, 'Zona 0', 103),
(57, 'Zona 1', 103),
(58, 'Zona 2', 103),
(59, 'Zona 3', 103),
(60, 'Zona 4', 103),
(61, 'Sin Zona', 104),
(62, 'Zona 0', 104),
(63, 'Sin Zona', 105),
(64, 'Zona 0', 105),
(65, 'Sin Zona', 106),
(66, 'Zona 0', 106),
(67, 'Sin Zona', 107),
(68, 'Zona 0', 107),
(69, 'Sin Zona', 109),
(70, 'Zona 0', 109),
(71, 'Zona 1', 109),
(72, 'Zona 2', 109),
(73, 'Zona 3', 109),
(74, 'Zona 4', 109),
(75, 'Sin Zona', 110),
(76, 'Zona 0', 110),
(77, 'Sin Zona', 111),
(78, 'Zona 0', 111),
(79, 'Sin Zona', 112),
(80, 'Zona 0', 112),
(81, 'Sin Zona', 113),
(82, 'Zona 0', 113),
(83, 'Sin Zona', 114),
(84, 'Zona 0', 114),
(85, 'Sin Zona', 115),
(86, 'Zona 1', 115),
(87, 'Zona 2', 115),
(88, 'Zona 3', 115),
(89, 'Zona 4', 115),
(90, 'Zona 5', 115),
(91, 'Zona 6', 115),
(92, 'Zona 7', 115),
(93, 'Zona 8', 115),
(94, 'Zona 9', 115),
(95, 'Zona 10', 115),
(96, 'Zona 11', 115),
(97, 'Zona 12', 115),
(98, 'Sin Zona', 116),
(99, 'Zona 0', 116),
(100, 'Sin Zona', 201),
(101, 'Zona 0', 201),
(102, 'Sin Zona', 202),
(103, 'Zona 0', 202),
(104, 'Sin Zona', 203),
(105, 'Zona 0', 203),
(106, 'Sin Zona', 204),
(107, 'Zona 0', 204),
(108, 'Sin Zona', 205),
(109, 'Zona 0', 205),
(110, 'Sin Zona', 206),
(111, 'Zona 0', 206),
(112, 'Sin Zona', 207),
(113, 'Sin Zona', 207),
(114, 'Zona 0', 208),
(115, 'Sin Zona', 208),
(116, 'Zona 0', 301),
(117, 'Sin Zona', 301),
(118, 'Zona 0', 302),
(119, 'Sin Zona', 302),
(120, 'Zona 0', 303),
(121, 'Sin Zona', 303),
(122, 'Zona 0', 304),
(123, 'Sin Zona', 304),
(124, 'Zona 0', 305),
(125, 'Sin Zona', 305),
(126, 'Zona 0', 306),
(127, 'Sin Zona', 306),
(128, 'Zona 0', 307),
(129, 'Sin Zona', 307),
(130, 'Zona 0', 308),
(131, 'Sin Zona', 308),
(132, 'Zona 0', 309),
(133, 'Sin Zona', 309),
(134, 'Zona 0', 310),
(135, 'Sin Zona', 310),
(136, 'Sin Zona', 311),
(137, 'Zona 0', 311),
(138, 'Sin Zona', 312),
(139, 'Zona 0', 312),
(140, 'Sin Zona', 313),
(141, 'Zona 0', 313),
(142, 'Sin Zona', 314),
(143, 'Zona 0', 314),
(144, 'Sin Zona', 315),
(145, 'Zona 0', 315),
(146, 'Sin Zona', 316),
(147, 'Zona 0', 316),
(148, 'Sin Zona', 401),
(149, 'Zona 0', 401),
(150, 'Sin Zona', 402),
(151, 'Zona 0', 402),
(152, 'Sin Zona', 403),
(153, 'Sin Zona', 403),
(154, 'Zona 0', 404),
(155, 'Sin Zona', 404),
(156, 'Zona 0', 405),
(157, 'Sin Zona', 405),
(158, 'Sin Zona', 406),
(159, 'Zona 0', 406),
(160, 'Sin Zona', 407),
(161, 'Zona 0', 407),
(162, 'Sin Zona', 408),
(163, 'Zona 0', 408),
(164, 'Sin Zona', 409),
(165, 'Zona 0', 409),
(166, 'Sin Zona', 410),
(167, 'Zona 0', 410),
(168, 'Sin Zona', 411),
(169, 'Zona 0', 411),
(170, 'Sin Zona', 412),
(171, 'Zona 0', 412),
(172, 'Sin Zona', 413),
(173, 'Zona 0', 413),
(174, 'Sin Zona', 414),
(175, 'Zona 0', 414),
(176, 'Sin Zona', 415),
(177, 'Zona 0', 415),
(178, 'Sin Zona', 416),
(179, 'Zona 0', 416),
(180, 'Sin Zona', 501),
(181, 'Sin Zona', 501),
(182, 'Zona 0', 502),
(183, 'Sin Zona', 502),
(184, 'Zona 0', 503),
(185, 'Sin Zona', 503),
(186, 'Zona 0', 504),
(187, 'Sin Zona', 504),
(188, 'Zona 0', 505),
(189, 'Sin Zona', 505),
(190, 'Zona 0', 506),
(191, 'Sin Zona', 506),
(192, 'Zona 0', 507),
(193, 'Sin Zona', 507),
(194, 'Zona 0', 508),
(195, 'Sin Zona', 508),
(196, 'Zona 0', 509),
(197, 'Sin Zona', 509),
(198, 'Zona 0', 510),
(199, 'Sin Zona', 510),
(200, 'Zona 0', 511),
(201, 'Sin Zona', 512),
(202, 'Zona 0', 512),
(203, 'Sin Zona', 513),
(204, 'Sin Zona', 513),
(205, 'Zona 0', 601),
(206, 'Sin Zona', 601),
(207, 'Zona 0', 602),
(208, 'Sin Zona', 602),
(209, 'Zona 0', 603),
(210, 'Sin Zona', 603),
(211, 'Zona 0', 604),
(212, 'Sin Zona', 604),
(213, 'Zona 0', 605),
(214, 'Sin Zona', 605),
(215, 'Zona 0', 606),
(216, 'Sin Zona', 606),
(217, 'Zona 0', 607),
(218, 'Sin Zona', 607),
(219, 'Zona 0', 608),
(220, 'Sin Zona', 608),
(221, 'Zona 0', 609),
(222, 'Sin Zona', 609),
(223, 'Zona 0', 610),
(224, 'Sin Zona', 610),
(225, 'Zona 0', 611),
(226, 'Sin Zona', 611),
(227, 'Zona 0', 612),
(228, 'Sin Zona', 612),
(229, 'Zona 0', 613),
(230, 'Sin Zona', 613),
(231, 'Zona 0', 614),
(232, 'Sin Zona', 614),
(233, 'Zona 0', 701),
(234, 'Sin Zona', 701),
(235, 'Zona 0', 702),
(236, 'Sin Zona', 702),
(237, 'Zona 0', 703),
(238, 'Sin Zona', 703),
(239, 'Zona 0', 704),
(240, 'Sin Zona', 704),
(241, 'Zona 0', 705),
(242, 'Sin Zona', 705),
(243, 'Zona 0', 706),
(244, 'Sin Zona', 706),
(245, 'Zona 0', 707),
(246, 'Sin Zona', 707),
(247, 'Zona 0', 708),
(248, 'Sin Zona', 708),
(249, 'Sin Zona', 709),
(250, 'Zona 0', 709),
(251, 'Sin Zona', 710),
(252, 'Zona 0', 710),
(253, 'Sin Zona', 711),
(254, 'Zona 0', 711),
(255, 'Sin Zona', 712),
(256, 'Zona 0', 712),
(257, 'Sin Zona', 713),
(258, 'Zona 0', 713),
(259, 'Sin Zona', 714),
(260, 'Zona 0', 714),
(261, 'Sin Zona', 715),
(262, 'Zona 0', 715),
(263, 'Sin Zona', 716),
(264, 'Zona 0', 716),
(265, 'Sin Zona', 717),
(266, 'Zona 0', 717),
(267, 'Sin Zona', 718),
(268, 'Zona 0', 718),
(269, 'Sin Zona', 719),
(270, 'Zona 0', 719),
(271, 'Sin Zona', 801),
(272, 'Sin Zona', 801),
(273, 'Zona 0', 802),
(274, 'Sin Zona', 802),
(275, 'Zona 0', 803),
(276, 'Sin Zona', 803),
(277, 'Zona 0', 804),
(278, 'Sin Zona', 804),
(279, 'Zona 0', 805),
(280, 'Sin Zona', 805),
(281, 'Zona 0', 806),
(282, 'Sin Zona', 806),
(283, 'Sin Zona', 807),
(284, 'Zona 0', 807),
(285, 'Sin Zona', 808),
(286, 'Zona 0', 808),
(287, 'Sin Zona', 901),
(288, 'Zona 0', 901),
(289, 'Sin Zona', 902),
(290, 'Zona 0', 902),
(291, 'Sin Zona', 903),
(292, 'Zona 0', 903),
(293, 'Sin Zona', 904),
(294, 'Zona 0', 904),
(295, 'Sin Zona', 905),
(296, 'Zona 0', 905),
(297, 'Sin Zona', 906),
(298, 'Zona 0', 906),
(299, 'Sin Zona', 907),
(300, 'Zona 0', 907),
(301, 'Sin Zona', 908),
(302, 'Zona 0', 908),
(303, 'Sin Zona', 909),
(304, 'Zona 0', 909),
(305, 'Sin Zona', 910),
(306, 'Sin Zona', 910),
(307, 'Zona 0', 911),
(308, 'Sin Zona', 911),
(309, 'Zona 0', 912),
(310, 'Sin Zona', 912),
(311, 'Zona 0', 913),
(312, 'Sin Zona', 913),
(313, 'Zona 0', 914),
(314, 'Sin Zona', 914),
(315, 'Zona 0', 915),
(316, 'Sin Zona', 915),
(317, 'Zona 0', 916),
(318, 'Sin Zona', 916),
(319, 'Zona 0', 917),
(320, 'Sin Zona', 917),
(321, 'Zona 0', 918),
(322, 'Sin Zona', 918),
(323, 'Zona 0', 919),
(324, 'Sin Zona', 919),
(325, 'Zona 0', 920),
(326, 'Sin Zona', 920),
(327, 'Zona 0', 921),
(328, 'Sin Zona', 921),
(329, 'Sin Zona', 922),
(330, 'Zona 0', 922),
(331, 'Sin Zona', 923),
(332, 'Zona 0', 923),
(333, 'Sin Zona', 924),
(334, 'Zona 0', 924),
(335, 'Sin Zona', 1001),
(336, 'Zona 0', 1001),
(337, 'Sin Zona', 1002),
(338, 'Zona 0', 1002),
(339, 'Sin Zona', 1003),
(340, 'Zona 0', 1003),
(341, 'Sin Zona', 1004),
(342, 'Zona 0', 1004),
(343, 'Sin Zona', 1005),
(344, 'Zona 0', 1005),
(345, 'Sin Zona', 1006),
(346, 'Zona 0', 1006),
(347, 'Sin Zona', 1007),
(348, 'Zona 0', 1007),
(349, 'Sin Zona', 1008),
(350, 'Zona 0', 1008),
(351, 'Sin Zona', 1009),
(352, 'Sin Zona', 1009),
(353, 'Zona 0', 1010),
(354, 'Sin Zona', 1010),
(355, 'Zona 0', 1011),
(356, 'Sin Zona', 1011),
(357, 'Zona 0', 1012),
(358, 'Sin Zona', 1012),
(359, 'Zona 0', 1013),
(360, 'Sin Zona', 1013),
(361, 'Zona 0', 1014),
(362, 'Sin Zona', 1014),
(363, 'Zona 0', 1015),
(364, 'Sin Zona', 1015),
(365, 'Zona 0', 1016),
(366, 'Sin Zona', 1016),
(367, 'Zona 0', 1017),
(368, 'Sin Zona', 1017),
(369, 'Zona 0', 1018),
(370, 'Sin Zona', 1018),
(371, 'Zona 0', 1019),
(372, 'Sin Zona', 1019),
(373, 'Zona 0', 1020),
(374, 'Sin Zona', 1020),
(375, 'Sin Zona', 1101),
(376, 'Zona 0', 1101),
(377, 'Sin Zona', 1102),
(378, 'Zona 0', 1102),
(379, 'Sin Zona', 1103),
(380, 'Zona 0', 1103),
(381, 'Sin Zona', 1104),
(382, 'Zona 0', 1104),
(383, 'Sin Zona', 1105),
(384, 'Zona 0', 1105),
(385, 'Sin Zona', 1106),
(386, 'Zona 0', 1106),
(387, 'Sin Zona', 1107),
(388, 'Zona 0', 1107),
(389, 'Sin Zona', 1108),
(390, 'Zona 0', 1108),
(391, 'Sin Zona', 1109),
(392, 'Zona 0', 1109),
(393, 'Sin Zona', 1201),
(394, 'Zona 0', 1201),
(395, 'Sin Zona', 1202),
(396, 'Zona 0', 1202),
(397, 'Sin Zona', 1203),
(398, 'Sin Zona', 1203),
(399, 'Zona 0', 1204),
(400, 'Sin Zona', 1204),
(401, 'Zona 0', 1205),
(402, 'Sin Zona', 1205),
(403, 'Zona 0', 1206),
(404, 'Sin Zona', 1206),
(405, 'Zona 0', 1207),
(406, 'Sin Zona', 1207),
(407, 'Zona 0', 1208),
(408, 'Sin Zona', 1208),
(409, 'Zona 0', 1209),
(410, 'Sin Zona', 1209),
(411, 'Zona 0', 1210),
(412, 'Sin Zona', 1210),
(413, 'Zona 0', 1211),
(414, 'Sin Zona', 1211),
(415, 'Zona 0', 1212),
(416, 'Sin Zona', 1212),
(417, 'Zona 0', 1213),
(418, 'Sin Zona', 1213),
(419, 'Zona 0', 1214),
(420, 'Sin Zona', 1214),
(421, 'Sin Zona', 1215),
(422, 'Zona 0', 1215),
(423, 'Sin Zona', 1216),
(424, 'Zona 0', 1216),
(425, 'Sin Zona', 1217),
(426, 'Zona 0', 1217),
(427, 'Sin Zona', 1218),
(428, 'Zona 0', 1218),
(429, 'Sin Zona', 1219),
(430, 'Zona 0', 1219),
(431, 'Sin Zona', 1220),
(432, 'Zona 0', 1220),
(433, 'Sin Zona', 1221),
(434, 'Zona 0', 1221),
(435, 'Sin Zona', 1222),
(436, 'Zona 0', 1222),
(437, 'Sin Zona', 1223),
(438, 'Zona 0', 1223),
(439, 'Sin Zona', 1224),
(440, 'Zona 0', 1224),
(441, 'Sin Zona', 1225),
(442, 'Zona 0', 1225),
(443, 'Sin Zona', 1226),
(444, 'Sin Zona', 1226),
(445, 'Zona 0', 1227),
(446, 'Sin Zona', 1227),
(447, 'Zona 0', 1228),
(448, 'Sin Zona', 1228),
(449, 'Zona 0', 1229),
(450, 'Sin Zona', 1229),
(451, 'Zona 0', 1301),
(452, 'Sin Zona', 1301),
(453, 'Zona 0', 1302),
(454, 'Sin Zona', 1302),
(455, 'Sin Zona', 1303),
(456, 'Zona 0', 1303),
(457, 'Sin Zona', 1304),
(458, 'Zona 0', 1304),
(459, 'Sin Zona', 1305),
(460, 'Zona 0', 1305),
(461, 'Sin Zona', 1306),
(462, 'Zona 0', 1306),
(463, 'Sin Zona', 1307),
(464, 'Zona 0', 1307),
(465, 'Sin Zona', 1308),
(466, 'Zona 0', 1308),
(467, 'Sin Zona', 1309),
(468, 'Zona 0', 1309),
(469, 'Sin Zona', 1310),
(470, 'Zona 0', 1310),
(471, 'Sin Zona', 1311),
(472, 'Zona 0', 1311),
(473, 'Sin Zona', 1312),
(474, 'Zona 0', 1312),
(475, 'Sin Zona', 1313),
(476, 'Zona 0', 1313),
(477, 'Sin Zona', 1314),
(478, 'Zona 0', 1314),
(479, 'Sin Zona', 1315),
(480, 'Zona 0', 1315),
(481, 'Sin Zona', 1316),
(482, 'Zona 0', 1316),
(483, 'Sin Zona', 1317),
(484, 'Zona 0', 1317),
(485, 'Sin Zona', 1318),
(486, 'Zona 0', 1318),
(487, 'Sin Zona', 1319),
(488, 'Zona 0', 1319),
(489, 'Sin Zona', 1320),
(490, 'Zona 0', 1320),
(491, 'Sin Zona', 1321),
(492, 'Zona 0', 1321),
(493, 'Sin Zona', 1322),
(494, 'Zona 0', 1322),
(495, 'Sin Zona', 1323),
(496, 'Zona 0', 1323),
(497, 'Sin Zona', 1324),
(498, 'Zona 0', 1324),
(499, 'Sin Zona', 1325),
(500, 'Zona 0', 1325),
(501, 'Sin Zona', 1326),
(502, 'Zona 0', 1326),
(503, 'Sin Zona', 1327),
(504, 'Zona 0', 1327),
(505, 'Sin Zona', 1328),
(506, 'Zona 0', 1328),
(507, 'Sin Zona', 1329),
(508, 'Zona 0', 1329),
(509, 'Sin Zona', 1330),
(510, 'Zona 0', 1330),
(511, 'Sin Zona', 1331),
(512, 'Zona 0', 1331),
(513, 'Sin Zona', 1401),
(514, 'Zona 0', 1401),
(515, 'Sin Zona', 1402),
(516, 'Zona 0', 1402),
(517, 'Sin Zona', 1403),
(518, 'Sin Zona', 1403),
(519, 'Zona 0', 1404),
(520, 'Sin Zona', 1404),
(521, 'Zona 0', 1405),
(522, 'Sin Zona', 1405),
(523, 'Zona 0', 1406),
(524, 'Sin Zona', 1406),
(525, 'Zona 0', 1407),
(526, 'Sin Zona', 1407),
(527, 'Zona 0', 1408),
(528, 'Sin Zona', 1408),
(529, 'Zona 0', 1409),
(530, 'Sin Zona', 1409),
(531, 'Zona 0', 1410),
(532, 'Sin Zona', 1410),
(533, 'Zona 0', 1411),
(534, 'Sin Zona', 1411),
(535, 'Zona 0', 1412),
(536, 'Sin Zona', 1412),
(537, 'Zona 0', 1413),
(538, 'Sin Zona', 1413),
(539, 'Zona 0', 1414),
(540, 'Sin Zona', 1414),
(541, 'Sin Zona', 1415),
(542, 'Zona 0', 1415),
(543, 'Sin Zona', 1416),
(544, 'Zona 0', 1416),
(545, 'Sin Zona', 1417),
(546, 'Zona 0', 1417),
(547, 'Sin Zona', 1418),
(548, 'Zona 0', 1418),
(549, 'Sin Zona', 1419),
(550, 'Zona 0', 1419),
(551, 'Sin Zona', 1420),
(552, 'Zona 0', 1420),
(553, 'Sin Zona', 1421),
(554, 'Zona 0', 1421),
(555, 'Sin Zona', 1501),
(556, 'Zona 0', 1501),
(557, 'Sin Zona', 1502),
(558, 'Zona 0', 1502),
(559, 'Sin Zona', 1503),
(560, 'Zona 0', 1503),
(561, 'Sin Zona', 1504),
(562, 'Zona 0', 1504),
(563, 'Sin Zona', 1505),
(564, 'Sin Zona', 1505),
(565, 'Zona 0', 1506),
(566, 'Sin Zona', 1506),
(567, 'Zona 0', 1507),
(568, 'Sin Zona', 1507),
(569, 'Zona 0', 1508),
(570, 'Sin Zona', 1508),
(571, 'Zona 0', 1601),
(572, 'Sin Zona', 1601),
(573, 'Zona 0', 1602),
(574, 'Sin Zona', 1602),
(575, 'Zona 0', 1603),
(576, 'Sin Zona', 1603),
(577, 'Zona 0', 1604),
(578, 'Sin Zona', 1604),
(579, 'Zona 0', 1605),
(580, 'Sin Zona', 1605),
(581, 'Zona 0', 1606),
(582, 'Sin Zona', 1606),
(583, 'Zona 0', 1607),
(584, 'Sin Zona', 1607),
(585, 'Zona 0', 1608),
(586, 'Sin Zona', 1608),
(587, 'Sin Zona', 1609),
(588, 'Zona 0', 1609),
(589, 'Sin Zona', 1610),
(590, 'Zona 0', 1610),
(591, 'Sin Zona', 1611),
(592, 'Zona 0', 1611),
(593, 'Sin Zona', 1612),
(594, 'Zona 0', 1612),
(595, 'Sin Zona', 1613),
(596, 'Zona 0', 1613),
(597, 'Sin Zona', 1614),
(598, 'Zona 0', 1614),
(599, 'Sin Zona', 1615),
(600, 'Zona 0', 1615),
(601, 'Sin Zona', 1616),
(602, 'Zona 0', 1616),
(603, 'Sin Zona', 1701),
(604, 'Zona 0', 1701),
(605, 'Sin Zona', 1702),
(606, 'Zona 0', 1702),
(607, 'Sin Zona', 1703),
(608, 'Zona 0', 1703),
(609, 'Sin Zona', 1704),
(610, 'Sin Zona', 1704),
(611, 'Zona 0', 1705),
(612, 'Sin Zona', 1705),
(613, 'Zona 0', 1706),
(614, 'Sin Zona', 1706),
(615, 'Zona 0', 1707),
(616, 'Sin Zona', 1707),
(617, 'Zona 0', 1708),
(618, 'Sin Zona', 1708),
(619, 'Zona 0', 1709),
(620, 'Sin Zona', 1709),
(621, 'Sin Zona', 1710),
(622, 'Zona 0', 1710),
(623, 'Sin Zona', 1711),
(624, 'Zona 0', 1711),
(625, 'Sin Zona', 1712),
(626, 'Zona 0', 1712),
(627, 'Sin Zona', 1801),
(628, 'Zona 0', 1801),
(629, 'Sin Zona', 1802),
(630, 'Zona 0', 1802),
(631, 'Sin Zona', 1803),
(632, 'Zona 0', 1803),
(633, 'Sin Zona', 1804),
(634, 'Zona 0', 1804),
(635, 'Sin Zona', 1805),
(636, 'Zona 0', 1805),
(637, 'Sin Zona', 1901),
(638, 'Zona 0', 1901),
(639, 'Sin Zona', 1902),
(640, 'Zona 0', 1902),
(641, 'Sin Zona', 1903),
(642, 'Zona 0', 1903),
(643, 'Sin Zona', 1904),
(644, 'Zona 0', 1904),
(645, 'Sin Zona', 1905),
(646, 'Zona 0', 1905),
(647, 'Sin Zona', 1906),
(648, 'Zona 0', 1906),
(649, 'Sin Zona', 1907),
(650, 'Zona 0', 1907),
(651, 'Sin Zona', 1908),
(652, 'Zona 0', 1908),
(653, 'Sin Zona', 1909),
(654, 'Zona 0', 1909),
(655, 'Sin Zona', 1910),
(656, 'Zona 0', 1910),
(657, 'Sin Zona', 2001),
(658, 'Zona 0', 2001),
(659, 'Sin Zona', 2002),
(660, 'Zona 0', 2002),
(661, 'Sin Zona', 2003),
(662, 'Zona 0', 2003),
(663, 'Sin Zona', 2004),
(664, 'Zona 0', 2004),
(665, 'Sin Zona', 2005),
(666, 'Sin Zona', 2005),
(667, 'Zona 0', 2006),
(668, 'Sin Zona', 2006),
(669, 'Zona 0', 2007),
(670, 'Sin Zona', 2007),
(671, 'Zona 0', 2008),
(672, 'Sin Zona', 2008),
(673, 'Zona 0', 2009),
(674, 'Sin Zona', 2009),
(675, 'Zona 0', 2010),
(676, 'Sin Zona', 2010),
(677, 'Zona 0', 2011),
(678, 'Sin Zona', 2011),
(679, 'Zona 0', 2101),
(680, 'Sin Zona', 2101),
(681, 'Zona 0', 2102),
(682, 'Sin Zona', 2102),
(683, 'Zona 0', 2103),
(684, 'Sin Zona', 2103),
(685, 'Zona 0', 2104),
(686, 'Sin Zona', 2104),
(687, 'Sin Zona', 2105),
(688, 'Zona 0', 2105),
(689, 'Sin Zona', 2106),
(690, 'Zona 0', 2106),
(691, 'Sin Zona', 2107),
(692, 'Zona 0', 2107),
(693, 'Sin Zona', 2201),
(694, 'Zona 0', 2201),
(695, 'Sin Zona', 2202),
(696, 'Zona 0', 2202),
(697, 'Sin Zona', 2203),
(698, 'Sin Zona', 2203),
(699, 'Zona 0', 2204),
(700, 'Sin Zona', 2204),
(701, 'Zona 0', 2205),
(702, 'Sin Zona', 2205),
(703, 'Zona 0', 2206),
(704, 'Sin Zona', 2206),
(705, 'Zona 0', 2208),
(706, 'Sin Zona', 2208),
(707, 'Zona 0', 2209),
(708, 'Sin Zona', 2209),
(709, 'Zona 0', 2210),
(710, 'Sin Zona', 2210),
(711, 'Zona 0', 2211),
(712, 'Sin Zona', 2211),
(713, 'Zona 0', 2212),
(714, 'Sin Zona', 2213),
(715, 'Zona 0', 2213),
(716, 'Sin Zona', 2214),
(717, 'Zona 0', 2214),
(718, 'Sin Zona', 2215),
(719, 'Zona 0', 2215),
(720, 'Sin Zona', 2216),
(721, 'Zona 0', 2216),
(722, 'Sin Zona', 2217),
(723, 'Zona 0', 2217);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bienes_inmuebles`
--
ALTER TABLE `bienes_inmuebles`
  ADD PRIMARY KEY (`inmueble_id`),
  ADD KEY `tipo_propiedad_id` (`tipo_propiedad_id`,`estado_id`,`cliente_id`,`direccion`,`zona_id`,`cod_empleado`),
  ADD KEY `cliente_id` (`cliente_id`),
  ADD KEY `cod_empleado` (`cod_empleado`),
  ADD KEY `zona_id` (`zona_id`),
  ADD KEY `estado_id` (`estado_id`),
  ADD KEY `estado_neg_id` (`estado_neg_id`),
  ADD KEY `image_id` (`image_id`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`cliente_id`),
  ADD UNIQUE KEY `user` (`user`,`password`),
  ADD KEY `persona_id` (`persona_id`);

--
-- Indices de la tabla `departamentos`
--
ALTER TABLE `departamentos`
  ADD PRIMARY KEY (`depto_id`),
  ADD KEY `cod_region` (`region_id`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`cod_empleado`),
  ADD UNIQUE KEY `user` (`user`,`password`),
  ADD KEY `persona_id` (`persona_id`),
  ADD KEY `tipo_usuario_id` (`tipo_usuario_id`,`estado_emp_id`),
  ADD KEY `estado_emp_id` (`estado_emp_id`),
  ADD KEY `image_id` (`image_id`);

--
-- Indices de la tabla `estados_empleados`
--
ALTER TABLE `estados_empleados`
  ADD PRIMARY KEY (`estado_emp_id`);

--
-- Indices de la tabla `estado_bien_inmueble`
--
ALTER TABLE `estado_bien_inmueble`
  ADD PRIMARY KEY (`estado_id`);

--
-- Indices de la tabla `image_url`
--
ALTER TABLE `image_url`
  ADD PRIMARY KEY (`image_id`);

--
-- Indices de la tabla `municipios`
--
ALTER TABLE `municipios`
  ADD PRIMARY KEY (`muni_id`),
  ADD KEY `cod_depto` (`depto_id`);

--
-- Indices de la tabla `personas`
--
ALTER TABLE `personas`
  ADD PRIMARY KEY (`persona_id`),
  ADD UNIQUE KEY `no_documento` (`no_documento`,`nit`),
  ADD KEY `tipo_documento_id` (`tipo_documento_id`);

--
-- Indices de la tabla `regiones`
--
ALTER TABLE `regiones`
  ADD PRIMARY KEY (`region_id`);

--
-- Indices de la tabla `suscriptores`
--
ALTER TABLE `suscriptores`
  ADD PRIMARY KEY (`suscriptor_id`);

--
-- Indices de la tabla `tipos_propiedades`
--
ALTER TABLE `tipos_propiedades`
  ADD PRIMARY KEY (`tipo_propiedad_id`);

--
-- Indices de la tabla `tipos_usuarios`
--
ALTER TABLE `tipos_usuarios`
  ADD PRIMARY KEY (`tipo_usuario_id`);

--
-- Indices de la tabla `tipo_documento`
--
ALTER TABLE `tipo_documento`
  ADD PRIMARY KEY (`tipo_documento_id`);

--
-- Indices de la tabla `venta_renta`
--
ALTER TABLE `venta_renta`
  ADD PRIMARY KEY (`estado_neg_id`);

--
-- Indices de la tabla `zonas`
--
ALTER TABLE `zonas`
  ADD PRIMARY KEY (`zona_id`),
  ADD KEY `muni_id` (`muni_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `cliente_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT de la tabla `image_url`
--
ALTER TABLE `image_url`
  MODIFY `image_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `personas`
--
ALTER TABLE `personas`
  MODIFY `persona_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT de la tabla `suscriptores`
--
ALTER TABLE `suscriptores`
  MODIFY `suscriptor_id` int(10) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bienes_inmuebles`
--
ALTER TABLE `bienes_inmuebles`
  ADD CONSTRAINT `bienes_inmuebles_ibfk_1` FOREIGN KEY (`cliente_id`) REFERENCES `clientes` (`cliente_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `bienes_inmuebles_ibfk_2` FOREIGN KEY (`cod_empleado`) REFERENCES `empleados` (`cod_empleado`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `bienes_inmuebles_ibfk_3` FOREIGN KEY (`tipo_propiedad_id`) REFERENCES `tipos_propiedades` (`tipo_propiedad_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `bienes_inmuebles_ibfk_5` FOREIGN KEY (`estado_id`) REFERENCES `estado_bien_inmueble` (`estado_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `bienes_inmuebles_ibfk_6` FOREIGN KEY (`estado_neg_id`) REFERENCES `venta_renta` (`estado_neg_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `bienes_inmuebles_ibfk_7` FOREIGN KEY (`zona_id`) REFERENCES `zonas` (`zona_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `bienes_inmuebles_ibfk_8` FOREIGN KEY (`image_id`) REFERENCES `image_url` (`image_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `clientes_ibfk_1` FOREIGN KEY (`persona_id`) REFERENCES `personas` (`persona_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `departamentos`
--
ALTER TABLE `departamentos`
  ADD CONSTRAINT `departamentos_ibfk_1` FOREIGN KEY (`region_id`) REFERENCES `regiones` (`region_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD CONSTRAINT `empleados_ibfk_1` FOREIGN KEY (`persona_id`) REFERENCES `personas` (`persona_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `empleados_ibfk_2` FOREIGN KEY (`estado_emp_id`) REFERENCES `estados_empleados` (`estado_emp_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `empleados_ibfk_3` FOREIGN KEY (`tipo_usuario_id`) REFERENCES `tipos_usuarios` (`tipo_usuario_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `empleados_ibfk_4` FOREIGN KEY (`image_id`) REFERENCES `image_url` (`image_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `municipios`
--
ALTER TABLE `municipios`
  ADD CONSTRAINT `municipios_ibfk_1` FOREIGN KEY (`depto_id`) REFERENCES `departamentos` (`depto_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `personas`
--
ALTER TABLE `personas`
  ADD CONSTRAINT `personas_ibfk_1` FOREIGN KEY (`tipo_documento_id`) REFERENCES `tipo_documento` (`tipo_documento_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `zonas`
--
ALTER TABLE `zonas`
  ADD CONSTRAINT `zonas_ibfk_1` FOREIGN KEY (`muni_id`) REFERENCES `municipios` (`muni_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
