package array;

public class Thirdmaxelementarray {

	public static void main(String[] args)
	{
	    int []a= {11,34,54,67,89,23,12};
	    int temp;
	     for(int i=0;i<a.length;i++)
	     {  
	    
	    	 for(int j=0;j<a.length-1-i;j++)
	    	 {
	    		 if(a[j]>a[j+1])
	    		 {
	    			 temp=a[j];
	    			 a[j]=a[j+1];
	    			 a[j+1]=temp;
	    		 }
	    		 
	    	 }
	  
	     }
	    for(int i=0;i<a.length;i++)
	    {
	    	System.out.print(a[4]+" ");
	    	break;
	    	
	    	 
	    }
	    
	}

}
