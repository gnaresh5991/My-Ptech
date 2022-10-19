package com.ja.Model;
import java.sql.*;
import java.util.Scanner;

public class InsertData {
	public static void insertDb()
	{
		Scanner s=new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver found");
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/students1111","root","root");
			Statement stm=con.createStatement();
			int uid,ujv,udb,uds;
			String uname;
			System.out.println("Enter ID");uid=s.nextInt();
			System.out.println("Enter name");uname=s.next();
			System.out.println("enter java marks");ujv=s.nextInt();
			System.out.println("enter db marks");udb=s.nextInt();
			System.out.println("enter ds marks");uds=s.nextInt();
			
			stm.executeUpdate("INSERT INTO `students1111`.`topper` (`id`, `name`, `java`, `db`, `ds`) VALUES ('"+uid+"', '"+uname+"', '"+ujv+"', '"+udb+"', '"+uds+"')");
			System.out.println("data inserted success  !");
		}
		catch (Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		insertDb();
	}

}
