package com.refresher.problems;

public class MultipleThreadsTogether {

    protected int threadSequence = 0;

    public static void main(String[] args) {
        MultipleThreadsTogether mtt = new MultipleThreadsTogether();
        mtt.printSequenceWithThreads();
    }

    public void printSequenceWithThreads() {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                try {
                    int i=1;
                    for(i=1; i<=10; ) {
                        if(threadSequence == 0) {
                            System.out.print(" " + 0);
                            if(i%2 == 0) {
                                threadSequence = 2;
                            } else {
                                threadSequence = 1;
                            }
                            i++;
                        }
                        Thread.sleep(100);
                    }
                } catch(InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };


        Runnable r2 = new Runnable(){
            @Override
            public void run() {
                try {
                    int i = 1;
                    for (i = 1; i <= (10 * 2);) {
                        if(threadSequence == 1) {
                            System.out.print(" " + i);
                            threadSequence = 0;
                            i = i + 2;
                        }
                        Thread.sleep(100);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };

        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 2;
                    for (i = 2; i <= (10 * 2); ) {
                        if(threadSequence == 2) {
                            System.out.print(" " + i);
                            threadSequence = 0;
                            i = i + 2;
                        }
                        Thread.sleep(100);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();
    }

}
