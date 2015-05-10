package org.techsoft.sklad.pojo;

import java.sql.Date;


public class Zakazky {
	private int id;
	private Date datumDodani;
	private Date datumObjednani;
	private int idZakaznici;
	private int idZamestnanci;
	
	public Zakazky(int id, Date datumDodani, Date datumObjednani,
			int idZakaznici, int idZamestnanci) {
		this.id = id;
		this.datumDodani = datumDodani;
		this.datumObjednani = datumObjednani;
		this.idZakaznici = idZakaznici;
		this.idZamestnanci = idZamestnanci;
	}
	
	public Zakazky( Date datumDodani, Date datumObjednani,
			int idZakaznici, int idZamestnanci) {
		this.id = 0;
		this.datumDodani = datumDodani;
		this.datumObjednani = datumObjednani;
		this.idZakaznici = idZakaznici;
		this.idZamestnanci = idZamestnanci;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDatumDodani() {
		return datumDodani;
	}

	public void setDatumDodani(Date datumDodani) {
		this.datumDodani = datumDodani;
	}

	public Date getDatumObjednani() {
		return datumObjednani;
	}

	public void setDatumObjednani(Date datumObjednani) {
		this.datumObjednani = datumObjednani;
	}

	public int getIdZakaznici() {
		return idZakaznici;
	}

	public void setIdZakaznici(int idZakaznici) {
		this.idZakaznici = idZakaznici;
	}

	public int getIdZamestnanci() {
		return idZamestnanci;
	}

	public void setIdZamestnanci(int idZamestnanci) {
		this.idZamestnanci = idZamestnanci;
	}
	
	
}
