package array;
import java.util.HashSet;

public class Commonelementsinarray1 {

	public static void main(String[] args) 
	{
	    HashSet hs=new HashSet();
		int[] arr1= {2,3,4,3,1,7};
	      int[] arr2= {2,7,4,1,5,6};
	      for(int i:arr1)
	      {
	    	 for(int j:arr2)
	    	 {
	    		 if(arr1[i]==arr2[j])
	    		 {
	    			 hs.add(arr1[i]);
	    			 break;
	    			 
	    		 }
	    	 }
	      }

	}

}
