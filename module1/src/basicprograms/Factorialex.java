package basicprograms;

public class Factorialex {

	/*public static void main(String[] args) 
	{
		int fact=1,i=5;
		while(i>0)
		{
			fact=fact*i;
			i--;
		}
		System.out.println(fact);

	}*/
    
	public static void main(String[] args)
	{
	   int i,fact=1;
	   int number=5;
	   for( i=1;i<=number;i++)
	   {
		   fact=fact*i;
	   }
	   System.out.println(fact);   
	}
	 
}
