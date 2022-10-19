package com.pack1;

import java.util.Scanner;

public class Arr1 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= new int[5];
		System.out.println("Enter Elements ");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("retriving");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
