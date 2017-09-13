package com.refresher.utils;

import java.util.*;

/**
 * Created by kulkamah on 2/7/2017.
 */
public class CollectionUtils<T> {

    public static <T> void printCollection(Collection<T> collection) {
        Iterator<T> iterator = collection.iterator();
        System.out.print("[ ");

        while (iterator.hasNext()) {
            // Just making a generic method to print any kind of collection object
            T item = iterator.next();
            String itemValue = "";
            if (item instanceof String) {
                itemValue = (String) item;
            } else if (item instanceof Integer) {
                itemValue = "" + (Integer) item;
            } else {
                itemValue = item.toString();
            }

            System.out.print(itemValue);

            if (iterator.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.print(" ]");
        System.out.println();
    }

    public static <T, K> void printHashMap(Map<T, K> collection) {

        Set<T> keySet = collection.keySet();
        Iterator<T> iterator = keySet.iterator();
        System.out.print("[ ");

        while (iterator.hasNext()) {
            // Just making a generic method to print any kind of collection object
            T key = iterator.next();
            System.out.print("{ ");
            System.out.print(key + ", ");
            System.out.print(collection.get(key));
            System.out.print("}");
        }
        System.out.print(" ]");
        System.out.println("");
    }

    public static List<Long> generateArrayList(double numberOfItems) {
        List<Long> list = new ArrayList<>();

        Random rand = new Random(1234567890);
        int i = 0;
        while (i < numberOfItems) {
            list.add(rand.nextLong());
            i++;
        }
        return list;
    }
}