package com.example.MyLibraryApp;
/**
 * The Book class represents a single book in a library.
 * It contains details such as the name of the book, the author's name, genre, ISBN, and publish date.
 * The book's availability and loan period are also included.
 */
public class Book {
    // Class variables (set to private)
    String nameOfBook;
    String authorFirstName;
    String authorLastName;
    String genre;
    String ISBN;
    String publishDate;
    boolean isAvailable;
    int loanPeriod;
    
    /**
     * Constructor to initialize a new Book object.
     * The 'this' keyword is used to differentiate between instance variables and constructor parameters with the same name.
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
