import java.util.Scanner;
public class Arithmetic
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a[]= new float[5];
        float b[]=new float[5];

        System.out.println("\nEnter 5 dividend : ");
        for(int i=0;i<5;i++)
        {
             System.out.print("Dividend "+ (i+1) +" : ");
             a[i]=sc.nextFloat();
        }
        System.out.println("\nEnter 5 divisor : ");
        for(int i=0;i<5;i++)
        {
             System.out.print("Divisor "+(i+1)+" : ");
             b[i]=sc.nextFloat();
        }
        float c[]=new float[5];
        System.out.println("\nAnswers : ");
        try
        {
        for(int i=0;i<5;i++)
        { if(b[i]==0)
            {
                System.out.println("Division by zero is not allowed");
            }
            else
            {
            c[i]=a[i]/b[i];
             System.out.println("Answer "+(i+1)+" : "+ c[i]);
            }
        }
    }
        catch( Exception e )
        {
            System.out.println("Arithmetic Exception");
        }
    }
}