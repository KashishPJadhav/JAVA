import java.util.Scanner;

public class Ass3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an instance of StringValidator
        StringValidator st = new StringValidator();

        try {
            System.out.println("Enter a string:");
            String s = sc.nextLine();

            // Validate the string
            st.setString(s);
            System.out.println("String accepted: " + st.getString());
        } catch (ExceptionLineTooLong e) {
            // Handle custom exception
            System.out.println("Invalid value: " + e.getInvalidValue());
            System.out.println("Message: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
