package array;

public class Matrixsubstraction {

	public static void main(String[] args) 
	{
		int [][]a= {{4,2,7},{9,8,7}};
		int [][]b= {{1,3,4},{1,3,4}};
		int [][]c=new int[2][3];
		for(int i=0;i<2;i++)
		{
			for(int j=0; j<3;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
