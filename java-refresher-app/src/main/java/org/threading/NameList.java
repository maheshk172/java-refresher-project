package org.threading;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by kulkamah on 2/22/2017.
 */
public class NameList {

    private List names = Collections.synchronizedList(
            new LinkedList());

    public synchronized void add(String name) {
        System.out.println("current Thread inside Add: " + Thread.currentThread().getName());
        names.add(name);
    }

    public synchronized String removeFirst() {
        try {
            System.out.println("current Thread inside removeFirst: " + Thread.currentThread().getName());
            Thread.sleep(4000);
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
        return (String) names.remove(0);
    }

    public synchronized boolean isListEmpty() {
        System.out.println("current Thread inside isListEmpty: " + Thread.currentThread().getName());
        if (names.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        final NameList nl = new NameList();

        nl.add("Ozymandias");

        class NameDropper extends Thread {
            public void run() {
                if(nl.isListEmpty()) {
                    String name = nl.removeFirst();
                    System.out.println(name);
                } else {
                    System.out.println("Nothing to delete");
                }
            }
        }

        Thread t1 = new NameDropper();
        Thread t2 = new NameDropper();

        t1.start();
        t2.start();
    }


}
