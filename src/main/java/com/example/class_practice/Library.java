// Check teacher = Book.java

package com.example.class_practice;

import java.util.ArrayList;

public class Library {

    // Data fields for the Library (Book) class
    private String title;
    private String author;
    private String ISBN;
    private ArrayList<String> customers = new ArrayList<>();
    private String genre;
    private String date;
    private boolean inStock;
    private String[] Books;

    // Constructor
    public Library(String title, String author, String ISBN, String genre) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
    }

    // Getter for book title
    public String getBookTitle() {
        return this.title;
    }

    // Method to add a new book
    public void addNewBook(String title, String author, String ISBN, String genre) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
    }

    // Method to remove a book
    public void removeBook() {
        this.title = null;
        this.author = null;
        this.ISBN = null;
        this.genre = null;
    }

    // Method to add a customer
    public void addCustomer(String customerName) {
        this.customers.add(customerName);
    }

    // Set the date of book acquisition
    public void setDate(String date) {
        this.date = date;
    }

    // Check if the book is in stock
    public boolean isInStock() {
        return this.inStock;
    }

    // Set the book stock status
    public void setStockStatus(boolean inStock) {
        this.inStock = inStock;
    }

    public static void main(String[] args) {
        // Instantiate your Library object and interact with it here
        Library myLibrary = new Library("1984", "George Orwell", "1234567890", "Dystopian");
        System.out.println("Added book with title: " + myLibrary.getBookTitle());

        // Add a customer
        myLibrary.addCustomer("John");

        // Set the date and check stock status
        myLibrary.setDate("2022-09-30");
        myLibrary.setStockStatus(true);
        System.out.println("Is the book in stock? " + myLibrary.isInStock());

        // Remove the book
        myLibrary.removeBook();
        System.out.println("Removed book, title is now: " + myLibrary.getBookTitle());
    }
}
