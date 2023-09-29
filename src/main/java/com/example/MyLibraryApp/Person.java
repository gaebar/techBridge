package com.example.MyLibraryApp;

public class Person {
    // Class variables
    String firstName;
    String lastName;
    String email;
    String phoneNumber;

    public Person(String firstName, String lastName, String email, String phoneNumber){
        // Constructor initializes all the fields of a person
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    // Method to return the full name of the person
    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }
}
