import org.junit.jupiter.api.Test;

import com.junit.*;

import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
public class FileProcessorTest {

    @Test
    void testFileWriteAndRead() throws IOException {
        String filename = "test.txt";
        String content = "Hello, world!";
        FileProcessor.writeToFile(filename, content);
        assertEquals(content, FileProcessor.readFromFile(filename));
    }

    @Test
    void testFileNotFound() {
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("nonexistent.txt"));
    }
}
