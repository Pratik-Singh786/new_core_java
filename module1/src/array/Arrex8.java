package array;

public class Arrex8 {
// printing jagged array
	public static void main(String[] args) 
	{
		int[][] arr=new int[3][];
		 arr[0]=new int[3];
		arr[1]=new int[4];
		arr[2]=new int[2];
		arr[0][0]= 0;
		arr[0][1]=1;
		arr[0][2]=2;
		arr[1][0]= 3;
		arr[1][1]=4;
		arr[1][2]=5;
		arr[1][3]= 6;
		arr[2][0]=7;
		arr[2][1]=8;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] +" ");
				
			}
			System.out.println();
		}
		

	}

}
