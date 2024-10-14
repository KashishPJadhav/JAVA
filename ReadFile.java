import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the file name from the user
        System.out.print("Enter the name of the file: ");
        String fileName = scanner.nextLine();

        // Read contents of the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Ask if the user wants to add content to the file
        System.out.print("Do you want to add contents to the file? (1 for yes, 0 for no): ");
        int response = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        if (response == 1) {
            System.out.print("Enter the content to append to the file: ");
            String content = scanner.nextLine();

            // Write to the file
            try (FileOutputStream fos = new FileOutputStream(fileName, true)) {
                fos.write(content.getBytes());
                fos.write(System.lineSeparator().getBytes()); // New line after content
                System.out.println("Content appended to the file successfully.");
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        } else {
            System.out.println("No changes made to the file.");
        }

        // Close the scanner
        scanner.close();
    }
}
