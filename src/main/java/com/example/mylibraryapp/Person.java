package com.example.mylibraryapp;

/**
 * The Person class represents an individual person with basic personal details.
 * It contains information such as the first name, last name, email, and phone number.
 */

public class Person {
    // Class variables to store personal details
    String firstName;
    String lastName;
    String email;
    String phoneNumber;

    // NOTE: As the teacher explain in class, I used a String for phoneNumber for several reasons:
    // 1. Strings are immutable, providing a level of safety.
    // 2. Phone numbers can have varying formats (hyphens, spaces, parentheses, country codes, etc.),
    // which are easier to handle as strings.
    // 3. Phone numbers may start with a leading zero, which would be truncated if stored as an integer.
    // 4. There are no mathematical operations required on phone numbers, negating the need for a numerical type.

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
     * Method to get the full name of the person.
     * 
     * @return A string representing the full name, which is a concatenation of the first name and last name.
     */
    public String fullName(){
        // Concatenating the first and last name to get the full name
        return String.format("%s %s", this.firstName, this.lastName);
    }

    /**
     * Overrides the toString() method to provide a human-readable description of the Person object.
     * 
     * @return A string format displaying the person's name, email, and phone number.
     */
    @Override
    public String toString() {
        // Using String.format to organize the fields in a readable format
        // Also reusing the fullName() method to get the person's full name
        return String.format("Name: %s, Email: %s, Phone Number: %s", fullName(), email, phoneNumber);
    }
}
