package org.specialAttention.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by kulkamah on 2/14/2017.
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        List<Double> list1 = new ArrayList<>();

        for(int i=100; i>=90; i--) {
            list1.add(Math.sqrt(i));
        }

        ListIterator iter = list1.listIterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("Going back now ******** ");
        while(iter.hasPrevious()) {
            System.out.println(iter.previous());
        }

    }
}
