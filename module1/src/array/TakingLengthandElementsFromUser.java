 package array;
import java.io.*;
import java.util.*;

public class TakingLengthandElementsFromUser {

	public static void main(String[] args) 
	{
		int  n;
		Scanner sc=new Scanner(System.in);
		System.out.println("entre the length of the array");
		n=sc.nextInt();

		String []s=new String[n];
		System.out.println("Enter the names:");

		for(int i=0;i<n;i++)
		{

			s[i]=sc.nextLine();
		}
		System.out.print(s[1]);
		/*int arr[]=new int[n];
		for(int i=0;i<n;i++ )
		{
			System.out.println("enter the elements of the array"+(i+1));
			arr[i]= sc.nextInt();
		}*/

		

	}


}
