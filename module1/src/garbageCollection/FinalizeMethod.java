package garbageCollection;
//just before destroying an object gc calls finalize() to perform cleanup activities
public class FinalizeMethod
{
    public static void main(String [] args)
    {
       // String s=new String("pratik");
        //s=null;  //in this case String class finalize() is called so only one output
        FinalizeMethod fm=new  FinalizeMethod();
        fm=null;
        System.gc();
        System.out.println("End of main");

    }
    protected void finalize()
    {
        System.out.println("finalize method called");
    }


}
