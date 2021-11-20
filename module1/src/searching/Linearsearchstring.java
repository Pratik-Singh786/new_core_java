package searching;

public class Linearsearchstring {

	public static void main(String[] args) 
	{
		String[] arr= {"ram","sita","krishna","radha"};
		String item="krishna";
		int temp=0;
		
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i].equals(item))
				{
					System.out.println("item found at "+i+" ");
					temp=temp+1;
				}
				
			}
		if(temp==0)
		{
			System.out.println("item is not found");
		}

	}

}
