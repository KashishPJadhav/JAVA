import java.util.Scanner;
public class four
{
    public static void main(String[] args)
    {
        double a,b;
        System.out.print("Enter 1st no. : ");
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextDouble() && !sc.hasNextInt())
        {
            a=sc.nextDouble();
        }
        else
        {
            System.out.print("Number is not double");
            a=0;
        }
        System.out.print("\nEnter 2nd no. : ");
        if(sc.hasNextDouble() && !sc.hasNextInt())
        {
            b=sc.nextDouble();
        }
        else
        {
            System.out.print("Number is not double");
            b=0;
        }
        double avg=(a+b)/2;
        System.out.print("\nAverage is : "+avg);
    }
}