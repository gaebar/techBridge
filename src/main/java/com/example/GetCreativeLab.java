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
            System.out.println("You picked: " + smallNumber + ". Byte: 8-bit signed integer. Range from -128 to 127.");

            // Using short
            System.out.print("");
            short mediumNumber = scanner.nextShort();
            System.out.println("You picked: " + mediumNumber + ". Short: 16-bit signed integer. Range from -32,768 to 32,767.");

            // Using int
            System.out.print("Pick a large number: ");
            int largeNumber = scanner.nextInt();
            System.out.println("You picked: " + largeNumber + ". Int: 32-bit signed integer. Range from -2,147,483,648 to 2,147,483,647.");

            // Using long
            System.out.print("Pick a very large number: ");
            long veryLargeNumber = scanner.nextLong();
            System.out.println("You picked: " + veryLargeNumber + ". Long: 64-bit signed integer. Range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.");

            // Using float
            System.out.print("Pick a decimal number with up to 7 decimal places: ");
            float decimalNumber = scanner.nextFloat();
            System.out.println("You picked: " + decimalNumber + ". Float: 32-bit IEEE 754 floating-point.");

            // Using double
            System.out.print("Pick a decimal number with up to 15 decimal places: ");
            double preciseDecimal = scanner.nextDouble();
            System.out.println("You picked: " + preciseDecimal + ". Double: 64-bit IEEE 754 floating-point.");

            System.out.println("Other primitive data types are: \"char\" represents a single 16-bit Unicode character, and \"boolean\" represents true or false values.");

            System.out.println("Now, as last part of the game we can play with some Math.");
            System.out.println("This is a simple calculator that will perform basic arithmetic operations on two integers.");
            System.out.print("Enter the first integer: ");
            int firstInt = scanner.nextInt();

            // CONTINUE WORKING HERE:

            // Check for division by zero
            int secondInt = 0;
            do {
                System.out.print("Enter the second integer (Note: It should not be zero for division and modulus): ");
                secondInt = scanner.nextInt();
                
                if (secondInt == 0) {
                    System.out.println("The second integer should not be zero for division and modulus operations. Please try again.");
                }
            } while (secondInt == 0);

            int addResult = firstInt + secondInt;
            int subResult = firstInt - secondInt;
            int mulResult = firstInt * secondInt;
            int divResult = firstInt / secondInt;
            int modResult = firstInt % secondInt;

            System.out.println("Addition result: " + firstInt + " + " + secondInt +  " = " + addResult);
            System.out.println("Subtraction result: " + firstInt + " - " + secondInt +  " = " +  subResult);
            System.out.println("Multiplication result: " + firstInt + " * " + secondInt +  " = " +  mulResult);
            System.out.println("Division result: " + firstInt + " / " + secondInt +  " = " +  divResult);
            System.out.println("Modulus result: " + firstInt + " % " + secondInt +  " = " +  modResult);

            // Using boolean
            System.out.println("Do you want to play again? (true/false)");
            playAgain = scanner.nextBoolean();
            scanner.nextLine(); // Consume leftover newline

        } while (playAgain);

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
