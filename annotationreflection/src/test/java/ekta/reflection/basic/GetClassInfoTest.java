package ekta.reflection.basic;

import org.junit.jupiter.api.Test;

import ekta.reflection.basic.GetClassInfo;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GetClassInfoTest {
    @Test
    void testGetClassDetails() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        GetClassInfo.getClassDetails("java.lang.String");

        String output = outputStream.toString();
        assertTrue(output.contains("Class Name: java.lang.String"));
        assertTrue(output.contains("Methods:"));
        assertTrue(output.contains("Fields:"));
        assertTrue(output.contains("Constructors:"));
    }
}
