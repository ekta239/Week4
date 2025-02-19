package ekta.reflection.basic;

import org.junit.jupiter.api.Test;

import ekta.reflection.basic.DynamicObjectCreation;
import ekta.reflection.basic.Student;

import static org.junit.jupiter.api.Assertions.*;

public class DynamicObjectCreationTest {
    @Test
    void testDynamicObjectCreation() throws Exception {
        Student student1 = DynamicObjectCreation.createStudentInstance();
        assertEquals("Default Student", student1.getName());

        Student student2 = DynamicObjectCreation.createStudentInstance("John Doe");
        assertEquals("John Doe", student2.getName());
    }
}
