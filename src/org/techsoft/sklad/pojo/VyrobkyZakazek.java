package org.techsoft.sklad.pojo;

public class VyrobkyZakazek {
	private int id;
	private String barva;
	private int mnozstvi;
	private int idVyrobky;
	private int idZakazky;
	
	public VyrobkyZakazek(int id, String barva, int mnozstvi, int idVyrobky,
			int idZakazky) {
		this.id = id;
		this.barva = barva;
		this.mnozstvi = mnozstvi;
		this.idVyrobky = idVyrobky;
		this.idZakazky = idZakazky;
	}
	
	public VyrobkyZakazek(String barva, int mnozstvi, int idVyrobky,
			int idZakazky) {
		this.id = 0;
		this.barva = barva;
		this.mnozstvi = mnozstvi;
		this.idVyrobky = idVyrobky;
		this.idZakazky = idZakazky;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBarva() {
		return barva;
	}

	public void setBarva(String barva) {
		this.barva = barva;
	}

	public int getMnozstvi() {
		return mnozstvi;
	}

	public void setMnozstvi(int mnozstvi) {
		this.mnozstvi = mnozstvi;
	}

	public int getIdVyrobky() {
		return idVyrobky;
	}

	public void setIdVyrobky(int idVyrobky) {
		this.idVyrobky = idVyrobky;
	}

	public int getIdZakazky() {
		return idZakazky;
	}

	public void setIdZakazky(int idZakazky) {
		this.idZakazky = idZakazky;
	}
	
	
	
	
}
