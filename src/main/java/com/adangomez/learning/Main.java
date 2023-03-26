package com.adangomez.learning;

import com.adangomez.learning.section1.ExampleOfLambda;
import com.adangomez.learning.section1.ImperativeVsDeclarative;
import com.adangomez.learning.section1.ImplementationOfFuncInterface;
import com.adangomez.learning.section2.p1;
import com.adangomez.learning.section2.p2;

public class Main {
    public static void main(String[] args) {
        initSection1();
        initSection2();

    }

    public static void initSection1(){
        System.out.println("Initializing Section 1");
        ImperativeVsDeclarative.start();
        ExampleOfLambda.start();
        ImplementationOfFuncInterface.start();
    }
    public static void initSection2(){
        System.out.println("Initializing Section 2");
        p1.start();
        p2.start();
    }
}