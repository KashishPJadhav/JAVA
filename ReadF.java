import java.io.*;
import java.util.Scanner;

public class ReadF {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name: "); // Prompt the user for input
        String fn = sc.nextLine();

        File file = new File(fn);
        if (file.exists()) {
            try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
                System.out.println("File contents:");
                String line;
                while ((line = bf.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file: " + e.getMessage());
            }

            System.out.println("Do you want to add contents to the file: 'yes/no'");
            String response = sc.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                System.out.println("Enter contents to be added: ");
                String c = sc.nextLine();
                try (FileWriter wr = new FileWriter(file, true)) { // Open in append mode
                    wr.write(c + System.lineSeparator()); // Write the new content and add a new line
                } catch (IOException e) {
                    System.out.println("Error occurred while writing: " + e.getMessage());
                }
            } else {
                System.out.println("No changes.");
            }
        } else {
            System.out.println("File not found");
        }
        
        sc.close(); // Close the Scanner to avoid resource leaks
    }
}