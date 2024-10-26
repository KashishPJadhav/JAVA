import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two strings from input
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        // 1. Sum the lengths of a and b
        int lengthSum = a.length() + b.length();
        System.out.println(lengthSum);

        // 2. Check if a is lexicographically greater than b
        if (a.compareTo(b) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Capitalize the first letter of a and b and print them
        String capitalizedA = a.substring(0, 1).toUpperCase() + a.substring(1);
        String capitalizedB = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

        scanner.close();
    }
}



