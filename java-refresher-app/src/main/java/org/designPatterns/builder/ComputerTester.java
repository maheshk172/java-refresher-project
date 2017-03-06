package org.designPatterns.builder;

/**
 * Created by kulkamah on 2/13/2017.
 */
public class ComputerTester {

    public static void main(String[] args) {
        Computer comp = new Computer.ComputerBuilder("1 TB", "4 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(false).build();

    }
}