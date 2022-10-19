package com.pack1;

import java.util.Scanner;

public class Test_casting 
{
	public float addMethod()
	{
		float a,b,c;
		
		Scanner  sc	 = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		a =sc.nextInt();
		b= sc.nextInt();
		c=a+b;
		return (int) c;

	}
	public static void main(String[] args) {

		Test_casting t=new Test_casting();
		System.out.println(t.addMethod());
	}

}
