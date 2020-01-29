package com.infix.jan.twenty.six;


import java.util.Scanner;

public class DriverScript {
    //Class is a blue print of an object
    public static void main(String[] args) {
        System.out.println(maxNum(20,80));
        //Scanner Class
        //When a user provide value on run time
        Scanner test = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = test.nextInt();
        System.out.println("Enter Second Number");
        int b = test.nextInt();
        System.out.println(maxNum(a,b));
        //Avg Number
        System.out.println(avgNum(5,5));
        System.out.println(avgNum(a,b));
        mulNum();
    }

    public static int maxNum(int i, int j){
        if(i>j){
            return i;
        } else if (i==j){
            System.out.println("Both numbers are equal");
            return 0;
        }else
            return j;
    }

    public static int avgNum(int a, int b){
    //Veriable scopping
        int y = (a+b)/2;
        return y;
    }
//TechyLoop2

    public static void mulNum(){

        for(int i=1;i<=10;i++){
            System.out.println(5*i);

        }
    }
    public void type(){

    }


}
