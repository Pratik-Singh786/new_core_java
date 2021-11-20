package basicprograms;

public class sortingarr {

	public static void main(String[] args) 
	{
		int[]x= {1,2,3,4,5,6,7,8,9,10};
		int temp;
		for(int i=0;i<x.length;i++)
		{
			for(int j=i;i<x.length-1;i++)
			{
				if (x[j]>x[i])
				{
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
					
					
				}
				
			}
		}
		for(int i=0 ;i<x.length;i++)
		{
			System.out.println(x[i]);
		}

	}

}
