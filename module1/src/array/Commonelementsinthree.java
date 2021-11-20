package array;
import java.util.ArrayList;

public class Commonelementsinthree {

	public static void main(String[] args) 
	{
		int []a1= {2,4,8};
		int [] a2= {2,3,4,8,10,16};
		int []a3= {2,8,14,40};
		ArrayList<Integer> l=new ArrayList<>();
		int x=0,y=0,z=0;
		while(a1.length>x && a2.length>y &&  a3.length>z)
		{
			if(a1[x]==a2[y] && a2[y]==a3[z])
			{
				l.add(a1[x]);
				x++;
				y++;
				z++;
				
			}
			else if(a1[x]<a2[y])
			{
				x++;
			}
			else if(a2[y]<a3[z])
			{
				y++;
			}
			else
			{
				z++;
			}
		}
		for(int n:l)
		{
			System.out.print(n+" ");
		}
		
		
	}

}
