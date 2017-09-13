package com.refresher.java8;

public class DefaultMethodInInterfaceDemo {
    public static void main(String[] args) {
        Table t1 = new Table();
        System.out.println(t1.areaOfShape(10));

        Square sqt = new Table();
        System.out.println(sqt.areaOfShape(10));

        Triangle triangle = new Table();;
        System.out.println(triangle.areaOfShape(10));
    }
}

interface Square {
    double weight(int a);
    default double areaOfShape(int a) {
        return 10;
    }
}

interface Triangle {
    double weight(int a);
    default double areaOfShape(int a) {
        return 20;
    }
}

class Table implements Square, Triangle {

    @Override
    public double weight(int a) {
        return 40.10;
    }

    @Override
    public double areaOfShape(int a) {
        return 30;
    }

}




