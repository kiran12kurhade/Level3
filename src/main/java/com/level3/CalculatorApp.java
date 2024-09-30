package com.level3;

// Abstract parent class Calculator
abstract class Calculator {

    // Abstract methods
    public abstract double add(double a, double b);
    public abstract double subtract(double a, double b);
    public abstract double multiply(double a, double b);
    public abstract double divide(double a, double b);
}

// Child class that extends the abstract Calculator class
class BasicCalculator extends Calculator {

    // Implement the abstract methods
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        // Check for division by zero
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
}

// Main class to demonstrate the calculator
public class CalculatorApp {
    public static void main(String[] args) {
        // Create an object of the child class
        BasicCalculator calc = new BasicCalculator();

        // Call the implemented methods
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));
        System.out.println("Division by zero: " + calc.divide(10, 0));
    }
}
