package org.techsoft.sklad.pojo;

public class Vyrobky {
	private int id;
	private int serioveCislo;
	private int hloubka;
	private String nazev;
	private int sirka;
	private int vyska;
	private int idDruhyvyrobku;
	
	public Vyrobky(int id, int serioveCislo, int hloubka, String nazev,
			int sirka, int vyska, int idDruhyvyrobku) {
		this.id = id;
		this.serioveCislo = serioveCislo;
		this.hloubka = hloubka;
		this.nazev = nazev;
		this.sirka = sirka;
		this.vyska = vyska;
		this.idDruhyvyrobku = idDruhyvyrobku;
	}
	
	public Vyrobky(int serioveCislo, int hloubka, String nazev,
			int sirka, int vyska, int idDruhyvyrobku) {
		this.id = 0;
		this.serioveCislo = serioveCislo;
		this.hloubka = hloubka;
		this.nazev = nazev;
		this.sirka = sirka;
		this.vyska = vyska;
		this.idDruhyvyrobku = idDruhyvyrobku;
	}

	@Override
	public String toString() {
		
		return nazev +" ("+serioveCislo+")";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSerioveCislo() {
		return serioveCislo;
	}

	public void setSerioveCislo(int serioveCislo) {
		this.serioveCislo = serioveCislo;
	}

	public int getHloubka() {
		return hloubka;
	}

	public void setHloubka(int hloubka) {
		this.hloubka = hloubka;
	}

	public String getNazev() {
		return nazev;
	}

	public void setNazev(String nazev) {
		this.nazev = nazev;
	}

	public int getSirka() {
		return sirka;
	}

	public void setSirka(int sirka) {
		this.sirka = sirka;
	}

	public int getVyska() {
		return vyska;
	}

	public void setVyska(int vyska) {
		this.vyska = vyska;
	}

	public int getIdDruhyvyrobku() {
		return idDruhyvyrobku;
	}

	public void setIdDruhyvyrobku(int idDruhyvyrobku) {
		this.idDruhyvyrobku = idDruhyvyrobku;
	}
	

}
