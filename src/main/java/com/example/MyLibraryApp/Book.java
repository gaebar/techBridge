package com.example.MyLibraryApp;


// The Book class represents a single book in the library
public class Book {
    // Class variables
    String nameOfBook;
    String authorFirstName;
    String authorLastName;
    String genre;
    String ISBN;
    String publishDate;
    double price;
    
    // Constructor initializes all the fields of a book
    public Book(String nameOfBook, String authorFirstName, String authorLastName,
                String genre, String ISBN, String publishDate, double price) {
        this.nameOfBook = nameOfBook;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.genre = genre;
        this.ISBN = ISBN;
        this.publishDate = publishDate;
        this.price = price;
    }
}
