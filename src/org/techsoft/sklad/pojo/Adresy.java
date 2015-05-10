package org.techsoft.sklad.pojo;

public class Adresy {
	private int id;
	private String mesto;
	private String PSC;
	private String ulice;
	
	public Adresy(int id, String mesto, String pSC, String ulice) {
		this.id = id;
		this.mesto = mesto;
		PSC = pSC;
		this.ulice = ulice;
	}
	
	public Adresy( String mesto, String pSC, String ulice) {
		this.id = 0;
		this.mesto = mesto;
		PSC = pSC;
		this.ulice = ulice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMesto() {
		return mesto;
	}

	public void setMesto(String mesto) {
		this.mesto = mesto;
	}

	public String getPSC() {
		return PSC;
	}

	public void setPSC(String pSC) {
		PSC = pSC;
	}

	public String getUlice() {
		return ulice;
	}

	public void setUlice(String ulice) {
		this.ulice = ulice;
	}
	
	
	
}
