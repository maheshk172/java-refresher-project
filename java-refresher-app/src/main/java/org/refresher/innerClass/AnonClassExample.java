package org.refresher.innerClass;

/**
 * Created by kulkamah on 2/7/2017.
 */
public class AnonClassExample {
    public static void main(String[] args) {
        AnonClassExample anon = new AnonClassExample();
        anon.printClass();
    }

    public class SuperClass {
        public void doIt() {
            System.out.println("Doing it as you say");
        }
    }

    public void printClass () {
        SuperClass instance = new SuperClass() {
            @Override
            public void doIt() {
                System.out.println("Anonymous way of doing the same stuff");
            }
        };

        instance.doIt();

    }
}






