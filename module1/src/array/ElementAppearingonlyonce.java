package array;

public class ElementAppearingonlyonce {

	public static void main(String[] args) 
	{
		int []a= {5,3,2,5,3,4,4};
		int res= a[0];
		int count=0;
		for(int i=1;i<a.length;i++)
		{
			res=res^a[i];
		
		}
		System.out.println(res);
	}

}
