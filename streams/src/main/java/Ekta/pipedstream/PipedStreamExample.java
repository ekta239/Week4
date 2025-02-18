package Ekta.pipedstream;

import java.io.*;

class WriterThread extends Thread {
    public staticPipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try (pos) {
            String message = "Hello from Writer Thread!";
            pos.write(message.getBytes());
            System.out.println("Writer: Data written.");
        } catch (IOException e) {
            System.out.println("Writer Error: " + e.getMessage());
        }
    }
}

class ReaderThread extends Thread {
    private PipedInputStream pis;

    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }
    
    @Override
    public void run() {
        try (pis) {
            byte[] buffer = new byte[1024];
            int length = pis.read(buffer);
            String receivedMessage = new String(buffer, 0, length);
            System.out.println("Reader: Received - " + receivedMessage);
        } catch (IOException e) {
            System.out.println("Reader Error: " + e.getMessage());
        }
    }
}

public class PipedStreamExample {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            WriterThread writer = new WriterThread(pos);
            ReaderThread reader = new ReaderThread(pis);

            writer.start();
            reader.start();

            writer.join();
            reader.join();

        } catch (IOException | InterruptedException e) {
            System.out.println("Main Thread Error: " + e.getMessage());
        }
    }
}
