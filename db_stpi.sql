-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 30, 2016 at 07:00 PM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_stpi`
--

-- --------------------------------------------------------

--
-- Table structure for table `administrador`
--

CREATE TABLE `administrador` (
  `administrador_id` int(11) NOT NULL,
  `cedula` varchar(20) COLLATE latin1_spanish_ci NOT NULL,
  `nombre` varchar(50) COLLATE latin1_spanish_ci NOT NULL,
  `correo` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `username` varchar(50) COLLATE latin1_spanish_ci NOT NULL,
  `password` varchar(100) COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Dumping data for table `administrador`
--

INSERT INTO `administrador` (`administrador_id`, `cedula`, `nombre`, `correo`, `username`, `password`) VALUES
(1, '10224449898', 'Yojhan Rodriguez', 'YojhanR95@gmail.com', 'YojhanR', 'admin'),
(2, '10334557766', 'Hector Hurtado', 'Hector@gmail.com', 'HectorH', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `bicicleta`
--

CREATE TABLE `bicicleta` (
  `bicicleta_id` int(11) NOT NULL,
  `estado` enum('Libre','Reserva') COLLATE latin1_spanish_ci NOT NULL DEFAULT 'Libre'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Dumping data for table `bicicleta`
--

INSERT INTO `bicicleta` (`bicicleta_id`, `estado`) VALUES
(1, 'Libre'),
(2, 'Libre'),
(3, 'Libre');

-- --------------------------------------------------------

--
-- Table structure for table `bicicleta_usuario`
--

CREATE TABLE `bicicleta_usuario` (
  `id` int(11) NOT NULL,
  `bicicleta_id` int(11) NOT NULL,
  `usuario_id` int(11) NOT NULL,
  `fecha_inicio` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fecha_fin` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `bus`
--

CREATE TABLE `bus` (
  `bus_id` int(11) NOT NULL,
  `estado` enum('Libre','En recorrido') COLLATE latin1_spanish_ci NOT NULL DEFAULT 'Libre',
  `matricula` varchar(10) COLLATE latin1_spanish_ci NOT NULL,
  `ubicacion` varchar(40) COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Dumping data for table `bus`
--

INSERT INTO `bus` (`bus_id`, `estado`, `matricula`, `ubicacion`) VALUES
(1, 'Libre', 'ATK-234', 'Cll 45 No 2-56'),
(2, 'Libre', 'ATM-569', 'Cll 45 No 2-56'),
(3, 'Libre', 'ATR-345', 'Cll 45 No 2-56'),
(4, 'Libre', 'ATY-149', 'Cll 45 No 2-56'),
(5, 'Libre', 'ATZ-834', 'Cll 45 No 2-56'),
(6, 'Libre', 'ATK-234', 'Cll 45 No 2-56'),
(7, 'Libre', 'YLR-123', 'Calle 45 No 2-56'),
(8, 'Libre', 'YLR-123', 'Calle 45 No 2-56');

-- --------------------------------------------------------

--
-- Table structure for table `bus_conductor`
--

CREATE TABLE `bus_conductor` (
  `id` int(11) NOT NULL,
  `bus_id` int(11) NOT NULL,
  `conductor_id` int(11) NOT NULL,
  `ruta_id` int(11) NOT NULL,
  `kilometros_recorridos` float NOT NULL,
  `fecha_inicio` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fecha_fin` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `conductor`
--

CREATE TABLE `conductor` (
  `conductor_id` int(11) NOT NULL,
  `cedula` varchar(20) COLLATE latin1_spanish_ci NOT NULL,
  `nombre` varchar(50) COLLATE latin1_spanish_ci NOT NULL,
  `fecha_nac` date NOT NULL,
  `telefono` varchar(20) COLLATE latin1_spanish_ci NOT NULL,
  `direccion` varchar(40) COLLATE latin1_spanish_ci NOT NULL,
  `estado` enum('Libre','En recorrido') COLLATE latin1_spanish_ci NOT NULL DEFAULT 'Libre'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Dumping data for table `conductor`
--

INSERT INTO `conductor` (`conductor_id`, `cedula`, `nombre`, `fecha_nac`, `telefono`, `direccion`, `estado`) VALUES
(1, '1012364', 'Alberto Cardenas', '1979-03-16', '3117893456', 'Kra 4 #1-45', 'Libre'),
(2, '9832789', 'Martin Suarez', '1989-04-06', '7893456', 'Cll 56 #32-78', 'Libre'),
(3, '9190932', 'Luis Cifuentes', '1982-09-22', '3002874562', 'Kra 68 # 1 A 12', 'Libre'),
(6, '1022345', 'Carlos Martinez', '1990-01-18', '3111223455', 'Kra 12# 14 C 3', 'Libre'),
(7, '9187859', 'Rodrigo Ramirez', '1978-01-05', '4667898', 'Kra 98# 23 A 45', 'Libre');

-- --------------------------------------------------------

--
-- Table structure for table `estacion`
--

CREATE TABLE `estacion` (
  `estacion_id` int(11) NOT NULL,
  `ruta_id` int(11) NOT NULL,
  `nombre` varchar(10) COLLATE latin1_spanish_ci NOT NULL,
  `ubicacion` varchar(50) COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Dumping data for table `estacion`
--

INSERT INTO `estacion` (`estacion_id`, `ruta_id`, `nombre`, `ubicacion`) VALUES
(1, 1, 'Bici-A', 'Cll 54 #9-2'),
(2, 2, 'Bici-B', 'Kra 8 #98-1'),
(3, 3, 'Bici-C', 'Cll 3 #13-8');

-- --------------------------------------------------------

--
-- Table structure for table `estacion_bicicleta`
--

CREATE TABLE `estacion_bicicleta` (
  `id` int(11) NOT NULL,
  `estacion_id` int(11) NOT NULL,
  `bicicleta_id` int(11) NOT NULL,
  `ruta_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Dumping data for table `estacion_bicicleta`
--

INSERT INTO `estacion_bicicleta` (`id`, `estacion_id`, `bicicleta_id`, `ruta_id`) VALUES
(1, 1, 1, 1),
(2, 2, 2, 2),
(3, 3, 3, 3);

-- --------------------------------------------------------

--
-- Table structure for table `ruta`
--

CREATE TABLE `ruta` (
  `ruta_id` int(11) NOT NULL,
  `kilometros` int(11) NOT NULL,
  `nombre` varchar(5) COLLATE latin1_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Dumping data for table `ruta`
--

INSERT INTO `ruta` (`ruta_id`, `kilometros`, `nombre`) VALUES
(1, 13, 'A'),
(2, 14, 'B'),
(3, 14, 'C');

-- --------------------------------------------------------

--
-- Table structure for table `transfer`
--

CREATE TABLE `transfer` (
  `transfer_id` int(11) NOT NULL,
  `matricula` varchar(10) COLLATE latin1_spanish_ci NOT NULL,
  `ubicacion` varchar(50) COLLATE latin1_spanish_ci NOT NULL,
  `estado` enum('Libre','En recorrido') COLLATE latin1_spanish_ci NOT NULL DEFAULT 'Libre'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Dumping data for table `transfer`
--

INSERT INTO `transfer` (`transfer_id`, `matricula`, `ubicacion`, `estado`) VALUES
(1, 'TPY-123', 'Cll 54 #78-1', 'Libre'),
(2, 'ASD-973', 'Cll 54 #78-1', 'Libre'),
(3, 'KJF-964', 'Cll 54 #78-1', 'Libre'),
(4, 'ERG-911', 'Cll 54 #78-1', 'Libre'),
(5, 'HNG-873', 'Cll 54 #78-1', 'Libre');

-- --------------------------------------------------------

--
-- Table structure for table `transfer_conductor`
--

CREATE TABLE `transfer_conductor` (
  `id` int(11) NOT NULL,
  `transfer_id` int(11) NOT NULL,
  `conductor_id` int(11) NOT NULL,
  `usuario_id` int(11) NOT NULL,
  `kilometros_recorridos` float NOT NULL,
  `fecha_inicio` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fecha_fin` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `usuario_id` int(11) NOT NULL,
  `cedula` varchar(20) COLLATE latin1_spanish_ci NOT NULL,
  `nombre` varchar(100) COLLATE latin1_spanish_ci NOT NULL,
  `direccion` varchar(50) COLLATE latin1_spanish_ci NOT NULL,
  `telefono` varchar(20) COLLATE latin1_spanish_ci NOT NULL,
  `correo` varchar(50) COLLATE latin1_spanish_ci NOT NULL,
  `estado` enum('Activo','No activo') COLLATE latin1_spanish_ci NOT NULL DEFAULT 'Activo'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`usuario_id`, `cedula`, `nombre`, `direccion`, `telefono`, `correo`, `estado`) VALUES
(1, '193892', 'Valeria Pineda', 'Cll 56 #89-9', '3110986732', 'vale@gmail.com', 'Activo'),
(2, '863947', 'Andres Monroy', 'Cll 78 #9-13', '3002397634', 'andres@gmail.com', 'Activo'),
(3, '123809', 'Vivian Alvarez', 'Cll 23 #1-90', '3120986534', 'vivian@gmail.com', 'Activo'),
(4, '113409', 'Gustavo Guillen', 'Cll 7 #8-23', '3002387653', 'gustavo@gmail.com', 'Activo'),
(5, '108344', 'Enrique Valencia', 'Cll 98 #83-23', '3118414998', 'enrique@gmail.com', 'Activo');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`administrador_id`);

--
-- Indexes for table `bicicleta`
--
ALTER TABLE `bicicleta`
  ADD PRIMARY KEY (`bicicleta_id`);

--
-- Indexes for table `bicicleta_usuario`
--
ALTER TABLE `bicicleta_usuario`
  ADD PRIMARY KEY (`id`),
  ADD KEY `bicicleta_id` (`bicicleta_id`),
  ADD KEY `usuario_id` (`usuario_id`);

--
-- Indexes for table `bus`
--
ALTER TABLE `bus`
  ADD PRIMARY KEY (`bus_id`);

--
-- Indexes for table `bus_conductor`
--
ALTER TABLE `bus_conductor`
  ADD PRIMARY KEY (`id`),
  ADD KEY `bus_id` (`bus_id`),
  ADD KEY `conductor_id` (`conductor_id`),
  ADD KEY `ruta_id` (`ruta_id`);

--
-- Indexes for table `conductor`
--
ALTER TABLE `conductor`
  ADD PRIMARY KEY (`conductor_id`);

--
-- Indexes for table `estacion`
--
ALTER TABLE `estacion`
  ADD PRIMARY KEY (`estacion_id`),
  ADD KEY `ruta_id` (`ruta_id`);

--
-- Indexes for table `estacion_bicicleta`
--
ALTER TABLE `estacion_bicicleta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `estacion_id` (`estacion_id`),
  ADD KEY `bicicleta_id` (`bicicleta_id`),
  ADD KEY `ruta_id` (`ruta_id`);

--
-- Indexes for table `ruta`
--
ALTER TABLE `ruta`
  ADD PRIMARY KEY (`ruta_id`);

--
-- Indexes for table `transfer`
--
ALTER TABLE `transfer`
  ADD PRIMARY KEY (`transfer_id`);

--
-- Indexes for table `transfer_conductor`
--
ALTER TABLE `transfer_conductor`
  ADD PRIMARY KEY (`id`),
  ADD KEY `transfer_id` (`transfer_id`),
  ADD KEY `conductor_id` (`conductor_id`),
  ADD KEY `usuario_id` (`usuario_id`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`usuario_id`),
  ADD UNIQUE KEY `cedula` (`cedula`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `administrador`
--
ALTER TABLE `administrador`
  MODIFY `administrador_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `bicicleta`
--
ALTER TABLE `bicicleta`
  MODIFY `bicicleta_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `bicicleta_usuario`
--
ALTER TABLE `bicicleta_usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `bus`
--
ALTER TABLE `bus`
  MODIFY `bus_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `bus_conductor`
--
ALTER TABLE `bus_conductor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `conductor`
--
ALTER TABLE `conductor`
  MODIFY `conductor_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `estacion`
--
ALTER TABLE `estacion`
  MODIFY `estacion_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `estacion_bicicleta`
--
ALTER TABLE `estacion_bicicleta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `ruta`
--
ALTER TABLE `ruta`
  MODIFY `ruta_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `transfer`
--
ALTER TABLE `transfer`
  MODIFY `transfer_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `transfer_conductor`
--
ALTER TABLE `transfer_conductor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `usuario_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `bicicleta_usuario`
--
ALTER TABLE `bicicleta_usuario`
  ADD CONSTRAINT `bicicleta_usuario_ibfk_1` FOREIGN KEY (`bicicleta_id`) REFERENCES `bicicleta` (`bicicleta_id`),
  ADD CONSTRAINT `bicicleta_usuario_ibfk_2` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`usuario_id`);

--
-- Constraints for table `bus_conductor`
--
ALTER TABLE `bus_conductor`
  ADD CONSTRAINT `bus_conductor_ibfk_1` FOREIGN KEY (`bus_id`) REFERENCES `bus` (`bus_id`),
  ADD CONSTRAINT `bus_conductor_ibfk_2` FOREIGN KEY (`conductor_id`) REFERENCES `conductor` (`conductor_id`),
  ADD CONSTRAINT `bus_conductor_ibfk_3` FOREIGN KEY (`ruta_id`) REFERENCES `ruta` (`ruta_id`);

--
-- Constraints for table `estacion`
--
ALTER TABLE `estacion`
  ADD CONSTRAINT `estacion_ibfk_1` FOREIGN KEY (`ruta_id`) REFERENCES `ruta` (`ruta_id`);

--
-- Constraints for table `estacion_bicicleta`
--
ALTER TABLE `estacion_bicicleta`
  ADD CONSTRAINT `estacion_bicicleta_ibfk_1` FOREIGN KEY (`estacion_id`) REFERENCES `estacion` (`estacion_id`),
  ADD CONSTRAINT `estacion_bicicleta_ibfk_2` FOREIGN KEY (`bicicleta_id`) REFERENCES `bicicleta` (`bicicleta_id`),
  ADD CONSTRAINT `estacion_bicicleta_ibfk_3` FOREIGN KEY (`ruta_id`) REFERENCES `ruta` (`ruta_id`);

--
-- Constraints for table `transfer_conductor`
--
ALTER TABLE `transfer_conductor`
  ADD CONSTRAINT `transfer_conductor_ibfk_1` FOREIGN KEY (`transfer_id`) REFERENCES `transfer` (`transfer_id`),
  ADD CONSTRAINT `transfer_conductor_ibfk_2` FOREIGN KEY (`conductor_id`) REFERENCES `conductor` (`conductor_id`),
  ADD CONSTRAINT `transfer_conductor_ibfk_3` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`usuario_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
