 package array;

public class Matrixmultiply {

	public static void main(String[] args) 
	{
		int[][] a= {{1,2,3},{3,4,5},{3,2,1}};
		int[][] b= {{3,2},{4,5},{1,2}};
		int[][] c=new int [3][2];
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<2;j++)
			 {
				 c[i][j]=0;
				 for(int k=0;k<3;k++)
				 {
					 c[i][j]+=a[i][k]*b[k][j];
				 }
				 System.out.print(" "+c[i][j]);
			 }
			 System.out.println();
		 }
		
	}
		

}
