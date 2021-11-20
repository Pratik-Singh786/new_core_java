package array;

public class Commonelementsintwoarray {

	public static void main(String[] args)
	{
      int[] arr1= {2,3,4,3,1,7};
      int[] arr2= {2,7,4,1,5,6};
      for(int i=0;i<arr1.length;i++)
      {
    	  for(int j=0;j<arr2.length;j++)
    	  {
    		  if(arr1[i]==arr2[j])
    			  
    		  {
    			  System.out.println(arr1[i]);
    			  break;
    		  }
    			  
    	 }
      }
      
     }
    	  
      

	

}
