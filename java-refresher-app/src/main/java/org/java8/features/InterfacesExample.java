package org.java8.features;
/**
 * Created by kulkamah on 2/8/2017.
 */
interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}

class BrandFormula implements Formula {

    @Override
    public double calculate(int a) {
        return a*a;
    }

    @Override
    public double sqrt(int a) {
        return Math.sqrt(a) + 1;
    }
}

public class InterfacesExample {
    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return a * a;
            }
        };

        System.out.println(formula.calculate(100));
        System.out.println(formula.sqrt(100));

        Formula formula1 = new BrandFormula();


        System.out.println(formula1.calculate(100));
        System.out.println(formula1.sqrt(100));



    }
}


