package array;

public class CountTheFrequencyOfEle {

	public static void main(String[] args)
	{
	  int a[]= {1,2,2,3,4,2,5};
	  int count=0;
	  int b[]=new int [a.length];
	  for(int i=0;i<a.length;i++)
	  {
		  for(int j=i+1;j<a.length;j++)
		  {
			 if( a[i]==a[j])
			 {
				 System.out.print(" "+a[i]);
				 count++;
				 
			 }
		  }
			  
			  
	  }
	  
	  System.out.print(" :"+count);
	  

	}

}
