package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Java CI/CD");

        String input = "Hello, World!";
        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);

        String greeting = getGreeting("Alice");
        System.out.println(greeting);

        String defaultGreeting = getGreeting(null);
        System.out.println(defaultGreeting);

        String employeeId = createEmployeeId(45);
        System.out.println("Employee ID: " + employeeId);

        String name = "prasad";
        System.out.println(nameUpperCase(name));

        // Test palindrome
        String word = "Race car";
        System.out.println("Is '" + word + "' palindrome? " + isPalindrome(word));
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

    /**
     * Creates a unique employee ID starting with 'E' followed by a zero-padded
     * number.
     * Example: If id is 45, the returned string will be "E00045".
     * 
     * @param id the numeric part of the employee ID
     * @return the formatted employee ID string
     */
    public static String createEmployeeId(int id) {
        return String.format("E%05d", id);
    }

    /**
     * Change lower case letters to upper case.
     * 
     * @param name the name to convert
     * @return upper case name
     */
    public static String nameUpperCase(String name) {
        return name.toUpperCase();
    }

    /**
     * Checks if the given string is a palindrome (case-insensitive).
     * Ignores spaces.
     * 
     * @param input the string to check
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {
        if (input == null) return false;
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
}
