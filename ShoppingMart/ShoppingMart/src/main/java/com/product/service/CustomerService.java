package com.product.service;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.java.ConnectionTest.ConnectionFactory;
import com.product.Model.Cloth;
import com.product.Model.Electronics;
import com.product.dao.CustomerDao;

public class CustomerService implements CustomerDao 
{
	Scanner scanner=new Scanner(System.in);
String cusname=scanner.next();

	public float totalbillElectrnics() {
		float bill=0;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Called");
		ProductService service=new ProductService();
		ArrayList<Electronics> electronics=service.displayEleItes();
		System.out.println(electronics.size());
		float cost[]=new float[electronics.size()];
		String name[]=new String[electronics.size()];
		int prId[]=new int[electronics.size()];
		int i=0;
		for(Electronics e:electronics)
		{
			cost[i]=e.getCost();
			name[i]=e.getName();
			prId[i]=e.getPid();
//			System.out.println(e.getPid()+"   "+e.getName()+"   "+e.getCost()+"   "+e.getQunat() );
		i++;
		}
		
		
		for(int j=0;j<electronics.size();j++)
		{
			System.out.println(prId[j]+"   "+cost[j]+"   "+name[j]);
		}
		int choice,quantity;
		for(int j=0;j<electronics.size();j++)
		{
			System.out.println("Would you like to purcahse "+name[j]+"\n 1 for yes 2 for no ");
			choice=scanner.nextInt();
			if(choice==1)
			{
				System.out.println("How many ??");
				quantity=scanner.nextInt();
			bill=bill+cost[j]*quantity;
			}
		}
		
		try
		{
			
			Connection connection=ConnectionFactory.getConnection();
			Statement statement=connection.createStatement();
			statement.executeUpdate("insert into customer(`name`,`bille`) values('"+cusname+"','"+bill+"') ");
		}
		catch (Exception e) {

			System.out.println(e);
			
		}
		return bill;
	}
	
	
	
	
	public float totalbillCloth() {
		float bill=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Called");
		ProductService service=new ProductService();
		ArrayList<Cloth> cloth=service.buyCloItes();
		System.out.println(cloth.size());
		float cost[]=new float[cloth.size()];
		String name[]=new String[cloth.size()];
		int prId[]=new int[cloth.size()];
		int i=0;
		for(Cloth e:cloth)
		{
			cost[i]=e.getCost();
			name[i]=e.getName();
			prId[i]=e.getPid();
//			System.out.println(e.getPid()+"   "+e.getName()+"   "+e.getCost()+"   "+e.getQunat() );
		i++;
		}
		
		
		for(int j=0;j<cloth.size();j++)
		{
			System.out.println(prId[j]+"   "+cost[j]+"   "+name[j]);
		}
		int choice,quantity;
		for(int j=0;j<cloth.size();j++)
		{
			System.out.println("Would you like to purcahse "+name[j]+"\n 1 for yes 2 for no ");
			choice=scanner.nextInt();
			if(choice==1)
			{
				System.out.println("How many ??");
				quantity=scanner.nextInt();
			bill=bill+cost[j]*quantity;
			}
		}
		
		try
		{
			
			Connection connection=ConnectionFactory.getConnection();
			Statement statement=connection.createStatement();
			statement.executeUpdate("UPDATE `producttest`.`customer` SET `billclo` = '"+bill+"' WHERE (`name` = '"+cusname+"');");
		}
		catch (Exception e) {

			System.out.println(e);
			
		}
		return bill;
		
		
		
	}

}
