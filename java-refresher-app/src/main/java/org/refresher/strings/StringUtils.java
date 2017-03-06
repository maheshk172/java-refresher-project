package org.refresher.strings;

/**
 * Created by kulkamah on 2/10/2017.
 */
public class StringUtils {
    public static void main(String[] args) {
        //printChars();
        String str = "ABCDabcdEFGefg";
        System.out.println(changeCase(str));
    }

    // convert the string in such a way that all the lowercase letters should change to upper case
    // and all upper case letters to lowercase
    public static String changeCase(String str) {
        StringBuffer result = new StringBuffer();
        char charValue;
        int charIntValue;
        for(int i=0; i<str.length(); i++) {
            charValue = str.charAt(i);
            charIntValue = (int)charValue;
            if(charIntValue >=65 && charIntValue <91 ) {
                charIntValue = charIntValue + 32;
            } else if(charIntValue >=97 && charIntValue <123 ){
                charIntValue = charIntValue - 32;
            }
            result.append((char)charIntValue);
        }
        return result.toString();
    }

    /*
     Upper case : 65 - 90
     lower case : 97 - 122
     */
   public static void printChars() {
       int num = 65;
       int i =0;
       for(i = num; i<= num+25; i++) {
           System.out.println("i : " + i + ", char value: " + (char)i);
       }

       num = 97;
       for(i = num; i<= num+25; i++) {
           System.out.println("i : " + i + ", char value: " + (char)i);
       }
   }

}
