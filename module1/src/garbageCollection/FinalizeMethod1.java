package garbageCollection;

public class FinalizeMethod1
{
    public static void main(String [] args)
    {
        //when we are directly calling finalize() it will be executed as normal method call.
        //but when  it called by System.gc() then only object will be destroyed.
        FinalizeMethod1 fm = new FinalizeMethod1();
        fm.finalize();
        fm.finalize();
        fm=null;
        System.gc();
        System.out.println("End of main");
    }
    public void finalize()
    {
        System.out.println("finalize method called");
    }

}
