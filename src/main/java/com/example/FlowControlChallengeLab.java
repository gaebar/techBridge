package com.example;

import java.util.InputMismatchException;
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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Flow Control Final Challenge Program!");
        System.out.println("Please provide two numbers such that the difference between them is at least 200.");

        int num1 = 0;
        int num2 = 0;
        boolean validInput = false;  // Flag to indicate whether user input is valid


        // Ensure user provides valid integer input and difference is at least 200
        while (!validInput) {
            // Using a try-catch block to handle potential input mismatches.
            try {
                // Prompt user for the two numbers
                System.out.print("Enter the first number: ");
                num1 = scanner.nextInt();

                System.out.print("Enter the second number: ");
                num2 = scanner.nextInt();
                
                // Check if difference is at least 200
                int difference = Math.abs(num1 - num2);
                if (difference < 200) {
                    System.out.println("The difference between " + num1 + " and " + num2 + " is less than 200. Please try again.");
                    continue;  // Ask the user again
                }

                validInput = true;  // Exit the loop once valid input is received

            } catch (InputMismatchException e) {
                System.out.println("Please enter valid integers.");
                scanner.nextLine();  // Clear the invalid input
            }
        }
        scanner.close();

        // Initialize sums
        int sumDivBy4 = 0;
        int sumDivBy8 = 0;
        int sumOddNotDivBy5 = 0;

        // For loop: Sum numbers divisible by 4 and even
        System.out.println("Calculating the sum of numbers (using for loop) that are even and divisible by 4...");
        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if (i % 2 == 0 && i % 4 == 0) {
                sumDivBy4 += i;
            }
        }

        // While loop: Sum numbers divisible by 8 and even
        System.out.println("Calculating the sum of numbers (using while loop) that are even and divisible by 8...");
        int j = Math.min(num1, num2);
        while (j <= Math.max(num1, num2)) {
            if (j % 2 == 0 && j % 8 == 0) {
                sumDivBy8 += j;
            }
            j++;
        }

        // Do-while loop: Sum numbers not even and not divisible by 5
        System.out.println("Calculating the sum of numbers (using do-while loop) that are not even and not divisible by 5...");
        int k = Math.min(num1, num2);
        do {
            if (k % 2 != 0 && k % 5 != 0) {
                sumOddNotDivBy5 += k;
            }
            k++;
        } while (k <= Math.max(num1, num2));

        // Display the results
        System.out.println("Displaying the calculated results...");
        int choice = 1;  
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
