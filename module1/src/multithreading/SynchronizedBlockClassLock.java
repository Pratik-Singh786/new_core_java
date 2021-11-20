package multithreading;
class Display5
{
    
	  public   void wish5(String name) 
       {
		  synchronized(Display5.class)  //synchronized block on a class lock
		  {
        
             for(int i=1;i<10;i++)
              {
                System.out.print("hi its me :");
                 try
                  {
                   Thread.sleep(1000);
                  } 
                 catch(InterruptedException a)
                 {
            	   System.out.println(a);
                 }
               System.out.println(name);
            } 
		  }
   
        
    }
        
  }
class MyThread25 extends Thread
 {
    Display5 d5;
    String name;
    MyThread25(Display5 d5,String name)
   {
     this.d5=d5;
     this.name=name;
   }
    public void run()
    {
        d5.wish5(name);
    }

 }
 public class SynchronizedBlockClassLock
  {
     public static void main(String[] args) 
     { 
        Display5 d7 =new Display5();
        Display5 d8 =new Display5();
        MyThread25 mt24=new MyThread25(d7,"pratik");  
        MyThread25 mt25=new  MyThread25(d8,"ankit");
        mt24.start();
        mt25.start();
       }
  }
