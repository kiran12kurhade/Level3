package com.level3;

// Super class
class SuperClass {
    String superString;

    // Constructor of SuperClass that initializes the string
    public SuperClass(String str) {
        this.superString = str;
        System.out.println("SuperClass Constructor called: " + superString);
    }
}

// Sub class extending SuperClass
class SubClass extends SuperClass {
    String subString;

    // Constructor of SubClass that initializes the string and calls the SuperClass constructor
    public SubClass(String superStr, String subStr) {
        // Call the SuperClass constructor to initialize the superString
        super(superStr);

        // Initialize the subString
        this.subString = subStr;
        System.out.println("SubClass Constructor called: " + subString);
    }
}

// Main class to demonstrate the functionality
public class StringConstructorDemo {
    public static void main(String[] args) {
        // Create an object of SubClass and pass values for both superString and subString
        SubClass obj = new SubClass("Hello from Super Class", "Hello from Sub Class");

        // Print the strings initialized in both classes
        System.out.println("\nSuper Class String: " + obj.superString);
        System.out.println("Sub Class String: " + obj.subString);
    }
}

