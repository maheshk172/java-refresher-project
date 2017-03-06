package org.threading;

/**
 * Created by kulkamah on 2/22/2017.
 */
public class WaitNotifyExample {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();
        synchronized (b) {
            try {
                System.out.println("Waiting for b to complete...");
                b.wait();
            } catch (InterruptedException e) {
            }
            System.out.println("Total is: " + b.total);
        }
        try {
            b.wait();
        } catch (InterruptedException e) {
        }
    }


}


class ThreadB extends Thread {
    int total;

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                total += i;
            }
            //notify();
            this.notify();
        }

    }
}


