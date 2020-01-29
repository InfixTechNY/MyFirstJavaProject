package com.yahoo.test;

public class MySecondJavaClass {
    //
    /*
    1. Data types, Veriable
    2. Different types of methods or java functions -
    3. void, return types of function/method, function with arguments
    4. Main function
    5. Programing control flow- if else
    6. Loops - For, while, do while
    6.1 Objects - Java Object
    7. Array
    8. Hashmap or Map or Arraylist
    9. Object - String class
    10. OOP - Inheriatnce, Polymorsphisism, Encapsulation
    11. Advance concept of java - Abstract class, interface, constructor method

    * *** How a  program execute - run? - A program execute code line by line ***
    *
    * java  Main method
     */
  public static void main(String []args){
      int i; // veriable Declaration
      int j = 20;
      int k;

      i = 10; // Veriable value assignment, initilization

      //+, -, * , /, %

      k=j%i;
      System.out.println(k);

      long a = 10;
      long b = 20;
      long c = a+b;
      System.out.println(c);


    //Loop - For loop
      // Print your name 5 times
      //what type of loop? Whenever you know how many times you have to repeat, then you use for loop.
     //Initilization or start point, end point / end condition, increment or decrement
    int total=0;
      for(int r=1;r<=10;r++) {
        //System.out.println("TAWHID");
        //System.out.println(c);
        //System.out.println(r);
          total=total+r;

    }
      System.out.println("The result is " + total);

    // r=1 then r++ , r=1+1 = 2, r=2+1
      //Condition check eaither true or false = '1<5=true', r<=5 this means r=5=true or r<r=false
  }

}
