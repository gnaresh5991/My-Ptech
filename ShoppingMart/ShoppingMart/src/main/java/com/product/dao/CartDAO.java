package com.product.dao;

import java.util.ArrayList;

import com.product.Model.Cloth;
import com.product.Model.Electronics;

public interface CartDAO {

	public void buyEleItes(Electronics electronics);
	public ArrayList<Electronics> displayEleItes();
	public ArrayList<Cloth> buyCloItes();
}
