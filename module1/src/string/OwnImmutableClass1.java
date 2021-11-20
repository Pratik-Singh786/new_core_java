package string;

public final class OwnImmutableClass1
{
	 final String panCardNumber;
	 
	public OwnImmutableClass1(String panCardNumber)
	 {
		 this.panCardNumber=panCardNumber;
		 
	 }
	public String getPanNumber()
	{
		return  panCardNumber;
	}

	public static void main(String[] args) 
	{
		OwnImmutableClass1 oic=new OwnImmutableClass1("123456");
		System.out.println(oic.getPanNumber());

	}

}
