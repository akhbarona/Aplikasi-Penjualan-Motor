-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 11, 2020 at 08:36 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penjualanmotor`
--

-- --------------------------------------------------------

--
-- Table structure for table `cetak_pesanan`
--

CREATE TABLE `cetak_pesanan` (
  `no_transaksi` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cetak_pesanan`
--

INSERT INTO `cetak_pesanan` (`no_transaksi`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `daftarmotor`
--

CREATE TABLE `daftarmotor` (
  `uname_pegawai` varchar(50) NOT NULL,
  `kode_unit` varchar(8) NOT NULL,
  `nama_motor` varchar(20) NOT NULL,
  `warna` varchar(15) NOT NULL,
  `tahun` varchar(4) NOT NULL,
  `merk` varchar(20) NOT NULL,
  `harga` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `daftarmotor`
--

INSERT INTO `daftarmotor` (`uname_pegawai`, `kode_unit`, `nama_motor`, `warna`, `tahun`, `merk`, `harga`) VALUES
('ucok003', 'CG3 BR 2', 'SUPRA X 125 SPOKE', 'BLACK RED', '2012', 'HONDA', '10000000'),
('dhani001', 'CG4 BR 3', 'BEAT 125', 'RED WHITE', '2016', 'HONDA', '12000000'),
('ucok003', 'CG5 BR 4', 'VARIO 150', 'BLACK DOF', '2018', 'HONDA', '16000000'),
('nestiawan002', 'CG6 BR 5', 'AEROX 150', 'RED DOF', '2019', 'YAMAHA', '19000000'),
('dhani001', 'CG7 BR 6', 'VIXION 150', 'BLACK', '2013', 'YAMAHA', '15000000'),
('nestiawan002', 'CG8 BR 7', 'R25', 'RED WHITE', '2017', 'YAMAHA', '45000000'),
('nestiawan002', 'CG9 BR 8', 'CBR250', 'BLACK DOF', '2020', 'HONDA', '58000000');

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `uname_pegawai` varchar(50) NOT NULL,
  `pwd_pegawai` varchar(8) NOT NULL,
  `id_pegawai` varchar(9) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `no_telepon` varchar(12) NOT NULL,
  `alamat` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`uname_pegawai`, `pwd_pegawai`, `id_pegawai`, `nama`, `no_telepon`, `alamat`) VALUES
('dhani001', '5674', '1266518', 'dhani adi', '087756745634', 'korpri raya'),
('nestiwan002', '4532', '5697426', 'nestiwan ferdianto', '089754312456', 'jl. zainal abidin'),
('ucok003', '8765', '1241241', 'Ucok baba', '081987654321', 'Jl. Airan');

-- --------------------------------------------------------

--
-- Table structure for table `pembeli`
--

CREATE TABLE `pembeli` (
  `uname_pembeli` varchar(50) NOT NULL,
  `pwd_pembeli` varchar(8) NOT NULL,
  `id_ktp` varchar(16) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `no_telepon` varchar(12) NOT NULL,
  `alamat` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pembeli`
--

INSERT INTO `pembeli` (`uname_pembeli`, `pwd_pembeli`, `id_ktp`, `nama`, `no_telepon`, `alamat`) VALUES
('abdul_12', '1234', '1234567891', 'abdul rozak', '081987654321', 'Jl. Airan'),
('akhbarona', '0321', '8765456776', 'akhbarona syanulyn', '081256752109', 'way dadi'),
('angga_kur', '1987', '2167859865', 'angga kurnia', '085765344412', 'karang anyar'),
('hastio_wahyu', '0123', '2312817387', 'hastio wahyu utomo', '081258655551', 'way dadi');

-- --------------------------------------------------------

--
-- Table structure for table `pemesanan`
--

CREATE TABLE `pemesanan` (
  `id_pesanan` int(3) NOT NULL,
  `uname_pembeli` varchar(10) NOT NULL,
  `kode_unit` varchar(8) NOT NULL,
  `jumlah` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pemesanan`
--

INSERT INTO `pemesanan` (`id_pesanan`, `uname_pembeli`, `kode_unit`, `jumlah`) VALUES
(1, 'abdul_12', 'CG3 BR 2', '1');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `no_transaksi` int(3) NOT NULL,
  `id_pesanan` int(3) NOT NULL,
  `jenis_transaksi` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`no_transaksi`, `id_pesanan`, `jenis_transaksi`) VALUES
(1, 1, 'ATM');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cetak_pesanan`
--
ALTER TABLE `cetak_pesanan`
  ADD KEY `no_transaksi` (`no_transaksi`);

--
-- Indexes for table `daftarmotor`
--
ALTER TABLE `daftarmotor`
  ADD PRIMARY KEY (`kode_unit`),
  ADD KEY `uname_pegawai` (`uname_pegawai`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`uname_pegawai`),
  ADD UNIQUE KEY `id_pegawai` (`id_pegawai`),
  ADD UNIQUE KEY `pwd_pegawai` (`pwd_pegawai`);

--
-- Indexes for table `pembeli`
--
ALTER TABLE `pembeli`
  ADD PRIMARY KEY (`uname_pembeli`),
  ADD UNIQUE KEY `id_ktp` (`id_ktp`),
  ADD UNIQUE KEY `pwd_pembeli` (`pwd_pembeli`);

--
-- Indexes for table `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD PRIMARY KEY (`id_pesanan`),
  ADD KEY `uname_pembeli` (`uname_pembeli`),
  ADD KEY `kode_unit` (`kode_unit`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`no_transaksi`),
  ADD KEY `id_pesanan` (`id_pesanan`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cetak_pesanan`
--
ALTER TABLE `cetak_pesanan`
  ADD CONSTRAINT `cetak_pesanan_ibfk_1` FOREIGN KEY (`no_transaksi`) REFERENCES `transaksi` (`no_transaksi`);

--
-- Constraints for table `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD CONSTRAINT `pemesanan_ibfk_1` FOREIGN KEY (`uname_pembeli`) REFERENCES `pembeli` (`uname_pembeli`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pemesanan_ibfk_2` FOREIGN KEY (`kode_unit`) REFERENCES `daftarmotor` (`kode_unit`);

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_pesanan`) REFERENCES `pemesanan` (`id_pesanan`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
