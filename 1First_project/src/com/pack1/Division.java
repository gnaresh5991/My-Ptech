package com.pack1;

import java.util.Scanner;

public class Division {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number ");
//		int a=sc.nextInt();
		int c=0,c1=0,c2=0;

		 for(int i=20;i<40;i++)
		 {
			 if(i%3==0) { System.out.print(i+" ");
			// System.out.println(" divisible by 3 is"+i);

			 c++;}
			 
			 if(i%4==0) {System.out.print(i+" ");
			// System.out.println(" divisible by 4 is"+i);

			 c1++;}
			 
			 if(i%5==0) {System.out.print(i+" ");
			// System.out.println(" divisible by 5 is"+i);

			 c2++;}
			 
		 }
		 System.out.println();
		 System.out.println(" divisible by 3 is"+c+" times");
		 System.out.println();

		 System.out.println(" divisible by 4 is"+c1+" times");
		 System.out.println();

		 System.out.println(" divisible by 5 is"+c2+" times");

	}
}
