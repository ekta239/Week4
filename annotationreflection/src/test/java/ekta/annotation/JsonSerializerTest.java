package ekta.annotation;
import org.junit.jupiter.api.Test;

import ekta.annotations.jsonfieldanotation.*;

import static org.junit.jupiter.api.Assertions.*;
public class JsonSerializerTest {
    @Test
    void testJsonSerialization() throws IllegalAccessException {
        User user = new User("john_doe", "john@example.com");
        String json = user.toJson();
        assertFalse(json.contains("\"user_name\"=john_doe"));
        assertFalse(json.contains("\"user_email\"=john@example.com"));
    }
}
