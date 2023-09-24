package com.example;

import java.util.Scanner;

public class FlowControlChallengeLab {

    
    /**
     * Assignment: Create a program that does the following:
        - Takes 2 numbers as input. The difference between the numbers can’t be any less than 200.
        - if the difference is less than 200 then the program will have no output and will end.
        - The program should sum up the numbers that are even and also divisible by 4.
        - Then the program should sum up the numbers that are even and also divisible by 8.
        - Then the program should sum up the numbers that are not even and and not divisible by 5.
        - These values should all be displayed at the end of the program.
        - You must use all three kinds of loops and a switch statement.
        - Be sure to properly document your code with comments!!!!!!!!!!!!!!!!!
     * @param args
     */

    public static void main(String[] args) {
        //Initialize the Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Flow Control Final Challenge Program!");


        // Prompt user for the two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Close the Scanner
        scanner.close();

        // Calculate the absolute difference between the two numbers
        int difference = Math.abs(num1 - num2);
        
        // Explain the difference criteria
        System.out.println("Checking if the difference between " + num1 + " and " + num2 + " is at least 200...");

        // Check if the difference is less than 200
        if (difference < 200) {
            System.out.println("The difference between the numbers is less than 200. Exiting the program.");
            return;  // Exit the program if the condition is met
        }

        // Initialize sums
        int sumDivBy4 = 0;
        int sumDivBy8 = 0;
        int sumOddNotDivBy5 = 0;

        System.out.println("Calculating the sum of numbers that are even and divisible by 4...");

        // Use a for loop to sum numbers divisible by 4
        for(int i = Math.min(num1, num2); i <=Math.max(num1, num2); i++){
            if(i % 2 == 0 && i % 4 == 0){
                sumDivBy4 += i;
            }
        }
        // Inform user of the next process
        System.out.println("Calculating the sum of numbers that are even and divisible by 8...");

         // Use a while loop to sum numbers divisible by 8
         int j = Math.min(num1, num2);
         while (j <= Math.max(num1, num2)) {
             if (j % 2 == 0 && j % 8 == 0) {
                 sumDivBy8 += j;
             }
             j++;
         }
 
         // Inform user of the next process
         System.out.println("Calculating the sum of numbers that are not even and not divisible by 5...");
 
         // Use a do-while loop to sum numbers that are not even and not divisible by 5
         int k = Math.min(num1, num2);
         do {
             if (k % 2 != 0 && k % 5 != 0) {
                 sumOddNotDivBy5 += k;
             }
             k++;
         } while (k <= Math.max(num1, num2));
 
         // Inform user about the final output
         System.out.println("Displaying the calculated results...");
 
         // Use a switch statement for output
         int choice = 1;  // Just for the sake of using a switch statement
         switch (choice) {
             case 1:
                 System.out.println("Sum of numbers that are even and divisible by 4: " + sumDivBy4);
                 System.out.println("Sum of numbers that are even and divisible by 8: " + sumDivBy8);
                 System.out.println("Sum of numbers that are not even and not divisible by 5: " + sumOddNotDivBy5);
                 break;
             default:
                 System.out.println("Invalid choice.");
         }
     }

}
