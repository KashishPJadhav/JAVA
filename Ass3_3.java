import java.util.Scanner;
public class Ass3_3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String s=sc.nextLine();
        String[] p=s.split(" ");
        int c=0;
        for(int i=0;i<p.length;i++)
        {
            System.out.println(p[i]);
            c++;
        }
        System.out.println("total words are : "+c);
    }
}