package flowcontrol;

public class SwitchEx4 {

	public static void main(String[] args) 
	{
		 byte b=10;
		 switch(b+1) // new its byte + integer so its integer and 1000 is in the range of  b+1
		 {
		     case 10:
			    System.out.println(10);
			    break;
		     case 100:
				 System.out.println(100);
				 break;
		     case 1000:
				 System.out.println(1000);
				 break;
		    	
			 
			 
		 }

	}

}
