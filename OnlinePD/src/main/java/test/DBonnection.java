 package test;

import java.io.Serializable;
import java.sql.*;

public class DBonnection implements Serializable{

	private static Connection con =null;
	private  DBonnection() {}
	public static Connection getCon() {
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/springdb","root","root");
			return con;

		}

		catch (Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
}

