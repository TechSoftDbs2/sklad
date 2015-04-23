-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Počítač: 127.0.0.1
-- Vytvořeno: Čtv 23. dub 2015, 13:56
-- Verze serveru: 5.6.21
-- Verze PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Databáze: `dbs`
--

-- --------------------------------------------------------

--
-- Struktura tabulky `adresy`
--

CREATE TABLE IF NOT EXISTS `adresy` (
  `mesto` varchar(50) NOT NULL,
  `PSC` char(6) NOT NULL,
  `ulice` varchar(50) NOT NULL,
  `adresyID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struktura tabulky `druhy_surovin`
--

CREATE TABLE IF NOT EXISTS `druhy_surovin` (
  `nazev` varchar(50) NOT NULL,
  `druhy_surovinID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struktura tabulky `druhy_vyrobku`
--

CREATE TABLE IF NOT EXISTS `druhy_vyrobku` (
  `pouziti` varchar(50) NOT NULL,
  `druhy_vyrobkuID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struktura tabulky `suroviny`
--

CREATE TABLE IF NOT EXISTS `suroviny` (
  `kusy` int(11) NOT NULL,
  `nazev` varchar(50) NOT NULL,
  `material` varchar(50) NOT NULL,
  `vaha` int(11) NOT NULL,
  `surovinyID` int(11) NOT NULL,
  `druhy_surovinID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struktura tabulky `surovinyvyrobku`
--

CREATE TABLE IF NOT EXISTS `surovinyvyrobku` (
  `surovinyVyrobkuID` int(11) NOT NULL,
  `surovinyID` int(11) NOT NULL,
  `vyrobkyID` int(11) NOT NULL,
  ` kusy` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struktura tabulky `vyrobky`
--

CREATE TABLE IF NOT EXISTS `vyrobky` (
  `hloubka` int(11) NOT NULL,
  `nazev` varchar(50) NOT NULL,
  `seriove_cislo` int(11) NOT NULL,
  `sirka` int(11) NOT NULL,
  `vyska` int(11) NOT NULL,
  `vyrobkyID` int(11) NOT NULL,
  `druhy_vyrobkuID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struktura tabulky `vyrobkyzakazek`
--

CREATE TABLE IF NOT EXISTS `vyrobkyzakazek` (
  `barva` varchar(50) NOT NULL,
  `mnozstvi` int(11) NOT NULL,
  `vyrobkyZakazekID` int(11) NOT NULL,
  `vyrobkyID` int(11) NOT NULL,
  `zakazkyID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struktura tabulky `zakazky`
--

CREATE TABLE IF NOT EXISTS `zakazky` (
  `datum_dodani` date DEFAULT NULL,
  `datum_objednani` date NOT NULL,
  `zakazkyID` int(11) NOT NULL,
  `zakazniciID` int(11) NOT NULL,
  `zamestnanciID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struktura tabulky `zakaznici`
--

CREATE TABLE IF NOT EXISTS `zakaznici` (
  `email` varchar(50) NOT NULL,
  `jmeno` varchar(50) NOT NULL,
  `prijmeni` varchar(50) NOT NULL,
  `telefon` varchar(16) NOT NULL,
  `zakazniciID` int(11) NOT NULL,
  `adresyID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struktura tabulky `zamestnanci`
--

CREATE TABLE IF NOT EXISTS `zamestnanci` (
  `email` varchar(50) NOT NULL,
  `jmeno` varchar(50) NOT NULL,
  `prijmeni` varchar(50) NOT NULL,
  `telefon` varchar(16) NOT NULL,
  `zamestnanciID` int(11) NOT NULL,
  `adresyID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Klíče pro exportované tabulky
--

--
-- Klíče pro tabulku `adresy`
--
ALTER TABLE `adresy`
 ADD PRIMARY KEY (`adresyID`);

--
-- Klíče pro tabulku `druhy_surovin`
--
ALTER TABLE `druhy_surovin`
 ADD PRIMARY KEY (`druhy_surovinID`);

--
-- Klíče pro tabulku `druhy_vyrobku`
--
ALTER TABLE `druhy_vyrobku`
 ADD PRIMARY KEY (`druhy_vyrobkuID`);

--
-- Klíče pro tabulku `suroviny`
--
ALTER TABLE `suroviny`
 ADD PRIMARY KEY (`surovinyID`), ADD KEY `druhy_surovinID` (`druhy_surovinID`), ADD KEY `druhy_surovinID_2` (`druhy_surovinID`);

--
-- Klíče pro tabulku `surovinyvyrobku`
--
ALTER TABLE `surovinyvyrobku`
 ADD PRIMARY KEY (`surovinyVyrobkuID`), ADD KEY `surovinyID` (`surovinyID`), ADD KEY `vyrobkyID` (`vyrobkyID`);

--
-- Klíče pro tabulku `vyrobky`
--
ALTER TABLE `vyrobky`
 ADD PRIMARY KEY (`vyrobkyID`), ADD KEY `druhy_vyrobkuID` (`druhy_vyrobkuID`);

--
-- Klíče pro tabulku `vyrobkyzakazek`
--
ALTER TABLE `vyrobkyzakazek`
 ADD PRIMARY KEY (`vyrobkyZakazekID`), ADD KEY `vyrobkyID` (`vyrobkyID`), ADD KEY `zakazkyID` (`zakazkyID`);

--
-- Klíče pro tabulku `zakazky`
--
ALTER TABLE `zakazky`
 ADD PRIMARY KEY (`zakazkyID`), ADD KEY `zakazniciID` (`zakazniciID`), ADD KEY `zamestnanciID` (`zamestnanciID`);

--
-- Klíče pro tabulku `zakaznici`
--
ALTER TABLE `zakaznici`
 ADD PRIMARY KEY (`zakazniciID`), ADD KEY `adresyID` (`adresyID`), ADD KEY `adresyID_2` (`adresyID`);

--
-- Klíče pro tabulku `zamestnanci`
--
ALTER TABLE `zamestnanci`
 ADD PRIMARY KEY (`zamestnanciID`), ADD KEY `adresyID` (`adresyID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
