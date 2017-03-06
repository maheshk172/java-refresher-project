package org.specialAttention.collections;

import org.specialAttention.utils.*;

import java.time.Clock;
import java.util.*;

/**
 * Created by kulkamah on 2/14/2017.
 */
public class MapTest {


    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        insertNumbers(map1, 10000000);
        //basic hashmap
        //searchAndChange(map1, 4);

        //This one takes a lot of time, tried to keep program running for 10+ mins, no result
        searchAndChange(getTreeMap(map1), 4);

        //This one takes a lot of time, tried to keep program running long time and program fails
        //searchAndChange(getLinkedMap(map1), 4);
    }

    public static void insertNumbers(Map<Integer, String> map1, int numOfElements) {
        Clock clock = Clock.systemDefaultZone();
        long miliStart = clock.millis();
        //System.out.println("Start :" + miliStart);
        for(int i = 0; i < numOfElements; i++) {
            map1.put(i, i + "*" + i + "=" + i*i);
        }
        long miliEnd = clock.millis();
        //System.out.println("End :" + miliEnd);
        System.out.println("Time taken for inserting " + numOfElements + " elements is = " + (miliEnd - miliStart) + " miliseconds");
    }

    public static List<String> searchAndChange(Map<Integer, String> map1, int numberToMatch) {
        Clock clock = Clock.systemDefaultZone();
        long miliStart = clock.millis();
        //System.out.println("Start :" + miliStart);
        Set keySet = map1.keySet();
        Iterator iter = keySet.iterator();
        List<String> result = new ArrayList<>();

        while(iter.hasNext()) {
            int key = (Integer) iter.next();

            if(key % numberToMatch == 0) {
                String value = map1.get(key);
                result.add(value);
            }
        }

        long miliEnd = clock.millis();
        //System.out.println("End :" + miliEnd);
        System.out.println("Time taken for find " + numberToMatch + " elements is = " + (miliEnd - miliStart) + " miliseconds");
        System.out.println("Number of Matches " + result.size());
        return result;
    }



    public static TreeMap<Integer, String> getTreeMap(Map<Integer, String> map1) {
        return new TreeMap<>(map1);
    }

    public static LinkedHashMap<Integer, String> getLinkedMap(Map<Integer, String> map1) {
        return new LinkedHashMap<>(map1);
    }












    public static void basicUsage(String[] args) {
        //Map<Integer, String> treeMap = new TreeMap<>();
        Map<Integer, String> treeMap = new HashMap<>();

        treeMap.put(1, "Str1");
        treeMap.put(2, "Str2");
        treeMap.put(3, "Str3");

        Utilities.printHashMap(treeMap);
        //entrySet
        Set<Map.Entry<Integer, String>> entrySet = treeMap.entrySet();
        Utilities.printCollection(entrySet);

        //entrySet
        Set<Integer> keySet = treeMap.keySet();
        Utilities.printCollection(keySet);

        //using streams
        keySet.stream()
                .forEachOrdered(s -> {
                    System.out.println("Key:" + s + ", value: " + treeMap.get(s));
                });

        System.out.println(treeMap.size());
    }
}
