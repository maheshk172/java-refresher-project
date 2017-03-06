package org.refresher.annotations;

import java.lang.annotation.*;

/**
 * Created by kulkamah on 2/13/2017.
 */
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {


    String author() default "Pankaj";

    String date();

    int revision() default 1;

    String comments();

}
