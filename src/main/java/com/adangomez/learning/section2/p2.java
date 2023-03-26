package com.adangomez.learning.section2;

public class p2 {

    public static void start(){
        System.out.println("p2 start");
        MathOperation substract = (a, b) -> System.out.println("The substract operation is: " + (a - b));
        substract.substract(5, 3);
        MathOperation multiply = (a, b) -> System.out.println("The multiply operation is: " + (a * b));
        multiply.substract(5, 3);
    }
    //Escribe un test para probar la funcionalidad de la clase p2

}
