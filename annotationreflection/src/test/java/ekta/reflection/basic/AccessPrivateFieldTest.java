package ekta.reflection.basic;

import org.junit.jupiter.api.Test;

import ekta.reflection.basic.AccessPrivateField;
import ekta.reflection.basic.Person;

import static org.junit.jupiter.api.Assertions.*;

public class AccessPrivateFieldTest {
    @Test
    void testAccessPrivateField() throws Exception {
        Person person = new Person(25);

        assertEquals(25, AccessPrivateField.getPrivateAge(person));

        AccessPrivateField.setPrivateAge(person, 30);
        assertEquals(30, AccessPrivateField.getPrivateAge(person));
    }
}
