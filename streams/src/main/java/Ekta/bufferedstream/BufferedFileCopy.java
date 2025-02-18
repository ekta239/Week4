package Ekta.bufferedstream;

import java.io.*;

public class BufferedFileCopy {
    private static final int BUFFER_SIZE = 4096; // 4 KB

    public static void main(String[] args) {
        String sourceFile = "destination.txt";  // Replace with actual large file path
        String bufferedDestFile = "bufferedCopy.txt";
        String unbufferedDestFile = "unbufferedCopy.txt";

        // Measure performance of Buffered Streams
        long bufferedTime = copyFileWithBuffer(sourceFile, bufferedDestFile);
        System.out.println("Buffered Copy Time: " + bufferedTime + " nanoseconds");

        // Measure performance of Unbuffered Streams
        long unbufferedTime = copyFileWithoutBuffer(sourceFile, unbufferedDestFile);
        System.out.println("Unbuffered Copy Time: " + unbufferedTime + " nanoseconds");
    }

    // Method for Buffered Stream Copy
    public static long copyFileWithBuffer(String source, String destination) {
        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }

    // Method for Unbuffered Stream Copy
    public static long copyFileWithoutBuffer(String source, String destination) {
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
        return System.nanoTime() - startTime;
    }
}
