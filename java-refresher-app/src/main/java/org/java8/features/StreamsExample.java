package org.java8.features;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by kulkamah on 2/8/2017.
 */
public class StreamsExample {

    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();

        stringCollection.add("Test11");
        stringCollection.add("Test22");
        stringCollection.add("Test333");
        stringCollection.add("Test444");
        stringCollection.add("Test57");
        stringCollection.add("Test67");
        stringCollection.add("Test7");
        stringCollection.add("Test87");
        stringCollection.add("Test966");
        stringCollection.add("Test107");

        StringPrintDecorator decorator = new StringPrintDecorator();

        //filter and for each print
/*        stringCollection
                .stream()
                .filter(s -> s.endsWith("7"))
                .forEach(System.out::println);*/

/*        stringCollection
                .stream()
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.compareTo(o2);
                    }
                })
                .filter(s -> s.contains("57"))
                .forEach(decorator::printStringObject);
                //.forEach(StringPrintDecorator::printString);
                //.forEachOrdered(System.out::println);*/

       /* stringCollection
                .stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);*/

        //count
        //System.out.println(stringCollection.stream().count());

        /*Optional<String> reduced =
        stringCollection
                .stream()
                .filter(s -> s.endsWith("7"))
                .reduce((s1, s2) -> s1 + " # " + s2);

        reduced.ifPresent(System.out::println);*/


        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        /*long t0 = System.nanoTime();

        long count = values.stream().sorted().count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("sequential sort took: %d ms", millis));*/

        long t0 = System.nanoTime();

        long count = values.parallelStream().sorted().count();
        System.out.println(count);
        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("Parallel sort took: %d ms", millis));


    }



}

class StringPrintDecorator {
    public static void printString(String str) {
        System.out.println(str);
    }

    public void printStringObject(String str) {
        System.out.println(str);
    }
}
