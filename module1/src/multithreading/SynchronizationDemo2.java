package multithreading;
class DisplaySync1
{
    public synchronized  void wish1(String name)
    {
        for(int i=1;i<10;i++)
       {
            System.out.print("Good morning:");
             try
            {  
              Thread.sleep(1000);
             }
            catch(InterruptedException e)
           {
           }
           System.out.println(name);
        }
    }
}
class MyThread20 extends Thread
{
    DisplaySync1 d1;
    String name;
    MyThread20(DisplaySync1 d1 , String name)
    {
      this.d1=d1;
      this.name=name;
 
     }
    public void run()
   {
      d1.wish1(name);
    }
 
}
public class SynchronizationDemo2 
{

    public static void main(String[] args) 
    {
      DisplaySync1 d2=new DisplaySync1();// when we are working on the two objects synchronized method will not work we need class level lock.
      DisplaySync1 d3=new DisplaySync1();
        MyThread20 m19=new MyThread20(d2,"ankit");
        MyThread20 m20=new MyThread20(d3,"rahul");
        m19.start();
        m20.start();
      }
}
