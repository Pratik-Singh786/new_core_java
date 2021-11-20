package multithreading;
class PrintTable
{
    
	  public  static synchronized void print(int n) 
       {
		  
        
           for(int i=1;i<10;i++)
            {
               System.out.println(n*i);
               try
                {
                  Thread.sleep(1000);
                 } 
              catch(InterruptedException a)
               {
            	  System.out.println(a);
               }
           
   
        }
    }
        
  }
class MyThread28 extends Thread
 {
    PrintTable t;

    MyThread28(PrintTable t)
   {
    	this.t=t;
     
   }
    public void run()
    {
        t.print(8);
    }

 }
 public class StaticSynchronizedDemo
  {
     public static void main(String[] args) 
     { 
        PrintTable t1=new PrintTable();
        PrintTable t2=new PrintTable();
        MyThread28 mt28=new MyThread28(t1);  
        MyThread28 mt29=new  MyThread28(t2);
        mt28.start();
        mt29.start();
       }
  }
