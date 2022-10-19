package com.customer;

import java.util.Scanner;

public class Shopping {
	static float  bill=0;
	static int A,B,C,D,E;
	static String un;
	static float bgt=0;
	static boolean wish=true;

	public static void startShopping()
	{
		while(wish) {
			Scanner s=new Scanner(System.in);
			System.out.println("------welcome Ikea super mart-----------");

			int choice;
			System.out.println("please Enter your name"); un=s.next();
			System.out.println("please enter your cash budget to shop"); bgt=s.nextFloat();

			System.out.println("==choose the section=="); 
			System.out.println("\n1.electronics\n2.Bath\n3.kitchen\n4.Cloths\n");
			choice=s.nextInt();
			if(bgt>=10000 && choice==1)
			{

				int tv=10000,phone=10000;
				System.out.println("Items under Electonis Section");
				System.out.println("Item id\t\tDescription\t\tCost\t\tAvl.Quantity\n");
				System.out.println("101\t\tLG TV\t\t₹10000\t\t5");
				System.out.println("102\t\tSmartPhone\t\t₹10000\t\t5");
				System.out.println("enter '1' for tv and '2' for mobile");int c=s.nextInt();
				if(c==1)
				{
					System.out.println(" how mny yo want");int pd=s.nextInt();A=pd*tv;
					bill+=A;
				}
				else {
					System.out.println(" how mny yo want");int pd=s.nextInt();A=pd*phone;
					bill+=A;

				}
				
			}

			else if(bgt>=100 && choice==2)
			{
				int soap=40,oil=60;
				System.out.println("Items under Soaps & oils Section");
				System.out.println("Item id\t\tDescription\t\tCost\t\tAvl.Quantity\n");
				System.out.println("201\t\tDettol\t\t₹40/soap\t\t50");
				System.out.println("202\t\tNavaratna oil\t\t₹60\t\t40");
				System.out.println("enter '1' for Soaps and '2' for oils");int c1=s.nextInt();

				if(c1==1)
				{		 
					System.out.println(" how mny yo want");int pd=s.nextInt();B=pd*soap;
					bill+=B;
				}
				else {
					System.out.println(" how mny yo want");int pd=s.nextInt();B=pd*oil;
					bill+=B;

				}
				
			}

			else if(bgt>=100 && choice==3)

			{
				int tomato=40,brinjal=60;
				System.out.println("Items under kitchen Section");
				System.out.println("Item id\t\tDescription\t\tCost\t\tAvl.Quantity\n");
				System.out.println("301\t\ttomato\t\t₹40\t\t50");
				System.out.println("302\t\tbrinjal \t\t₹60\t\t40");
				System.out.println("enter '1' for tomato and '2' for brinjal");int c3=s.nextInt();

				if(c3==1)
				{
					System.out.println(" how mny yo want");int pd=s.nextInt();C=pd*tomato;
					bill+=C;

				}
				else {
					System.out.println(" how mny yo want");int pd=s.nextInt();C=pd*brinjal;
					bill+=C;

				}
			
			}

			else if(bgt>=1000 && choice==4)
			{

				int shirt=700,pant=1000;
				System.out.println("Items under cloths Section");
				System.out.println("Item id\t\tDescription\t\tCost\t\tAvl.Quantity\n");
				System.out.println("301\t\tshirt\t\t₹700\t\t50");
				System.out.println("302\t\tbrinjal \t\t₹1000\t\t40");
				System.out.println("enter '1' for shirt and '2' for pant");int c4=s.nextInt();


				if(c4==1)
				{
					System.out.println(" how mny yo want");int pd=s.nextInt();D=pd*shirt;
					bill+=D;

				}
				else {
					System.out.println(" how mny yo want");int pd=s.nextInt();D=pd*pant;
					bill+=D;

				}
			}
			else {System.out.println(" Your budget low Start again ");}
			System.out.println("Do you want to exit press '3' or else any key");int k=s.nextInt();
			if(k==3) { wish =false;} else {wish=true;}}

	}


	public static void billing() {

		System.out.println("----IKEA BILL-----");
		System.out.println("\nname "+un);
		System.out.println("\nElectronics---"+A);
		System.out.println("Soaps & oils---"+B);
		System.out.println("kitchen---"+C);
		System.out.println("Cloths---"+D);
		System.out.println("Total Bill=₹"+bill);


	}
	public static void main(String[] args) {
		startShopping();
		billing();
	}
}
