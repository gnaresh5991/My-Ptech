 

package veg_dtls;

public class Bill_dtls {

	public static  void calcBill()
	{
		float tamt=(Brinjal.cbk*Brinjal.price)+(Tomatos.ctk*Tomatos.price);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("\n\t\tWELCOME TO VEGTABLES STORE\n\n");
		System.out.println("Customer Name : "+Main.cname);
		//System.out.println(" Items purchased by You\n");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("ITEM NAME-\tQTY--\tPrice/KG\t--\tAMOUNT\n");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(" Brinjal --\t"+Brinjal.cbk+"--   Price :"+Brinjal.price+"/KG \t--Amount : ₹"+(Brinjal.cbk*Brinjal.price));
		System.out.println(" Tomatos --\t"+Tomatos.ctk+"--   Price :"+Tomatos.price+"/KG \t--Amount : ₹"+(Tomatos.ctk*Tomatos.price));
		System.out.println(" Potatos --\t"+Potato.cpk+"--   Price :"+Potato.price+"/KG \t--Amount : ₹"+(Potato.cpk*Potato.price));

		System.out.println("\n TOTAL AMOUNT OF BILL PAYBLE \t :₹"+tamt);
		System.out.println("\n---------------------------------------------------------------------------");
	}
}
