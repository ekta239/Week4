package ekta.annotation;
import org.junit.jupiter.api.Test;

import ekta.annotations.maxlength.*;

import static org.junit.jupiter.api.Assertions.*;
public class UserValidatorTest {
    @Test
    void testMaxLengthValidation() throws Exception {
        Exception exception = assertThrows(IllegalArgumentException.class, 
            () -> new User("VeryLongUsername"));
        assertEquals("Username exceeds max length!", exception.getMessage());
        
        User validUser = new User("ShortName");
        assertEquals("ShortName", validUser.getUsername());
    }
}
