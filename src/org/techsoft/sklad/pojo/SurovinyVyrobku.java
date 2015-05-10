package org.techsoft.sklad.pojo;

/**
 *
 * @author Saly
 * @
 */
public class SurovinyVyrobku {
	private int id;
	private int idSuroviny;
	private int idVyrobky;
	private int kusy;
	
	public SurovinyVyrobku(int id, int idSuroviny, int idVyrobky, int kusy) {
		this.id = id;
		this.idSuroviny = idSuroviny;
		this.idVyrobky = idVyrobky;
		this.kusy = kusy;
	}
	
	public SurovinyVyrobku(int idSuroviny, int idVyrobky, int kusy) {
		this.id = 0;
		this.idSuroviny = idSuroviny;
		this.idVyrobky = idVyrobky;
		this.kusy = kusy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdSuroviny() {
		return idSuroviny;
	}

	public void setIdSuroviny(int idSuroviny) {
		this.idSuroviny = idSuroviny;
	}

	public int getIdVyrobky() {
		return idVyrobky;
	}

	public void setIdVyrobky(int idVyrobky) {
		this.idVyrobky = idVyrobky;
	}

	public int getKusy() {
		return kusy;
	}

	public void setKusy(int kusy) {
		this.kusy = kusy;
	}
	
	
	
	
}
