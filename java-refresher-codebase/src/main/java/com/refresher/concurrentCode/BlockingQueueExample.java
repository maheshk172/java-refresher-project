package com.refresher.concurrentCode;

import java.util.*;
import java.util.concurrent.*;

public class BlockingQueueExample {

    public static void main(String[] args) {
        BlockingQueue<String> drop = new ArrayBlockingQueue(10);

        (new Thread(new StringMessageProducer(drop))).start();
        (new Thread(new StringMessageProducer(drop))).start();
        (new Thread(new StringMessageProducer(drop))).start();
        (new Thread(new StringMessageProducer(drop))).start();
        (new Thread(new StringMessageProducer(drop))).start();
        (new Thread(new StringMessageProducer(drop))).start();
        (new Thread(new StringMessageProducer(drop))).start();
        (new Thread(new StringMessageProducer(drop))).start();
        (new Thread(new StringMessageProducer(drop))).start();
        (new Thread(new StringMessageProducer(drop))).start();
        (new Thread(new StringMessageProducer(drop))).start();
        (new Thread(new StringMessageProducer(drop))).start();



        (new Thread(new IntMessageProducer(drop))).start();
        (new Thread(new IntMessageProducer(drop))).start();
        (new Thread(new IntMessageProducer(drop))).start();
        (new Thread(new IntMessageProducer(drop))).start();
        (new Thread(new IntMessageProducer(drop))).start();
        (new Thread(new IntMessageProducer(drop))).start();
        (new Thread(new IntMessageProducer(drop))).start();
        (new Thread(new IntMessageProducer(drop))).start();
        (new Thread(new IntMessageProducer(drop))).start();

        (new Thread(new FunnyMessageProducer(drop))).start();
        (new Thread(new FunnyMessageProducer(drop))).start();
        (new Thread(new FunnyMessageProducer(drop))).start();
        (new Thread(new FunnyMessageProducer(drop))).start();
        (new Thread(new FunnyMessageProducer(drop))).start();
        (new Thread(new FunnyMessageProducer(drop))).start();
        (new Thread(new FunnyMessageProducer(drop))).start();
        (new Thread(new FunnyMessageProducer(drop))).start();
        (new Thread(new FunnyMessageProducer(drop))).start();
        (new Thread(new FunnyMessageProducer(drop))).start();
        (new Thread(new FunnyMessageProducer(drop))).start();
        (new Thread(new FunnyMessageProducer(drop))).start();
        (new Thread(new FunnyMessageProducer(drop))).start();
        (new Thread(new FunnyMessageProducer(drop))).start();
        (new Thread(new FunnyMessageProducer(drop))).start();
        (new Thread(new FunnyMessageProducer(drop))).start();
        (new Thread(new FunnyMessageProducer(drop))).start();
        (new Thread(new FunnyMessageProducer(drop))).start();
        (new Thread(new FunnyMessageProducer(drop))).start();




        (new Thread(new Consumer(drop))).start();
    }

}

class StringMessageProducer
        implements Runnable {
    private BlockingQueue<String> drop;
    public StringMessageProducer(BlockingQueue<String> d) {
        this.drop = d;
    }

    public void run() {
        try {
            /*for (String s : messages)
                drop.put(s);
            drop.put("DONE");*/
            int count = 1;
            while(true) {

                drop.put("Message from: " + Thread.currentThread().getName() + "=>  String item message: " + count);
                count ++;
                Thread.sleep(300);
                drop.put("Message from: " + Thread.currentThread().getName() + "=>  String item message: " + count);
                count ++;
                Thread.sleep(300);
                drop.put("Message from: " + Thread.currentThread().getName() + "=>  String item message: " + count);
                count ++;
                Thread.sleep(300);

                //
            }


        } catch (InterruptedException intEx) {
            System.out.println("Interrupted! " +
                    "Last one out, turn out the lights!");
        }
    }
}

class IntMessageProducer
        implements Runnable {
    private BlockingQueue<String> drop;
    public IntMessageProducer(BlockingQueue<String> d) {
        this.drop = d;
    }

    public void run() {
        try {
            int count = 1;
            while(true) {

                drop.put("Message from: " + Thread.currentThread().getName() + "=>  Int item message : " + count);
                count ++;
                Thread.sleep(300);
                drop.put("Message from: " + Thread.currentThread().getName() + "=>  Int item message : " + count);
                count ++;
                Thread.sleep(300);
                drop.put("Message from: " + Thread.currentThread().getName() + "=>  Int item message : " + count);
                count ++;
                Thread.sleep(300);


                //Thread.sleep(1000);
            }

        } catch (InterruptedException intEx) {
            System.out.println("Interrupted! " +
                    "Last one out, turn out the lights!");
        }
    }
}

class FunnyMessageProducer
        implements Runnable {
    private BlockingQueue<String> drop;
    public FunnyMessageProducer(BlockingQueue<String> d) {
        this.drop = d;
    }

    public void run() {
        try {
            int count = 1;
            while(true) {

                drop.put("Message from: " + Thread.currentThread().getName() + "=>  Funny item message : " + count);
                count ++;
                Thread.sleep(300);
                drop.put("Message from: " + Thread.currentThread().getName() + "=>  Funny item message : " + count);
                count ++;
                Thread.sleep(300);
                drop.put("Message from: " + Thread.currentThread().getName() + "=>  Funny item message : " + count);
                count ++;
                Thread.sleep(300);

                //Thread.sleep(800);
            }

        } catch (InterruptedException intEx) {
            System.out.println("Interrupted! " +
                    "Last one out, turn out the lights!");
        }
    }
}

class Consumer
        implements Runnable {
    private BlockingQueue<String> drop;

    public Consumer(BlockingQueue<String> d) {
        this.drop = d;
    }

    public void run() {
        try {
            String msg = null;

            while (true) {
                Thread.sleep(1000);

                for(int i=0; i<3; i++) {
                    msg = this.drop.take();
                    System.out.println("--------------------------------");
                    System.out.println("processing started for message : " + msg);
                    System.out.println("processing completed for Message : " + msg);
                    System.out.println("--------------------------------");

                }
            }

        } catch (InterruptedException intEx) {
            System.out.println("Interrupted! " +
                    "Last one out, turn out the lights!");
        }



    }
}

