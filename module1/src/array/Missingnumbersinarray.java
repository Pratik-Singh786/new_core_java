package array;

public class Missingnumbersinarray {

	public static void main(String[] args)
	{
		int []a= {1,2,3,4,6};
		int expected_no_elements=a.length+1;
		int sum=0;
		int total_sum=expected_no_elements*(expected_no_elements+1)/2;
		System.out.println(total_sum);
		for(int i=0;i<a.length;i++)
		{
		 sum=sum+a[i];
		}
		System.out.print(sum);
		System.out.println();
		System.out.print(total_sum-sum);
       
	}

}
