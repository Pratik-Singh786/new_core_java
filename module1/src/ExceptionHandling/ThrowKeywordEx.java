package ExceptionHandling;

public class ThrowKeywordEx  //throws keyword used with checked exception like IOException,Sql exception
{
	

		 static void validate(int age)
		 {
			 if(age<18)
			 {
				 throw new ArithmeticException("not valid");
			 }
			 else
			 {
				 System.out.println("valid to vote");
			 }
			 
		 }
		

		public static void main(String[] args)
		{
			validate(13);
			validate(19);

		}

	

}
