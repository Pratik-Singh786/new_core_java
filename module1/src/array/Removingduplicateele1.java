package array;
import java.util.Set;
import java.util.HashSet;
public class Removingduplicateele1 {

	public static void main(String[] args) // by set method
	{
		int [] a= {3,5,4,3,2,2,1};
		Set<Integer> s=new HashSet<>();
		for(int i:a)
		{
			if(s.add(i)==false)
			{
				System.out.print(i+" ");
			}
		}

	}

}
