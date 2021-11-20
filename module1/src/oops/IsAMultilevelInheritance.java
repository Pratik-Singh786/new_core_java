package oops;


  class Car        //  1.Grandparent multilevel   inheritance :2nd class extends 1st  and 3rd class extends first
  {
	  void drive()    
	  {
		  System.out.println("drive car");
	  }
  }
  class SportsBike extends Car     //2.parent
  {
	  void drivebike()
	  {
	  System.out.println("drive sprotsbike");
	  }
	  
  }
  class cycle extends SportsBike   //3.child
  {
	  void drivebycycle()
	  {
		  System.out.println("dive cycle");
	  }
	  
  }	
  public class IsAMultilevelInheritance
  {
    public static void main(String[] args) 
	{
		cycle bc=new cycle();
		bc.drive();
		bc.drivebike();
		bc.drivebycycle();

	}

}
