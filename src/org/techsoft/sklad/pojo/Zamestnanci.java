package org.techsoft.sklad.pojo;

public class Zamestnanci {
	private int id;
	private String jmeno;
	private String prijmeni;
	private String email;
	private String telefon;
	private int idAdresy;
	private int osobCislo;
	private char[] heslo;
	private boolean adminPrava;

	public Zamestnanci(int id, String jmeno, String prijmeni, String email,
			String telefon, int idAdresy, int osobCislo, char[] heslo, boolean adminPrava) {
		this.id = id;
		this.jmeno = jmeno;
		this.prijmeni = prijmeni;
		this.email = email;
		this.telefon = telefon;
		this.idAdresy = idAdresy;
		this.osobCislo = osobCislo;
		this.heslo = heslo;
		this.adminPrava = adminPrava;
	}
	
	public Zamestnanci(String jmeno, String prijmeni, String email,
			String telefon, int idAdresy, int osobCislo, char[] heslo, boolean adminPrava) {
		this.id = 0;
		this.jmeno = jmeno;
		this.prijmeni = prijmeni;
		this.email = email;
		this.telefon = telefon;
		this.idAdresy = idAdresy;
		this.osobCislo = osobCislo;
		this.heslo = heslo;
		this.adminPrava = adminPrava;
	}

	@Override
	public String toString() {
		return "["+osobCislo +"] "+jmeno +" "+prijmeni;
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

	public int getOsobCislo() {
		return osobCislo;
	}

	public void setOsobCislo(int osobCislo) {
		this.osobCislo = osobCislo;
	}

	public char[] getHeslo() {
		return heslo;
	}

	public void setHeslo(char[] heslo) {
		this.heslo = heslo;
	}

	public boolean isAdminPrava() {
		return adminPrava;
	}

	public void setAdminPrava(boolean adminPrava) {
		this.adminPrava = adminPrava;
	}
	
	
	
}
