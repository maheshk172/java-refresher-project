package org.specialAttention.collections;

import org.refresher.collections.Utilities;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by kulkamah on 2/14/2017.
 */
public class DeQueueTest {
    public static void main(String[] args) {
        Deque<String> dequeue1 = new ArrayDeque<>();

        dequeue1.add("1");
        dequeue1.add("2");
        dequeue1.add("3");
        dequeue1.add("4");

        Utilities.printCollection(dequeue1);
        /* Dequeue specific operations, addFirst, addLast */
        dequeue1.addFirst("0");
        dequeue1.addLast("5");
        Utilities.printCollection(dequeue1);


        while(!dequeue1.isEmpty()) {
            System.out.println("Peeking now ******** ");
            System.out.println(dequeue1.peek());
            System.out.println(dequeue1.peekFirst());
            System.out.println(dequeue1.peekLast());

            System.out.println("Polling now ******** ");
            System.out.println(dequeue1.poll());
            System.out.println(dequeue1.pollFirst());
            System.out.println(dequeue1.pollLast());
        }
    }
}
