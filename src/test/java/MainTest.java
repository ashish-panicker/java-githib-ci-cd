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

}
