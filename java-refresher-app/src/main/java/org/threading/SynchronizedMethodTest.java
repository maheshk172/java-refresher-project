package org.threading;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by kulkamah on 2/22/2017.
 */
public class SynchronizedMethodTest {

    private List names = Collections.synchronizedList(
            new LinkedList());

    public void add(String name) {
        System.out.println("current Thread inside Add: " + Thread.currentThread().getName());
        names.add(name);
    }

    public String removeFirst() {
        /*try {

            Thread.sleep(10);
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }*/
        System.out.println("current Thread inside removeFirst: " + Thread.currentThread().getName());
        synchronized(this) {
            return (String) names.remove(0);
        }

    }

    public boolean isListEmpty() {
        System.out.println("current Thread inside isListEmpty: " + Thread.currentThread().getName());
        if (names.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        final NameList nl = new NameList();

        for(int i = 0; i < 10; i++) {
            nl.add("test + " + i);
        }

        class NameDropper extends Thread {
            public void run() {
                for(int i = 0; i < 10; i++) {
                    if(nl.isListEmpty()) {
                        String item = nl.removeFirst();
                        System.out.println(item);
                    } else {
                        System.out.println("Nothing to remove");
                    }

                }
            }
        }

        Thread t1 = new NameDropper();
        Thread t2 = new NameDropper();
        Thread t3 = new NameDropper();


        t1.start();
        t2.start();
        t3.start();
    }


}
