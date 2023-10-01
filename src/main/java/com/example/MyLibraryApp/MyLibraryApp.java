package com.example.MyLibraryApp;
/**
 * Assignment:
 * Expand your bookstore/library class. Create all methods and class variables. 
    Use creativity to make sure all methods and variables get used.
    - There must be at least 10 methods
    - There must be at least 10 variables

    create a Person class that representes a customer along with all methods &
    class variables.
 */

// Note:
// I am using Javadoc comments even for this small class as a practice exercise to familiarize myself with the Javadoc tool.


// The App class serves as the entry point for the application
public class MyLibraryApp {
    public static void main(String[] args) {
        // Initialize library
        Library myLib = new Library("Sammamish Public Library", "Sammamish, WA", "1998-12-15");

        // Add new books
        myLib.addNewBook(new Book("La Tagliatrice di Vermi", "Gaetano", "Barreca", "Foreign Fiction", "1549976664", "2017-10-13", true, 14));
        myLib.addNewBook(new Book("Dopo il Funerale", "Gaetano", "Barreca", "Foreign Novel", "1533621918", "2016-06-04", true, 19));

        // Add a new customer
        myLib.addCustomer(new Person("Maria", "Alvarez", "mariaal@email.com", "123-456-7890"));

        // Scenario: Remove a book from inventory
        System.out.println("Removing book with ISBN 1549976664...");
        myLib.removeFromInventory("1549976664");
        System.out.println("Is La Tagliatrice di Vermi still in stock? " + myLib.isBookInStock("1549976664"));

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

        // Scenario: List all books in the Foreign Novel genre
        System.out.println("Books in the Foreign Novel genre: " + myLib.listBooksInGenre("Foreign Novel"));

        // Display library information
        myLib.displayLibraryInfo();
    }
}