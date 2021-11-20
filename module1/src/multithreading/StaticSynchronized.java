package multithreading;
class Display7
{
    
	  public  static synchronized void wish7(String name) 
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
class MyThread27 extends Thread
 {
    Display7 d7;
    String name;
    MyThread27(Display7 d7,String name)
   {
     this.d7=d7;
     this.name=name;
   }
    public void run()
    {
        d7.wish7(name);
    }

 }
 public class StaticSynchronized
  {
     public static void main(String[] args) 
     { 
        Display7 d8 =new Display7();
        Display7 d9 =new Display7();
        MyThread27 mt24=new MyThread27(d8,"pratik");  
        MyThread27 mt25=new  MyThread27(d9,"ankit");
        mt24.start();
        mt25.start();
       }
  }

