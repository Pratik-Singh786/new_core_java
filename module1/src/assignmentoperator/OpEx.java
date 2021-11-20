package assignmentoperator;
public class OpEx
{
	public static void main(String [] args)
	{
		int x=10;
		int y=11;
		System.out.println(x++);//10(11)
		System.out.println(x++);//11(12)
		System.out.println(++x);//13
		System.out.println(x--);//13(12)
		System.out.println(x--);//12(11)
		System.out.println(--x);//10  unary operator 
		System.out.println("x++ + ++x=="+(x++ + ++x));//10+12
		System.out.println(x++ + x++);//12+13
		System.out.println(y++ + y++);//10+11
		
	}

}
