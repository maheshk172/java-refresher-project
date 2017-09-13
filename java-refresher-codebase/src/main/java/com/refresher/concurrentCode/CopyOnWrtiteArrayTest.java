package com.refresher.concurrentCode;

import com.refresher.utils.CollectionUtils;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrtiteArrayTest {
    public static void main(String[] args) {

        List<Long> list = new CopyOnWriteArrayList<>(CollectionUtils.generateArrayList(2000));
        //List<Long> list = CollectionUtils.generateArrayList(10);

        ListIterator<Long> iter = list.listIterator();
        Long item;
        while(iter.hasNext()) {
            item = (Long) iter.next();
            System.out.println(item);
            //Condition 1 :
            if(item % 9 == 0) {
                list.add(item+item);
                System.out.println("added Item into the List : " + (item+item));
            }

        }
    }
}

