package com.Productservice;

import java.sql.*;
import java.util.*;

import com.model.ProductcsDAO;



public class ServiceSection implements ProductcsDAO {
	public static int A,B,C,D,tbill=0;
	Scanner sc=new Scanner(System.in);
	public  void eleItems()
	{
		try{
			Connection con=com.model.ConnectionFactory.getConnection();

			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from electronics");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			}
			System.out.println("==choose your product code==");int ch=sc.nextInt();
			int qty=0;
			switch(ch)
			{			
			case 101: System.out.println("enter Quantity you want"); qty=sc.nextInt();
			A=qty*15000;tbill+=A;break;
			case 102: System.out.println("enter Quantity you want");  qty=sc.nextInt();
			A=qty*5000;tbill+=A;break;
			default : System.out.println("Invalid input..!");

			}
		}
		catch (Exception x)
		{
			System.out.println(x);
		}
		
	}
	public  void furnitureItems()
	{
		try{
			Connection con=com.model.ConnectionFactory.getConnection();

			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from furniture");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			}
			System.out.println("==choose your product code==");int ch=sc.nextInt();
			int qty=0;
			switch(ch)
			{			
			case 201: System.out.println("enter Quantity you want"); qty=sc.nextInt();
			B=qty*1000;tbill+=B;break;
			case 202: System.out.println("enter Quantity you want");  qty=sc.nextInt();
			B=qty*5000;tbill+=B;break;
			default : System.out.println("Invalid input..!");

			}
		}
		catch (Exception x)
		{
			System.out.println(x);
		}
}
	
	public  void kitchenItems()
	{
		try{
			Connection con=com.model.ConnectionFactory.getConnection();

			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from kitchen");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			}
			System.out.println("==choose your product code==");int ch=sc.nextInt();
			int qty=0;
			switch(ch)
			{			
			case 301: System.out.println("enter Quantity you want"); qty=sc.nextInt();
			C=qty*3000;tbill+=C;break;
			case 302: System.out.println("enter Quantity you want");  qty=sc.nextInt();
			C=qty*2000;tbill+=C;break;
			default : System.out.println("Invalid input..!");

			}
		}
		catch (Exception x)
		{
			System.out.println(x);
		}
}
	public  void clothsItems()
	{
		try{
			Connection con=com.model.ConnectionFactory.getConnection();

			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from cloths");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			}
			System.out.println("==choose your product code==");int ch=sc.nextInt();
			int qty=0;
			switch(ch)
			{			
			case 401: System.out.println("enter Quantity you want"); qty=sc.nextInt();
			D=qty*1000;tbill+=D;break;
			case 402: System.out.println("enter Quantity you want");  qty=sc.nextInt();
			D=qty*2000;tbill+=D;break;
			default : System.out.println("Invalid input..!");

			}
		}
		catch (Exception x)
		{
			System.out.println(x);
		}
		
	}
	
}
