package lambdaExpression;
interface  Drawable
{
	public void draw();// functional interface
}
public class LambdaExpressionEx 
{

	public static void main(String[] args) 
	{
		int width=10;
		/*Drawable d=new Drawable()
				{
			public void draw()
			{
				System.out.println("Drawing: "+width);  //ananymous inner class 
			} 
			
				};
				
				
				d.draw();*/
		Drawable d1=()->{System.out.println("Drawing: "+width);};
		d1.draw();
		

	}

}
