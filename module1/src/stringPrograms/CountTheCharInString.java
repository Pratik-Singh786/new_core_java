package stringPrograms;

public class CountTheCharInString {

	public static void main(String[] args) 
	{
		int count=0;
		String str="the best of  both worlds";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			
			{	
               count++;
			}
			
		}
		System.out.print(count);
		int x=-5;
		System.out.print(~x);


	}

}
