package ExceptionHandling;
class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}
public class CustomException
{
	static void validate(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("not valid");
		}
		else
			
		{
			System.out.println("welcome to vote");
		}
		
	}

	public static void main(String[] args)
	{
		try
		{
			validate(18);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code ");
	

	}

}
