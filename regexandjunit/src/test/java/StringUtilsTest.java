import org.junit.jupiter.api.Test;

import com.junit.*;

import static org.junit.jupiter.api.Assertions.*;;
public class StringUtilsTest {

    @Test
    void testReverse() {
        assertEquals("olleH", StringUtils.reverse("Hello"));
    }

    @Test
    void testPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"));
        assertFalse(StringUtils.isPalindrome("hello"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", StringUtils.toUpperCase("hello"));
    }
}
