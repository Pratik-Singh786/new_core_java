package array;

public class DeletingAnElementAtSpecficpos {

	public static void main(String[] args) 
	{
		int[] a= {90,80,60,30,40,20};
		int element=30;
		for(int i=0;i<a.length;i++)
		{
			if(element==a[i])
			{
				for(int j=i;j<a.length-1;j++)
				{
					a[j]=a[j+1];
				}
				
			}
		}
		for(int i=0;i<a.length-1;i++)
		System.out.println(" "+a[i]);

	}

}
