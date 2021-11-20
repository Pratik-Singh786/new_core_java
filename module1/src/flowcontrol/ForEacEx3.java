package flowcontrol;

public class ForEacEx3 {

	public static void main(String[] args) 
	{
		int a[][][]= {{{10,20,},{30,40},{50,60,70} ,{80,90}}};
		 for(int [][] x:a)
		 {
			 for(int[] x1:x)
			 {
				 for(int x2:x1)
				 {
					 System.out.print(x2+ " ");
				 }
				 System.out.println();
			 }
		 }
		

	}

}
