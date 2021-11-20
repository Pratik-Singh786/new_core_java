package innerClasses;

public class StaticNestedClassesEx2 
{
    int x=10;
    static int y=20;
    static class StaticNestedInnerclass1
    {
    	public void m1()
    	{
    		//System.out.println(x); // non-static variable x in static field;
    		System.out.println(y);
    	}
    	
    }
	public static void main(String[] args) 
	{
		StaticNestedClassesEx2.StaticNestedInnerclass1 sn=new StaticNestedClassesEx2.StaticNestedInnerclass1();
		sn.m1();
		

	}

}
