package ekta.reflection.advanced;

import org.junit.jupiter.api.Test;

import ekta.reflection.advanced.JsonSerializer;
import ekta.reflection.advanced.Person;

import static org.junit.jupiter.api.Assertions.*;

public class JsonSerializerTest {
    @Test
    void testJsonSerialization() throws IllegalAccessException {
        Person person = new Person();
        String json = JsonSerializer.toJson(person);
        assertTrue(json.contains("\"name\"=Alice"));
        assertTrue(json.contains("\"age\"=25"));
    }
}
