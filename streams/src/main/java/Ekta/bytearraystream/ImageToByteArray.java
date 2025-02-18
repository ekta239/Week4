package Ekta.bytearraystream;

import java.io.*;

public class ImageToByteArray {
    // Method to convert an image file to a byte array
    public static byte[] imageToByteArray(String imagePath) {
        try (FileInputStream fis = new FileInputStream(imagePath);
             ByteArrayOutputStream bos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            return bos.toByteArray();

        } catch (IOException e) {
            System.out.println("Error converting image to byte array: " + e.getMessage());
            return null;
        }
    }

    // Method to write a byte array back to an image file
    public static void byteArrayToImage(byte[] imageBytes, String outputPath) {
        try (ByteArrayInputStream bis = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Image written successfully to " + outputPath);

        } catch (IOException e) {
            System.out.println("Error writing byte array to image file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String inputImage = "original.jpg";   // Replace with actual image file path
        String outputImage = "copy.jpg";      // New image file

        byte[] imageBytes = imageToByteArray(inputImage);
        if (imageBytes != null) {
            byteArrayToImage(imageBytes, outputImage);
        }
    }
}
