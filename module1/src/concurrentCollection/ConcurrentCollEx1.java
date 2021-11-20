package concurrentCollection;

import java.util.ArrayList;
import java.util.Iterator;

class ConcurrentCollEx extends Thread {
    static ArrayList l = new ArrayList();

    public void run() {
        try {
            Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println("child Thead updating List");
        }
        l.add("D");
    }

    public static void main(String[] args) throws InterruptedException {
        l.add("A");
        l.add("B");
        l.add("c");
        ConcurrentCollEx cc = new ConcurrentCollEx();
        cc.start();
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            String s1 = (String) itr.next();
            System.out.println("Main thread iterating list and current object is" + s1);
            Thread.sleep(3000);
        }


    }
}