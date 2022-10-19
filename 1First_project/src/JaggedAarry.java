
public class JaggedAarry {

	public static void main(String[] args) {
		
		Integer a1[]= {3,8,6};
		Integer a2[]= {1,2,3,4,5};
		Integer a3[]= {9,8,6,8};
		Integer a[][]= {a1,a2,a3};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
