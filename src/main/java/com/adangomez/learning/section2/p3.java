 package com.adangomez.learning.section2;

public class p3 {

    public static void printName(String name) {
        LengthOfAString len = String::length;
        System.out.println("The length of the string"+ name + len.length(name));
    }
}
