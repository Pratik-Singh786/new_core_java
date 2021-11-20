package array;
//passing anonymous  array 
public class Arrex4 
{
   public static void printarray(int arr[])
    {
    	for(int i=0;i<arr.length;i++)
    		System.out.println(arr[i]);
    }
    public static void main(String[] args)
    {
    	printarray(new int[] {10,20,30,40});// passing anonymous array
    }
}
 