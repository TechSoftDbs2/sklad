package testDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class testMySQL {
	public static void main(String[] args) {
		Connection con = null;
		
		try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		//con = DriverManager.getConnection("jdbc:mysql://95.143.143.9:3306/dbs" + "user=dbs&password=dbs");
		//con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbs" + "user=root&password=''")
	    con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbs", "root", "");
	//	con = DriverManager.getConnection("jdbc:mysql://95.143.143.9:3306/pkg/dbs", "dbs", "dbs");
		
	    }catch (ClassNotFoundException e){
	    	e.printStackTrace();
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    if (con != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
	    //vkládání do DB insert
	    try {
			Statement s = con.createStatement();
			s.executeUpdate("CREATE TABLE Persons(PersonID int,"
							 +"LastName varchar(255),"
							 +"FirstName varchar(255),"
							 +" Address varchar(255),"
							 +" City varchar(255)"
							 +"	)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
