package com.add.model;

import com.add.DAO.Add_DAO;

public class AddService implements Add_DAO {

	@Override
	public void add(ADD a) {
		
		System.out.println(a.getA()+a.getB());
	}

}
