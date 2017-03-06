package org.designPatterns.singleton;

/**
 * Created by kulkamah on 2/13/2017.
 */
public class SingletonDesignPatternTester {
    public static void main(String[] args) {
        DatabasePoolLazyInit dbPool = DatabasePoolLazyInit.getDatabasePool();
    }
}
