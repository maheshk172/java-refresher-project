package org.designPatterns.abstractFactory;

/**
 * Created by kulkamah on 2/13/2017.
 */
public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
