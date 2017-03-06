package org.refresher.enums;

/**
 * Created by kulkamah on 2/7/2017.
 */
public class BasicEnumExample {
    private Level level = Level.HIGH;

    public static void main(String[] args) {
        (new BasicEnumExample()).compareLevel(Level.HIGH);

        for(Level levelValue : Level.values()) {
            System.out.println(levelValue);
        }

        TeaLevel level = TeaLevel.LOW;
        System.out.println(level.getTeaLevelCode());
    }

    public String compareLevel(Level level) {
        String returnValue = "Default Volume";
        if(level == Level.HIGH) {
            returnValue = "High Volume";
        } else if(level == Level.LOW) {
            returnValue = "Low Volume";
        } else if(level == Level.MEDIUM) {
            returnValue = "Medium Volume";
        }

        return returnValue;
    }

}


