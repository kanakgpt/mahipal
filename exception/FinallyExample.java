package com.example.crud.exception;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        }
        catch (NullPointerException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        finally {
            System.out.println("This block will always execute.");
        }
    }
    public static int divide(int a, int b) {
        return a / b; // This will throw ArithmeticException if b is 0
    }
}
