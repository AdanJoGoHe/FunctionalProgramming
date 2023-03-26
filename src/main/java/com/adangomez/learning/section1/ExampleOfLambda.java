package com.adangomez.learning.section1;

public class ExampleOfLambda {

    public static void start(){

        // This is an example of a full body expression
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from normal thread");
            }
        });
        t.start();

        // This is an example of a lambda expression
        new Thread(() -> System.out.println("Hello from lambda thread")).start();

    }
}
