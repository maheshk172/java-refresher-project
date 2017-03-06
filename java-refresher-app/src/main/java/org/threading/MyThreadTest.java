package org.threading;

/**
 * Created by kulkamah on 2/20/2017.
 */
public class MyThreadTest {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread1 thread2 = new MyThread1();
        MyThread1 thread3 = new MyThread1();
        thread1.setName("Thread-1");
        thread2.setName("Thread-2");
        thread3.setName("Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();

        /*thread1.start();
        thread2.start();
        thread3.start();*/
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        super.run();

        for (int i = 0; i <= 100; i++) {
            System.out.println("Current Thread : " + this.getName() + ", Current work in progress :  " + i);
            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("Current Thread : " + this.getName() + ", Work Finished :  " + i);
        }
    }

    @Override
    public void start() {
        //super.start();
        this.run();
    }
}
