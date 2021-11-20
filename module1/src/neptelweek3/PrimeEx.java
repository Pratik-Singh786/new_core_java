package neptelweek3;

public class PrimeEx {

	public static void main(String[] args) 
	{
		//int n=Integer.parseInt(args[0]);
		int n=7;
		boolean isprime=true;
		if (n==0||n==1)
		{
			System.out.println(isprime=false);
		}
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					System.out.println(isprime=false);
					break;
				}
				else
				{
					System.out.println(isprime=true);
					break;
				}
			}
		}
		

	}

}
