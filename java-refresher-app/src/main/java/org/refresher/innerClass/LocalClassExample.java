package org.refresher.innerClass;

/**
 * Created by kulkamah on 2/7/2017.
 */
public class LocalClassExample {
    public static void main(String[] arags) {
        OuterClass class1 = new OuterClass();
        class1.printText();
    }
}

class OuterClass {
    private String str1;

    OuterClass() {
        this.str1 = "Outer class str1";
    }

    public void printText() {
        class InnerClass {
            private String str1;

            InnerClass() {
                this.str1 = "Local Inner class Str1";
            }

            public void printText() {
                System.out.println(this.str1);
                System.out.println(OuterClass.this.str1);
            }
        }

        InnerClass ic = new InnerClass();
        ic.printText();

        System.out.println(this.str1);
    }
}
