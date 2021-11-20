
package array;

public class CopyingElementsOfOneToOther {

	public static void main(String[] args) 
	{
		int []arr1= {12,8,7,2,1};
		int []arr2= new int[arr1.length];
		for (int i=0;i<arr1.length;i++)
		{
			arr2 [i]=arr1[i];
			
		}
		System.out.println("Printing the elements of the array");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}

	
	}
}
