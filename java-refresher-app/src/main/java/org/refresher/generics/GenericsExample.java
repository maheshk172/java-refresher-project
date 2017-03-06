package org.refresher.generics;

import java.util.Iterator;

/**
 * Created by kulkamah on 2/10/2017.
 */
public class GenericsExample {
    public static void main(String[] args) {

    }
}

interface List <E> {
    void add(E x);
    DataIterator<E> iterator();
}


interface DataIterator<E> extends Iterator<E>{

}