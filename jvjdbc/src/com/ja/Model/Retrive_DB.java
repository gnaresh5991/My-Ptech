package com.ja.Model;

import java.sql.*;


import com.mysql.cj.xdevapi.Statement;

public class Retrive_DB {

	public static void main(String[] args) {
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Driver found");
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/students1111","root","root");
			java.sql.Statement statement=con.createStatement();
			ResultSet rs=statement.executeQuery("select * from topper");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
			}
			
		}
		catch (Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
