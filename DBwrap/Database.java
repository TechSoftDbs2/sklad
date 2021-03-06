package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
	protected Connection con = null;
	protected Query query;
	
	/**
	 * Pozn.: Pokud bychom wrapper pou��vali ve webov� aplikaci m�sto v desktopov�, nebyl by tento p��stup vhodn� kv�li velk�mu po�tu aktivn�ch spojen� s datab�z�. V tomto p��pad� bychom se m�li p�ipojit v ka�d� metod� znovu a pomoc� bloku TWR, jak to zn�te z p�edchoz�ch tutori�l�.
	 * @param db
	 * @param userName
	 * @param password
	 * @throws SQLException
	 */
	public Database(String db, String userName, String password) throws SQLException {
		con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pkg/"+db, userName, password);
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
	private int query(String query, Object[] params) throws SQLException{
		PreparedStatement ps = con.prepareStatement(query);
        if (params != null){
          int index = 1;
          for(Object param : params){
            ps.setObject(index, param);
           index++;
          }
        }
        return ps.executeUpdate();
	}
	/**
     * Vyma�e �daje z datab�zov� tabulky
     * @param table
     * @param requirement
     * @param param
     * @return
     * @throws SQLException
     */
    public int delete(String table, String requirement, Object[] param) throws SQLException{
        query = new Query();
        query.delete(table)
             .where(requirement);
        return query(query.getQuery(), param);
    }
    /**
     * Ulo�� do datab�zov� tabulky 1 subjekt
     * @param table
     * @param params
     * @return
     * @throws java.sql.SQLException
     */
    public int insert(String table, Object[] params) throws SQLException{
        query = new Query();
        query.insert(table)
             .values(params);
        return query(query.getQuery(), params);
    }
    /**
     * Aktualizuje data ulo�en� v datab�zov� tabulce
     * @param table
     * @param columns
     * @param requirement
     * @param params
     * @return
     * @throws SQLException
     */
    public int update(String table, String[] columns, String requirement, Object[] params) throws SQLException{
    	query = new Query();
    	query.update(table)
    		 .set(columns)
    		 .where(requirement);
    	return query(query.getQuery(), params);
    		 
    }
    
    /**
     * Vrac� �daje z datab�zov� tabulky
     * @param table
     * @param columns
     * @param requirement
     * @param params
     * @return
     * @throws SQLException
     */
    public ResultSet select(String table, String[] columns, String requirement, Object[] params) throws SQLException{
    	query = new Query();
    	query.select(columns).from(table).where(requirement);
    	
    	PreparedStatement ps = con.prepareStatement(query.getQuery());
    	if (params != null){
            int index = 1;
            for(Object param : params){
              ps.setObject(index, param);
             index++;
            }
    	}
    	ResultSet rs = ps.executeQuery();
    	return rs;
    }
    /**
     * Vrac� �daje z datab�zov� tabulky (bez WHERE)
     * @param table
     * @param columns
     * @param params
     * @return
     * @throws SQLException
     */
    public ResultSet select(String table, String[] columns, Object[] params) throws SQLException{
    	return select(table, columns, "", params);
    }
}
