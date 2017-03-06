package org.java8.features;

import java.util.Objects;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;

/**
 * Created by kulkamah on 2/8/2017.
 */
public class BuiltInFunctionalInterfaces {

    public static void main(String[] args) {
        BuiltInFunctionalInterfaces b1 = new BuiltInFunctionalInterfaces();
        b1.predicateExample();
    }

    public void predicateExample() {
        Predicate<String> predicate = (s) -> s.length() > 0;

        System.out.println(predicate.test("100"));
        System.out.println(predicate.test(""));

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

    }

}


