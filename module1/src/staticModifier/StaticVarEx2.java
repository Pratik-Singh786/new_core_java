package staticModifier;

public class StaticVarEx2 
{
     static  int x=10;
     int y=20;
	public static void main(String[] args) 
	{
		StaticVarEx2  st=new StaticVarEx2 ();
		st.x=888;
		st.y=999;
		
		StaticVarEx2 st1=new StaticVarEx2 ();
		System.out.println(st1.x+ " "+st1.y);

	}

}
