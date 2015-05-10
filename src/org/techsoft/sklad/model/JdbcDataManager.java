package org.techsoft.sklad.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.techsoft.sklad.db.Database;
import org.techsoft.sklad.pojo.Adresy;
import org.techsoft.sklad.pojo.DruhySurovin;
import org.techsoft.sklad.pojo.DruhyVyrobku;
import org.techsoft.sklad.pojo.Suroviny;
import org.techsoft.sklad.pojo.SurovinyVyrobku;
import org.techsoft.sklad.pojo.Vyrobky;
import org.techsoft.sklad.pojo.Zamestnanci;

public class JdbcDataManager implements DataManager {
	Database db = null;
	Statement stmt = null;

	public JdbcDataManager() {
		db = new Database("127.0.0.1:3306", "dbs", "root", "");
		// db = new Database("95.143.143.9:3306","dbs","dbs","dbs");
	}

	@Override
	public List<DruhySurovin> getAllDruhySurovin() {
		List<DruhySurovin> druhyS = new ArrayList<DruhySurovin>();
		try {
			ResultSet rs = db.select("druhy_surovin", null, null);
			while (rs.next()) {
				DruhySurovin ds = new DruhySurovin(
						rs.getInt("druhy_surovinID"), rs.getString("nazev"));
				druhyS.add(ds);
			}
			return druhyS;

		} catch (SQLException e) {
			e.printStackTrace();
			// v pripade chyby vracime null
			return null;
		}
	}

	@Override
	public List<DruhyVyrobku> getAllDruhyVyrobku() {
		List<DruhyVyrobku> druhyV = new ArrayList<DruhyVyrobku>();
		try {
			ResultSet rs = db.select("druhy_vyrobku", null, null);
			while (rs.next()) {
				DruhyVyrobku dv = new DruhyVyrobku(
						rs.getInt("druhy_vyrobkuID"), rs.getString("pouziti"));
				druhyV.add(dv);
			}
			return druhyV;

		} catch (SQLException e) {
			e.printStackTrace();
			// v pripade chyby vracime null
			return null;
		}
	}

	@Override
	public List<Suroviny> getAllSuroviny() {
		List<Suroviny> suroviny = new ArrayList<Suroviny>();
		try {
			ResultSet rs = db.select("suroviny", null, null);
			while (rs.next()) {
				Suroviny s = new Suroviny(rs.getInt("surovinyID"),
						rs.getString("nazev"), rs.getInt("kusy"),
						rs.getString("material"), rs.getInt("vaha"),
						rs.getInt("druhy_surovinID"));
				suroviny.add(s);
			}
			return suroviny;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public Suroviny getSurovinuById(int id) {
		try {
			Suroviny s = null;
			Object[] param = { id };
			ResultSet rs = db.select("suroviny", null, "id", param);
			while (rs.next()) {
				s = new Suroviny(rs.getInt("surovinyID"),
						rs.getString("nazev"), rs.getInt("kusy"),
						rs.getString("material"), rs.getInt("vaha"),
						rs.getInt("druhy_surovinID"));
			}
			return s;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public List<Suroviny> getSurovinyByIdVyrobku(int idV) {
		try {
			stmt = db.getCon().createStatement();
			ResultSet res = stmt
					.executeQuery("SELECT s.surovinyID, s.nazev, s.kusy, s.material, s.vaha, s.druhy_surovinID"
							+ " FROM surovinyvyrobku sv INNER JOIN suroviny s ON sv.surovinyID = s.surovinyID WHERE sv.vyrobkyID = "
							+ idV);
			List<Suroviny> seznam = new ArrayList<>();
			while (res.next()) {
				Suroviny s = new Suroviny(res.getInt("surovinyID"), res.getString("nazev"),
						res.getInt("kusy"), res.getString("material"), res.getInt("vaha"), 
						res.getInt("druhy_surovinID"));
				seznam.add(s);
			}
			stmt.close();
			return seznam;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public List<String> getSurovinuByIdVyr(int idV) {
		try {
			stmt = db.getCon().createStatement();
			ResultSet res = stmt
					.executeQuery("SELECT s.nazev, sv.kusy FROM surovinyvyrobku sv INNER JOIN suroviny s ON sv.surovinyID = s.surovinyID WHERE sv.vyrobkyID = "
							+ idV);
			List<String> seznam = new ArrayList<>();
			while (res.next()) {
				seznam.add(res.getString("nazev"));
				seznam.add(res.getString("kusy"));
			}
			stmt.close();
			return seznam;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public List<Vyrobky> getVyrobkyByIdDSur(int idDS) {
		try {
			
			Vyrobky v = null;
			stmt = db.getCon().createStatement();
			ResultSet res = stmt
					.executeQuery("SELECT v.vyrobkyID, v.seriove_cislo, v.nazev, v.hloubka, v.sirka, v.vyska, v.druhy_vyrobkuID "
							+ "FROM suroviny s "
							+ "INNER JOIN surovinyvyrobku sv ON s.surovinyID=sv.surovinyID "
							+ "INNER JOIN vyrobky v ON sv.vyrobkyID=v.vyrobkyID "
							+ "WHERE s.druhy_surovinID=" + idDS);
			List<Vyrobky> seznam = new ArrayList<>();
			while (res.next()) {
				v = new Vyrobky(res.getInt("vyrobkyID"),
						res.getInt("seriove_cislo"), res.getInt("hloubka"),
						res.getString("nazev"), res.getInt("sirka"),
						res.getInt("vyska"), res.getInt("druhy_vyrobkuID"));
				seznam.add(v);
			}
			stmt.close();
			return seznam;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Vyrobky> getAllVyrobky() {
		List<Vyrobky> vyrobky = new ArrayList<Vyrobky>();
		try {
			ResultSet rs = db.select("vyrobky", null, null);
			while (rs.next()) {
				Vyrobky v = new Vyrobky(rs.getInt("vyrobkyID"),
						rs.getInt("seriove_cislo"), rs.getInt("hloubka"),
						rs.getString("nazev"), rs.getInt("sirka"),
						rs.getInt("vyska"), rs.getInt("druhy_vyrobkuID"));
				vyrobky.add(v);
			}
			return vyrobky;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Zamestnanci> getAllZamestnance() {
		List<Zamestnanci> zam = new ArrayList<Zamestnanci>();
		try {
			ResultSet rs = db.select("zamestnanci", null, null);
			while (rs.next()) {
				Zamestnanci z = new Zamestnanci(rs.getInt("zamestnanciID"),
						rs.getString("jmeno"), rs.getString("prijmeni"),
						rs.getString("email"), rs.getString("telefon"),
						rs.getInt("adresyID"), rs.getInt("osobni_cislo"),
						rs.getString("heslo").toCharArray(), rs.getBoolean("admin_prava"));
				zam.add(z);
			}
			return zam;
	
		} catch (SQLException e) {
			e.printStackTrace();
			// v pripade chyby vracime null
			return null;
		}
	}

	@Override
	public void addDruhSuroviny(DruhySurovin dS) {
		try {
			Object[] params = { dS.getNazev() };
			String[] columns = { "nazev" };
			db.insert("druhy_surovin", params, columns);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void addDruhVyrobku(DruhyVyrobku dV) {
		try {
			Object[] params = { dV.getNazev() };
			String[] columns = { "pouziti" };
			db.insert("druhy_vyrobku", params, columns);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void addSurovinu(Suroviny surovina, int idDruhuSuroviny) {
		try {
			Object[] params = { surovina.getNazev(), surovina.getKusy(),
					surovina.getMaterial(), surovina.getVaha(), idDruhuSuroviny };
			String[] columns = { "nazev", "kusy", "material", "vaha",
					"druhy_surovinID" };
			db.insert("suroviny", params, columns);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	@Override
	public void addVyrobek(Vyrobky vyrobek) {
		try {
			Object[] params = { vyrobek.getSerioveCislo(), vyrobek.getHloubka(), vyrobek.getNazev(),
					vyrobek.getSirka(), vyrobek.getVyska(), vyrobek.getIdDruhyvyrobku() };
			String[] columns = { "seriove_cislo", "hloubka", "nazev",  "sirka", "vyska",
					"druhy_vyrobkuID" };
			db.insert("vyrobky", params, columns);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void addSurovinyVyrobku(SurovinyVyrobku surVyr) {
		try {
			Object[] params = { surVyr.getIdSuroviny(), surVyr.getIdVyrobky(), surVyr.getKusy()};
			String[] columns = { "surovinyID", "vyrobkyID", "kusy"};
			db.insert("surovinyvyrobku", params, columns);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	@Override
	public void addZamestnance(Zamestnanci zam, Adresy adr) {	
		try {			
			int adminPrava = zam.isAdminPrava() ? 1 : 0;
//			char[] heslo =  zam.getHeslo();
//			for (int i = 0; i < zam.getHeslo().length; i++) {
//				 System.out.println(heslo[i]);
//			}
//			 System.out.println(new String(heslo));
			stmt = db.getCon().createStatement();
			String query = "INSERT INTO adresy (mesto,PSC,ulice) VALUES "
					+ "('"+adr.getMesto()+"',"+adr.getPSC()+",'"+adr.getUlice()+"')";
			String query2 = "INSERT INTO zamestnanci (jmeno,prijmeni,email,telefon,adresyID,osobni_cislo,heslo,admin_prava) VALUES "
					+ "('"+zam.getJmeno()+"','"+zam.getPrijmeni()+"','"+zam.getEmail()+"','"+zam.getTelefon()+"',LAST_INSERT_ID(),"
					+ zam.getOsobCislo() +",'" +new String(zam.getHeslo())+"'," +adminPrava +")";
			 System.out.println(query);
			 System.out.println(query2);
			stmt.execute(query);
			stmt.execute(query2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

	@Override
	public void updSurovinu(Suroviny surovina) {
		Object[] params = { surovina.getNazev(), surovina.getKusy(),
				surovina.getMaterial(), surovina.getVaha(),
				surovina.getIdDruhuSur(), surovina.getId() };
		//odmazat
		for (Object o : params) {
			System.out.println(o);
		}
		String[] columns = { "nazev", "kusy", "material", "vaha",
				"druhy_surovinID" };
		try {
			db.update("suroviny", columns, "surovinyID", params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updVyrobek(Vyrobky vyrobek) {
		Object[] params = { vyrobek.getSerioveCislo(), vyrobek.getHloubka(), vyrobek.getNazev(),
				vyrobek.getSirka(), vyrobek.getVyska(), vyrobek.getIdDruhyvyrobku(), vyrobek.getId() };

		String[] columns = { "seriove_cislo", "hloubka", "nazev",  "sirka", "vyska",
		"druhy_vyrobkuID" };
		try {
			db.update("vyrobky", columns, "vyrobkyID", params);
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	@Override
	public void delDruhSuroviny(DruhySurovin dS) {
		try {
			Object[] param = { dS.getId() };
			db.delete("druhy_surovin", "druhy_surovinID	", param);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delDruhVyrobku(DruhyVyrobku dV) {
		try {
			Object[] param = { dV.getId() };
			db.delete("druhy_vyrobku", "druhy_vyrobkuID	", param);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delSurvinu(Suroviny surovina) {
		Object[] param = { surovina.getId() };
		try {
			db.delete("suroviny", "surovinyID", param);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delVyrobek(Vyrobky vyrobek) {
		Object[] param = { vyrobek.getId() };
		try {
			db.delete("vyrobky", "vyrobkyID", param);
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	@Override
	public void delSurovinyVyrobku(SurovinyVyrobku surVyr) {
		Object[] param = { surVyr.getId() };
		try {
			db.delete("surovinyvyrobku", "surovinyvyrobkuID", param);
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
	}
	@Override
	public void delSurovinyVyrobku(int idV, int idS) {
		Object[] param = {idV,idS};
		try {
			db.delete("surovinyvyrobku", "vyrobkyID = ? AND surovinyID", param);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	@Override
	public void delZamestnance(Zamestnanci zam) {
		Object[] param = { zam.getId() };
		Object[] param2 = { zam.getIdAdresy() };
		try {
			db.delete("zamestnanci", "zamestnanciID", param);
			db.delete("adresy", "adresyID", param2);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
