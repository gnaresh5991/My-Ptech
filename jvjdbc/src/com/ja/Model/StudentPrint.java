package com.ja.Model;
import java.sql.*;
public class StudentPrint {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver found");
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/students1111","root","root");
	System.out.println("connection success");
	}
	catch (Exception e)
	{
		System.out.println(e);
		e.printStackTrace();
	}
}
}
