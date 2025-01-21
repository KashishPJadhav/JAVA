import java.util.Scanner;
import java.lang.*;
public class Double{
    public static void main(String[] args)
    {
        double a,b;
        System.out.print("Enter 1st no. : ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        System.out.print("Enter 2nd no. : ");
        b=sc.nextDouble();
        sc.close();
        double c;
        if(a>b)
        {c=a;}
        else
        {c=b;}
        System.out.println("MAX : "+c);

    }
}