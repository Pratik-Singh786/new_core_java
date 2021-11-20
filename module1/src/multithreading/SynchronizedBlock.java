package multithreading;
class Display4
{
       public  void wish5(String name)
       {
             //suppose here 500 lines of code
            synchronized(this) 
           {
               for(int i=1;i<10;i++)
               {              
                  System.out.print("Good Morning");
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
             // 500 lines of codes here
       }
}
class MyThread24 extends Thread
{
     Display4 d5;
     String name;
     MyThread24(Display4 d5,String name)
    {
       this.d5=d5;
       this.name=name;
     }

    public void run()
    {
      d5.wish5(name);
    }

}
public class SynchronizedBlock 
{
   public static void main(String[] args)  
  {  
      Display4 d5 =new Display4(); 
      MyThread24 mth3=new MyThread24(d5,"pratik"); 
      MyThread24 mth4=new  MyThread24(d5,"rahul");
      mth4.start();
      mth3.start();
   }

}


	