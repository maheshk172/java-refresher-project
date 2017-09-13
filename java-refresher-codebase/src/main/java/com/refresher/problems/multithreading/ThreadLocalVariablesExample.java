package com.refresher.problems.multithreading;

public class ThreadLocalVariablesExample {
    public static void main(String[] args) {



        //With Primitives
        //Sharing same Runnable instance

        Runnable incrementWorker = new IncrementWorker();
        Thread threadOne = new Thread(incrementWorker);
        Thread threadTwo = new Thread(incrementWorker);


        // With Shared Object
        //Runnable incrementObjectWorker = new IncrementObjectWorker();
        //Runnable incrementObjectWorker = new IncrementObjectWorker(new SharedObject());
        /*Thread threadOne = new Thread(incrementObjectWorker);
        Thread threadTwo = new Thread(incrementObjectWorker);
*/
        threadOne.setName("Thread 1");
        threadTwo.setName("Thread 2");

        threadOne.start();
        threadTwo.start();
    }
}

class IncrementWorker implements Runnable {

    //SharedCounter s1 = new SharedCounter();

    ThreadLocal<SharedCounter> threadLocal = new ThreadLocal<>();

    //@Override
    public void run() {
        int count = 0;

        if((SharedCounter)threadLocal.get() == null) {
            threadLocal.set(new SharedCounter());
        }

        SharedCounter s1 = (SharedCounter)threadLocal.get();

        while(((SharedCounter)threadLocal.get()).counter < 20) {

            System.out.println(Thread.currentThread().getName() + "=>  incrementing from count = " + count + " by 1");
            count++;
            try {
                Thread.sleep(300);
            } catch(InterruptedException ex) {
                ex.printStackTrace();
            }

            s1.counter = s1.counter + 1;
            //threadLocal.set(s1);
        }
        System.out.println(Thread.currentThread().getName() + "=>  Final count = " + count);
    }

    //@Override
    public void runTwo() {
        int count = 0;

        while(count < 20) {
            System.out.println(Thread.currentThread().getName() + "=>  incrementing from count = " + count + " by 1");
            count++;
            try {
                Thread.sleep(300);
            } catch(InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "=>  Final count = " + count);
    }
}

class IncrementObjectWorker implements Runnable {
    ThreadLocal<SharedCounter> threadLocal = new ThreadLocal<>();
    //Test - 1
    //SharedObject object = new SharedObject();

    //Test - 2
    /*SharedObject object;

    public IncrementObjectWorker() {
    }

    public IncrementObjectWorker(SharedObject object) {
        this.object = object;
    }*/

    @Override
    public void run() {
        //Test - 3
        SharedObject object = new SharedObject();

        if((SharedCounter)threadLocal.get() == null) {
            threadLocal.set(new SharedCounter());
        }

        SharedCounter s1 = (SharedCounter)threadLocal.get();

        while(s1.counter < 20) {
            System.out.println(Thread.currentThread().getName() + "=>  incrementing from count = " + object.getCount() + " by 1");
            object.setCount(object.getCount() + 1);
            try {

                Thread.sleep(300);


            } catch(InterruptedException ex) {
                ex.printStackTrace();
            }

            s1.counter = s1.counter + 1;
            threadLocal.set(s1);
        }
        System.out.println(Thread.currentThread().getName() + "=>  Final count = " + object.getCount());
    }
}

class SharedObject {
    private int count;

    public void setCount(final int count) {
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }
}

class SharedCounter {
    public int counter = 0;
}
