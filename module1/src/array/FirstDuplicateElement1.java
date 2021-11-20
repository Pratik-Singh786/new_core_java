package array;
import java.util.HashSet;


public class FirstDuplicateElement1 {

	public static void main(String[] args)
	{
		int temp=-1;
		int []a= {6,5,3,2,1,2,4};
		HashSet<Integer>s =new HashSet<>();
		for(int i=a.length-1;i>=0;i--)
		{
			if(s.contains(a[i]))
			{
				temp=i;
			}
			else
			{
				s.add(a[i]);
			}
		}
		if(temp!=-1)
		{
			System.out.print("first duplicate element is "+a[temp]);
		}
		else
		{
			System.out.print("Element not found");
		}

	}

}
