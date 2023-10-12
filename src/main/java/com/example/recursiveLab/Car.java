package com.example.recursiveLab;

public class Car extends Vehicle {

    public Car(String color) {
        this.color = color;
    }

    // Override the accelerate method
    @Override
    public void accelerate() {
        System.out.println("The " + color + " car is accelerating quickly.");
    }

    // Override the brake method
    @Override
    protected void brake() {
        System.out.println("The " + color + " car is braking smoothly.");
    }
}
