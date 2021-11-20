package string;

public class GetCharsEx {

	public static void main(String[] args) 
	{
		String s1="welcome to javatpoint";
		char[] ch=new char[20];
		try
		{
			s1.getChars(0,10,ch,0);
			System.out.println(ch);
		}
		catch(Exception e)
		{
			
		}
	

	}

}
