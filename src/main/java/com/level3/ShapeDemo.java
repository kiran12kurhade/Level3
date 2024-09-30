package com.level3;

// Shape Interface
interface Shape {
    // Method to take input
    void input();

    // Method to calculate area
    double area();
}

// Circle class that implements Shape interface
class Circle implements Shape {
    private double radius;

    // Implement input() method
    @Override
    public void input() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
    }

    // Implement area() method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class that implements Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;

    // Implement input() method
    @Override
    public void input() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = sc.nextDouble();
    }

    // Implement area() method
    @Override
    public double area() {
        return length * width;
    }
}

// Main class to demonstrate the functionality
public class ShapeDemo {
    public static void main(String[] args) {

        // Create objects of Circle and Rectangle
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        // Input and calculate the area of the circle
        System.out.println("Circle:");
        circle.input();
        System.out.println("Area of Circle: " + circle.area());

        // Input and calculate the area of the rectangle
        System.out.println("\nRectangle:");
        rectangle.input();
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}

