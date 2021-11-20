package overriding;
class Forest
{
	void dense () //default
	{
		System.out.println("this forest is dense");
	}
}
class Tree extends Forest
{
	public void dense() // public:we can increase  the scope  modifier of method
	{
		System.out.println("this tree is very gaint");
	}
}

public class OverridingWrtScope {

	public static void main(String[] args) 
	{
		 Forest ft=new  Forest();
		 ft.dense();
		 Tree tr=new Tree();
		 tr.dense();
		 Forest fr=new Tree();
		 fr.dense();
	

	}

}
