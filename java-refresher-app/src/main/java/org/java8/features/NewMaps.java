package org.java8.features;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kulkamah on 2/8/2017.
 */
public class NewMaps {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }



        map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
        map.get(9);             // val9

        map.merge(9, "concat", (value, newValue) -> value.concat(newValue));
        map.get(9);

        map.forEach((id, val) -> System.out.println(val));
    }

}
