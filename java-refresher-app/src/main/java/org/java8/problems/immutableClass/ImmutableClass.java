package org.java8.problems.immutableClass;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by kulkamah on 2/13/2017.
 * How to make class Immutable:
 */

public class ImmutableClass {
    private final int id;
    private final String name;
    private final HashMap<String,String> testMap;

    //Deep Copy Constructor
    private ImmutableClass(ImmutableClassBuilder builder){
        System.out.println("Performing Deep Copy for Object initialization");

        this.id=builder.id;
        this.name=builder.name;

        HashMap<String,String> tempMap=new HashMap<String,String>();
        String key;

        Iterator<String> it = builder.properties.keySet().iterator();
        while(it.hasNext()){
            key=it.next();
            tempMap.put(key, builder.properties.get(key));
        }

        this.testMap=tempMap;
    }

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

    public static class ImmutableClassBuilder {
        private String name;
        private int id;
        private HashMap<String,String> properties;

        public ImmutableClassBuilder(int id, String name) {
            this.name = name;
            this.id = id;
        }

        public ImmutableClassBuilder setProperties(HashMap<String, String> properties) {
            this.properties = properties;
            return this;
        }

        public ImmutableClass build(){
            return new ImmutableClass(this);
        }
    }
}
