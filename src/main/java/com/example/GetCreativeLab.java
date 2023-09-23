package com.example;

import java.util.Scanner;

/*  Create a small program in the next five minutes that takes user input 
    using a scanner and any data type. Display the value input. Then, perform some 
    type of manipulation on that value and display that result. Please use ALL data types and ALL operators.
*/
public class GetCreativeLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        

        // Using String to get the name
        System.out.print("Welcome to the game! What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name);

        // Using char to get the initial letter of the surname
        System.out.print("What's the first letter of your surname? (This allows me to demonstrate using a 'char' data type in Java.) ");
        /** Read a line to get a String, extract its first character to store as a char, and convert it to uppercase
            
            Developer Note: The Scanner class lacks a method for directly reading a single character ('char'). 
            Therefore, the approach here is to read an entire line as a String, 
            extract the first character from that String using charAt(0),
            and then convert that character to uppercase using Character.toUpperCase().
        */
        char surnameInitial = Character.toUpperCase(scanner.nextLine().charAt(0));

        System.out.println("Interesting, " + name + " " + surnameInitial + ". Let's revise some Java data types together!");

           
        do {
            // Using byte
            System.out.print("Pick a small number between -128 and 127: ");
            byte smallNumber = scanner.nextByte();
            scanner.nextLine();  // consume leftover newline
            System.out.println("You picked: " + smallNumber + ". Byte: 8-bit signed integer. Range from -128 to 127.");

            // Using short
            short mediumNumber = 0; // Initialize the variable
            boolean validInput = false; // Flag to check if the input is valid
            while (!validInput) {
                try {
                    System.out.print("Pick a medium number between -32,768 and 32,767: ");
                    mediumNumber = scanner.nextShort();
                    validInput = true;  // If we reach here, the input was valid
                } catch (java.util.InputMismatchException e) {  // Catch invalid input exception
                    System.out.println("Invalid input. Please enter a number between -32,768 and 32,767.");
                    scanner.nextLine();  // Clear the buffer
                }
            }
            System.out.println("You picked: " + mediumNumber + ". Short: 16-bit signed integer. Range from -32,768 to 32,767.");


            // Using int
            System.out.print("Pick a large number: ");
            int largeNumber = scanner.nextInt();
            scanner.nextLine();  // consume leftover newline
            System.out.println("You picked: " + largeNumber + ". Int: 32-bit signed integer. Range from -2,147,483,648 to 2,147,483,647.");

            // Using long
            System.out.print("Pick a very large number: ");
            long veryLargeNumber = scanner.nextLong();
            scanner.nextLine();  // consume leftover newline
            System.out.println("You picked: " + veryLargeNumber + ". Long: 64-bit signed integer. Range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.");

            // Using float
            System.out.print("Pick a decimal number with up to 7 decimal places: ");
            float decimalNumber = scanner.nextFloat();
            scanner.nextLine();  // consume leftover newline
            System.out.println("You picked: " + decimalNumber + ". Float: 32-bit IEEE 754 floating-point.");

            // Using double
            System.out.print("Pick another decimal number with up to 15 decimal places: ");
            double preciseDecimal = scanner.nextDouble();
            scanner.nextLine();  // consume leftover newline
            System.out.println("You picked: " + preciseDecimal + ". Double: 64-bit IEEE 754 floating-point.");

            // Using boolean
            System.out.print("Do you like this game? (true/false): ");
            boolean isGameLiked = scanner.nextBoolean();
            scanner.nextLine();  // consume leftover newline
            System.out.println("Your opinion: " + isGameLiked + ". Boolean: represents true or false values.");

            System.out.println("Another primitive data types is \"char\" that represents a single 16-bit Unicode character. A reference data type is \"String\". String represents a sequence of characters.");

            System.out.println("As last part of the game we can play with some Math.");



            // Simple calculator for double data type
            System.out.println("Now, a calculator for double-precision numbers.");
            System.out.print("Enter the first double: ");
            double firstDouble = scanner.nextDouble();
            System.out.print("Enter the second double: ");
            double secondDouble = scanner.nextDouble();

            // Check for division by zero in double
            if (secondDouble == 0) {
                System.out.println("Division by zero is undefined.");
            } else {
                double divDouble = firstDouble / secondDouble;
                System.out.println("Division result: " + firstDouble + " / " + secondDouble + " = " + divDouble);
            }

            // Perform and display the arithmetic operations
            System.out.println("Addition result: " + firstDouble + " + " + secondDouble + " = " + (firstDouble + secondDouble));
            System.out.println("Subtraction result: " + firstDouble + " - " + secondDouble + " = " + (firstDouble - secondDouble));
            System.out.println("Multiplication result: " + firstDouble + " * " + secondDouble + " = " + (firstDouble * secondDouble));

            // Simple calculator for long data type
            System.out.println("Now, a calculator for long integers.");
            System.out.print("Enter the first long integer: ");
            long firstLong = scanner.nextLong();

            // Check for division by zero in long
            long secondLong = 0;
            do {
                System.out.print("Enter the second long integer (Note: It should not be zero for division): ");
                secondLong = scanner.nextLong();
                if (secondLong == 0) {
                    System.out.println("The second integer should not be zero for division. Please try again.");
                }
            } while (secondLong == 0);

            System.out.println("Division result: " + firstLong + " / " + secondLong + " = " + (firstLong / secondLong));

            System.out.println("Addition result: " + firstLong + " + " + secondLong + " = " + (firstLong + secondLong));
            System.out.println("Subtraction result: " + firstLong + " - " + secondLong + " = " + (firstLong - secondLong));
            System.out.println("Multiplication result: " + firstLong + " * " + secondLong + " = " + (firstLong * secondLong));

            // Simple calculator for byte data type
            System.out.println("Now, a calculator for byte-sized integers.");
            System.out.print("Enter the first byte: ");
            byte firstByte = scanner.nextByte();
            System.out.print("Enter the second byte: ");
            byte secondByte = scanner.nextByte();

            System.out.println("Addition result: " + firstByte + " + " + secondByte + " = " + (byte)(firstByte + secondByte));
            System.out.println("Subtraction result: " + firstByte + " - " + secondByte + " = " + (byte)(firstByte - secondByte));

            // Simple calculator for short data type
            System.out.println("Now, a calculator for short integers.");
            System.out.print("Enter the first short integer: ");
            short firstShort = scanner.nextShort();
            System.out.print("Enter the second short integer: ");
            short secondShort = scanner.nextShort();

            System.out.println("Addition result: " + firstShort + " + " + secondShort + " = " + (short)(firstShort + secondShort));
            System.out.println("Subtraction result: " + firstShort + " - " + secondShort + " = " + (short)(firstShort - secondShort));




            // Using boolean
            System.out.println("Do you want to play again? (true/false)");
            playAgain = scanner.nextBoolean();
            scanner.nextLine(); // Consume leftover newline

        } while (playAgain);

        System.out.println("Thanks for playing with me, " + name + " " + surnameInitial + ". Wish you a great day!");
        scanner.close();
    }
}
