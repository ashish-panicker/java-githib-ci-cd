import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.example.Main;

public class MainTest {

    @Test
    public void testReverseString() {
        String input = "Hello, World!";
        String expected = "!dlroW ,olleH";
        String actual = Main.reverseString(input);
        assertEquals(expected, actual, "Expected: " + expected + ", but got: " + actual);
    }

    @Test
    public void testReverseStringWithNull() {
        String input = null;
        String actual = Main.reverseString(input);
        assertNull(actual, "Expected null, but got: " + actual);
    }

    @Test
    public void testGetGreetingWithName() {
        String name = "Alice";
        String expected = "Hello, Alice!";
        String actual = Main.getGreeting(name);
        assertEquals(expected, actual, "Expected: " + expected + ", but got: " + actual);
    }

    @Test
    public void testGetGreetingWithNull() {
        String name = null;
        String expected = "Hello, Guest!";
        String actual = Main.getGreeting(name);
        assertEquals(expected, actual, "Expected: " + expected + ", but got: " + actual);
    }

    @Test
    public void testGetGreetingWithEmptyString() {
        String name = "";
        String expected = "Hello, Guest!";
        String actual = Main.getGreeting(name);
        assertEquals(expected, actual, "Expected: " + expected + ", but got: " + actual);
    }

    @Test
    public void testCreateEmployeeIdWithZero() {
        int id = 0;
        String departmentId = "HR01";
        String expected = "E00000HR01";
        String actual = Main.createEmployeeId(id, departmentId);
        assertEquals(expected, actual, "Expected: " + expected + ", but got: " + actual);
    }

    @Test
    public void testCreateEmployeeId() {
        int id = 45;
        String departmentId = "HR01";
        String expected = "E00045HR01";
        String actual = Main.createEmployeeId(id, departmentId);
        assertEquals(expected, actual, "Expected: " + expected + ", but got: " + actual);
    }
}