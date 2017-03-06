package org.designPatterns.singleton;

import java.lang.reflect.Constructor;

/**
 * Created by kulkamah on 2/13/2017.
 */
public class ReflectionToDestroySingleton {

    public static void main(String[] args) {
        DatabasePoolEager instanceOne = DatabasePoolEager.getDatabasePool();

        DatabasePoolEager instanceTwo = null;

        try {
            Constructor[] constructors= DatabasePoolEager.class.getDeclaredConstructors();

            for(Constructor ctr: constructors) {
                ctr.setAccessible(true);
                instanceTwo = (DatabasePoolEager) ctr.newInstance();
                break;
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
