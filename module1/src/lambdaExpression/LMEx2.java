package lambdaExpression;
interface Sayable1
{
	public String say(String name);
}
public class LMEx2 {

	public static void main(String[] args) 
	{
		Sayable1 s1=(name)->{
			return "hello"+name;
			
		};
		System.out.println(s1.say("pratik"));
		

	}

}
