package com.yahoo.test;

public class HomeWork {
    public static void main(String []args) {
      for (int i=1;i<=10;i++){
          //System.out.println(2*i);
      }

      //For each loop
        //Array
        String name = "John";
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

        //While loop = Whenever a user needs to repert some work they need to use loop.
        //WHenever we know when to stop to stop - Condition based loop
        int x=3;
        while(x<5){
            System.out.println(x);
            x++;
        }

        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);

    }
}
