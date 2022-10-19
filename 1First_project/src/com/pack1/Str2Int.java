package com.pack1;

import java.util.Scanner;

public class Str2Int {

	public static void main(String[] args) {
		
		String a,b;
		Scanner  sc	 = new Scanner(System.in);
		System.out.println("enter 2 no.s  :");
		a=sc.next();
		b=sc.next();
		int c,d;
		c=Integer.parseInt(a);
		d=Integer.parseInt(b);
		System.out.println("String "+a+b);
		
		System.out.println("integer "+(c+d));
	}
	
}
