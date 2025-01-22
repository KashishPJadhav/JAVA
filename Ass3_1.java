import java.util.Scanner;
public class Ass3_1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String[] array=new String[4];
        String s;
        for(int i=0;i<4;i++)
        {
            System.out.print("Enter string :  ");
            array[i]=sc.nextLine();;
        }
        for(int i=0;i<4;i++)
        {
            System.out.println("String "+(i+1)+" : "+array[i]);
        }
        System.out.println("String with vowels at end : ");
        int l=0;
        char c;
        for(int i=0;i<4;i++)
        {
             l=array[i].length();
             c=array[i].charAt(l-1);
             if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u')
             {
                System.out.println("String : "+array[i]);
             }
        }
    }
}