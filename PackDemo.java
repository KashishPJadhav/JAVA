import MyMath.Trig;
import MyMath.Arithmetic;
import MyMath.Stat;
import java.util.Scanner;
public class PackDemo {
    public static void main(String[] args) {
        // Trigonometric operations
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Degrees :");
        int a=sc.nextInt();
        if(a<0 && a>360)
        {
            System.out.println("\nInvalid Angle.");
            return;
        }
        Trig trig = new Trig(a); 
        System.out.println("\nSine: " + trig.getSine());
        System.out.println("Cosine: " + trig.getCosine());
        System.out.println("Tangent: " + trig.getTangent());
        System.out.println("Secant: " + trig.getSecant());
        System.out.println("Cosecant: " + trig.getCosecant());
        System.out.println("Cotangent: " + trig.getCotangent());

        // Arithmetic operations
        System.out.print("Enter 1st number : ");
        int b=sc.nextInt();
        System.out.print("\nEnter 2nd number : ");
        int c=sc.nextInt();
        Arithmetic arithmetic = new Arithmetic();
        System.out.println("\nAddition: " + arithmetic.add(b,c));
        System.out.println("Subtraction: " + arithmetic.subtract(b,c));
        System.out.println("Multiplication: " + arithmetic.multiply(b,c));
        System.out.println("Division: " + arithmetic.divide(b,c));

        // Statistical operations
        System.out.print("Enter Array Size : ");
        int d=sc.nextInt();
        int[] numbers = new int[d];
        System.out.print("\nEnter Array : ");
        for(int i=0;i<d;i++)
        {
            numbers[i]=sc.nextInt();
        }
        Stat stat = new Stat();
        System.out.println("Minimum: " + stat.min(numbers));
        System.out.println("Maximum: " + stat.max(numbers));
        System.out.println("Count: " + stat.count(numbers));
        System.out.println("Sum: " + stat.sum(numbers));
        System.out.println("Average: " + stat.average(numbers));
    }
}
