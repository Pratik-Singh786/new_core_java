package multithreadingEnhancement;

public class LockInterfaceImportantMethods 
{

	public static void main(String[] args) 
	{
		//1.void lock():- same as synchronized if the lock is available get it immediately ,otherwise wait
		//2.tryLock():- if lock is available acquire the lock and return true if not available returns false and will perform alternate opr.
		//3.boolean tryLock():-If the lock is available  then get the lock but if it is not available then thread will wait for a specified 
		//unit of time still lock is not available thread can continue its execution;
		//4.void lockInterruptibly() :- acquires the lock if it is available ,if not then will wait ,while waiting if thread got interrupted 
		// then  thread wont get the lock.
		//5.void unlock():- to call the method compulsory current thread should be owner of the lock.

	}

}
