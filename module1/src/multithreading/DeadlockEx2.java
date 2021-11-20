package multithreading;
public class DeadlockEx2
      {
          public static void main(String[] args) 
          {
            String s1="pratik";
            String s2="Singh";
            Thread th=new Thread()
             {
                 public void run()
                 {
                    while(true)
                    {
                         synchronized(s1)
                          {
                              System.out.println(Thread.currentThread().getName()+"locked :" +s1);
                               try
                               {
                                 Thread.sleep(1000);
                               }
                              catch(Exception e)
                               {
                                e.printStackTrace();
                                }
                                synchronized(s2)
                               {
                                System.out.println(Thread.currentThread().getName()+ "locked :"+s2);
                                }
                          }
                     }
                }
             };
             
             Thread th1=new Thread()
             {
                 public void run()
                 {
                      while(true)
                      { 
                           synchronized(s2)
                           {
                             System.out.println(Thread . currentThread().getName()+"locked :" +s2);
                             synchronized(s1)
                              {
                              System.out.println(Thread . currentThread().getName()+"locked: " +s1);
                              }
                           }
                      }

                  }
              };
             th.start();
             th1.start();
           }
       }

          
      


