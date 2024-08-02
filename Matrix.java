import java.util.Scanner;
class Matrix1
{
    Scanner sc=new Scanner(System.in);
    int s;
    int a[][]=new int[5][5];
       int b[][]=new int[5][5];
       int c[][]=new int[5][5];
       void getarray()
       {
        System.out.print("Enter Size of Matrix :");
         s=sc.nextInt();
       
       System.out.println();
       System.out.println("Enter Matrix 1 : ");
       for(int i=0;i<s;i++)
       {
        for(int j=0;j<s;j++)
        {
            a[i][j]=sc.nextInt();
        }
       }
       System.out.println("Enter Matrix 2 : ");
       for(int i=0;i<s;i++)
       {
        for(int j=0;j<s;j++)
        {
            b[i][j]=sc.nextInt();
        }
       }
       System.out.println("Matrix 1 is : ");
       for(int i=0;i<s;i++)
       {
        for(int j=0;j<s;j++)
        {
            System.out.print(a[i][j]+ " ");
        }
        System.out.println();
       }
       System.out.println("Matrix 2 is : ");
       for(int i=0;i<s;i++)
       {
        for(int j=0;j<s;j++)
        {
            System.out.print(b[i][j]+ " ");
        }
        System.out.println();
       }
       }
       void add()
       {
        
        System.out.println("Addition is : ");
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");

            }
            System.out.println();
        }
       }
       void sub()
       {
        System.out.println("Substraction is : ");
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                c[i][j]=a[i][j]-b[i][j];
                System.out.print(c[i][j]+" ");

            }
            System.out.println();
        }
       }
       void mul()
       {
        int c[][]=new int[s][s];
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                for(int k=0;k<s;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
               }
            }
        }
       
       System.out.println("Multiplication is : ");
       for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    void div()
       {
        float c[][]=new float[s][s];
        System.out.println("Division is : ");
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                c[i][j]=a[i][j]/b[i][j];
                System.out.print(c[i][j]+" ");

            }
            System.out.println();
        }
       }
       }
       
public class Matrix 
{
    public static void main(String args[])
    {
       Matrix1 M=new Matrix1();
       M.getarray();
       M.add();
       M.sub();
       M.mul();
       M.div();
    }  
}