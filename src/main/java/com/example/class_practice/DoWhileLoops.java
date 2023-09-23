package com.example.class_practice;

public class DoWhileLoops {
    public static void main(String[] args) {
    
        int i = 1, n = 5;
        
        do {
            System.out.println(i);
            i++;
        } while(i <= n);
        System.out.println("Value of i after the loop: " + i);
    }

    // Infinite While Loop:
    // while(true) {
    //     System.out.println("This is an infinite while loop.");
    // }

    // Infinite Do-While Loop:
    // do {
    //     System.out.println("This is an infinite do-while loop.");
    // } while(true);
    // }
}
