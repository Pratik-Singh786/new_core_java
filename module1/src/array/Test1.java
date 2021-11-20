package array;

public class Test1 {

	public static void main(String[] args)
	{
		//take three things
		// input no. of test cases (t);
		//size of the array
		//elements of the array
		int arr[]={2,2};
		int n=2;
		int arr2[]=findTwoElement(arr,n);
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[0]+" "+arr2[1]);
		}


	}
	static int[] findTwoElement(int arr[], int n)
	{
		int a[] =new int[arr.length+1] ;//to insert the missing number
		int result[]=new int[n];
		System.out.println(n);
		for(int i=1;i<arr.length;i++)
		{
			a[arr[i]]++;
		}
		int t=0;

		for(int i=0;i<a.length;i++)
		{
			if(i>0 && a[i]==0)
			{
				result[i]=a[i];
				i++;
			}
			if(i>0 && a[i]>1)
			{
				result[i]=a[i];
				i++;

			}

		}




		return result;


	}
}



		/*int arr[]= {20,40,50,10,30};
		for(int cs=0; cs<arr.length-1;cs++)
		{
			int pos=cs;
			int item=arr[cs];
			for(int i=cs+1;i<arr.length;i++)
			{
				if(arr[i]<item)
				{
					pos++;
				}
			}
		    int temp= item;
		    item=arr[pos];
		    arr[pos]=temp;
		    for(int i=0;i<arr.length;i++)
		    {
		    	System.out.print(arr[i]+" ");
		    }
		    break;
			
		}
		int arr[]= {1,4,4,1,0,1};
		int k=5;
		int count[]= new int[6];
	
		for(int i=0;i<arr.length;i++)
		{
			count[i]=0;
		}

		for(int i=0;i<arr.length;i++)
		{
			count[arr[i]]++;
			
		}
		for(int i=0;i<count.length;i++)
		{
			System.out.print(count[i]+" ");
		}*/

		/*int arr[]= {20,40,50,10,30,1,2,3};
		int n=arr.length;
		int low=0; int high =n-1;
		int mid= (low+high)/2;
		int n1=mid-low+1;
		int n2=high-mid;
		System.out.print(n1+" "+n2);*/

