package org.designPatterns.singleton;

/**
 * Created by kulkamah on 2/10/2017.
 * Using static Inner class Approach
 * ----------------------------------
 * The instance will be created when first time some client will request it
 */

public class DatabasePoolLazyInitWithInnerClass {
    private DatabasePoolLazyInitWithInnerClass() {}

    private static class DatabasePoolInitilizer {
        private static final DatabasePoolLazyInitWithInnerClass INSTANCE = new DatabasePoolLazyInitWithInnerClass();
    }

    public static DatabasePoolLazyInitWithInnerClass getDatabasePool() {
        return DatabasePoolInitilizer.INSTANCE;
    }

}
