package org.threading;

/**
 * Created by kulkamah on 2/20/2017.
 */
public class MyThreadInterfaceTest {
    public static void main(String[] args) {
        MyThread2 thread1 = new MyThread2();
        MyThread2 thread2 = new MyThread2();
        MyThread2 thread3 = new MyThread2();

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread1);
        Thread t3 = new Thread(thread1);

        t1.start();
        t2.start();
        t3.start();

    }
}

class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Current Thread : " + Thread.currentThread().getName() + ", Current work in progress :  " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("Current Thread : " + Thread.currentThread().getName() + ", Work Finished :  " + i);
        }
    }
}
