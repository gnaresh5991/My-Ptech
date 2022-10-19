package bike_Org;

import java.util.*;

public class Factory {
	
	ArrayList al=new ArrayList<>();
	
	public Object order(Integer b)
	{	
		for(int i=0;i<b;i++)
		{	Bikes ob=new Bikes("bike"+i);
			al.add(ob.name);
		}
		System.out.println(al.size());
		return al;
	}
	
}
