package org.specialAttention.collections;

import org.specialAttention.utils.Utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by kulkamah on 2/14/2017.
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        list1.add("Str11");
        list1.add("Str1");
        list1.add("Str4");
        list1.add("Str0");
        list1.add("Str12");

        Utilities.printCollection(list1);
        // Basic String Comparator
        Comparator<String> comparator1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        // Collections::SORT Method
        Collections.sort(list1, comparator1);
        Utilities.printCollection(list1);

        // Collections Binary Search
        //System.out.println(Collections.binarySearch(list1, "Str4", comparator1));

        // Shuffle operation -> good for shuffling data
        /*Collections.shuffle(list1);
        Utilities.printCollection(list1);

        Collections.shuffle(list1);
        Utilities.printCollection(list1);*/

        Collections.reverse(list1);
        Utilities.printCollection(list1);

        Collections.reverse(list1);
        Utilities.printCollection(list1);


    }
}
