package multithreading;
class MyThread14 extends Thread  
 {
     static Thread mt;
     public void run()
     {
        try
        {
         mt.join();  //child thread will wait until the completion of main thread
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
public class JoinKeywordCase2 
{
    public static void main(String[] args) throws InterruptedException
   {
      MyThread14.mt=Thread.currentThread();
      MyThread14  m14=new  MyThread14 ();
      m14.start();
      for(int i=1;i<10;i++)
        {
         System.out.println("main Thread");
        } 
    }

}
