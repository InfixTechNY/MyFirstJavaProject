package com.infix.jan.twenty.six;

import java.util.Scanner;

public class ObjectPrac {
    //Defination of an object:
     // Object is an instance of a class
    public static void main(String[] args) {

        //Formula
        //Class Name object name = new Classname ();
        DriverScript hwOne = new DriverScript();
        DriverScript hwTwo = new DriverScript();
        DriverScript hwThree = new DriverScript();
        Scanner input = new Scanner(System.in);
    //OPP - Biggest charecterSticks you have to reuse the code
        //How to use the functionally
        //Call the method from new class, object name.methodName();
        System.out.println( hwOne.maxNum(40,5));
        System.out.println(hwTwo.avgNum(5,5));
        hwThree.type();
    }
}
