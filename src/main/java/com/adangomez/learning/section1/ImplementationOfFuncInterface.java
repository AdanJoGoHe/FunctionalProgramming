package com.adangomez.learning.section1;

public class ImplementationOfFuncInterface {

    public static void start(){
        System.out.println("This is an implementation of a functional interface");
        LittleFuncInterface fun = () -> System.out.println("Hello from the functional Interface");
        fun.start();
        onTheFly(() -> System.out.println("Hello from the functional Interface"));
    }

    public static void onTheFly(LittleFuncInterface fun){
        fun.start();
    }
}
