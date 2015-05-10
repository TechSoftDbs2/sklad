package org.techsoft.sklad.pojo;

public class DruhyVyrobku {
	 private int id;
	 private String nazev;
	 
	 public DruhyVyrobku(int id, String nazev) {
		this.id = id;
		this.nazev = nazev;
	}
	 public DruhyVyrobku(String nazev) {
			this.id = 0;
			this.nazev = nazev;
		}
	 
	 @Override
	public String toString() {
		return nazev;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNazev() {
		return nazev;
	}

	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
	 
	 
}
