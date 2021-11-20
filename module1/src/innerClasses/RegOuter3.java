package innerClasses;

public class RegOuter3   // case 3  accessing  inner class code from outside of outer class
{
  class RegInner3
  {
	  public void memethod() 
	  {
	  System.out.println("Inner class methods");  
	  }
  }
	public static void main(String[] args)
	{
		RegOuter3  ro3=new RegOuter3 ();
		RegOuter3 .RegInner3 ri= ro3.new RegInner3();
		ri.memethod();

	}

}
