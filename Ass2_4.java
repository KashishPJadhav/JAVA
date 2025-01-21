import java.util.Scanner;
class A{
    public static int factorial(int n)
    {
        if(n>=1)
        {
            return n*factorial(n-1);
        }
        else{
            return 1;
        }
    }
    public static boolean isPrime(int n)
    {
        if(n==0 || n==1)
        {
            return true;
        }
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void printPositiveNegative(int n)
    {
          if(n>0)
          {
            System.out.println(n+" is positive");
          }
          else if(n<0)
          {
            System.out.println(n+" is negative");
          }
          else
          {
            System.out.println(n+" is zero");
          }
    }
}
public class Ass2_4
{
    public static void main(String[] args)
    {
           A a =new A();
           System.out.print("0.Exit\n1.Factorial\n2.Prime\n3.Positive or negative\nEnter choice: ");
           Scanner sc = new Scanner(System.in);
           int choice;
   
           do {
               System.out.print("\n0. Exit\n1. Factorial\n2. Prime\n3. Positive or Negative\nEnter your choice: ");
               choice = sc.nextInt();
   
               switch (choice) {
                   case 1:
                       System.out.print("Enter a number to find the factorial: ");
                       int factNum = sc.nextInt();
                       System.out.println("Factorial is: " + A.factorial(factNum));
                       break;
   
                   case 2:
                       System.out.print("Enter a number to check if it's prime: ");
                       int primeNum = sc.nextInt();
                       System.out.println("Is Prime: " + A.isPrime(primeNum));
                       break;
   
                   case 3:
                       System.out.print("Enter a number to check if it's positive or negative: ");
                       int posNegNum = sc.nextInt();
                       A.printPositiveNegative(posNegNum);
                       break;
   
                   case 0:
                       System.out.println("Exiting...");
                       break;
   
                   default:
                       System.out.println("Invalid choice. Please try again.");
               }
           } while (choice != 0);
   
           sc.close();
       }
           
           
    }
