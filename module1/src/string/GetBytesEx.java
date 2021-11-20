package string;

public class GetBytesEx {

	public static void main(String[] args)
	{
		String s1="i will be a developer in mnc";
		byte [] bar=s1.getBytes();
		for(int i=0;i<bar.length;i++)
		{
			System.out.println(bar[i]);
		}
		String s2=new String(bar);
		System.out.println(s2);//getting the back the string
		

	}

}
