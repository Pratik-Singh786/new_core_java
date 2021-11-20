package multithreading;
class MyThread15 extends Thread
{
     static Thread mt; 
     public void run()
     {
        try
         {
            mt.join();  //calling join method on main
         }
       catch(InterruptedException e)
       {
       }
      for(int  i=1;i<10;i++)
      {
       System.out.println("child Thread");
       } 
 
    }
}
public class JoinKeywordCase3 
{
  public static void main(String[] args)  throws InterruptedException
  {
    MyThread15 m15=new MyThread15();
    MyThread15.mt=Thread.currentThread();
    m15.start();
    m15.join(); //calling join on child reference
    for(int i=1;i<10;i++)
    {
      System.out.println("main Thread");
    } 
 
 }
}
