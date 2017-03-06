package org.refresher.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by kulkamah on 2/13/2017.
 */
public class AnnotationParsing {

    public static void main(String[] args) {
        try {

            for(Method method: AnnotationParsing.class.getClassLoader().loadClass("org.refresher.annotations.MethodInfoAnnotationExample").getMethods()) {
                if(method.isAnnotationPresent(org.refresher.annotations.MethodInfo.class)) {
                    try {
                        for(Annotation annotation: method.getDeclaredAnnotations()) {
                            System.out.println("annotation in method " + method + ":" + annotation);
                        }

                        MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);
                        if (methodAnno.revision() == 1) {
                            System.out.println("Method with revision no 1 = " + method);
                        }



                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
