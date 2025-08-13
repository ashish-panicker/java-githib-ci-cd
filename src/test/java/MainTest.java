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
        String departmentCode;
        String actual = Main.createEmployeeId(id, departmentCode);
        assert expected.equals(actual) : "Expected: " + expected + ", but got: " + actual;
    }

    @Test
    public void testCreateEmployeeIdWithZero() {
        int id = 0;
        String expected = "E00000"; 
        String actual = Main.createEmployeeId(id, "hr");
        assert expected.equals(actual) : "Expected: " + expected + ", but got: " + actual;
    }

}
