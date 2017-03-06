package org.designPatterns.factory;

/**
 * Created by kulkamah on 2/13/2017.
 */
public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if(type.equalsIgnoreCase("pc")){
            return new PC(ram, hdd, cpu);
        } else if(type.equalsIgnoreCase("server")){
            return new Server(ram, hdd, cpu);
        } else {
            return null;
        }
    }
}
