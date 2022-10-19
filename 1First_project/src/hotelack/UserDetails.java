package hotelack;

import java.util.Scanner;

public class UserDetails {

	Scanner sc=new Scanner(System.in);

	public void useraInput()
	{ 	
		String uname;
		int sad,scd,ht,ad=0,cd=0,rtp,fn,p,location,vu,b1=3000,b2=2500,b3=2000,b4=1800;
		System.out.println("enter your name ");uname=sc.nextLine();
		System.out.println("\tChoose your Location : \n\t1.HYDERABAD\n\t2.MUMBAI\n\t3.CHENNAI");location=sc.nextInt();
		switch(location) {
		case 1 : System.out.println("your trip location is: HYDERABAD");
		break;
		case 2 : System.out.println("your trip location is: MUMBAI");
		break;
		case 3 : System.out.println("your trip location is: CHENNAI ");
		break;
		default : System.out.println("Invalid input ..!");
		}
		System.out.println("Select VIEW from your room  :\n\t1.Garden view\n\t2.Mountain  view\n\t3.Lake view");vu=sc.nextInt();
		switch(vu) {
		case 1 : System.out.println("view  : Garden view");break;
		case 2 : System.out.println("view  : Mountain  view");break;
		case 3 : System.out.println("view  : Lake view");break;
		default : System.out.println(" No such views ..!");

		}
		System.out.println("How many members in the family : "); fn=sc.nextInt();
		for(int i=1;i<=fn;i++)
		{
			System.out.println("enter the age of "+i+" st Person"); p=sc.nextInt();
			if(p>10) ad++;else cd++;

		}
		System.out.println("\nno.of adults "+ad);
		System.out.println("no.of children "+cd);
		System.out.println(" Hotels available on your requirement ");

		System.out.println("--Please choose hotel--\n\n1.Hotel 5STAR \n\t1. Ac- ₹3000 \n\t2.NON Ac - ₹2500\n\n2.Hotel H2 3STAR\n\t1. Ac- ₹ ₹2000 \n\t2.NON Ac - ₹₹ ₹1800");
		ht=sc.nextInt();
		switch(ht)
		{
		case 1: System.out.println("welcome to Hotel 5STAR "+uname);
		System.out.println("Choose room tuype \n1.AC \n2.NON AC");rtp=sc.nextInt();
		if(rtp==1 )
		{  if(ad<=2 && cd<=2)
			{System.out.println("1 Ac room Allocated \t your Bill=₹"+b1);}
			else {
				sad=ad-2;b1+=sad*b1;
				System.out.println(1+sad+" Ac rooms allocat"
					+ "ed \t your Bill=₹"+b1);}
		}
		else if(rtp==2)
		{
			if(ad>=3 && cd>=3)
				{System.out.println("1 NON Ac room Allocated \t your Bill=₹₹"+b2);}
			else {
				sad=ad-2;b2+=sad*b2;
				System.out.println(1+sad+" NoN Ac rooms allocated \t your Bill=₹₹₹"+b2);}
		}
		else {System.out.println("invalid input..!");}
		break;

		case 2: System.out.println("welcome to Hotel 3STAR "+uname);
		System.out.println("Choose room tuype 1.AC \n2.NON AC");rtp=sc.nextInt();
		if(rtp==1 )
		{  if(ad<=2 && cd<=2)
			{System.out.println("1 Ac room Allocated \t your Bill=₹"+b3);}
			else {
				sad=ad-2;b3+=sad*b3;
				System.out.println(1+sad+" Ac rooms allocated \t your Bill=₹"+b3);}
		}
		else if(rtp==2)
		{
			if(ad>=3 && cd>=3)
				{System.out.println("1 NON Ac room Allocated \t your Bill=₹"+b4);}
			else {
				sad=ad-2;b4+=sad*b4;
				System.out.println(1+sad+" NON Ac rooms allocated \t your Bill=₹"+b4);}
		}
		else {System.out.println("invalid input..!");}													
		break;
		default : System.out.println("Invalid input ..!");
		}


	}
	public static void main(String[] args) {
		UserDetails ud=new UserDetails();
		ud.useraInput();
	}
}
