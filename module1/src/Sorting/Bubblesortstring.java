package Sorting;

public class Bubblesortstring {

	public static void main(String[] args) 
	{
		String []a={"ram","sita","krishna","radha"};
		String temp;
		for(int i=0;i<a.length;i++)
		{
			int flag=0;
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j+1].compareTo(a[j])>0)
				{
				   temp=a[j];
				   a[j]=a[j+1];
				   a[j+1]=temp;
					flag=flag+1;   
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}

	}

}
