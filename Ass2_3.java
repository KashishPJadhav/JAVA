class person
{
    int age;
    String name;
    person(int a,String n)
    {
        this.age=a;
        this.name=n;
    }
}
class employee extends person{
    private int id;
    protected float sal;
    private String dept;
    employee(int a, String b,int c,float d,String e)
    {
        super(a,b);
        this.id=c;
        this.sal=d;
        this.dept=e;
    }
    public void display()
    {
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("ID : "+this.id);
        System.out.println("Salary : "+this.sal);
        System.out.println("Department : "+this.dept);

    }

}
public class Ass2_3
{
    public static void main(String[] args)
    {
          employee e=new employee(20,"Kashish",1,3000.00f,"AI");
          e.display();
    }
}
