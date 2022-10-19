package com.product.Tester;

import com.product.service.CustomerService;
import com.product.service.ServiceImpl;

public class Tester {

	public static void main(String[] args) {

		float finalbill=0;
		CustomerService customerService=new CustomerService();
		 finalbill=customerService.totalbillElectrnics();
		System.out.println("Electrnics Bill="+finalbill);
		finalbill=customerService.totalbillCloth();
		System.out.println("cloths Bill="+finalbill);
		
		
	}

}
