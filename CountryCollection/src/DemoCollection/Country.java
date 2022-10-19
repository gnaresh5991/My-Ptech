package DemoCollection;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class Country
{
	String j;
	int choice,counter=0;
	public void count()
	{
		System.out.println("Press...\n1.To add different country names\r\n"+ "\r\n"+ "2. Exit and give the count.\r\n"+ "\r\n"+ "3. clear and reset.");
		Scanner sc=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("--------------------------------------------------\nEnter your Choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter the Country Name:");
			j=sc.nextLine();
			while(!(j.equalsIgnoreCase("end")))
			{
				counter++;
				al.add(j);
				j=sc.nextLine();
			}
			al.remove(0);
			System.out.println("Before sorting"+al);
			Collections.sort(al);
			System.out.println("after sortig"+al);
		}
		case 2:
		{
			System.out.println("The total number of countries added till now are "+counter);
			Map<String, Integer> duplicates = new HashMap<String, Integer>();
			for (String str : al)
			{
				if (duplicates.containsKey(str))
				{
					duplicates.put(str, duplicates.get(str) + 1);
				}
				else
				{
					duplicates.put(str, 1);
				}
			}
			for (Map.Entry<String, Integer> entry : duplicates.entrySet())
			{
				System.out.println(entry.getKey() + " = " + entry.getValue());
			}
			break;
		}
		case 3:
		{
			al.removeAll(al);
			count();
			break;
		}
		default:
		{
			System.out.println("Enter the correct choice!");
		}
		}
	}
	public static void main(String[] args)
	{
		new Country().count();
	}
}
