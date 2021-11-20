package multithreadingEnhancement;

public class ThreadGroupEx {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());// main  group
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());//system group

	}

}
