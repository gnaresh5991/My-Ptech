package com.product.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.java.ConnectionTest.ConnectionFactory;
import com.product.Model.Cloth;
import com.product.Model.Electronics;
import com.product.dao.CartDAO;

public class ProductService implements CartDAO
{

	public  ArrayList<Electronics> displayEleItes() {
		ArrayList<Electronics> list=new ArrayList<Electronics>();	
		try
		{
		Connection con=ConnectionFactory.getConnection();
		Statement statement=con.createStatement();
		ResultSet set=statement.executeQuery("SELECT * FROM electronics");

		
		while(set.next())
		{
		
			Electronics electronics=new Electronics();
			electronics.setPid(set.getInt(2));
			electronics.setName(set.getString(3));
			electronics.setCost(set.getFloat(5));
			electronics.setQunat(set.getInt(6));
			list.add(electronics);
				
			
		}
			
		return list;
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return list;
		
		
		
	}
	public void buyEleItes(Electronics electronics) {
		
		try
		{
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

	

	public ArrayList<Cloth> buyCloItes() {
		ArrayList<Cloth> list=new ArrayList<Cloth>();	
		try
		{
		Connection con=ConnectionFactory.getConnection();
		Statement statement=con.createStatement();
		ResultSet set=statement.executeQuery("SELECT * FROM cloth");

		
		while(set.next())
		{
		
			Cloth electronics=new Cloth();
			electronics.setPid(set.getInt(2));
			electronics.setName(set.getString(3));
			electronics.setCost(set.getFloat(5));
			electronics.setQunat(set.getInt(6));
			list.add(electronics);
				
			
		}
			
		return list;
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return list;
		
		
	}

	
}
