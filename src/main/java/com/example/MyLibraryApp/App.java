package com.example.MyLibraryApp;

/**
 * Assignment:
 * Expand your bookshtore/library class. Create all methods and class variables. 
    Use creativity to make sure all methods are varioables get us3ed.
    - There must be at least 10 methods
    - There must be at least 10 variables

    create a Person class that representes a customer along wioth all methods &
    class variables.
 */

// The App class serves as the entry point for the application
public class App {
    public static void main(String[] args) {
        // Initialize library
        Library myLib = new Library("Sammamish Public Library", "Sammamish, WA", "1998-12-15");

        // Enhanced console output
        System.out.println(String.format("%-35s", "=============================="));
        System.out.println(String.format("%-35s", "        WELCOME TO THE         "));
        System.out.println(String.format("%-35s", "     SAMMAMISH LIBRARY APP     "));
        System.out.println(String.format("%-35s", "=============================="));
        
        // Add new books
        myLib.addNewBook(new Book("La Tagliatrice di Vermi", "Gaetano", "Barreca", "Foreign Fiction", "1549976664", "2017-10-13", 14.99));
        myLib.addNewBook(new Book("Dopo il Funerale", "Gaetano", "Barreca", "Foreign Novel", "1533621918", "2016-06-04", 12.99));
        
        // Add a new customer
        myLib.addCustomer(new Person("Maria", "Alvarez", "mariaal@email.com", "123-456-7890"));
        
        // Scenario: Remove a book from inventory
        System.out.println("Removing book with ISBN 1549976664...");
        myLib.removeFromInventory("1549976664");
        System.out.println("Is La tagliatrice di Vermi still in stock? " + myLib.isBookInStock("1549976664"));
        
        // Scenario: Order a new book
        System.out.println("Ordering a new book...");
        if (myLib.orderNewBook("My Brilliant Friend")) {
            System.out.println("Successfully ordered a new book!");
        }

        // Scenario: Check if the book is in stock by ISBN
        System.out.println("Is Dopo il Funerale in stock? " + myLib.isBookInStock("1533621918"));
        
        // Scenario: Get the title of a book by ISBN
        System.out.println("The book with ISBN 1533621918 is titled: " + myLib.getBookTitle("1533621918"));
        
        // Scenario: Check if Maria is a customer by email
        System.out.println("Is Maria a customer? " + myLib.isCustomer("mariaal@email.com"));
        
        // Scenario: Get the full name of a customer by email
        System.out.println("Full name of the customer with email mariaal@email.com: " + myLib.getCustomerNameByEmail("mariaal@email.com"));

        // Scenario: List all books in the Classic genre
        System.out.println("Books in the Foreign Novel genre: " + myLib.listBooksInGenre("Foreign Novel"));
        
        // Scenario: Get the price of a book by ISBN
        System.out.println("Price of Dopo il Funerale: $" + myLib.getBookPrice("1533621918"));
        
        // Display library information
        myLib.displayLibraryInfo();
    }
}