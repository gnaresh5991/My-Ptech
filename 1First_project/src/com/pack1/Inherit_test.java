package com.pack1;


class Yamaha{
	
	public void twoWheeler()
	{
		System.out.println("we have 2 wheelers");
	}
}
class Honda extends Yamaha {
	 public void FourWheelers() {
		 System.out.println(" we have 4 wheelers");
	 }
}
class Suzuki extends Honda{
	public void sixWheelers()
	{
		System.out.println("we have 6 Wheelers");
	}
}

public class Inherit_test {

public static void main(String[] args) {
	Suzuki sz=new Suzuki();
	sz.twoWheeler();
	sz.FourWheelers();
	sz.sixWheelers();
}	
}
