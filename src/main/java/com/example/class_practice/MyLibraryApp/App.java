package com.example.class_practice.MyLibraryApp;


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
        Library myLib = new Library("Sammamish Public Library", "Sammamish, WA", "2023-09-29");

        // Enhanced console output
        System.out.println(String.format("%-35s", "=============================="));
        System.out.println(String.format("%-35s", "        WELCOME TO THE         "));
        System.out.println(String.format("%-35s", "     SAMMAMISH LIBRARY APP     "));
        System.out.println(String.format("%-35s", "=============================="));
        
        // Add new books
        myLib.addNewBook(new Book("1984", "George", "Orwell", "Dystopian", "1234567890", "1949-06-08", 9.99));
        myLib.addNewBook(new Book("To Kill a Mockingbird", "Harper", "Lee", "Classic", "0987654321", "1960-07-11", 7.99));
        
        // Add a new customer
        myLib.addCustomer(new Person("Maria", "Johnson", "maria@email.com", "123-456-7890"));
        
        // Scenario: Remove a book from inventory
        System.out.println("Removing book with ISBN 1234567890...");
        myLib.removeFromInventory("1234567890");
        System.out.println("Is 1984 still in stock? " + myLib.isBookInStock("1234567890"));
        
        // Scenario: Order a new book
        System.out.println("Ordering a new book...");
        if (myLib.orderNewBook("Brave New World")) {
            System.out.println("Successfully ordered a new book!");
        }

        // Scenario: Check if the book is in stock by ISBN
        System.out.println("Is To Kill a Mockingbird in stock? " + myLib.isBookInStock("0987654321"));
        
        // Scenario: Get the title of a book by ISBN
        System.out.println("The book with ISBN 0987654321 is titled: " + myLib.getBookTitle("0987654321"));
        
        // Scenario: Check if Maria is a customer by email
        System.out.println("Is Maria a customer? " + myLib.isCustomer("maria@email.com"));
        
        // Scenario: Get the full name of a customer by email
        System.out.println("Full name of the customer with email maria@email.com: " + myLib.getCustomerNameByEmail("maria@email.com"));

        // Scenario: List all books in the Classic genre
        System.out.println("Books in the Classic genre: " + myLib.listBooksInGenre("Classic"));
        
        // Scenario: Get the price of a book by ISBN
        System.out.println("Price of To Kill a Mockingbird: $" + myLib.getBookPrice("0987654321"));
        
        // Display library information
        myLib.displayLibraryInfo();
    }
}