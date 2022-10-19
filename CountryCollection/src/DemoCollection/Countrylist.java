package DemoCollection;

import java.util.*;
import java.util.Map.Entry;

public class Countrylist {
	
	static ArrayList<String> al=new ArrayList<>();
	static int count=0;
	public static void main(String[] args)  {
		while(true) {
		Scanner s=new Scanner(System.in);
		boolean f=true;
		System.out.println("====Choose====");
		System.out.println(" 1.Add Country.\n 2.Exit & Give count.\n 3.Clear & Reset.");
		int choice=s.nextInt();s.nextLine();
		switch(choice)
		{
		case 1:	System.out.println("Enter country names : "); 
			while(f)
			{
				String cName=s.nextLine();
				if(cName.equalsIgnoreCase("end")) f=false;
				else {al.add(cName); count++;}
			}
			//System.out.println(count);
			break;
	
		case 2:
		Map<String,Integer> m= new HashMap<>();
		System.out.println("-------------------------");
		System.out.println("Country\t\tRepeated\n-------------------------");
		for(String s1:al)
		{
			if(m.containsKey(s1))
			{
				m.put(s1,m.get(s1)+1);
			}
			else
			{
				m.put(s1, 1);
			}
		}
		for(Map.Entry<String,Integer> v :m.entrySet())
		{
			System.out.println(v.getKey()+"\t\t"+v.getValue());
		}
		System.out.println("\nTotal countries entered : "+count);
		System.exit(0);	
		break;
		
		case 3:System.out.println("previous data Cleared\n");
				al.clear();			System.out.println("\tEnter country names : "); 
		while(f)
		{
			String cName=s.nextLine();
			if(cName.equalsIgnoreCase("end")) f=false;
			else {al.add(cName); count++;}
		}
		//System.out.println(count);
		break;
		default : System.out.println("Invalid Input..! Program Terminated Start Again..");

		}
		}

	}
}
