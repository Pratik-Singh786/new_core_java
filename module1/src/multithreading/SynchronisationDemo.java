package multithreading;
class DisplaySync
{
    public synchronized  void wish(String name)
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
class MyThread18 extends Thread
{
    DisplaySync d;
    String name;
    MyThread18(DisplaySync dam , String name)
    {
      this.d=dam;
     this.name=name;
 
     }
    public void run()
   {
      d.wish(name);
    }
 
}
class SynchronisationDemo 
{

    public static void main(String[] args) 
    {
     DisplaySync d1=new DisplaySync();
        MyThread18 m18=new MyThread18(d1,"Dhoni");
        MyThread18 m19=new MyThread18(d1,"Yuvraj");
        m18.start();
        m19.start();
      }
}
