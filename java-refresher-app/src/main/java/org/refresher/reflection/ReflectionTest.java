package org.refresher.reflection;

import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Created by kulkamah on 2/13/2017.
 */
public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException {

        // 3 Ways we can get class instance
        Class <?> concreteClass = ConcreteClass.class;
        concreteClass = new ConcreteClass(5).getClass();

        concreteClass = Class.forName("org.refresher.reflection.ConcreteClass");

        /**
         * getCanonicalName() -> returns class name
         */
        /*System.out.println(concreteClass.getCanonicalName());

        Class<?> d1 = new Double(5).getClass();
        System.out.println(d1.getCanonicalName());

        Class<?> b1 = new Boolean(true).getClass();
        System.out.println(b1.getCanonicalName());

        try {
            Class<?> cDoubleArray = Class.forName("[D");
            System.out.println(cDoubleArray.getCanonicalName());
        } catch(Exception ex) {
            ex.printStackTrace();
        }

        Class<?> twoDStringArray = String[][].class;
        System.out.println(twoDStringArray.getCanonicalName());*/

        /**
         * getSuperClass() :  Get Super class of the class being discussed
         */
        /*Class<?> superClass = Class.forName("org.refresher.reflection.ConcreteClass").getSuperclass();
        System.out.println(superClass); // prints "class com.journaldev.reflection.BaseClass"
        System.out.println(Object.class.getSuperclass()); // prints "null"
        System.out.println(String[][].class.getSuperclass());// prints "class java.lang.Object"*/

        /**
         * getClasses() :  get classes
         */
        /*Class<?>[] classes = concreteClass.getClasses();
        System.out.println(Arrays.toString(classes));*/

        /**
         * getDeclaringClass()
         * getEnclosingClass()
         */
        /*Class<?> innerClass  = Class.forName("org.refresher.reflection.ConcreteClass$ConcreteClassPublicClass");
        System.out.println(innerClass.getDeclaringClass().getCanonicalName());
        System.out.println(innerClass.getEnclosingClass().getCanonicalName());*/

        /**
         * getPackageName()
         */
        //System.out.println(Class.forName("org.refresher.reflection.BaseInterface").getPackage().getName());

        /**
         * getClassModifiers()
         */
        System.out.println(Modifier.toString(concreteClass.getModifiers())); //prints "public"

        //prints "public abstract interface"
        System.out.println(Modifier.toString(Class.forName("org.refresher.reflection.BaseInterface").getModifiers()));

    }
}
