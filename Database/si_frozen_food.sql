-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 13 Okt 2021 pada 22.56
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `si_frozen_food`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `id_barang` varchar(10) NOT NULL,
  `nama_barang` varchar(35) NOT NULL,
  `stok` int(11) NOT NULL,
  `harga_barang` int(10) NOT NULL,
  `kategori_barang` varchar(25) NOT NULL,
  `id_petugas` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`id_barang`, `nama_barang`, `stok`, `harga_barang`, `kategori_barang`, `id_petugas`) VALUES
('Sk13', 'Sosis Sapi King Food', 37, 20000, 'SOSIS', '3780'),
('Ka3456', 'Kornet Ayam King Food', 11, 15000, 'KORNET AYAM', '1234'),
('Nb32', 'Chicken Nugget Belfoods', 32, 30000, 'NUGGET', '3456'),
('Kb', 'Kebab Frozen', 11, 18000, 'KEBAB FROZEN', '12456');

-- --------------------------------------------------------

--
-- Struktur dari tabel `costumer`
--

CREATE TABLE `costumer` (
  `id_customer` varchar(10) NOT NULL,
  `nama_customer` varchar(50) NOT NULL,
  `alamat_customer` varchar(255) NOT NULL,
  `tlp_customer` varchar(13) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `costumer`
--

INSERT INTO `costumer` (`id_customer`, `nama_customer`, `alamat_customer`, `tlp_customer`) VALUES
('34567', 'Rosidi', 'Jl Lubang buaya ', '0891267830567'),
('170799', 'Retno', 'Jl Anugrah Jatimakmur', '087845712003'),
('654321', 'Ririn Agustin', 'Jl Bunga Pondok Melati', '087217890136');

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_jual`
--

CREATE TABLE `detail_jual` (
  `id_detail` varchar(11) NOT NULL,
  `id_barang` varchar(15) NOT NULL,
  `harga_barang` int(50) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `detail_jual`
--

INSERT INTO `detail_jual` (`id_detail`, `id_barang`, `harga_barang`, `jumlah`) VALUES
('1234', 'NB345', 30000, 1),
('3456', 'KG54', 20000, 3),
('456', 'KB12', 23000, 2),
('09879', 'Aff12', 20000, 5),
('Na01', 'Aff12', 20000, 1),
('5678', 'Kb', 18000, 1),
('JAOE0001', 'Kb', 18000, 3),
('JA0E003', 'Ka3456', 15000, 4),
('JA0E005', 'Ka3456', 15000, 3);

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_kirim`
--

CREATE TABLE `detail_kirim` (
  `id_supplier` varchar(15) NOT NULL,
  `id_barang` varchar(15) NOT NULL,
  `tgl_kirim` date NOT NULL,
  `jumlah` int(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `detail_kirim`
--

INSERT INTO `detail_kirim` (`id_supplier`, `id_barang`, `tgl_kirim`, `jumlah`) VALUES
('hr34', '1212', '2020-06-12', 24),
('12345', 'KB12', '2020-06-23', 10),
('32145', 'KG54', '2020-06-04', 12),
('Wr68', 'Sk13', '2020-06-20', 12),
('Wr68', 'Nb32', '2020-11-27', 10),
('Wi78', 'Kb', '2020-11-26', 5);

-- --------------------------------------------------------

--
-- Struktur dari tabel `petugas_toko`
--

CREATE TABLE `petugas_toko` (
  `id_petugas` varchar(15) NOT NULL,
  `nama_petugas` varchar(20) NOT NULL,
  `tlp_petugas` varchar(17) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `petugas_toko`
--

INSERT INTO `petugas_toko` (`id_petugas`, `nama_petugas`, `tlp_petugas`) VALUES
('020304', 'Fitri', '082134679013'),
('123456', 'Samsul Bahri', '082215550770'),
('090917', 'Fuad', '087836550361');

-- --------------------------------------------------------

--
-- Struktur dari tabel `struk`
--

CREATE TABLE `struk` (
  `id_struk` varchar(15) CHARACTER SET utf8 NOT NULL,
  `tgl_struk` date NOT NULL,
  `total_harga` int(11) NOT NULL,
  `id_petugas` varchar(15) CHARACTER SET utf8 NOT NULL,
  `id_customer` varchar(15) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Dumping data untuk tabel `struk`
--

INSERT INTO `struk` (`id_struk`, `tgl_struk`, `total_harga`, `id_petugas`, `id_customer`) VALUES
('09879', '2020-06-18', 100000, 'Af09', '0909'),
('1234', '2020-06-04', 30000, '090917', '87871'),
('3456', '2020-06-05', 60000, '121297', '787810'),
('456', '2020-06-11', 46000, '090917', '87871'),
('5678', '2020-06-13', 18000, '090917', '170799'),
('JA0E003', '2020-11-28', 60000, '090917', '654321'),
('JA0E005', '2020-11-10', 45000, '020304', '34567'),
('JAOE0001', '2020-11-09', 54000, '090917', '654321'),
('Na01', '2020-06-12', 20000, '2', '0909');

-- --------------------------------------------------------

--
-- Struktur dari tabel `supplier`
--

CREATE TABLE `supplier` (
  `id_supplier` varchar(15) NOT NULL,
  `nama_supplier` varchar(30) NOT NULL,
  `alamat_supplier` varchar(50) NOT NULL,
  `tlp_supplier` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `supplier`
--

INSERT INTO `supplier` (`id_supplier`, `nama_supplier`, `alamat_supplier`, `tlp_supplier`) VALUES
('Wi78', 'Wiwi', 'Jl Jatirahayu 5', '08791550224'),
('Wr68', 'Wiryono', 'Jl Jatikramat', '08157800123');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id_barang`),
  ADD KEY `id_petugas` (`id_petugas`);

--
-- Indeks untuk tabel `costumer`
--
ALTER TABLE `costumer`
  ADD PRIMARY KEY (`id_customer`);

--
-- Indeks untuk tabel `detail_jual`
--
ALTER TABLE `detail_jual`
  ADD KEY `id_detail` (`id_detail`),
  ADD KEY `id_barang` (`id_barang`);

--
-- Indeks untuk tabel `detail_kirim`
--
ALTER TABLE `detail_kirim`
  ADD KEY `id_supplier` (`id_supplier`,`id_barang`);

--
-- Indeks untuk tabel `petugas_toko`
--
ALTER TABLE `petugas_toko`
  ADD PRIMARY KEY (`id_petugas`);

--
-- Indeks untuk tabel `struk`
--
ALTER TABLE `struk`
  ADD PRIMARY KEY (`id_struk`),
  ADD KEY `id_petugas` (`id_petugas`,`id_customer`);

--
-- Indeks untuk tabel `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id_supplier`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
