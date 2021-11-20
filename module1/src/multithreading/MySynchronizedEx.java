package  multithreading;
class Table
{  
    void printTable(int n){//method not synchronized  
    for(int i=1;i<=5;i++)
    {  
     System.out.println(n*i);  
     try
     {  
      Thread.sleep(400);  
     }
     catch(Exception e)
     {
    	 System.out.println(e);
     }  
   }  
  
 }  
}  
  
class MyThread100 extends Thread
{  
   Table t;  
   MyThread100(Table t)
   {  
   this.t=t;  
   }  
   public void run()
   {  
     t.printTable(5);  
    }  
  
}  
class MyThread101 extends Thread
{  
   Table t;  
   MyThread101(Table t)
   {  
     this.t=t;  
   }  
   public void run()
   {  
     t.printTable(100);  
   }  
}  
  
public class MySynchronizedEx
{  
   public static void main(String args[])
   {  
    Table obj = new Table();//only one object  
    MyThread100 t1=new MyThread100(obj);  
    MyThread101 t2=new MyThread101(obj);  
    t1.start();  
     t2.start();  
   }  
}  
