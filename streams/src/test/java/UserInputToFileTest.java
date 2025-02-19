import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

import Ekta.userinputfromconsole.*;

class UserInputToFileTest {
    private static final String TEST_FILE = "user_data.txt";

    @BeforeEach
    void setUp() {
        new File(TEST_FILE).delete(); // Ensure clean test environment
    }

    @Test
    void testUserInputToFile() throws IOException {
        // Simulate user input: name, age, and favorite language
        String simulatedInput = "Alice\n25\nJava\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        // Run main method
        UserInputToFile.main(new String[]{});

        // Verify the file exists
        File file = new File(TEST_FILE);
        assertTrue(file.exists(), "File should be created");

        // Verify file contents
        try (BufferedReader reader = new BufferedReader(new FileReader(TEST_FILE))) {
            String line = reader.readLine();
            assertEquals("Name: Alice, Age: 25, Language: Java", line, "File content should match input");
        }
    }

    @AfterEach
    void tearDown() {
        new File(TEST_FILE).delete(); // Cleanup test file
    }
}
