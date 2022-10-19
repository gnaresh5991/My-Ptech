import java.util.Scanner;

public class Delimeter1 {
public static void main(String[] args) {
	
	Scanner st=new Scanner("i am from india");
	st=st.useDelimiter(" ");
//	String str="i am from india";
//	str=str.useDelimiter();
	while(st.hasNext())
	{
		System.out.println(st.next());
	}
}
}
