package string;
import java.util.StringTokenizer;
public class StringTokenizerEx {

	public static void main(String[] args) 
	{
		StringTokenizer st=new StringTokenizer("i am a royal rajput");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}
