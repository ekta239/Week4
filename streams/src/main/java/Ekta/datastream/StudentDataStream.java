package Ekta.datastream;
import java.io.*;

public class StudentDataStream {
    private static final String FILE_NAME = "students.dat";

    // Method to store student details in a binary file
    public static void writeStudentData(int rollNumber, String name, double gpa) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME, true))) {
            dos.writeInt(rollNumber);
            dos.writeUTF(name);
            dos.writeDouble(gpa);
            System.out.println("Student data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing student data: " + e.getMessage());
        }
    }

    // Method to read student details from a binary file
    public static void readStudentData() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            System.out.println("Reading Student Data:");
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        writeStudentData(101, "Alice", 3.8);
        writeStudentData(102, "Bob", 3.5);
        writeStudentData(103, "Charlie", 3.9);
        
        readStudentData();
    }
}
