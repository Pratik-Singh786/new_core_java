package basicprograms;

public class palindromeex {

	public static void main(String[] args) 
	{
		int n=121,temp,r,sum=0;
		temp=n;
		while(n>0)		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}

