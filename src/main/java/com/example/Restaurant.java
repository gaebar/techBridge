package com.example;

import java.util.Scanner;

/**
* Arrays Challenge
* I always dreamed of having a restaurant with 15 options on the menu, but I
* don’t know what I want to put on it. I’ve decided to ask you to create the
* items and decide how much they’ll cost because I’m not very creative. I need
* 5 appetizers, 5 entrees, and 5 desserts. And then the restaurant will begin
* taking orders. We are only willing to take 20 orders from the drive through.
* Customers are only able to order 1 item. Every time a car pulls up the drive
* through worker will have a script to read and the menu must appear.
*
* After all 20 orders happen, a summary must appear with this information:
* - Total money made
* - Percentage of sales for each item
* - A list of items ordered with the number of times they’re ordered.
*/


public class Restaurant {
    public static void main(String[] args) {
        // Initialize the menu items and prices
        String[] menuItems = {
            "Bruschetta", "Calamari Fritti", "Carpaccio", "Polpette", "Antipasto Misto", // 5 appetizers
            "Spaghetti Carbonara", "Risotto Ai Funghi", "Ossobuco", "Saltimbocca", "Frutti Di Mare", // 5 entrees
            "Tiramisu", "Cannoli", "Panna Cotta", "Gelato", "Sfogliatella" // 5 desserts
        };
        double[] prices = {
            5.99, 6.99, 7.99, 8.99, 9.99,
            10.99, 11.99, 12.99, 13.99, 14.99,
            3.99, 4.99, 5.99, 6.99, 7.99
        };

        int[] orders = new int[15];
        double totalSales = 0.0;

        Scanner scanner = new Scanner(System.in);

        // Initialize successfulOrders to 0. This variable will keep track of
        // the number of successfully completed orders.
        int successfulOrders = 0;

        // Start a loop that will run until 20 successful orders have been made.
        while (successfulOrders < 20) {
            // Display the current order number out of 20
            System.out.println("Order " + (successfulOrders + 1) + " of 20.");
            
            // Display the menu
            System.out.println("Welcome to 'Veloce Italiano' drive-through! Here's our menu:");
            for (int j = 0; j < menuItems.length; j++) {
                System.out.println(j + 1 + ". " + menuItems[j] + " - $" + prices[j]);
            }

            // Take the order
            System.out.print("Please enter the number of the item you'd like to order: ");

            // Attempt to get the user's choice and validate it.
            // If an invalid input type is entered, catch the exception and prompt again.
            try {
                int choice = scanner.nextInt();

                // Validate that the entered choice is a menu item number (1-15).
                if (choice < 1 || choice > 15) {
                    System.out.println("Invalid choice. Please choose between 1 and 15.");
                    continue;
                }
                
                // Update order counts and total sales
                orders[choice - 1]++;
                totalSales += prices[choice - 1];
                System.out.println("Thanks for choosing us, You've ordered " + menuItems[choice - 1] + " for $" + prices[choice - 1]);

                // Add a space line for the next customer
                System.out.println();

                successfulOrders++;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number between 1 and 15.");
                scanner.nextLine();  // Clear the invalid input
            }

            // If 20 orders have been reached, close the drive-through
            if (successfulOrders == 20) {
                System.out.println("The drive-through is now closed. Come back tomorrow to taste our delicious food.");
                break;
            }
        }

        // Display the summary
        System.out.println("Total money made: $" + totalSales);
        for (int i = 0; i < menuItems.length; i++) {
            double percentage = ((double) orders[i] / 20) * 100;
            System.out.println(menuItems[i] + ": " + percentage + "% sales, " + orders[i] + " orders");
        }

        scanner.close();
    }
}
