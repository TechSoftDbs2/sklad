package org.techsoft.sklad.model;

import java.util.List;

import org.techsoft.sklad.pojo.Adresy;
import org.techsoft.sklad.pojo.DruhySurovin;
import org.techsoft.sklad.pojo.DruhyVyrobku;
import org.techsoft.sklad.pojo.Suroviny;
import org.techsoft.sklad.pojo.SurovinyVyrobku;
import org.techsoft.sklad.pojo.Vyrobky;
import org.techsoft.sklad.pojo.Zamestnanci;

public interface DataManager {
	
	//Druhy surovin
	public List<DruhySurovin> getAllDruhySurovin();
	public void addDruhSuroviny(DruhySurovin dS);
	public void delDruhSuroviny(DruhySurovin dS);
	//Druhy vyrobku
	public List<DruhyVyrobku> getAllDruhyVyrobku();
	public void addDruhVyrobku (DruhyVyrobku dV);
	public void delDruhVyrobku (DruhyVyrobku dV);
	
	//suroviny
	public List<Suroviny> getAllSuroviny();
	public Suroviny getSurovinuById(int id);
	/**
	 * 
	 * @param idV identifikacni cislo vyrobku
	 * @return V listu Stringu jsou za sebou vlozeny nazev suroviny a pocet kusu
	 */
	public List<String> getSurovinuByIdVyr(int idV);
	public List<Suroviny> getSurovinyByIdVyrobku(int idV);
	public void addSurovinu(Suroviny surovina, int idDruhuSuroviny );
	public void delSurvinu(Suroviny surovina);
	public void updSurovinu(Suroviny surovina);
	
	//vyrobky
	public List<Vyrobky> getAllVyrobky();
	public List<Vyrobky> getVyrobkyByIdDSur(int idDS);
	public void addVyrobek(Vyrobky vyrobek);
	public void delVyrobek(Vyrobky vyrobek);
	public void updVyrobek(Vyrobky vyrobek);
	//suroviny vyrobku
	public void addSurovinyVyrobku(SurovinyVyrobku surVyr);
	public void delSurovinyVyrobku(SurovinyVyrobku surVyr);
	public void delSurovinyVyrobku(int idV, int idS);
	//zamestnanci
	public List<Zamestnanci> getAllZamestnance();
	public void addZamestnance(Zamestnanci zam, Adresy adr);
	public void delZamestnance(Zamestnanci zam);
	
	
}
