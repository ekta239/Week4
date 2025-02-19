import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

import Ekta.filestream.*;

class UpperToLowerConverterTest {
    private static final String INPUT_FILE = "test_input.txt";
    private static final String OUTPUT_FILE = "test_output.txt";

    @BeforeEach
    void setUp() throws IOException {
        // Create test input file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(INPUT_FILE))) {
            writer.write("HELLO WORLD\nTHIS IS A TEST\nJAVA IS AWESOME!");
        }
    }

    @Test
    void testConvertFile() throws IOException {
        // Run conversion method
        UpperToLowerConverter.convertFile(INPUT_FILE, OUTPUT_FILE);

        // Verify output file exists
        File outputFile = new File(OUTPUT_FILE);
        assertTrue(outputFile.exists(), "Output file should be created");

        // Verify content
        try (BufferedReader reader = new BufferedReader(new FileReader(OUTPUT_FILE))) {
            assertEquals("hello world", reader.readLine(), "First line should be lowercase");
            assertEquals("this is a test", reader.readLine(), "Second line should be lowercase");
            assertEquals("java is awesome!", reader.readLine(), "Third line should be lowercase");
        }
    }

    @AfterEach
    void tearDown() {
        new File(INPUT_FILE).delete();  // Cleanup test input file
        new File(OUTPUT_FILE).delete(); // Cleanup test output file
    }
}
