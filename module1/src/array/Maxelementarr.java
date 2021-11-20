package array;

public class Maxelementarr {

	public static void main(String[] args) 
	{
		int []a=new int[]{12,34,56,78};
		int max=a[0];
	    for(int i=1;i<a.length;i++)
	    {
	    	if(a[i]>max);
	    	{
	    	max=a[i];
	    	
	    	}
	    	
	    }
	    System.out.println(max);
	    
       
	}

}
