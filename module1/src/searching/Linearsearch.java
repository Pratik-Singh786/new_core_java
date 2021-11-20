package searching;

public class Linearsearch {

	public static void main(String[] args) 
	{
		int arr[]= {12,4,5,6,23};
		int item=12;
	
		
		for(int i=0;i<arr.length;i++)
		{
		    int temp=0;
			if(arr[i]==item)
			{
				 
				System.out.print("item is found "+i+" position");
				temp=temp+1;
			}
			if(temp==0)
		    	   System.out.print("item not found");
			       break;
		}
			
		}
     
	}


