package org.refresher.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by kulkamah on 2/7/2017.
 */
public class SetCollectionExample {
    public static void main(String[] args) {
 //        Set<StringItem> set1 = new HashSet<StringItem>();
        Set<StringItem> set1 = new LinkedHashSet<StringItem>();
          Set<StringItem> set1 = new TreeSet<StringItem>();

/*
        StringItem str1 = new StringItem("Test Item");
        StringItem str2 = new StringItem("Test Item");
        set1.add(str1);
        // No errors thrown, but the item is not added
        System.out.println(set1.add(str2));
*/
        StringItem str1;
        for(int i=0; i< 100 ; i++) {
            str1 = new StringItem("Test Item - " + i*i);
            set1.add(str1);
        }

        Utilities.printCollection(set1);


    }
}
