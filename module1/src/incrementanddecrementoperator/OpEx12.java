package incrementanddecrementoperator;

public class OpEx12 {

	public static void main(String[] args)
	{
		int x=10;
		char c='a';
		float f=10.5f;
		double d=12.5d;
		byte b=1;
		x++;
		System.out.println(x);//int
		c++;
		System.out.println(c);//char
		f++;
		System.out.println(f);//float
		d++;
		System.out.println(d);//double increment and decrement operator can be apply everywhere except boolean
        b=(byte)(b+1);//can't be like b=b+1
        System.out.println(b);
	}

}
