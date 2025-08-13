import org.junit.jupiter.api.Test;

import com.example.Main;

public class MainTest {

    @Test
    public void testReverseString() {
        String input = "Hello, World!";
        String expected = "!dlroW ,olleH";
        String actual = Main.reverseString(input);
        assert expected.equals(actual) : "Expected: " + expected + ", but got: " + actual;
    }

    @Test
    public void testReverseStringWithNull() {
        String input = null;
        String actual = Main.reverseString(input);
        assert actual == null : "Expected null, but got: " + actual;
    }

    @Test
    public void testGetGreetingWithName() {
        String name = "Alice";
        String expected = "Hello, Alice!";
        String actual = Main.getGreeting(name);
        assert expected.equals(actual) : "Expected: " + expected + ", but got: " + actual;
    }

    @Test
    public void testGetGreetingWithNull() {
        String name = null;
        String expected = "Hello, Guest!";
        String actual = Main.getGreeting(name);
        assert expected.equals(actual) : "Expected: " + expected + ", but got: " + actual;
    }

    @Test
    public void testGetGreetingWithEmptyString() {
        String name = "";
        String expected = "Hello, Guest!";
        String actual = Main.getGreeting(name);
        assert expected.equals(actual) : "Expected: " + expected + ", but got: " + actual;
    }

    @Test
    public void testCreateEmployeeId() {
        int id = 45;
        String expected = "E00045"; 
        String actual = Main.createEmployeeId(id);
        assert expected.equals(actual) : "Expected: " + expected + ", but got: " + actual;
    }

    @Test
    public void testCreateEmployeeIdWithZero() {
        int id = 0;
        String expected = "E00000"; 
        String actual = Main.createEmployeeId(id);
        assert expected.equals(actual) : "Expected: " + expected + ", but got: " + actual;
    }
    @Test
    public void testChangeNameWithLower(){
        String name = "prasad";
        String expected = "PRASAD";
        String acutal = Main.nameUpperCase(name);
        assert expected.equals(actual) : "Expected: " + expected + ", but got: " + actual;
    }
     @Test
    public void testChangeNameWithUpper(){
        String name = "PRASAD";
        String expected = "PRASAD";
        String acutal = Main.nameUpperCase(name);
        assert expected.equals(actual) : "Expected: " + expected + ", but got: " + actual;
    }

     @Test
    public void testSumWithPositiveNumbers() {
        int a = 5;
        int b = 10;
        int expected = 15;
        int actual = Main.sum(a, b);
        assert expected == actual : "Expected: " + expected + ", but got: " + actual;
    }

    @Test
    public void testSumWithNegativeNumbers() {
        int a = -3;
        int b = -7;
        int expected = -10;
        int actual = Main.sum(a, b);
        assert expected == actual : "Expected: " + expected + ", but got: " + actual;
    }

    @Test
    public void testSumWithPositiveAndNegativeNumber() {
        int a = 8;
        int b = -5;
        int expected = 3;
        int actual = Main.sum(a, b);
        assert expected == actual : "Expected: " + expected + ", but got: " + actual;
    }

    @Test
    public void testSumWithZero() {
        int a = 0;
        int b = 7;
        int expected = 7;
        int actual = Main.sum(a, b);
        assert expected == actual : "Expected: " + expected + ", but got: " + actual;
    }

}
