package interfaceex;


 interface X 
{
	public int method7();
	public int method8();
	public int  method9();
	public int method10();

}
  
abstract class AdapterclasseEx implements X
{
	 public int method7()    //if we declare  a method inside interface compulsory we should have provide implementation to all the methods
                              //that we have declared in interface otherwise we will get ce 
	 {
		 return 3;
	 }
	 public int method8()
	 {
		return 4; 
	 }
	 public int method9()
	 {
		 return 5;
	 }
	 public int method10()
	 {
		 return 6;
	 }

}
