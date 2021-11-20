package array;

public class Printing2darray {

	public static void main(String[] args)
	{

		int[][]a= {{1,2,3},{1,2,}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
	
		/*int [][]a= {{1,2,3},{3,4,5}};
		for(int []i:a)
		{
			for(int j:i)
			{
			System.out.print(j);
			}
		}*/

	}

}
