package flowcontrol;

public class ForEachEx1 {

	public static void main(String[] args) 
	{
		int arr[][]= {{1,2,3,4,5},{6,7,8}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		for(int [] x1:arr)
		{
			for(int x2:x1)
			{
				System.out.print(x2+ " ");
			}
			System.out.println();
		}
		

	}

}
