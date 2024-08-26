import java.util.Scanner;
class Person
{
    String name; int date,month,year; float height,weight; String address;
    Person(String a,int b,int c,int d,float e,float f,String g)
    {this.name=a; this.date=b; this.month=c; this.year=d;this.height=e;this.weight=f;this.address=g;}
    public void calculateAge()
    {
        int days=0;
        int presenty=2024;
        if(year>2024)
        {System.out.println("Invalid Year ");
        return;}
        if(date>31 || date<1)
        {System.out.println("Invalid Date ");
        return;}
        if(month==2)
        {
            if((year%4==0 && year%100!=0)|| year%400==0)
            { if(date>29)
                {System.out.println("Invalid Date ");
                return;}
                days=29-date;}
            else
            {if(date>28)
                {System.out.println("Invalid Date ");
                return;}
                days=28-date;}
        }
        else if(month>12 || month<1)
        {System.out.println("Invalid Month ");
    return;}
        else{
            if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            {if(date==30)
                {System.out.println("Invalid Date ");
                return;}
                days=31-date;}
            else
            {if(date==30)
                {System.out.println("Invalid Date ");
                return;}
                days=30-date;}
        }
        month--;
        year++;
        int ms=12-month;
        days=days+230;
        while(days>31)
        {
            days=days-30;
            ms++;
        }
        while(ms>12)
        {
            ms=ms-12;
            presenty++;
        }
        presenty=presenty-year;
        System.out.println("Age is : "+presenty +" Years "+ms +" Months " + days +" Days ");
    }
}
class Student extends Person
{
    String rollno; int marks[];
    Student(String a,int b,int c,int d,float e,float f,String g,String h,int i[])
    {
        super(a,b,c,d,e,f,g);
        this.rollno=h;
        this.marks=i;
    }
    public float claculateAvg()
    {
        float sum=0;
        for(int j=0;j<5;j++)
        {sum=sum+marks[j];}
        return sum/5;
    }
}
class Employee extends Person
{
    String EmpID; int Salary;
    Employee(String a,int b,int c,int d,float e,float f,String g,String h,int i)
    {
        super(a,b,c,d,e,f,g);
       this.EmpID=h;
       this.Salary=i;
    }
    public float claculateTax(float t)
    {
        t=t/100;
        return Salary-Salary*t;
    }
}



public class InheritanceTest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Scanner str=new Scanner(System.in);
        System.out.print("\nEnter Name : ");
        String a=str.nextLine();
        System.out.print("\nEnter Birth date : ");
        int b=sc.nextInt();
        System.out.print("\nEnter Birth month : ");
        int c=sc.nextInt();
        System.out.print("\nEnter Birth Year : ");
        int d=sc.nextInt();
        System.out.print("\nEnter Height : ");
        float e=sc.nextFloat();
        System.out.print("\nEnter Weight : ");
        float f=sc.nextFloat();
        System.out.print("\nEnter Address : ");
        String g=str.nextLine();
        System.out.print("\n1.Student \n2.Employee \nEnter Choice : ");
        int ch=sc.nextInt();
        if(ch==1)
        {
            int mks[]=new int[5];
           System.out.print("\nEnter Roll no : ");
           String r=str.nextLine();
           System.out.print("\nEnter Marks of 5 subjects : ");
           for(int i=0;i<5;i++)
           { mks[i]=sc.nextInt();}
           Student stu=new Student(a,b,c,d,e,f,g,r,mks);
           stu.calculateAge();
           System.out.println("\nAverage is : "+ stu.claculateAvg());
        }
        else if(ch==2)
        {
           System.out.print("\nEnter Employee ID : ");
           String emp=str.nextLine();
           System.out.print("\nEnter Salary : ");
           int sal=sc.nextInt();
           System.out.print("\nEnter Tax Percentage : ");
           float t=sc.nextFloat();
           Employee emp2=new Employee(a,b,c,d,e,f,g,emp,sal);
           emp2.calculateAge();
           System.out.println("\nSalary After Tax is : "+ emp2.claculateTax(t));
        }
        else
        {
            System.out.println("Invalid Choice ");
            return;
        }
    }
    
}
