package multithreading;
class MyThread12 extends Thread
        {
	       public  void run()
             {         
                 for(int i=1;i<10;i++)
                  { 
                    System.out.println("child Thread");
                  }
                  Thread.yield(); // stops the execution of  current executing thread and will give the chances to the thread of the same priority
             }
         }
      public class YieldKeyword 
      {
          public static void main(String[] args) 
          {
              MyThread12 m12=new MyThread12();
              m12.start();
               for(int i=1;i<10;i++)
                  {
                   System.out.println("main Thread");
                  }
           }
       }