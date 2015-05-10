package org.techsoft.sklad.pojo;

public class Suroviny {
	private int id;
	private String nazev;
	private int kusy;
	private String material;
	private int vaha;
	private int idDruhuSur;
	


	public Suroviny() {
		// TODO Auto-generated constructor stub
	}
	
	public Suroviny(int id, String nazev, int kusy, String material, int vaha,  int idDruhuSur) {
		this.id = id;
		this.nazev = nazev;
		this.kusy = kusy;
		this.material = material;
		this.vaha = vaha;
		this.idDruhuSur = idDruhuSur;
	}
	public Suroviny( String nazev, int kusy, String material, int vaha,  int idDruhuSur) {
		this.id = 0;
		this.nazev = nazev;
		this.kusy = kusy;
		this.material = material;
		this.vaha = vaha;
		this.idDruhuSur = idDruhuSur;
	}
	
	@Override
	public String toString() {
		return nazev +" z " +material;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdDruhuSur() {
		return idDruhuSur;
	}

	public void setIdDruhuSur(int idDruhuSur) {
		this.idDruhuSur = idDruhuSur;
	}

	public String getNazev() {
		return nazev;
	}

	public void setNazev(String nazev) {
		this.nazev = nazev;
	}

	public int getKusy() {
		return kusy;
	}

	public void setKusy(int kusy) {
		this.kusy = kusy;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getVaha() {
		return vaha;
	}

	public void setVaha(int vaha) {
		this.vaha = vaha;
	}
	
	
	
	
}
