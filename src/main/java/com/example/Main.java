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
}