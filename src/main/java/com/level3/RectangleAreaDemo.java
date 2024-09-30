package com.level3;

import java.util.Scanner;

class Rectangles{

    // Method to calculate and print the area of the rectangle
    public void calculateArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("The area of the rectangle is: " + area);
    }
}

public class RectangleAreaDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Create an object of the Rectangle class
        Rectangles rectangle = new Rectangles();

        // Call the calculateArea method with length and breadth as parameters
        rectangle.calculateArea(length, breadth);
    }
}

