package org.designPatterns.factory;

import java.util.Comparator;

/**
 * Created by kulkamah on 2/13/2017.
 */
public class Server implements Computer {
    @Override
    public String toString() {
        return this.getComputerConfig();
    }

    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
