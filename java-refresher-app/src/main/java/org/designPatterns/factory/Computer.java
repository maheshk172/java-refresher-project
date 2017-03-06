package org.designPatterns.factory;

/**
 * Created by kulkamah on 2/13/2017.
 */
/*
This abstract class can be replaced with Interface with default method as well, Post Java 8
public abstract class Computer {
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}*/

public interface Computer {
    String getRAM();
    String getHDD();
    String getCPU();


    public default String getComputerConfig(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}
