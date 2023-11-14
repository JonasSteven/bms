-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 11, 2023 at 12:02 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bms`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('jonas345@gmail.com', 'Jonas'),
('andry@gmail.com', 'Jonas'),
('konda@gmail.com', 'konda'),
('joy@gmail.com', 'JOY'),
('ko@gmail.com', 'KO'),
('Jonas@gmail.com', 'Jonas123'),
('jonas1234@gmail.com', 'Jonas345'),
('anacon@gmail.com', 'Anacon'),
('ando@gmail.com', 'Ando'),
('nicho@gmail.com', 'nicho');

-- --------------------------------------------------------

--
-- Table structure for table `managebus`
--

CREATE TABLE `managebus` (
  `buscode` varchar(30) NOT NULL,
  `source` varchar(30) NOT NULL,
  `destination` varchar(30) NOT NULL,
  `depart` varchar(30) NOT NULL,
  `noofseat` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `managebus`
--

INSERT INTO `managebus` (`buscode`, `source`, `destination`, `depart`, `noofseat`) VALUES
('BU006', 'jjkjkjkjkjk', 'fgfgfgffgff', '2023-01-23 09:00:00', '10'),
('BU001s', 'sdsdd', 'dsdsds', '2022-02-22', '11'),
('BU002', '23232', '32323', '2022-09-30 09:03:00', '23'),
('BU010', 'Jakarta', 'Bandung', '2023-01-15 08:15:00', '2'),
('BU011', 'ssdssds', 'sdsdsds', '2222-22-11 11:11:11', '12');

-- --------------------------------------------------------

--
-- Table structure for table `managepassenger`
--

CREATE TABLE `managepassenger` (
  `name` varchar(30) NOT NULL,
  `gender` varchar(30) NOT NULL,
  `nationality` varchar(30) NOT NULL,
  `passportnumber` varchar(30) NOT NULL,
  `phone` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `ticketbooking`
--

CREATE TABLE `ticketbooking` (
  `id` varchar(30) NOT NULL,
  `name` varchar(30) NOT NULL,
  `buscode` varchar(30) NOT NULL,
  `gender` varchar(30) NOT NULL,
  `passportnumber` varchar(30) NOT NULL,
  `amount` varchar(30) NOT NULL,
  `nationality` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
