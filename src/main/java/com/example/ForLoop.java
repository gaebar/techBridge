package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * TechBridge For Loop Assignment.
 * This class performs various exercises involving for-loops,
 * from displaying strings and numbers to calculating sums.
 */


public class ForLoop {

    /**
     * Entry point for the program.
     * @param args command line arguments, not used in this program.
     */
    public static void main(String[] args) {

        // Initialize Scanner object here
        Scanner scanner = new Scanner(System.in);

        // 1. A loop that will display a string 99 times
        for (int i = 1; i <= 99; i++) {
            System.out.println(i + ": " + "Hello World!");
        }

        // 2. A loop that will display every odd number from 0 to 99
        System.out.print("Odd numbers: ");
        for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
                if(i < 99){ // Check if it's not the last odd number
                    System.out.print(", ");
                }
                else{
                    System.out.print("."); // Append a period at the end
                }
            }
        }
        System.out.println();  // Move to the next line after displaying all odd numbers


        // 3. A loop that will display every even number from 0 to 99
        System.out.print("Even numbers using modulo: ");
        for (int i = 0; i <= 99; i++) {
            if (i % 2 == 0) {                
                System.out.print(i);
                if(i < 98){
                    System.out.print(", ");
                }
                else{
                    System.out.print(".");
                }
            }
        }
        System.out.println();

        // 4. The same loop as 3, but in a different way
        System.out.print("Even numbers using increment: ");
        for (int i = 0; i <= 99; i += 2) {
            System.out.print(i);
            if(i < 98){
                System.out.print(", ");
            }
            else{
                System.out.print(".");
            }
        }
        System.out.println();

        // 5. A loop that will sum up the odd numbers from 0 to 99 and print it at the
        // end
        int sumOdd = 0;
        for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                sumOdd += i; // Add odd numbers to the sum
            }
        }
        System.out.println("Sum of the odd numbers from 0 to 99:  " + sumOdd);

        // 6. A loop that will sum up the even numbers from 0 to 99 and print at the end
        int sumEven = 0;
        for (int i = 0; i <= 99; i++) {
            if (i % 2 == 0) {
                sumEven += i; // Add even numbers to the sum
            }
        }
        System.out.println("Sum of the even numbers from 0 to 99:  " + sumEven);

        // Exercise 7
        sumOfNumbers(scanner);

        // Self-assigned Exercise 8
        sumOfNumbersWithErrorHandling(scanner);

        // Close scanner to prevent resource leak
        scanner.close();
    }
    
    /**
     * Exercise 7: Calculate the sum of all numbers between two given numbers (inclusive).
     * @param scanner A Scanner object for reading user input.
     */
    public static void sumOfNumbers(Scanner scanner) {
        System.out.println("Exercise 7: This program will find the sum of all numbers between two numbers you provide, inclusive.");
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int sum = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {
            sum += i;
        }
        System.out.println("The sum of all numbers between " + firstNumber + " and " + secondNumber + " is: " + sum);
    }
    

    /**
     * Self-assigned Exercise 8: An enhancement of Exercise 7, sumOfNumbers method.
     * Implements error handling to ensure the user inputs a valid number.
     * @param scanner Scanner object for user input.
     */
    public static void sumOfNumbersWithErrorHandling(Scanner scanner) {
        int start = 0, end = 0;

        // Introductory message
        System.out.println("Exercise 8: This is an enhanced version of Exercise 7 with error handling. It will ensure you enter valid numbers.");

        // Input handling for the first number
        while (true) {
            try {
                System.out.print("Enter the first number: ");
                start = scanner.nextInt();
                break; // Exit the loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("That's not a valid number. Please enter again.");
                scanner.next(); // Consume the invalid token
            }
        }

        // Input handling for the second number
        while (true) {
            try {
                System.out.print("Enter the second number: ");
                end = scanner.nextInt();
                break; // Exit the loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("That's not a valid number. Please enter again.");
                scanner.next(); // Consume the invalid token
            }
        }

        if(start <= end){
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            System.out.println("The sum of numbers between " + start + " and " + end + " (inclusive) is: " + sum);
        } else {
            System.out.println("The start number should be less than or equal to the end number. No sum was calculated.");

        }
    }
}
