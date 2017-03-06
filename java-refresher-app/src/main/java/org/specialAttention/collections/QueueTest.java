package org.specialAttention.collections;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by kulkamah on 2/14/2017.
 */
public class QueueTest {

    public static void main(String[] args) {
        Queue<String> queue1 = new LinkedList<>();

        queue1.add("1");
        queue1.add("2");
        queue1.add("3");
        queue1.add("4");

        while(!queue1.isEmpty()) {
            // Only checks top element
            System.out.println(queue1.peek());

            // retrives/deletes element
            System.out.println(queue1.poll());
        }


    }
}
