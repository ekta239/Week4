import org.junit.jupiter.api.*;
import java.io.File;
import java.nio.file.Files;
import static org.junit.jupiter.api.Assertions.*;

import Ekta.bytearraystream.*;;

class ImageToByteArrayTest {
    private static final String ORIGINAL_IMAGE = "original.jpg"; // Replace with actual test image path
    private static final String OUTPUT_IMAGE = "test_copy.jpg";

    @Test
    void testImageToByteArrayConversion() throws Exception {
        File inputFile = new File(ORIGINAL_IMAGE);
        assertFalse(inputFile.exists(), "Original image file should exist");

        byte[] imageBytes = ImageToByteArray.imageToByteArray(ORIGINAL_IMAGE);
        assertNotNull(imageBytes, "Byte array should not be null");
        assertTrue(imageBytes.length > 0, "Byte array should have data");

        ImageToByteArray.byteArrayToImage(imageBytes, OUTPUT_IMAGE);
        File outputFile = new File(OUTPUT_IMAGE);
        assertTrue(outputFile.exists(), "Output image file should be created");

        // Verify file contents are identical
        byte[] originalBytes = Files.readAllBytes(inputFile.toPath());
        byte[] outputBytes = Files.readAllBytes(outputFile.toPath());
        assertArrayEquals(originalBytes, outputBytes, "Files should be identical");
    }

    @AfterEach
    void tearDown() {
        new File(OUTPUT_IMAGE).delete(); // Cleanup test file
    }
}
