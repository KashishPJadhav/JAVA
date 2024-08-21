import java.util.Scanner;
public class Arithmetic2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a[]= new float[5];
        float b;

        System.out.println("\nEnter 5 dividend : ");
        for(int i=0;i<5;i++)
        {
             System.out.print("Dividend "+ (i+1) +" : ");
             a[i]=sc.nextFloat();
        }
        System.out.println("\nEnter divisor : ");
        b=sc.nextFloat();
        float c[]=new float[5];
        System.out.println("\nAnswers : ");
        try
        {
           if(b==0)
            {
                System.out.println("Division by zero is not allowed");
            }
        
            else
            {
                for(int i=0;i<5;i++)
                {
                 c[i]=a[i]/b;
                System.out.println("Answer "+(i+1)+" : "+ c[i]);
                }
            }
        }
    
        catch( Exception e )
        {
            System.out.println("Arithmetic Exception");
        }
        sc.close();
    }
}