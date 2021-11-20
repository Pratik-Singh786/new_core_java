package array;

public class Arrayex5 {
	
      static int[] get()
      {
    	  return new int[]{10,20,30,40,50};
      }
	public static void main(String[] args) 
	{
		int arr[]=get();//calling get method
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}

}
