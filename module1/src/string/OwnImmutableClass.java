package string;

final class OwnImmutableClass 
{
	private int i;
	OwnImmutableClass(int i)
	{
		this.i=i;
	}
	public OwnImmutableClass  modify(int i)
	{
		if(this.i==i)
		{
			return this;
		}
		else
		{
			return new OwnImmutableClass(i);
		}
	}
	

	public static void main(String[] args)
	{
		OwnImmutableClass  oic =new OwnImmutableClass (10);
		OwnImmutableClass oic1 =oic.modify(100);
		OwnImmutableClass  oic2=oic.modify(10);
		System.out.println(oic==oic1);
		System.out.println(oic==oic2);
		

	}

}
