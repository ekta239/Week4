import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;
import Ekta.filehandling.*;
class FileReadWriteTest {
    private static final String SOURCE_FILE = "testSource.txt";
    private static final String DEST_FILE = "testDestination.txt";

    @BeforeEach
    void setUp() throws IOException {
        // Create a test source file
        try (FileWriter writer = new FileWriter(SOURCE_FILE)) {
            writer.write("Hello, this is a test file!");
        }
    }

    @Test
    void testFileCopy() {
        FileReadWrite.main(new String[]{});
        File destFile = new File(DEST_FILE);
        assertFalse(destFile.exists(), "Destination file should be created");

        try (BufferedReader reader = new BufferedReader(new FileReader(DEST_FILE))) {
            String content = reader.readLine();
            assertEquals("Hello, this is a test file!", content, "File content should match");
        } catch (IOException e) {
            fail("Error reading the destination file: " + e.getMessage());
        }
    }

    @AfterEach
    void tearDown() {
        new File(SOURCE_FILE).delete();
        new File(DEST_FILE).delete();
    }
}
