package com.pack1;

public class Addition {

	public int add( int a,int b) {
		
		int c=a+b;
		return c;
		
	}
	public static void main(String[] args) {
		
		Addition ad=new Addition();
		System.out.println(ad.add(5,10));
		
	}
}
