import java.util.Scanner;
import java.util.ArrayList;
public class Ass4_3
{
    public static void main(String[] args)
    {
        ArrayList<Integer> ar=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=1;
        int c=1;
        while(c!=0)
        {
            System.out.print("0.Exit\n1.Enter elements\nEnter choice : ");
            c=sc.nextInt();
            switch(c)
            {
                case 1:
                System.out.print("Enter ele : ");
                n=sc.nextInt();
                ar.add(n);
                break;
                
                case 0:
                System.out.println("Exiting....");
                break; 

                default :
                System.out.println("\nInvalid Choice.");
            }
        }
        System.out.println("List is : "+ar);
        System.out.print("Enter element to be inserted : ");
        n=sc.nextInt();
        System.out.print("\nEnter position : ");
        c=sc.nextInt();

        ar.set(c-1,n);
        System.out.println("List is : "+ar);
        
    } 
}