import java.util.InputMismatchException;
import java.util.Scanner;

public class AdditionSubtractionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = 0, b = 0;
        boolean validInput = false;

        // Input validation loop
        while (!validInput) {
            try {
                System.out.println("Enter the value of a and b: ");
                a = sc.nextInt();
                b = sc.nextInt();
                validInput = true; // Input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integers only.");
                sc.next(); // Clear the invalid input
            }
        }

        int sum = a + b;
        if (sum > 1000) {
            System.out.println("Too Long Addition exception: The sum exceeds 1000.");
        }

        int sub = a - b;
        if (sub < 0) {
            System.out.println("Too Long Negative exception: The result is negative.");
        }

        System.out.println("Program is ended");
        sc.close();
    }
}