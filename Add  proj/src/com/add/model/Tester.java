package com.add.model;

import java.util.Scanner;

public class Tester {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the values  ");
		ADD add =new ADD();  
		add.setId(s.nextInt());
		add.setA(s.nextInt());
		add.setB(s.nextInt());
		AddService as = new AddService();
		as.add(add);
		s.close();
	
	}

}
