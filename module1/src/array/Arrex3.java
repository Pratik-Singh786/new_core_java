package array;

public class Arrex3 
{
    static void min(int []arr)
    {
    	int min=arr[0];
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]<min)
    		{
    			min=arr[i];
    		}
    	}
    }
    
    public static void main(String...args)
    {
    	int []a= {32,2,1,3};
    	min(a);
    }


}
