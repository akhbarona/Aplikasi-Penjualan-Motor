-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 11 Bulan Mei 2020 pada 16.51
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sistem_informasi_penjualan_motor`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `daftarmotor`
--

CREATE TABLE `daftarmotor` (
  `kode_motor` varchar(20) NOT NULL,
  `nama_motor` varchar(20) NOT NULL,
  `warna_motor` varchar(20) NOT NULL,
  `tahun` char(4) NOT NULL,
  `merk_motor` varchar(20) NOT NULL,
  `harga_motor` varchar(20) NOT NULL,
  `username_pegawai` char(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `daftarmotor`
--

INSERT INTO `daftarmotor` (`kode_motor`, `nama_motor`, `warna_motor`, `tahun`, `merk_motor`, `harga_motor`, `username_pegawai`) VALUES
('CG6 BR 1', 'VARIO 125', 'BLACK', '2018', 'HONDA', '19500000', 'AKHBARONA_SYANULIN'),
('CG6 BR 2', 'SUPRA X 125 SPOKE', 'BLACK RED', '2012', 'HONDA', '10500000', 'ANGGA_KURNIA'),
('CG6 BR 3', 'BEAT 125', 'RED WHITE', '2016', 'HONDA', '12000000', 'ANGGA_KURNIA'),
('CG6 BR 4', 'VARIO 150', 'BLACK DOF', '2018', 'HONDA', '16000000', 'HASTIO_WAHYU'),
('CG6 BR 5', 'AEROX 150', 'RED DOF', '2019', 'YAMAHA', '19900000', 'AKHBARONA_SYANULIN'),
('CG6 BR 6', 'VIXION 150', 'BLACK', '2013', 'YAMAHA', '15200000', 'HASTIO_WAHYU'),
('CG6 BR 7', 'AEROX 150', 'RED DOF', '2017', 'YAMAHA', '19000000', 'AKHBARONA_SYANULIN'),
('CG9 BR 8', 'CBR250', 'BLACK DOF', '2020', 'HONDA', '58000000', 'HASTIO_WAHYU');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pegawai`
--

CREATE TABLE `pegawai` (
  `username_pegawai` char(20) NOT NULL,
  `email_pegawai` varchar(20) NOT NULL,
  `password_pegawai` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pegawai`
--

INSERT INTO `pegawai` (`username_pegawai`, `email_pegawai`, `password_pegawai`) VALUES
('AKHBARONA_SYANULIN', 'AKHBARONA@yahoo.com', '118140193'),
('ANGGA_KURNIA', 'ANGGA.118140185@stud', '118140185'),
('HASTIO_WAHYU', 'HASTIO.118140187@stu', '118140187');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembeli`
--

CREATE TABLE `pembeli` (
  `username_pembeli` varchar(20) NOT NULL,
  `email_pembeli` varchar(20) NOT NULL,
  `password_pembeli` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pembeli`
--

INSERT INTO `pembeli` (`username_pembeli`, `email_pembeli`, `password_pembeli`) VALUES
('Abdul_Hakim', 'muhammad@gmail.com', '1001'),
('Aldy_Pubiangga', 'aldy@gmail.com', '1002'),
('Alfha_Ridho', 'alfha@gmail.com', '1003');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tabel_pesan`
--

CREATE TABLE `tabel_pesan` (
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `username_pembeli` varchar(20) NOT NULL,
  `kode_motor` varchar(20) NOT NULL,
  `jumlah_dipesan` int(100) NOT NULL,
  `metode_pembayaran` varchar(5) NOT NULL,
  `status` varchar(100) NOT NULL,
  `jumlah_transfer` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tabel_pesan`
--

INSERT INTO `tabel_pesan` (`first_name`, `last_name`, `username_pembeli`, `kode_motor`, `jumlah_dipesan`, `metode_pembayaran`, `status`, `jumlah_transfer`) VALUES
('Aldy', 'Pubiangga', 'Aldy_Pubiangga', 'CG6 BR 4', 1, 'ATM', '15000000', 'kredit');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `daftarmotor`
--
ALTER TABLE `daftarmotor`
  ADD PRIMARY KEY (`kode_motor`),
  ADD KEY `username_pegawai` (`username_pegawai`);

--
-- Indeks untuk tabel `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`username_pegawai`),
  ADD UNIQUE KEY `password_pegawai` (`password_pegawai`);

--
-- Indeks untuk tabel `pembeli`
--
ALTER TABLE `pembeli`
  ADD PRIMARY KEY (`username_pembeli`);

--
-- Indeks untuk tabel `tabel_pesan`
--
ALTER TABLE `tabel_pesan`
  ADD KEY `username_pembeli` (`username_pembeli`),
  ADD KEY `kode_motor` (`kode_motor`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `daftarmotor`
--
ALTER TABLE `daftarmotor`
  ADD CONSTRAINT `daftarmotor_ibfk_1` FOREIGN KEY (`username_pegawai`) REFERENCES `pegawai` (`username_pegawai`) ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `tabel_pesan`
--
ALTER TABLE `tabel_pesan`
  ADD CONSTRAINT `tabel_pesan_ibfk_1` FOREIGN KEY (`username_pembeli`) REFERENCES `pembeli` (`username_pembeli`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
