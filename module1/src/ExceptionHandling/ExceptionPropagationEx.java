package ExceptionHandling;

public class ExceptionPropagationEx // on unchecked  exception like arithmetic ,null pointer ,array index out of bounds etc
{
	void m()
	{
		int data=50/0;
	}
	void n() 
	{
		m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) 
	{
	
		ExceptionPropagationEx ep=new ExceptionPropagationEx();
		ep.p();
	}

}
