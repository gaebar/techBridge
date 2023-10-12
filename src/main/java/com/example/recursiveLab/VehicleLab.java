package com.example.recursiveLab;

public class VehicleLab {
    public static void main(String[] args) {
        // Create a Vehicle object
        Vehicle vehicle = new Vehicle();
        vehicle.name = "Generic Vehicle";
        vehicle.speed = 70;
        vehicle.color = "Silver";
        vehicle.setFuelCapacity(60.5);

        // Test methods of Vehicle
        System.out.println("Vehicle Name: " + vehicle.name);
        System.out.println("Vehicle Speed: " + vehicle.speed + " mph");
        System.out.println("Vehicle Color: " + vehicle.color);
        System.out.println("Fuel Capacity: " + vehicle.getFuelCapacity());
        vehicle.accelerate();
        vehicle.brake();

        // Create a Car object
        Car car = new Car("Red");
        car.name = "Ferrari";
        car.speed = 220;
        car.setFuelCapacity(80.0);

        // Test methods of Car
        System.out.println("\nCar Name: " + car.name);
        System.out.println("Car Speed: " + car.speed + " mph");
        System.out.println("Car Color: " + car.color);
        System.out.println("Fuel Capacity of Car: " + car.getFuelCapacity());
        car.accelerate();
        car.brake();
    }
}
