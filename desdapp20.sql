-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-08-2019 a las 07:10:35
-- Versión del servidor: 10.3.16-MariaDB
-- Versión de PHP: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `desdapp20`
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
  `cod_empleado` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
  `estado_emp_id` tinyint(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`cod_empleado`, `persona_id`, `tipo_usuario_id`, `puesto`, `fecha_inicio`, `fecha_finalizacion`, `user`, `password`, `estado_emp_id`) VALUES
(2019, 1, 1, 'Admin', '2019-01-02', '0000-00-00', 'admin', 'admin', 1);

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
(1, 'test', 'test', 1, 'test', 'test', 'tes', 12345678, 12345678, 'test', '1992-09-15');

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
  ADD KEY `estado_neg_id` (`estado_neg_id`);

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
  ADD KEY `estado_emp_id` (`estado_emp_id`);

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
  MODIFY `cliente_id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `personas`
--
ALTER TABLE `personas`
  MODIFY `persona_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

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
  ADD CONSTRAINT `bienes_inmuebles_ibfk_7` FOREIGN KEY (`zona_id`) REFERENCES `zonas` (`zona_id`) ON DELETE CASCADE ON UPDATE CASCADE;

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
  ADD CONSTRAINT `empleados_ibfk_3` FOREIGN KEY (`tipo_usuario_id`) REFERENCES `tipos_usuarios` (`tipo_usuario_id`) ON DELETE CASCADE ON UPDATE CASCADE;

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
