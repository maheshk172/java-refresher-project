package org.java8.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kulkamah on 2/10/2017.
 */
public class SuperExtendsProblem {
    public static void main(String[] args) {

        // ? how exactly this thing is working

        List<? extends Fruit> list1 = new ArrayList<Fruit>();
        List<? extends Fruit> list2 = new ArrayList<Apple>();
        List<? extends Fruit> list3 = new ArrayList<Banana>();
        /*
        list1.add(new Fruit());
        list2.add(new Apple());
         */


        List<? super Fruit> list4 = new ArrayList<>();
        list4.add(new Fruit());
        list4.add(new Apple());
        list4.add(new Banana());
        //list2.add(new Tomato());  //Does not work

        List<? super Integer> foo3 = new ArrayList<>();

        foo3.add(new Integer(100));





    }
}

class Eatable {

}

class Fruit extends Eatable{
    public void hasSeed() {

    }

    public void hasJuice() {

    }
}

class Banana extends Fruit {

}

class Apple extends Fruit {

}

class Tomato {

}


