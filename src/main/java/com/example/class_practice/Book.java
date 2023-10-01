package com.example.class_practice;

import java.util.ArrayList;

class Book {
    String nameOfBook;
    String authorFirstName;
    String authorLastName;
    String genre;
    String ISBN;
    String publishDate;
    double price;  // Changed from String to double for better manipulation
    
    // Constructor
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

class Person {
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    
    // Constructor
    public Person(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    // Method to get full name
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}

class Library {
    ArrayList<Book> Books = new ArrayList<>();
    ArrayList<Person> Customers = new ArrayList<>();
    String libraryName;
    String location;
    String date;
    boolean inStock;
    
    // 1. Add New Book
    public void addNewBook(Book book) {
        Books.add(book);
    }
    
    // 2. Remove from inventory
    public void removeFromInventory(String ISBN) {
        Books.removeIf(book -> book.ISBN.equals(ISBN));
    }
    
    // 3. Order new book (For simplicity, let's return boolean)
    public boolean orderNewBook(String nameOfBook) {
        // Logic for ordering new book
        return true;
    }
    
    // 4. Check stock
    public boolean isBookInStock(String ISBN) {
        return Books.stream().anyMatch(book -> book.ISBN.equals(ISBN));
    }
    
    // 5. Get Book Title
    public String getBookTitle(String ISBN) {
        for (Book book : Books) {
            if (book.ISBN.equals(ISBN)) {
                return book.nameOfBook;
            }
        }
        return "Did not find book";
    }
    
    // 6. Add customer
    public void addCustomer(Person person) {
        Customers.add(person);
    }
    
    // 7. Check if person is a customer
    public boolean isCustomer(String email) {
        return Customers.stream().anyMatch(customer -> customer.email.equals(email));
    }
    
    // 8. List all books in a genre
    public ArrayList<String> listBooksInGenre(String genre) {
        ArrayList<String> bookNames = new ArrayList<>();
        for (Book book : Books) {
            if (book.genre.equals(genre)) {
                bookNames.add(book.nameOfBook);
            }
        }
        return bookNames;
    }
    
    // 9. Get book price
    public double getBookPrice(String ISBN) {
        for (Book book : Books) {
            if (book.ISBN.equals(ISBN)) {
                return book.price;
            }
        }
        return -1.0;
    }
    
    // 10. Get customer full name by email
    public String getCustomerNameByEmail(String email) {
        for (Person customer : Customers) {
            if (customer.email.equals(email)) {
                return customer.getFullName();
            }
        }
        return "Customer not found";
    }

    public static void main(String[] args) {
        Library myLib = new Library();
        
        // Add a book
        myLib.addNewBook(new Book("1984", "George", "Orwell", "Dystopian", "1234567890", "1949-06-08", 9.99));
        
        // Remove a book from inventory
        myLib.removeFromInventory("1234567890");
    }
}

