package constructors;

public class ThisToPassAnArgumentInMethod 
{
  void m(ThisToPassAnArgumentInMethod  obj)
  {
	  System.out.println("method is invoked");
  }
  void p()
  {
	m(this) ; 
  }
	public static void main(String[] args) 
	{
		ThisToPassAnArgumentInMethod ttp=new ThisToPassAnArgumentInMethod();
		ttp.p();

	}

}
