package org.threading;


public class PriorityThreadTest {

    public static void main(String[] args) {
        int i = 0;
        Thread.currentThread().setPriority(1);
        for (; i < 10; i++) {
            Thread t1 = new Thread(new MyRunnableItem());
            t1.setName("Thread-" + i);
            //int priority = (int) Math.floor((Math.random() * 10) + 1);
            int priority = 5;
            System.out.println("Generated Priority: " + priority);
            t1.setPriority(priority);
            t1.start();
        }

		for(i=0; i < 10; i++) {
            Thread t1 = new Thread(new MyRunnableItem());
			t1.setName("Thread-"+i);
			//int priority = (int)Math.floor((Math.random() * 10) + 1);
			int priority = 1;
			System.out.println("Generated Priority: " + priority);
			t1.setPriority(priority);
			t1.start();
		}

		/*for(i=0; i < 10; i++) {
			Thread t1 = new Thread(new MyRunnableItem());
			t1.setName("Thread-"+i);
			//int priority = (int)Math.floor((Math.random() * 10) + 1);
			int priority = 10;
			System.out.println("Generated Priority: " + priority);
			t1.setPriority(priority);
			t1.start();
		}*/
    }
}

class MyRunnableItem implements Runnable {

    public void run() {
        System.out.println("Thread Name:" + Thread.currentThread().getName() + ", Priority: " + Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName() + " Will start work now...");
		/*try {*/
        if (Thread.currentThread().getPriority() == 1) {
            System.out.println("Yielding Thread with priority = 1");
            Thread.yield();
        }
		/*}catch(InterruptedException ex) {
			ex.printStackTrace();
		}*/
        System.out.println(Thread.currentThread().getName() + ", completed its work...");
    }
}
