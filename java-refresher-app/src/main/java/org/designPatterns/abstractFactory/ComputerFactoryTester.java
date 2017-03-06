package org.designPatterns.abstractFactory;

/**
 * Created by kulkamah on 2/13/2017.
 */
public class ComputerFactoryTester {
    public static void main(String[] args) {
      /*  Computer comp1 = ComputerFactory.getComputer("PC", "2GB","1TB", "2.4GHZ");
        Computer comp2 = ComputerFactory.getComputer("server", "4GB","5TB", "2.8GHZ");

        System.out.println(comp1.toString());
        System.out.println(comp2.toString());*/

        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("4 GB", "1 TB", "2.8 GHz"));

        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }
}
