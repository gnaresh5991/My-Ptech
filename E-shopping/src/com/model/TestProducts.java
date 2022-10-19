package com.model;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

import com.Productservice.ServiceSection;

public class TestProducts {
	static String name;
	static int pcode,q;
	static boolean k=true;
	
	public static void productInfo()
	{	
		while(k) {
		Scanner s= new Scanner(System.in);
		System.out.println("==choose the section=="); 
		System.out.println("\n1.electronics\n2.furniture\n3.kitchen\n4.cloths\n");
		ServiceSection ss= new ServiceSection();
		int choice =s.nextInt();
		System.out.println("prodctcode\tName\tprice\tqty\n");

		switch(choice)
		{
		case 1: System.out.println("--electronics--");
			ss.eleItems();break;
		case 2: System.out.println("--furniture--");
		ss.furnitureItems();break;
		case 3:System.out.println("--kitchen--");
		ss.kitchenItems();break;
		case 4: System.out.println("--cloths--");
		ss.clothsItems();break;		
		default : System.out.println("Invalid input..!");
		}
		System.out.println("if you want to exit press '0' or else any key");q=s.nextInt();
		if(q==0) k=false; else k=true;
		
	}
		}
	public static void calcbill()
	{
	try {
		ServiceSection ss= new ServiceSection();
	

		System.out.println("----------Bajaj Store BILL----------");
		System.out.println("\nname "+name);
		System.out.println("\nElectronics\t---"+ss.A);
		System.out.println("Furniture\t---"+ss.B);
		
		System.out.println("kitchen\t\t---"+ss.C);
		System.out.println("Cloths\t\t---"+ss.D);
		System.out.println("\nTotal Bill=  ₹"+ss.tbill);
		System.out.println("--------------------------------------");
		Connection con=com.model.ConnectionFactory.getConnection();
		Statement stm=con.createStatement();
		int z=stm.executeUpdate("INSERT INTO `shopping`.`customers` ( `cname`, `elec`, `furniture`, `kitchen`, `cloths`, `total bill`) VALUES ( '"+name+"', '"+ss.A+"', '"+ss.B+"', '"+ss.C+"', '"+ss.D+"', '"+ss.tbill+"')");
			if(z>0)	System.out.println(" Customer Detais Updated in Database ...!");
	}
	catch (Exception x)
	{
		System.out.println(x);
	}
	}
	public static void main(String[] args)
	{	
		Scanner s= new Scanner(System.in);
		System.out.println("--welcome to Bajaj Store--");
	System.out.println("please enter your name");name =s.next();
		productInfo();	
		calcbill();
		s.close();
	}
}
