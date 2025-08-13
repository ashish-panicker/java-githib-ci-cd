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

}
