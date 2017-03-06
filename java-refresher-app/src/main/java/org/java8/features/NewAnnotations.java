package org.java8.features;

import java.lang.annotation.Repeatable;

/**
 * Created by kulkamah on 2/8/2017.
 */
public class NewAnnotations {
    public static void main(String[] args) {


        Hint h1 = PrimSchoolHints.class.getAnnotation(Hint.class);
        System.out.println(h1);

        Hints hints1 = PrimSchoolHints.class.getAnnotation(Hints.class);
        System.out.println(hints1.value().length);


    }
}


@Hints({@Hint("hint1"), @Hint("hint2")})
class SchoolHints {

}

@Hint("hint1")
@Hint("hint2")
class PrimSchoolHints {

}


@interface Hints {
    Hint[] value();
}

@Repeatable(Hints.class)
@interface Hint {
    String value();
}

