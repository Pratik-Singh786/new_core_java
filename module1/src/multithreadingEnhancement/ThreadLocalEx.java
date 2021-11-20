package multithreadingEnhancement;
public class ThreadLocalEx
{
	public static void main(String []args)  //overriding intialValue()
	{
		ThreadLocal tl=new ThreadLocal()
				{
			       public Object initialValue()
			       {
			    	   return "abc";
			       }
			
				};
				System.out.println(tl.get());
				tl.set("durga");
				System.out.println(tl.get());
				tl.remove();
				System.out.println(tl.get());
	}
}
