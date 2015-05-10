package org.techsoft.sklad.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	protected Connection con = null;
	protected Query query;

	/**
	 * Pozn.: Pokud bychom wrapper používali ve webové aplikaci místo v
	 * desktopové, nebyl by tento pøístup vhodný kvùli velkému poètu aktivních
	 * spojení s databází. V tomto pøípadì bychom se mìli pøipojit v každé
	 * metodì znovu a pomocí bloku TWR, jak to znáte z pøedchozích tutoriálù.
	 * 
	 * @param db
	 * @param userName
	 * @param password
	 * @throws SQLException
	 */
	public Database(String ipAddress, String db, String userName, String password) {
		try {
			con = DriverManager.getConnection("jdbc:mysql://"+ipAddress +"/"
					+ db, userName, password);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		if (con != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
	}

	/**
	 * 
	 * @param query
	 * @param params
	 * @return
	 * @throws SQLException
	 */
	private int query(String query, Object[] params) throws SQLException {
		PreparedStatement ps = con.prepareStatement(query);
		if (params != null) {
			int index = 1;
			for (Object param : params) {
				ps.setObject(index, param);
				index++;
			}
		}
		return ps.executeUpdate();
	}

	/**
	 * Vymaže údaje z databázové tabulky
	 * 
	 * @param table
	 * @param requirement
	 * @param param
	 * @return
	 * @throws SQLException
	 */
	public int delete(String table, String requirement, Object[] param)
			throws SQLException {
		query = new Query();
		query.delete(table).where(requirement);
		//System.out.println(query.getQuery());
		return query(query.getQuery(), param);
	}

	/**
	 * Uloží do databázové tabulky 1 subjekt
	 * 
	 * @param table
	 *            String
	 * @param params
	 *            Object[]
	 * @return int (count of insert rows)
	 * @throws java.sql.SQLException
	 */
	public int insert(String table, Object[] params, String[] columns) throws SQLException {
		query = new Query();
		if (columns == null)
			query.insert(table).values(params);
		else
			query.insert(table, columns).values(params);
		//System.out.println(query.getQuery());
		return query(query.getQuery(), params);
	}

	/**
	 * Aktualizuje data uložená v databázové tabulce
	 * 
	 * @param table
	 * @param columns
	 * @param requirement
	 * @param params
	 * @return
	 * @throws SQLException
	 */
	public int update(String table, String[] columns, String requirement,
			Object[] params) throws SQLException {
		query = new Query();
		query.update(table).set(columns).where(requirement);
		System.out.println(query.getQuery());
		return query(query.getQuery(), params);

	}

	/**
	 * Vrací údaje z databázové tabulky
	 * 
	 * @param table
	 * @param columns
	 * @param requirement
	 * @param params
	 * @return
	 * @throws SQLException
	 */
	public ResultSet select(String table, String[] columns, String requirement,
			Object[] params) throws SQLException {
		query = new Query();
		query.select(columns).from(table).where(requirement);

		PreparedStatement ps = con.prepareStatement(query.getQuery());
		//System.out.println(query.getQuery());
		if (params != null) {
			int index = 1;
			for (Object param : params) {
				ps.setObject(index, param);
				index++;
			}
		}
		ResultSet rs = ps.executeQuery();
		return rs;
	}

	/**
	 * Vrací údaje z databázové tabulky (bez WHERE)
	 * 
	 * @param table
	 * @param columns
	 * @param params
	 * @return
	 * @throws SQLException
	 */
	public ResultSet select(String table, String[] columns, Object[] params)
			throws SQLException {
		return select(table, columns, "", params);
	}
	
	public int lastID() throws SQLException{
		String query = "SELECT LAST_INSERT_ID()";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		int lastId = rs.getInt(1);
		return lastId;
	}
}
