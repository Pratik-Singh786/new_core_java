package multithreadingEnhancement;
import java.util.concurrent.locks.*;
public class ReentrantLockEx {

	public static void main(String[] args) 
	{
		ReentrantLock l=new ReentrantLock();// implementation class of lock interface
		l.lock();
		l.lock();
		System.out.println(l.isLocked());//true
		System.out.println(l.isHeldByCurrentThread());//true
		System.out.println(l.getQueueLength());//0
		l.unlock();
		System.out.println(l.getHoldCount());//1
		System.out.println(l.isLocked());//1 because only one lock is  unlocked
		l.unlock();
		System.out.println(l.isLocked());//false
		System.out.println(l.isFair());//false
		

	}

}
