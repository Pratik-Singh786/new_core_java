package string;

public class CanStringBufferImmutable
{

	public static void main(String[] args) 
	{
      final  StringBuffer sb=new  StringBuffer("durga"); // by making a reference variable final we can only stop the repeatation of 
      System.out.println(sb.append("software"));        //that variable but can't achieve immutability
     //  StringBuffer sb=new StringBuffer("ravi");
       

	}

}
