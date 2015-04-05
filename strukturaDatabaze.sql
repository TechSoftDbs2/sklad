CREATE TABLE Zakazky
(
	datum_dodani DATE,
	datum_objednani DATE NOT NULL,
	zakazkyID INTEGER NOT NULL,
	zakazniciID INTEGER NOT NULL,
	zamestnanciID INTEGER NOT NULL,
	PRIMARY KEY (zakazkyID)
) 
;


CREATE TABLE Zamestnanci
(
	email VARCHAR(50) NOT NULL,
	Jmeno VARCHAR(50) NOT NULL,
	Prijmeni VARCHAR(50) NOT NULL,
	telefon VARCHAR(16) NOT NULL,
	zamestnanciID INTEGER NOT NULL,
	adresyID INTEGER NOT NULL,
	PRIMARY KEY (zamestnanciID)
) 
;


CREATE TABLE Zakaznici
(
	Email VARCHAR(50) NOT NULL,
	Jmeno VARCHAR(50) NOT NULL,
	Prijmeni VARCHAR(50) NOT NULL,
	Telefon VARCHAR(16) NOT NULL,
	zakazniciID INTEGER NOT NULL,
	adresyID INTEGER NOT NULL,
	PRIMARY KEY (zakazniciID)
) 
;


CREATE TABLE VyrobkyZakazek
(
	barva VARCHAR(50) NOT NULL,
	mnozstvi INTEGER NOT NULL,
	vyrobkyZakazekID INTEGER NOT NULL,
	vyrobkyID INTEGER NOT NULL,
	zakazkyID INTEGER NOT NULL,
	PRIMARY KEY (vyrobkyZakazekID)
) 
;


CREATE TABLE SurovinyVyrobku
(
	surovinyVyrobkuID INTEGER NOT NULL,
	surovinyID INTEGER NOT NULL,
	vyrobkyID INTEGER NOT NULL,
	PRIMARY KEY (surovinyVyrobkuID)
) 
;


CREATE TABLE Druhy_vyrobku
(
	Nazev VARCHAR(50) NOT NULL,
	Pouziti VARCHAR(50) NOT NULL,
	druhy_vyrobkuID INTEGER NOT NULL,
	vyrobkyID INTEGER NOT NULL,
	PRIMARY KEY (druhy_vyrobkuID)
) 
;


CREATE TABLE Druhy_surovin
(
	Material VARCHAR(50) NOT NULL,
	Nazev VARCHAR(50) NOT NULL,
	druhy_surovinID INTEGER NOT NULL,
	surovinyID INTEGER NOT NULL,
	PRIMARY KEY (druhy_surovinID)
) 
;


CREATE TABLE Vyrobky
(
	Hloubka INTEGER NOT NULL,
	Nazev VARCHAR(50) NOT NULL,
	Seriove_cislo INTEGER NOT NULL,
	Sirka INTEGER NOT NULL,
	Vyska INTEGER NOT NULL,
	vyrobkyID INTEGER NOT NULL,
	PRIMARY KEY (vyrobkyID)
) 
;


CREATE TABLE Suroviny
(
	Kusy INTEGER NOT NULL,
	Nazev VARCHAR(50) NOT NULL,
	Vaha INTEGER NOT NULL,
	surovinyID INTEGER NOT NULL,
	PRIMARY KEY (surovinyID)
) 
;


CREATE TABLE Adresy
(
	Mesto VARCHAR(50) NOT NULL,
	PSC CHAR(6) NOT NULL,
	Ulice VARCHAR(50) NOT NULL,
	adresyID INTEGER NOT NULL,
	PRIMARY KEY (adresyID)
) 
;
