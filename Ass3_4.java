import java.util.Scanner;

public class Ass3_4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        try{
            string st=new string();
            String s=sc.nextLine();
            st.sets(s);
        }
        catch(ExceptionLineTooLong e)
        {
            System.out.println("Invalid value " + e.getInvalidValue());
            System.out.println("Message : "+e.getMessage());
        }
    }
}