package org.java8.problems;

/**
 * Created by kulkamah on 2/10/2017.
 */
public class InterfaceProblem {


    public static void main(String[] args) {
        A1 tclass1 = new TestClass();
        A2 tclass2 = new TestClass();
        tclass1.methodA();
        tclass1.methodB();
        tclass1.printName("Test Name");

        tclass2.methodA();
        tclass2.methodB();
        tclass2.printAge(30);

        TestClass t1 = (TestClass)tclass1;
        t1.methodA();
        t1.methodB();
        t1.printName("Mahesh");
        t1.printAge(30);
   }
}


//if return values are different in two interfaces then this will not compile
class TestClass implements A2, A1 {

    @Override
    public void methodA() {
        System.out.println("Inside Method A");
    }

    @Override
    public void methodB() {
        System.out.println("Inside Method B");
    }
}

interface A1 {
    void methodA();

    void methodB();

    default void printName(final String name) {
        System.out.println("Your name is" + name + ", welcome to A1 world");
    }
}

interface A2 {
    void methodA();

    void methodB();

    default void printAge(final int age) {
        System.out.println("Your age is" + age + ", welcome to A2 world");
    }
}

