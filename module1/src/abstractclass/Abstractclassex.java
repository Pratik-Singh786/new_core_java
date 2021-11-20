package abstractclass;
abstract class Honda
{
	abstract void run();
}
class Hero extends Honda
{
	void run()
	{
		System.out.println("run the hero honda");
	}
}
public class Abstractclassex {

	public static void main(String[] args)
	{
		Hero hr=new Hero();
		hr.run();
		Honda hd=new Hero();
		hd.run();
		

	}

}
