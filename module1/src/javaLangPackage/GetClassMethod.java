package javaLangPackage;

public class GetClassMethod {

	public static void main(String[] args) 
	{
		int count=0;
		Object o=new String("durga");
		Class c=o.getClass();
		System.out.println("fully qualified name of class"+c.getName());
		/*Method[] m=c.getDeclaredMethods();
		for(Method m1:m)
		{
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("the no. of methods "+ count);
		*/
		

	}

}
