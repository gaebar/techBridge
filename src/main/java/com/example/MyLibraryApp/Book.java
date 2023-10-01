package com.example.MyLibraryApp;

// Notes:
// 1. I am using Javadoc comments even for this small class as a practice exercise to familiarize myself with the Javadoc tool.
// 2. While we haven't covered getters and setters in class yet, I've learned that making class variables private 
//    necessitates the use of getter and setter methods. This is because private variables are not accessible outside 
//    of the class they are defined in. Getters and setters provide controlled access to these private variables, 
//    allowing them to be read or modified in a safe manner while preserving encapsulation and data integrity.


/**
 * The Book class represents a single book in a library.
 * It contains details such as the name of the book, the author's name, genre, ISBN, and publish date.
 * The book's availability and loan period are also included.
 */
public class Book {
    // Class variables (set to private)
    private String nameOfBook;
    private String authorFirstName;
    private String authorLastName;
    private String genre;
    private String ISBN;
    private String publishDate;
    private boolean isAvailable;
    private int loanPeriod;
    
    /**
     * Constructor to initialize a new Book object.
     *The 'this' keyword is used to differentiate between instance variables and constructor parameters with the same name.

     *
     * @param nameOfBook      The name of the book.
     * @param authorFirstName The first name of the author.
     * @param authorLastName  The last name of the author.
     * @param genre           The genre of the book.
     * @param ISBN            The ISBN of the book.
     * @param publishDate     The publish date of the book.
     * @param isAvailable     The availability status of the book.
     * @param loanPeriod      The loan period of the book in days.
     */
    public Book(String nameOfBook, String authorFirstName, String authorLastName,
                String genre, String ISBN, String publishDate, boolean isAvailable, int loanPeriod) {
        this.nameOfBook = nameOfBook;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.genre = genre;
        this.ISBN = ISBN;
        this.publishDate = publishDate;
        this.isAvailable = isAvailable;
        this.loanPeriod = loanPeriod;
    }
}
