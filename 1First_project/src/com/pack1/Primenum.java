package com.pack1;

import java.util.Scanner;

public class Primenum 
{
	public void cheakPrime()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range from :");
		int n1=sc.nextInt(),n2,c=0,fg;
		System.out.println("Enter range to :");
		n2=sc.nextInt();

		for(int i=n1;i<=n2;i++)
		{ 	
			fg=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0) { fg++;}
			}
			if(fg==2) { System.out.print(i+" "); c++;	}
		}
		System.out.println();
		System.out.println(c+" prime no.s ");
	}
	public static void main(String[] args) {
		new Primenum().cheakPrime();
	}
}
