package innerClasses;
class PopCorn
{
	public void taste()
	{
		System.out.println("taste");
	}
}
public class AnonymousClass 
{

	public static void main(String[] args)
	{
		PopCorn p=new PopCorn() // bsically we are making a child class of popcorn class 
				{
			      public void taste()
			      {
			    	  System.out.println("spicy");
			      }
			
				};
				p.taste();
				
	   PopCorn p1=new PopCorn();
	   p1.taste();
	   PopCorn p2=new PopCorn()
			   {
	   
	             public void taste()
	             {
	            	 System.out.println("sweet");
	             }
			   };
				
			   System.out.println(p.getClass().getName());
			   System.out.println(p1.getClass().getName());
			   System.out.println(p2.getClass().getName());
		

	}

}
