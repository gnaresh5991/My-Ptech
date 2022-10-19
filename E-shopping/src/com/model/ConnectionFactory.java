package com.model;

import java.sql.*;

public class ConnectionFactory
{	static Connection con=null;
	public static Connection getConnection()
	{	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shopping","root","root");
			return con;
			}
			catch (Exception e)
			{
			System.out.println(e);
			}
		return con;
	}
}
