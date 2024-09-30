package com.level3;

import java.util.Scanner;

class Cuboid {

    // Method to calculate the volume of a cuboid without parameters but with a return type
    public double calculateVolume() {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions from the user
        System.out.print("Enter the length of the cuboid: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the cuboid: ");
        double breadth = scanner.nextDouble();

        System.out.print("Enter the height of the cuboid: ");
        double height = scanner.nextDouble();

        // Calculate and return the volume of the cuboid
        return length * breadth * height;
    }
}

public class CuboidVolumeDemo {
    public static void main(String[] args) {

        // Create an object of Cuboid class
        Cuboid cuboid = new Cuboid();

        // Call the method to calculate volume and store the returned value
        double volume = cuboid.calculateVolume();

        // Display the volume of the cuboid
        System.out.println("The volume of the cuboid is: " + volume);
    }
}

