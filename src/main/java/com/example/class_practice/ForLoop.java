package com.example.class_practice;

public class ForLoop {
    // create a for loop that will iterate through an array, but you can't use a for-each loop.
    // Hint: You'll hava to find the sizee of the array.
    // Hint: the way to obtain the valuse of a position in an array: 
    // namsOfArray[positionDesired]

    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5};
        for(int i = 0; i < myArray.length; i ++){
            int element = myArray[i];

            System.out.println("Element at position " + i + " is: " + element);
        }
    }
}
