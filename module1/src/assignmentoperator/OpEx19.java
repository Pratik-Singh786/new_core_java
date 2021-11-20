package assignmentoperator;

public class OpEx19 {

	public static void main(String[] args) 
	{
		int y =10;//simple
		
		int a,b,c,d;
		a=b=c=d=20;//chained
		System.out.println(a+"..."+b+"..."+c+"..."+d);
		
		y+=1;//compound assignment operator
		System.out.println(y);
		y*=5;
		System.out.println(y);
		y=y*5;
		System.out.println(y);
		y/=5;
		System.out.println(y);
				

	}

}
