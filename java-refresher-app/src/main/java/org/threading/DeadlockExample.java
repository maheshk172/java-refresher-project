package org.threading;

/**
 * Created by kulkamah on 2/22/2017.
 */
public class DeadlockExample {
    public static void main(String[] args) {

        DeadLockTest d1 = new DeadLockTest();

        Runnable worker = new Runnable() {
            @Override
            public void run() {
                d1.write(10, 20);
                System.out.println("Read Value: " + d1.read());
            }
        };

        Thread t1 = new Thread(worker);
        t1.start();

        Thread t2 = new Thread(worker);
        t2.start();

        Thread t3 = new Thread(worker);
        t3.start();
    }


}

class DeadLockTest {
    private static class Resource {
        public int value;
    }

    private Resource resourceA = new Resource();
    private Resource resourceB = new Resource();

    public int read() {
        synchronized(resourceA) { // May deadlock here
            System.out.println("Thread Inside read:1st Sync: " + Thread.currentThread().getName());
            synchronized(resourceB) {
                System.out.println("Thread Inside read:2nd Sync: " + Thread.currentThread().getName());
                return resourceB.value + resourceA.value;
            }
        }
    }
    public void write(int a, int b) {
        synchronized(resourceB) { // May deadlock here
            System.out.println("Thread Inside writ1:1st Sync: " + Thread.currentThread().getName());
            synchronized(resourceA) {
                System.out.println("Thread Inside writ1:2nd Sync: " + Thread.currentThread().getName());
                resourceA.value = a;
                resourceB.value = b;
            }
        }
    }
}
