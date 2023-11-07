package com.example.recursivelab;

// Vehicle class (Parent)
public class Vehicle {
    // Public variable: Accessible from any class in any package
    public String name;

    // Protected variable: Accessible from classes in the same package
    // or subclasses in any package
    protected int speed;
    protected String color;

    // Private variable: Accessible only within this class
    private double fuelCapacity;

    // Public method: Accessible from any class in any package
    public void accelerate() {
        System.out.println("The vehicle is accelerating");
    }

    // Protected method: Accessible from classes in the same package
    // or subclasses in any package
    protected void brake() {
        System.out.println("The vehicle is braking");
    }

    // Private method: Accessible only within this class
    private void soundHorn() {
        System.out.println("Beep! Beep!");
    }

    // Public method to set the fuel capacity
    public void setFuelCapacity(double capacity) {
        this.fuelCapacity = capacity;
    }

    // Public method to get the fuel capacity
    public double getFuelCapacity() {
        return fuelCapacity;
    }
}
