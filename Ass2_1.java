import java.util.Scanner;

class Triangle {
    private int side1;
    private int side2;
    private int side3; 
    Triangle()
    {
        side1=0;
        side2=0;
        side3=0;
    }
    public int get1()
    {return side1;}
    public int get2()
    {return side2;}
    public int get3()
    {return side3;}
    public void set1(int s)
    {this.side1=s;}
    public void set2(int s)
    {this.side2=s;}
    public void set3(int s)
    {this.side3=s;}

    public void accept()
    {   Scanner sc=new Scanner(System.in);
        System.out.print("Enter side 1 : ");
        int a=sc.nextInt();
        set1(a);
        System.out.print("\nEnter side 2 : ");
        int b=sc.nextInt();
        set2(b);
        System.out.print("\nEnter side 3 : ");
        int c=sc.nextInt();
        set3(c);
    }
    public void display()
    {
        System.out.println("Side 1: "+this.side1);
        System.out.println("Side 2: "+this.side2);
        System.out.println("Side 3: "+this.side3);
    }
     public int calperi()
     {
        return side1+side2+side3;
     }
     public boolean isvalid()
     {
        if(((side1+side2)>side3)||((side1+side3)>side2)||((side3+side2)>side1))
        {
            return true;
        }
        else
        {return false;}
     }
}
public class Ass2_1
{
    public static void main(String[] args)
    {
        Triangle t[] = new Triangle[4];
        for(int i=0;i<4;i++)
        {
            t[i]=new Triangle();
            System.out.println("For Triangle "+(i+1)+" : ");
            t[i].accept();
    
        }
        for(int i=0;i<4;i++)
        {
            if(t[i].isvalid())
            {
            System.out.println("For Triangle "+(i+1)+" : ");
               t[i].display();
               System.out.println("Perimeter is : "+t[i].calperi());
            }
    
        }
    }
    
}
