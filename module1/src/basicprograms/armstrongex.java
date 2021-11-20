package basicprograms;

public class armstrongex {

	public static void main(String[] args) 
	{
		int n=371,temp,sum=0,r;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(temp==sum)
			System.out.println("armstrong number");
		else
			System.out.println("not armstrong");

	}

}
