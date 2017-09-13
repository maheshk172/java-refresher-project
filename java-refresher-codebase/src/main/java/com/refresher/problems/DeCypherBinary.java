package com.refresher.problems;


import java.util.StringTokenizer;

public class DeCypherBinary {
    public static void main(String[] args) {
        DeCypherBinary deCypherBinary = new DeCypherBinary();
        deCypherBinary.convertBinaryToInts("100");
    }

    public void convertBinaryToInts(String charString) {
        String[] tokens;// = charString.split(" ");
        StringTokenizer tokenizer = new StringTokenizer(charString, " ");
        String currentToken="";

        System.out.println("[ ");
        while(tokenizer.hasMoreElements()) {
            currentToken = tokenizer.nextToken();
            System.out.println(this.tokanizeAndMerge(currentToken));
            if(tokenizer.hasMoreElements()) {
                System.out.println(" ,");
            }
        }

        System.out.println(" ]");
    }

    public int tokanizeAndMerge(String charString) {
        int returnVal = 0;
        char[] chars = charString.toCharArray();

        int i=chars.length - 1;

        for(;i>=0;i--) {
            returnVal = returnVal + getNthDigitValue(i, chars[i]);
        }

        return returnVal;
    }

    public int getNthDigitValue(final int place, final char digit) {
        int returnVal = 0;
        int totalToMultiply = 1;
        int intDigit = Integer.parseInt("" + digit);
        int i=0;
        for(;i<place;i++) {
            totalToMultiply = totalToMultiply*2;
        }

        returnVal = digit*totalToMultiply;
        return  returnVal;
    }
}


