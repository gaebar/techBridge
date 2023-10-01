package com.example.MyLibraryApp;

import java.util.ArrayList;

// The Library class represents the entire library system
public class Library {
    // Class variables

    // I am using ArrayLists instead of arrays for books and customers because ArrayLists are dynamic in size
    // and provide built-in methods for easy manipulation (add, remove, etc.)
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Person> customers = new ArrayList<>();
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

    /**
     * 1. Adds a new book to the library inventory.
     * @param book The book to add.
     */
    public void addNewBook(Book book) {
        if (book != null) {
            books.add(book);
        }
    }


    // Utilizes ArrayList's removeIf method for efficient conditional removal

    /**
     * 2. Removes a book from the library inventory based on ISBN.
     * @param ISBN The ISBN of the book to remove.
     */
    public void removeFromInventory(String ISBN) {
        books.removeIf(book -> ISBN != null && ISBN.equals(book.ISBN));
    }

    /**
     * 3. Orders a new book.
     * @param nameOfBook The name of the book to order.
     * @return A boolean indicating the success of the order.
     */
    public boolean orderNewBook(String nameOfBook) {
        // Logic to order the book
        return true; // Simplified to always return true for now
    }


    /**
     * 4. Retrieves the title of a book based on its ISBN.
     * @param ISBN The ISBN of the book.
     * @return The title of the book, or a message if the book is not found.
     */
    public String getBookTitle(String ISBN) {
        for (Book book : books) {
            if (ISBN != null && ISBN.equals(book.ISBN)) {
                return book.nameOfBook;
            }
        }
        return "Book not found";
    }

    /**
     * 5. Adds a new customer to the library.
     * @param person The customer to add.
     */
    public void addCustomer(Person person) {
        if (person != null) {
            customers.add(person);
        }
    }

    /**
     * 6. Checks if a person is already a customer based on their email.
     * @param email The email address to check.
     * @return A boolean indicating if the person is already a customer.
     */

    // NOTE: reference for Java stream = https://stackoverflow.com/questions/34174112/how-to-return-a-default-boolean-value-in-java-streams-if-element-not-found/34174187#34174187
    public boolean isCustomer(String email) {
        return customers.stream().anyMatch(customer -> email != null && email.equals(customer.email));
    }

    /**
     * 7. Lists all books in a specific genre.
     * @param genre The genre to list books for.
     * @return An ArrayList of book titles in the specified genre.
     */
    public ArrayList<String> listBooksInGenre(String genre) {
        ArrayList<String> bookNames = new ArrayList<>();
        for (Book book : books) {
            if (genre != null && genre.equals(book.genre)) {
                bookNames.add(book.nameOfBook);
            }
        }
        return bookNames;
    }


    /**
     * 8. Checks if a book is available in the library based on its ISBN.
     * @param ISBN The ISBN of the book to check.
     * @return A boolean indicating if the book is available for checkout.
     */

    public boolean isBookAvailable(String ISBN) {
        for (Book book : books) {
            if (book.ISBN.equals(ISBN)) {
                return book.isAvailable;
            }
        }
        return false;  // Returns false if book is not found
    }

    /**
     * 9. Retrieves the loan period of a book based on its ISBN.
     * @param ISBN The ISBN of the book to check.
     * @return The loan period in days, or -1 if the book is not found.
     */

    public int getBookLoanPeriod(String ISBN) {
        for (Book book : books) {
            if (book.ISBN.equals(ISBN)) {
                return book.loanPeriod;
            }
        }
        return -1;  // Returns -1 if book is not found
    }

    /**
     * 10. Retrieves the full name of a customer based on their email.
     * @param email The email address of the customer.
     * @return The full name of the customer, or a message if the customer is not found.
     */
    public String getCustomerNameByEmail(String email) {
        for (Person customer : customers) {
            if (email != null && email.equals(customer.email)) {
                return customer.getFullName();
            }
        }
        return "Customer not found";
    }

    /**
     * 11. Displays the information about the library, such as its name, location, 
     *     and operational status.
     */
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
