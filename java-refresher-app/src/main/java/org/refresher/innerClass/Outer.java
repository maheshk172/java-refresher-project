package org.refresher.innerClass;

/**
 * Created by kulkamah on 2/7/2017.
 */
public class Outer {
    String dataText = "This is outer version class";
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner1 = outer.new Inner();

        inner1.printText();
    }

    public class Inner {
        String dataText = "This is inner version class";

        public void printText() {
            System.out.println(Outer.this.dataText);
            System.out.println(Inner.this.dataText);
        }
    }
}


