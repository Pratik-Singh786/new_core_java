package array;

public class FirstDuplicateElement {

	public static void main(String[] args)
	{
		int a[]= {6,5,3,2,5,1,2,4};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
	      for(int j=i+1;j<a.length;j++)
	      {
	    	  if(a[i]==a[j] && i!=j)
	    	  {
	    		  System.out.print(" "+a[j]);
	    		  temp=temp+1;
	    		  break;
	    	  }
	    	  
	      }
	      if(temp>0)
	    	  break;
	     
		}

	}

}
