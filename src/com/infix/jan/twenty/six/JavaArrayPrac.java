package com.infix.jan.twenty.six;

public class JavaArrayPrac {
    public static void main(String []args){
        // declares an array of double
        double[] anArray;

        // allocates memory for 10 integers
        anArray = new double[10];

        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;


        for (int i=0;i<10;i++){

            anArray[i]=90;
        }
        for (int i=0;i<10;i++){

            System.out.println(anArray[i]);
        }

    }
}
