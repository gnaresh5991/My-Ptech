package com.product.service;

import java.util.ArrayList;

import com.product.Model.Electronics;

public class ServiceImpl {

	public static void displayAllSection() {
		
		ProductService service=new ProductService();
		ArrayList<Electronics> electronics=service.displayEleItes();
		for(Electronics e:electronics)
		{
			System.out.println(e.getPid()+"   "+e.getName()+"   "+e.getCost()+"   "+e.getQunat() );
		}
	}
}
