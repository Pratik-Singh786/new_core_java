package array;

public class Minelementarr {

	public static void main(String[] args) 
	{
		int[]a=new int[] {10,2,3,4};
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			 min=a[i];
		
		}
		System.out.println(min);

	}

}
