package com.level3;

// Outer class
class OuterClass {

    // Static inner class
    static class InnerClass {

        // Non-static method in inner class
        public void show() {
            System.out.println("This is a method of the static inner class.");
        }
    }
}

// Main class to test the functionality
public class StaticInnerClassDemo {
    public static void main(String[] args) {

        // Create an object of the static inner class
        OuterClass.InnerClass innerObject = new OuterClass.InnerClass();

        // Call the show() method using the inner class object
        innerObject.show();
    }
}
