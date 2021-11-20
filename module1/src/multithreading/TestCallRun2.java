package multithreading;

class TestCallRun2 extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++)
	  {  
	    try{Thread.sleep(1000);
	    }
	    catch(InterruptedException e)
	    {
	    	//System.out.println(e);
	    	}  
	    System.out.println(i);  
	  }  
	 }  
	 public static void main(String args[]){  
	  TestCallRun2 mwt1=new TestCallRun2();  
	 // TestCallRun2 mwt2=new TestCallRun2();  
	  mwt1.start();
	 // mwt1.start();
	 // t1.run(); 
	  mwt1.run();  
	 }  
	}  
