package Sorting;

public class Insertionsort {

	public static void main(String[] args)
	{  
		int a[]= {5,1,6,2,4,3}; 
		Insertionsort is=new Insertionsort();
		is.inserstionsorting(a);
		is.printinsertionsort(a);
	}
		
	  void  inserstionsorting(int a[])
	  {
		for(int i=1;i<a.length;i++)
		{
			
			int j=i;
			while(j>0 && a[j-1]>a[i])
			{
				a[j]=a[j-1];
				j=j-1;
				
			}
			a[j]=a[i];
		}
	  }
	  void printinsertionsort(int a[])
	  {
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);

	  }

}
