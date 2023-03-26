package com.adangomez.learning.section1;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

    public static void start(){
        System.out.println("Imperative vs Declarative");
        System.out.println("Imperative: ");

        int sumOfEvents = 0;

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sumOfEvents += i;
            }
        }

        System.out.println(sumOfEvents);

        System.out.println("Declarative: ");

        sumOfEvents = IntStream.rangeClosed(0, 100)
                .filter(i -> i % 2 == 0)
                .reduce(Integer::sum)
                .getAsInt();

        System.out.println(sumOfEvents);

    }

}
