package com.example.MyLibraryApp;

// The MyLibraryApp class serves as the entry point for the application
public class MyLibraryApp {
    public static void main(String[] args) {

        // Initialize the library instance
        Library myLib = new Library("Sammamish Public Library", "Sammamish, WA", "1998-12-15");

        // Display welcome message
        System.out.println(String.format("%-35s", "=============================="));
        System.out.println(String.format("%-35s", "        WELCOME TO THE         "));
        System.out.println(String.format("%-35s", "     SAMMAMISH LIBRARY APP     "));
        System.out.println(String.format("%-35s", "=============================="));

        // Add new books to the library
        // Create book instances and add them to the library's inventory
        Book book1 = new Book("La Tagliatrice di Vermi", "Gaetano", "Barreca", "Foreign Fiction", "1549976664", "2017-10-13", true, 14);
        Book book2 = new Book("Dopo il Funerale", "Gaetano", "Barreca", "Foreign Novel", "1533621918", "2016-06-04", true, 19);
        myLib.addNewBook(book1);
        myLib.addNewBook(book2);

        // Confirm addition of new books
        // Print out details of the newly added books
        System.out.println("Successfully added the book: " + book1.toString());
        System.out.println("Successfully added the book: " + book2.toString());

        // Add a new customer to the library
        // Create a Person instance representing a customer and add them to the library's customer list
        Person customer1 = new Person("Maria", "Alvarez", "mariaal@email.com", "123-456-7890");
        myLib.addCustomer(customer1);
        // Confirm addition of new customer
        // Print out details of the newly added customer
        System.out.println("Successfully added the customer: " + customer1.toString());

        // Scenario: Remove a book from inventory
        System.out.println("Removing book with ISBN 1549976664...");
        myLib.removeFromInventory("1549976664");
        System.out.println("Is La Tagliatrice di Vermi still available? " + myLib.isBookAvailable("1549976664"));

        // Scenario: Order a new book
        String bookToOrder = "My Brilliant Friend";
        System.out.println("Ordering a new book: " + bookToOrder);
        if (myLib.orderNewBook(bookToOrder)) {
            System.out.println("Successfully ordered the new book: " + bookToOrder);
        }

        // Various other scenarios to demonstrate the library's functionalities
        // Each scenario demonstrates a specific functionality of the Library class
        System.out.println("The book with ISBN 1533621918 is titled: " + myLib.bookTitle("1533621918"));
        System.out.println("Is Dopo il Funerale available? " + myLib.isBookAvailable("1533621918"));
        System.out.println("Books in the Foreign Novel genre: " + myLib.listBooksInGenre("Foreign Novel"));
        System.out.println("Loan period for the book with ISBN 1533621918: " + myLib.bookLoanPeriod("1533621918") + " days");
        System.out.println("Is Maria a customer? " + myLib.isCustomer("mariaal@email.com"));
        System.out.println("Full name of the customer with email mariaal@email.com: " + myLib.customerNameByEmail("mariaal@email.com"));
        
        myLib.displayCustomerInfo("mariaal@email.com");

        // Display general information about the library
        // This method will output an overview of the library's status
        myLib.displayLibraryInfo();
    }
}