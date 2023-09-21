package com.example;

import java.util.Scanner;
import java.util.InputMismatchException;  // Importing InputMismatchException


/**
 * TechBridge For Loop assignment
 *
 * 1. A loop that will display a string 99 times
 * 2. A loop that will display every odd number from 0 to 99
 * 3. A loop that will display every even number from 0 to 99
 * 4. The same loop as 3, but in a different way.
 * 5. A loop that will sum up the odd numbers from 0 to 99 and print it at the
 * end
 * 6. A loop that will sum up the even numbers from 0 to 99 and print at the
 * end.
 * 7. A loop that finds a sum of the numbers between two numbers that are given
 * by the user, inclusive
 *
 */
public class ForLoop {
    public static void main(String[] args) {

        // 1. A loop that will display a string 99 times
        for (int i = 1; i <= 99; i++) {
            System.out.println(i + ": " + "Hello World!");
        }

        // 2. A loop that will display every odd number from 0 to 99
        for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd number:  " + i);
            }
        }

        // 3. A loop that will display every even number from 0 to 99
        for (int i = 0; i <= 99; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number:  " + i);
            }
        }

        // 4. The same loop as 3, but in a different way
        for (int i = 0; i <= 99; i += 2) {
            System.out.println("Even number - second option:  " + i);
        }

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

        // 7. A loop that finds a sum of the numbers between two numbers that are given
        // by the user, inclusive

        // Initialize Scanner object
        Scanner scanner = new Scanner(System.in);
        
        int start = 0, end = 0;

        // Display the program's purpose and call to action to the user
        System.out.println("Please enter two numbers to calculate the sum of all numbers between them, inclusive.");

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

        // Initialize sum variable
        int sum = 0;

        // Loop to calculate the sum
        for (int i = start; i <= end; i++) {
            sum += i;
        }

        // Display the sum
        System.out.println("The sum of numbers between " + start + " and " + end + " (inclusive) is: " + sum);

        // Close scanner to prevent resource leak
        scanner.close();
    }
}
