import java.io.*;

public class StudentInfo {
    public static void main(String[] args) {
        try {
            // Get student details from user
            DataInputStream dis = new DataInputStream(System.in);
            System.out.print("Enter Student Name: ");
            String name = dis.readLine();
            System.out.print("Enter Student Age: ");
            String age = dis.readLine();
            System.out.print("Enter Student Grade: ");
            String grade = dis.readLine();

            // Write student details to a file
            FileOutputStream fos = new FileOutputStream("StudentRecord.txt", true);
            fos.write(("Name: " + name + "\n").getBytes());
            fos.write(("Age: " + age + "\n").getBytes());
            fos.write(("Grade: " + grade + "\n").getBytes());
            fos.write(("----------------------\n").getBytes());
            fos.close();
            System.out.println("\nStudent details saved to file.");

            // Read and display student details from the file
            try (BufferedReader bf = new BufferedReader(new FileReader("StudentRecord.txt"))) { // Fixed the filename here
                System.out.println("File contents:");
                String line;
                while ((line = bf.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}