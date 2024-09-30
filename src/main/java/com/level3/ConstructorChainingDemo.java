package com.level3;

class ConstructorChaining {
    // Default constructor
    public ConstructorChaining() {
        // Call the second constructor with an argument value of 20
        this(20);
        System.out.println("Default Constructor called.");
    }

    // Second constructor: parameterized constructor with one argument
    public ConstructorChaining(int x) {
        System.out.println("Second Constructor called with x = " + x);
    }

    // Third constructor: parameterized constructor with two arguments
    public ConstructorChaining(int x, int y) {
        // Call the default constructor using this()
        this();
        System.out.println("Third Constructor called with x = " + x + " and y = " + y);
        System.out.println("Sum of x and y: " + (x + y));
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        // Call the third constructor with two arguments (11 and 12)
        ConstructorChaining obj = new ConstructorChaining(11, 12);
    }
}
