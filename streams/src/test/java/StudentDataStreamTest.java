import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class StudentDataStreamTest {
    private static final String TEST_FILE = "test_students.dat";

    @BeforeEach
    void setUp() throws IOException {
        new File(TEST_FILE).delete(); // Ensure a clean test environment
    }

    @Test
    void testWriteAndReadStudentData() throws IOException {
        // Write test data
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(TEST_FILE))) {
            dos.writeInt(101);
            dos.writeUTF("Alice");
            dos.writeDouble(3.8);
            
            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(3.5);
        }

        // Read and verify test data
        try (DataInputStream dis = new DataInputStream(new FileInputStream(TEST_FILE))) {
            assertEquals(101, dis.readInt());
            assertEquals("Alice", dis.readUTF());
            assertEquals(3.8, dis.readDouble());

            assertEquals(102, dis.readInt());
            assertEquals("Bob", dis.readUTF());
            assertEquals(3.5, dis.readDouble());
        }
    }

    @AfterEach
    void tearDown() {
        new File(TEST_FILE).delete(); // Cleanup test file
    }
}
