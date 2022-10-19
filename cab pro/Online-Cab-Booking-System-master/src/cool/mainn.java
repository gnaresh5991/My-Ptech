package cool;

import java.util.*;

public class mainn {
	public static void main(String[] args) {
		
	

		model model=new model();
		model.setId(1);
		model.setUname("naresh");
		List<model> mdc=new ArrayList<>();
		mdc.add(model);

		for(model x : mdc)
		{
			System.out.println(x.getUname());
		}



	}
}
