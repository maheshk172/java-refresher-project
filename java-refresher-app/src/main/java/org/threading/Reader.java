package org.threading;

/**
 * Created by kulkamah on 2/22/2017.
 */
public class Reader extends Thread {
    CalculatorThread c;

    public Reader(CalculatorThread calc) {
        c = calc;
    }

    public void run() {
        synchronized (c) {
            try {
                System.out.println("Waiting for calculation...");
                c.wait();
            } catch (InterruptedException e) {
            }
            System.out.println("Total is: " + c.total);
        }
    }

    public static void main(String[] args) {
        CalculatorThread calculator = new CalculatorThread();
        new Reader(calculator).start();
        new Reader(calculator).start();
        new Reader(calculator).start();
        calculator.start();
    }
}

class CalculatorThread extends Thread {
    int total;
    public void run() {
        synchronized(this) {
            for(int i=0;i<100;i++) {
                total += i;
            }
            notifyAll();
        }
    }
}