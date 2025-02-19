import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;
import Ekta.bufferedstream.*;

class BufferedFileCopyTest {
    private static final String SOURCE_FILE = "testLargeFile.txt";
    private static final String BUFFERED_DEST = "testBufferedCopy.txt";
    private static final String UNBUFFERED_DEST = "testUnbufferedCopy.txt";
    private static final int FILE_SIZE_MB = 100;

    @BeforeAll
    static void setUp() throws IOException {
        // Create a large test file (100MB)
        try (FileOutputStream fos = new FileOutputStream(SOURCE_FILE)) {
            byte[] buffer = new byte[1024 * 1024]; // 1 MB chunk
            for (int i = 0; i < FILE_SIZE_MB; i++) {
                fos.write(buffer);
            }
        }
    }

    @Test
    void testBufferedFileCopy() {
        long timeTaken = BufferedFileCopy.copyFileWithBuffer(SOURCE_FILE, BUFFERED_DEST);
        File file = new File(BUFFERED_DEST);
        assertTrue(file.exists(), "Buffered copy file should exist");
        assertEquals(new File(SOURCE_FILE).length(), file.length(), "File sizes should match");
        System.out.println("Buffered Copy Time: " + timeTaken + " nanoseconds");
    }

    @Test
    void testUnbufferedFileCopy() {
        long timeTaken = BufferedFileCopy.copyFileWithoutBuffer(SOURCE_FILE, UNBUFFERED_DEST);
        File file = new File(UNBUFFERED_DEST);
        assertTrue(file.exists(), "Unbuffered copy file should exist");
        assertEquals(new File(SOURCE_FILE).length(), file.length(), "File sizes should match");
        System.out.println("Unbuffered Copy Time: " + timeTaken + " nanoseconds");
    }

    @AfterAll
    static void tearDown() {
        new File(SOURCE_FILE).delete();
        new File(BUFFERED_DEST).delete();
        new File(UNBUFFERED_DEST).delete();
    }
}
