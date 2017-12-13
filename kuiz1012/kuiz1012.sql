-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 13 Des 2017 pada 16.29
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuiz1012`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tableidentitas_1012`
--

CREATE TABLE `tableidentitas_1012` (
  `nim` bigint(20) NOT NULL,
  `kelas` varchar(255) DEFAULT NULL,
  `nama` varchar(100) NOT NULL,
  `prodi` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `tableidentitas_1012`
--

INSERT INTO `tableidentitas_1012` (`nim`, `kelas`, `nama`, `prodi`) VALUES
(1555301036, '3 TI A', 'Ivonny Agahta', 'TI'),
(1555301097, '3 TI A', 'Ade Sukma', 'TI'),
(1555301098, '3 TI A', 'Fregie', 'TI'),
(1555301099, '3 TI C', 'Reyhan', 'TI'),
(1555301100, '3 TI A', 'Osby', 'TI');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tableipk_1012`
--

CREATE TABLE `tableipk_1012` (
  `id` bigint(20) NOT NULL,
  `ipk` int(11) DEFAULT NULL,
  `nim` bigint(20) NOT NULL,
  `semester` int(11) DEFAULT NULL,
  `tableinde_nim` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `tableipk_1012`
--

INSERT INTO `tableipk_1012` (`id`, `ipk`, `nim`, `semester`, `tableinde_nim`) VALUES
(1, 3, 1555301097, 5, NULL),
(4, 4, 1555301036, 5, 1555301036),
(5, 3, 1555301108, 5, NULL),
(6, 2, 1555301069, 5, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tableidentitas_1012`
--
ALTER TABLE `tableidentitas_1012`
  ADD PRIMARY KEY (`nim`),
  ADD UNIQUE KEY `UK_9fr1fuu1yq6hiwhuhxnatuhcf` (`nama`);

--
-- Indexes for table `tableipk_1012`
--
ALTER TABLE `tableipk_1012`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_pmmmkjhvd6si0tl438hk3qw8m` (`nim`),
  ADD KEY `FK80302wtwbkbsrovamqw1udc8n` (`tableinde_nim`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tableidentitas_1012`
--
ALTER TABLE `tableidentitas_1012`
  MODIFY `nim` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1555301102;
--
-- AUTO_INCREMENT for table `tableipk_1012`
--
ALTER TABLE `tableipk_1012`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `tableipk_1012`
--
ALTER TABLE `tableipk_1012`
  ADD CONSTRAINT `FK80302wtwbkbsrovamqw1udc8n` FOREIGN KEY (`tableinde_nim`) REFERENCES `tableidentitas_1012` (`nim`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
