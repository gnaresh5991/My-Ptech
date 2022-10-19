package com.Employee.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class EmpDBconnection 
{
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<>();
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Driver found");
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/students1111","root","root");
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery("select * from employee");
			while(rs.next())
			{
				Employee e=new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setAdd(rs.getString(3));
				e.setZip(rs.getInt(4));
				al.add(e);
			}
			
			for(Employee e : al)
			{
				System.out.println(e.getId()+" "+e.getName()+" "+e.getAdd()+" "+e.getZip());
			}
		}
		catch (Exception e)
		{
			
		}
	}

}
