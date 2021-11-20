package breakandcontinue;

public class Bandc5 {

	public static void main(String[] args) 
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				 if (i==j)
					 break;
						 
				 System.out.println(i+"..."+j);
			}
		}

	}

}
