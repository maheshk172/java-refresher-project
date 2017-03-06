package org.java8.features;

/**
 * Created by kulkamah on 2/8/2017.
 */
public class FunctionalInterfacesExample {

    public static void main(String[] args) {
        // So the abstract method implementation is here
        // All of following implementations are valid
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);

        Converter<String, Integer> converter1 = (from) -> {
            return Integer.valueOf(from);
        };

        Converter<String, Integer> converter2 = new Converter<String, Integer>() {
            @Override
            public Integer convert(String from) {
                return Integer.valueOf(from);
            }
        };

        // Method or constructor references (everything else is taken care)
        Converter<String, Integer> converter3 = Integer::valueOf;



        Integer converted = converter3.convert("123");
        System.out.println(converted);    // 123
    }
}

//Forces Single abstract interface
@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
    //T calculateCost(F from);
}
