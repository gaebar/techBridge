package com.example.MyLibraryApp;
/**
 * The Book class represents a single book in a library.
 * It contains details such as the name of the book, the author's name, genre, ISBN, and publish date.
 * The book's availability and loan period are also included.
 */
public class Book {
    // Class variables
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

    /**
     * Overrides the default toString() method inherited from the Object class.
     * 
     * The @Override annotation is used to indicate that this method is intended to override a method in the superclass.
     * This custom implementation provides a more informative and human-readable string representation of the Book object.
     * It displays important attributes such as the title, author's first and last name, and ISBN.
     * 
     * Without this custom implementation, invoking toString() would yield a non-informative result like "Book@4e25154f," 
     * which is the default behavior of the Object class's toString() method. This default output is generally not useful 
     * for understanding the state of the Book object.
     * 
     * @return A string containing detailed information about this book, making it easier to understand the object's state.
     */
    @Override
    public String toString() {
        return String.format("Title: %s, Author: %s %s, ISBN: %s", nameOfBook, authorFirstName, authorLastName, ISBN);
    }
}
