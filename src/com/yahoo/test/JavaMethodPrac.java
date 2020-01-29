package com.yahoo.test;

public class JavaMethodPrac {
    public static void main(String[] args) {
        //Method in java is same as Function in other language
        //Method - is a set of tasks
        //Use bathroom, brash your teeth, clean your face - dailylife function

        //How
        //OOP - Encapsulation - Giving boundary of your code - Public, Private and Protected.
        //Object and Static on class
        //Two types of Function / Methods - Void- means no value return, Return

        //Call a method
        add();//10
        division();//5

        int r = 9;
        //int y = r+add(); / /Error because of void method

        int u = 2;
        int j = u + division();//5
        System.out.println(j);//7

        //
        subtract(1, 2, 3, 4);
        mod(30, 15);

    }

    public static void add() {
        int a = 4;
        int b = 6;
        int c = a + b;
        System.out.println(c);
    }

    //Method parameters, argumets
    public static void subtract(int x, int y, int u, int z) {
        System.out.println(x - y - u - z);
    }

    public static int division() {
        int x = 10;
        int y = x / 2;
        System.out.println(y);
        return y;
    }

    public static int mod(int a, int b) {
        int k = a % b;
        System.out.println(k);
        return k;
    }

}
