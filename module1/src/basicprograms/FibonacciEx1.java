package basicprograms;

public class FibonacciEx1 {

	public static void main(String[] args) 
	{
		FibonacciEx1 fb =new FibonacciEx1();
		System.out.println(fb.fibo(4));

	}
	int fibo(int n)
	{
		if (n==0||n==1)
		{
			 return n;
			 
		}
		else
		{
			return fibo(n-1)+fibo(n-2);
		}
			
     }

}
