package org.designPatterns.factory;

/**
 * Created by kulkamah on 2/13/2017.
 */
public class ComputerFactoryTester {
    public static void main(String[] args) {
        Computer comp1 = ComputerFactory.getComputer("PC", "2GB","1TB", "2.4GHZ");
        Computer comp2 = ComputerFactory.getComputer("server", "4GB","5TB", "2.8GHZ");

        System.out.println(comp1.toString());
        System.out.println(comp2.toString());
    }
}
