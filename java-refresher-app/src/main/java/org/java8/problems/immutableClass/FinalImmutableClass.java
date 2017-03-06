package org.java8.problems.immutableClass;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by kulkamah on 2/13/2017.
 * How to make class Immutable:
 *
 *  1) Declare the class as final so it can’t be extended.
    2) Make all fields private so that direct access is not allowed.
    3) Don’t provide setter methods for variables
    4) Make all mutable fields final so that it’s value can be assigned only once.
    5) Initialize all the fields via a constructor performing deep copy.
    6) Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
 */
public final class FinalImmutableClass {
    private final int id;
    private final String name;
    private final HashMap<String,String> testMap;

    //Deep Copy Constructor
    public FinalImmutableClass(int i, String n, HashMap<String,String> hm){
        System.out.println("Performing Deep Copy for Object initialization");

        this.id=i;
        this.name=n;

        HashMap<String,String> tempMap=new HashMap<String,String>();
        String key;

        Iterator<String> it = hm.keySet().iterator();
        while(it.hasNext()){
            key=it.next();
            tempMap.put(key, hm.get(key));
        }

        this.testMap=tempMap;
    }

    //Shallow Copy Constructor
    /*public FinalImmutableClass(int i, String n, HashMap<String,String> hm){
        System.out.println("Performing Shallow Copy for Object initialization");
        this.id=i;
        this.name=n;
        this.testMap=hm;
    }*/


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /**
     * Accessor function for mutable objects
     * @return
     */
    public HashMap<String, String> getTestMap() {
        //return testMap;
        return (HashMap<String, String>) testMap.clone();
    }
}
