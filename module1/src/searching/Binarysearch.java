package searching;
public class Binarysearch {

	public static void main(String[] args) 
	{
		int []arr= {1,2,4,5,7,8,9};
		int item=8;
		int l=0;
		int u=arr.length-1;
		int mid=(l+u)/2;
		System.out.println(mid);
		while(l<=u)
		{
			if(arr[mid]==item)
			{
				System.out.println("element is found at "+mid+" position");
				break;
			}
			else if(arr[mid]<item)
			{
				l=mid+1;
			}
			else
			{
				u=mid-1;
			}
			mid=(l+u)/2;
		}
				

	
		
		
		
	}

}
