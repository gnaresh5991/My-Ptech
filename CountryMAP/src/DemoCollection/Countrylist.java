package DemoCollection;

import java.util.*;

public class Countrylist {

	public static void main(String[] args)  {

		Scanner s=new Scanner(System.in);
		boolean f=true;
		ArrayList<String> al=new ArrayList<>();
		System.out.println("====Choose====");
		System.out.println(" 1.Add Country.\n 2.Exit & Give count.\n 3.Clear & Reset.");
		int count=0, choice=s.nextInt();s.nextLine();
		switch(choice)
		{
		case 1:
			while(f)
			{
				System.out.println("Enter country name : "); 
				String cName=s.nextLine();
				if(cName.equalsIgnoreCase("end")) f=false;
				else {al.add(cName); count++;}
			}
			System.out.println(count);
			break;
	
		case 2:
		System.out.println(count+" countries  In the List ");
		System.exit(0);	
		break;
		
		case 3:System.out.println("previous data Cleared \n Enter agin :");
				al.clear();
		while(f)
		{
			System.out.println("Enter country name : "); 
			String cName=s.nextLine();
			if(cName.equalsIgnoreCase("end")) f=false;
			else {al.add(cName); count++;}
		}
		System.out.println(count);

		break;
		default : System.out.println("Invalid Input..! Program Terminated Start Again..");

		}

	}
}
