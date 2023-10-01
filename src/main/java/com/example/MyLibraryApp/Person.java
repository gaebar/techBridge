package com.example.MyLibraryApp;

/**
 * The Person class represents an individual person with basic personal details.
 * It contains information such as the first name, last name, email, and phone number.
 */

public class Person {
    // Class variables
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    /**
     * Constructor to initialize a new Person object.
     * 
     * @param firstName   The first name of the person.
     * @param lastName    The last name of the person.
     * @param email       The email address of the person.
     * @param phoneNumber The phone number of the person.
     */
    public Person(String firstName, String lastName, String email, String phoneNumber){
        // Constructor initializes all the fields of a person
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * Returns the full name of the person.
     * 
     * @return A string representing the full name, which is a concatenation of first name and last name.
     */
    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }
}
