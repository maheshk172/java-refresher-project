package org.refresher.collections;

import java.util.*;

/**
 * Created by kulkamah on 2/7/2017.
 */
public class ListCollectionExample {
    public static void main(String[] args) {

        /*List<String> list1 = new ArrayList<String>();

        list1.add("Test1");
        list1.add("Test2");
        list1.add("Test3");

        List<String> list2 = new ArrayList<String>();
        list2.addAll(list1);

        Utilities.printCollection(list1);
        Utilities.printCollection(list2);

        list2.addAll(list2);
        Utilities.printCollection(list2);

        list2.remove(0);
        list2.remove(0);
        Utilities.printCollection(list2);*/

        /*List<String> list1 = new ArrayList<String>();

        String str = "Test String";

        list1.add(str);
        Utilities.printCollection(list1);
        list1.add(str);
        Utilities.printCollection(list1);*/

        List<StringItem> list3 = new ArrayList<StringItem>();
        StringItem strItem = new StringItem();
        list3.add(strItem);
        list3.add(strItem);
        Utilities.printCollection(list3);
        System.out.println(list3.size());

    }
}


