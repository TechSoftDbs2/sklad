package org.techsoft.sklad.pojo;

public class DruhySurovin {
	private int id;
	private String nazev;
	
	public DruhySurovin(String nazev) {
		this.id = 0;
		this.nazev = nazev;		
	}
	
	public DruhySurovin(int id, String nazev) {
		this.id = id;
		this.nazev = nazev;		
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
	
	@Override
	public String toString() {		
		return nazev;
	}
	
}
