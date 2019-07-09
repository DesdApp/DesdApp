-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-07-2019 a las 20:39:22
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
-- Estructura de tabla para la tabla `bien_inmueble`
--

CREATE TABLE `bien_inmueble` (
  `id_inmueble` int(11) NOT NULL,
  `direccion` varchar(150) NOT NULL,
  `zona` smallint(2) NOT NULL,
  `municipio_id` int(11) NOT NULL,
  `metros_cuadrados` varchar(50) NOT NULL,
  `descripcion` varchar(150) NOT NULL,
  `precio_metro_cuadrado` decimal(10,2) NOT NULL,
  `tipo_propiedad` varchar(50) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `propietario_id` int(11) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `precio_min_venta` decimal(10,2) NOT NULL,
  `persona_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id_cliente` int(11) NOT NULL,
  `id_clasificacion` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamentos`
--

CREATE TABLE `departamentos` (
  `cod_depto` int(2) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `cod_region` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `departamentos`
--

INSERT INTO `departamentos` (`cod_depto`, `nombre`, `cod_region`) VALUES
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
-- Estructura de tabla para la tabla `detalles_ventas`
--

CREATE TABLE `detalles_ventas` (
  `detalle_id` int(11) NOT NULL,
  `venta_id` int(11) NOT NULL,
  `negocio_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_compra_venta`
--

CREATE TABLE `detalle_compra_venta` (
  `negocio_id` int(11) NOT NULL,
  `fecha_establecida_venta` date NOT NULL,
  `observaciones` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `id_persona` int(11) NOT NULL,
  `codigo_empleado` int(11) NOT NULL,
  `puesto` varchar(45) NOT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_finalizacion` date NOT NULL,
  `sueldo` decimal(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `municipios`
--

CREATE TABLE `municipios` (
  `cod_muni` int(4) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `cod_depto` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `municipios`
--

INSERT INTO `municipios` (`cod_muni`, `nombre`, `cod_depto`) VALUES
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
-- Estructura de tabla para la tabla `negocio`
--

CREATE TABLE `negocio` (
  `negocio_id` int(11) NOT NULL,
  `bien_inmueble_id` int(11) NOT NULL,
  `tipo_transaccion_id` int(11) NOT NULL,
  `asesor_id` int(11) NOT NULL,
  `precio_venta_propiedad` decimal(10,2) NOT NULL,
  `comision_empresa` decimal(10,2) NOT NULL,
  `fecha` date NOT NULL,
  `estado_pago` tinyint(4) NOT NULL,
  `cliente_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pagos_propiedades`
--

CREATE TABLE `pagos_propiedades` (
  `pago_propiedad_id` int(11) NOT NULL,
  `venta_id` int(11) NOT NULL,
  `tipo_pago_id` int(11) NOT NULL,
  `no_transaccion` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `monto_pagado` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `persona_id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `direccion` varchar(150) NOT NULL,
  `telefono` int(8) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `doc_identificacion` int(11) NOT NULL,
  `nit` int(10) NOT NULL,
  `login` varchar(45) NOT NULL,
  `pass` varchar(45) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `tipo_usario_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propietario`
--

CREATE TABLE `propietario` (
  `propietario_id` int(11) NOT NULL,
  `nombre_pago` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `regiones`
--

CREATE TABLE `regiones` (
  `cod_region` int(2) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `descripcion` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `regiones`
--

INSERT INTO `regiones` (`cod_region`, `nombre`, `descripcion`) VALUES
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
-- Estructura de tabla para la tabla `tipos_clientes`
--

CREATE TABLE `tipos_clientes` (
  `id_tipocliente` tinyint(4) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_pagos`
--

CREATE TABLE `tipos_pagos` (
  `tipo_pago_id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_transacciones`
--

CREATE TABLE `tipos_transacciones` (
  `tipo_transaccion_id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_facturacion`
--

CREATE TABLE `tipo_facturacion` (
  `tipo_id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_usuario`
--

CREATE TABLE `tipo_usuario` (
  `tipo_usario_id` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `venta_id` int(11) NOT NULL,
  `numero_factura` int(11) NOT NULL,
  `serie` varchar(10) NOT NULL,
  `nit` int(10) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `direccion` varchar(150) NOT NULL,
  `fecha` date NOT NULL,
  `total` decimal(10,2) NOT NULL,
  `tipo_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bien_inmueble`
--
ALTER TABLE `bien_inmueble`
  ADD PRIMARY KEY (`id_inmueble`),
  ADD KEY `persona_id` (`persona_id`),
  ADD KEY `municipio_id` (`municipio_id`,`propietario_id`),
  ADD KEY `propietario_id` (`propietario_id`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_cliente`),
  ADD KEY `id_clasificacion` (`id_clasificacion`);

--
-- Indices de la tabla `departamentos`
--
ALTER TABLE `departamentos`
  ADD PRIMARY KEY (`cod_depto`),
  ADD KEY `cod_region` (`cod_region`);

--
-- Indices de la tabla `detalles_ventas`
--
ALTER TABLE `detalles_ventas`
  ADD PRIMARY KEY (`detalle_id`),
  ADD KEY `venta_id` (`venta_id`,`negocio_id`),
  ADD KEY `negocio_id` (`negocio_id`);

--
-- Indices de la tabla `detalle_compra_venta`
--
ALTER TABLE `detalle_compra_venta`
  ADD PRIMARY KEY (`negocio_id`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`id_persona`);

--
-- Indices de la tabla `municipios`
--
ALTER TABLE `municipios`
  ADD PRIMARY KEY (`cod_muni`),
  ADD KEY `cod_depto` (`cod_depto`);

--
-- Indices de la tabla `negocio`
--
ALTER TABLE `negocio`
  ADD PRIMARY KEY (`negocio_id`),
  ADD KEY `bien_inmueble_id` (`bien_inmueble_id`,`tipo_transaccion_id`,`asesor_id`,`estado_pago`),
  ADD KEY `tipo_transaccion_id` (`tipo_transaccion_id`),
  ADD KEY `asesor_id` (`asesor_id`),
  ADD KEY `cliente_id` (`cliente_id`);

--
-- Indices de la tabla `pagos_propiedades`
--
ALTER TABLE `pagos_propiedades`
  ADD PRIMARY KEY (`pago_propiedad_id`),
  ADD KEY `negocio_id` (`venta_id`,`tipo_pago_id`),
  ADD KEY `tipo_pago_id` (`tipo_pago_id`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`persona_id`),
  ADD KEY `tipo_usario_id` (`tipo_usario_id`);

--
-- Indices de la tabla `propietario`
--
ALTER TABLE `propietario`
  ADD PRIMARY KEY (`propietario_id`);

--
-- Indices de la tabla `regiones`
--
ALTER TABLE `regiones`
  ADD PRIMARY KEY (`cod_region`);

--
-- Indices de la tabla `tipos_clientes`
--
ALTER TABLE `tipos_clientes`
  ADD PRIMARY KEY (`id_tipocliente`);

--
-- Indices de la tabla `tipos_pagos`
--
ALTER TABLE `tipos_pagos`
  ADD PRIMARY KEY (`tipo_pago_id`);

--
-- Indices de la tabla `tipos_transacciones`
--
ALTER TABLE `tipos_transacciones`
  ADD PRIMARY KEY (`tipo_transaccion_id`);

--
-- Indices de la tabla `tipo_facturacion`
--
ALTER TABLE `tipo_facturacion`
  ADD PRIMARY KEY (`tipo_id`);

--
-- Indices de la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  ADD PRIMARY KEY (`tipo_usario_id`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`venta_id`),
  ADD KEY `tipo_id` (`tipo_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `persona_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  MODIFY `tipo_usario_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bien_inmueble`
--
ALTER TABLE `bien_inmueble`
  ADD CONSTRAINT `bien_inmueble_ibfk_1` FOREIGN KEY (`municipio_id`) REFERENCES `municipios` (`cod_muni`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `bien_inmueble_ibfk_3` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`persona_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `bien_inmueble_ibfk_4` FOREIGN KEY (`propietario_id`) REFERENCES `propietario` (`propietario_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `clientes_ibfk_1` FOREIGN KEY (`id_clasificacion`) REFERENCES `tipos_clientes` (`id_tipocliente`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `clientes_ibfk_2` FOREIGN KEY (`id_cliente`) REFERENCES `persona` (`persona_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `departamentos`
--
ALTER TABLE `departamentos`
  ADD CONSTRAINT `departamentos_ibfk_1` FOREIGN KEY (`cod_region`) REFERENCES `regiones` (`cod_region`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `detalles_ventas`
--
ALTER TABLE `detalles_ventas`
  ADD CONSTRAINT `detalles_ventas_ibfk_1` FOREIGN KEY (`negocio_id`) REFERENCES `negocio` (`negocio_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detalles_ventas_ibfk_2` FOREIGN KEY (`venta_id`) REFERENCES `venta` (`venta_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `detalle_compra_venta`
--
ALTER TABLE `detalle_compra_venta`
  ADD CONSTRAINT `detalle_compra_venta_ibfk_1` FOREIGN KEY (`negocio_id`) REFERENCES `negocio` (`negocio_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `empleado_ibfk_1` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`persona_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `municipios`
--
ALTER TABLE `municipios`
  ADD CONSTRAINT `municipios_ibfk_1` FOREIGN KEY (`cod_depto`) REFERENCES `departamentos` (`cod_depto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `negocio`
--
ALTER TABLE `negocio`
  ADD CONSTRAINT `negocio_ibfk_1` FOREIGN KEY (`tipo_transaccion_id`) REFERENCES `tipos_transacciones` (`tipo_transaccion_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `negocio_ibfk_2` FOREIGN KEY (`asesor_id`) REFERENCES `empleado` (`id_persona`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `negocio_ibfk_3` FOREIGN KEY (`bien_inmueble_id`) REFERENCES `bien_inmueble` (`id_inmueble`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `negocio_ibfk_4` FOREIGN KEY (`cliente_id`) REFERENCES `clientes` (`id_cliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `pagos_propiedades`
--
ALTER TABLE `pagos_propiedades`
  ADD CONSTRAINT `pagos_propiedades_ibfk_1` FOREIGN KEY (`tipo_pago_id`) REFERENCES `tipos_pagos` (`tipo_pago_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pagos_propiedades_ibfk_2` FOREIGN KEY (`venta_id`) REFERENCES `venta` (`venta_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `persona_ibfk_1` FOREIGN KEY (`tipo_usario_id`) REFERENCES `tipo_usuario` (`tipo_usario_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `propietario`
--
ALTER TABLE `propietario`
  ADD CONSTRAINT `propietario_ibfk_1` FOREIGN KEY (`propietario_id`) REFERENCES `persona` (`persona_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`tipo_id`) REFERENCES `tipo_facturacion` (`tipo_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;