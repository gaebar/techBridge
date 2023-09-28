package com.example;

import java.util.Scanner;

/**
 * Arrays Challenge
 * I always dreamed of having a restaurant with 15 options on the menu, but I 
 * don’t know what I want to put on it. I’ve decided to ask you to create the 
 * items and decide how much they’ll cost because i’m not very creative. I need 
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
            "Appetizer1", "Appetizer2", "Appetizer3", "Appetizer4", "Appetizer5",
            "Entree1", "Entree2", "Entree3", "Entree4", "Entree5",
            "Dessert1", "Dessert2", "Dessert3", "Dessert4", "Dessert5"
        };
        double[] prices = {
            5.99, 6.99, 7.99, 8.99, 9.99,
            10.99, 11.99, 12.99, 13.99, 14.99,
            3.99, 4.99, 5.99, 6.99, 7.99
        };
        
        int[] orders = new int[15];
        double totalSales = 0.0;
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 20; i++) {
            // Display the menu
            System.out.println("Welcome to the drive through! Here's our menu:");
            for (int j = 0; j < menuItems.length; j++) {
                System.out.println(j + 1 + ". " + menuItems[j] + " - $" + prices[j]);
            }
            
            // Take the order
            System.out.print("Please enter the number of the item you'd like to order: ");
            int choice = scanner.nextInt();
            
            // Update order counts and total sales
            orders[choice - 1]++;
            totalSales += prices[choice - 1];
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
