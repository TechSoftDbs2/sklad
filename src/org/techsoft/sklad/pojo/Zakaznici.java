package org.techsoft.sklad.pojo;

public class Zakaznici {
	private int id;
	private String jmeno;
	private String prijmeni;
	private String email;
	private String telefon;
	private int idAdresy;
	
	public Zakaznici(int id, String jmeno, String prijmeni, String email,
			String telefon, int idAdresy) {
		this.id = id;
		this.jmeno = jmeno;
		this.prijmeni = prijmeni;
		this.email = email;
		this.telefon = telefon;
		this.idAdresy = idAdresy;
	}
	
	public Zakaznici(String jmeno, String prijmeni, String email,
			String telefon, int idAdresy) {
		this.id = 0;
		this.jmeno = jmeno;
		this.prijmeni = prijmeni;
		this.email = email;
		this.telefon = telefon;
		this.idAdresy = idAdresy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJmeno() {
		return jmeno;
	}

	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}

	public String getPrijmeni() {
		return prijmeni;
	}

	public void setPrijmeni(String prijmeni) {
		this.prijmeni = prijmeni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public int getIdAdresy() {
		return idAdresy;
	}

	public void setIdAdresy(int idAdresy) {
		this.idAdresy = idAdresy;
	}
	
	
}
