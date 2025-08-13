package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Java CI/CD");
        String input = "Hello, World!";
        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);

    }

    /**
     * Reverses the input string.
     * 
     * @param input the string to reverse
     * @return the reversed string, or null if input is null
     */
    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    /**
     * Generates a greeting message.
     * 
     * @param name the name to include in the greeting
     *             If name is null or empty, returns a default greeting.
     * @return the greeting message
     */
    public static String getGreeting(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello, Guest!";
        }
        return "Hello, " + name + "!";
    }
}