package array;

public  class OddandEveninarray
{
	public static void main(String args[])
	{
		int arr[]= {10,20,30,40,50};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("the even elements are: "+arr[i]+" ");
			}
			else
			{
				System.out.print("the odd elements are: "+arr[i]+" ");
			}
		}
	}
	
}
