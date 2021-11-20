package innerClasses;
class Outer
{
	 

    public  static class  StaticNestedClassesEx  // without existing the outer class object there may be chance of existing of inner nested class obj
   {  
	  public void m1()
	   {
	     System.out.println("static nested inner classes");
	   }

	 public static void main(String[] args) 
	  {
		 StaticNestedClassesEx scn=new StaticNestedClassesEx();// method 1
		 scn.m1();
		 Outer .StaticNestedClassesEx n= new Outer.StaticNestedClassesEx();
		 n.m1();

	  }

   }    
}
