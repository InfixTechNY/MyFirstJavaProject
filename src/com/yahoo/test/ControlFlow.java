package com.yahoo.test;

public class ControlFlow {
    //If Else
    //Control flow
    //Conditional Statement

    //Java Key words
    //if - First condition to check
    //else if - second, third.......conditions
    //else -
    public static void main(String [] args){
    int grade = 80;

    if(grade>80){
      System.out.println("A-");
    }else if(grade==80){
        System.out.println("B+");
    }else if(grade>75){
        System.out.println("B");
    }else if(grade>60){
        System.out.println("F");
    }
    else{
        System.out.println("No grade");
    }
    }
}
