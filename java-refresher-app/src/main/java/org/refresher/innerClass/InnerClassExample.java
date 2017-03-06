package org.refresher.innerClass;
/**
 * Created by kulkamah on 2/7/2017.
 */
public class InnerClassExample {
    public static void main(String[] args) {
        InnerClassExample inner1 = new InnerClassExample();
        InnerClassExample.Nested nested1 = new InnerClassExample.Nested();
        nested1.data1 = 100;
        //Accessing non-static class
        InnerClassExample.NonStaticNested nonStaticNested1 = inner1.new NonStaticNested();

        nonStaticNested1.setData1(100);
    }
    //static nested class
    public static class Nested {
        private int data1;
        private int data2;

        public int getData1() {
            return data1;
        }

        public void setData1(int data1) {
            this.data1 = data1;
        }

        public int getData2() {
            return data2;
        }

        public void setData2(int data2) {
            this.data2 = data2;
        }
    }

    //non-static nested class
    public class NonStaticNested {
        private int data1;

        public int getData1() {
            return data1;
        }

        public void setData1(int data1) {
            this.data1 = data1;
        }
    }
}



