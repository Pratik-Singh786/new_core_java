package multithreadingEnhancement;

public class OverridingThreadLocalInitialValueMethod {

	public static void main(String[] args)
	{

      ThreadLocal tl1=new  ThreadLocal()
      {
        public Object initialValue()
        {
    	  return "abc";
        }
	  };
	  System.out.println(tl1.get());
	  tl1.set("durga");
	  System.out.println(tl1.get());
	  tl1.remove();
	  System.out.println(tl1.get());
	  

}
}
