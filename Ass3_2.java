import java.util.Scanner;
public class Ass3_2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string : ");
        String s=sc.nextLine();
        s=s.toLowerCase();
        StringBuffer sb=new StringBuffer(s);
        StringBuffer sb2=new StringBuffer(sb);
        System.out.println("String : "+sb);
        sb.reverse();
        if(sb.toString().equals(sb2.toString()))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("No Palindrome");
        }
        

    }
}