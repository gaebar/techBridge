package com.example.class_practice.MyLibraryApp;

import java.util.ArrayList;

// The Library class represents the entire library system
public class Library {
    // Class variables
    ArrayList<Book> Books = new ArrayList<>();
    ArrayList<Person> Customers = new ArrayList<>();
    String libraryName;
    String location;
    String date;
    boolean isOpen;

    // Constructor
    public Library(String libraryName, String location, String date) {
        this.libraryName = libraryName;
        this.location = location;
        this.date = date;
        this.isOpen = true; // Default value
    }

    // 1. Method to add a new book to the library
    public void addNewBook(Book book) {
        Books.add(book);
    }

    // 2. Method to remove a book from the library inventory by ISBN
    public void removeFromInventory(String ISBN) {
        Books.removeIf(book -> book.ISBN.equals(ISBN));
    }

    // 3. Method to order a new book (simplified)
    public boolean orderNewBook(String nameOfBook) {
        return true; // Just returns true for simplicity
    }

    // 4. Method to check if a book is in stock by ISBN
    public boolean isBookInStock(String ISBN) {
        return Books.stream().anyMatch(book -> book.ISBN.equals(ISBN));
    }

    // 5. Method to get the title of a book by ISBN
    public String getBookTitle(String ISBN) {
        for (Book book : Books) {
            if (book.ISBN.equals(ISBN)) {
                return book.nameOfBook;
            }
        }
        return "Did not find book";  // Returns this string if book is not found
    }

    // 6. Method to add a new customer to the library
    public void addCustomer(Person person) {
        Customers.add(person);
    }

    // 7. Method to check if a person is already a customer by email
    public boolean isCustomer(String email) {
        return Customers.stream().anyMatch(customer -> customer.email.equals(email));
    }

    // 8. Method to list all books in a specific genre
    public ArrayList<String> listBooksInGenre(String genre) {
        ArrayList<String> bookNames = new ArrayList<>();
        for (Book book : Books) {
            if (book.genre.equals(genre)) {
                bookNames.add(book.nameOfBook);
            }
        }
        return bookNames;
    }

    // 9. Method to get the price of a book by ISBN
    public double getBookPrice(String ISBN) {
        for (Book book : Books) {
            if (book.ISBN.equals(ISBN)) {
                return book.price;
            }
        }
        return -1.0;  // Returns -1 if book is not found
    }

    // 10. Method to get the full name of a customer by email
    public String getCustomerNameByEmail(String email) {
        for (Person customer : Customers) {
            if (customer.email.equals(email)) {
                return customer.getFullName();
            }
        }
        return "Customer not found";  // Returns this string if customer is not found
    }

    // 11. Method to display library information
    public void displayLibraryInfo() {
        System.out.println(String.format("%-35s", "=============================="));
        System.out.println(String.format("%-35s", "          LIBRARY REPORT       "));
        System.out.println(String.format("%-35s", "=============================="));
        System.out.println(String.format("Library Name: %-20s", this.libraryName));
        System.out.println(String.format("Location: %-24s", this.location));
        System.out.println(String.format("Date Established: %-14s", this.date));
        System.out.println(String.format("Currently Open: %-20b", this.isOpen));
    }
}
