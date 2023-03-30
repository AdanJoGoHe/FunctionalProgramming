 package com.adangomez.learning.section2;

 import java.text.MessageFormat;

 public class p3 {

    public static void printName(String name) {
        LengthOfAString len = String::length;
        System.out.println(MessageFormat.format("The length of the string {0} is: {1}", name, len.length(name)));
    }
}
