package basicprograms;

public class primeex {

	public static void main(String[] args)
	{
		int n=12,m=0;
		m=n/2;		
        if(n==0||n==1)
        {
        	System.out.println("not prime");
        }
        else
        {   
        	for(int i=2;i<m;i++)
        	{
        	  if(n%i==0)
        		  
        	   {
        		System.out.println("not prime");
        		break;
        	    }
        	  
        	  else
        	  
        		  System.out.println("prime");
        	      break;
        	  
        	}
        }	
        	
        	
	}

}
