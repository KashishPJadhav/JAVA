class A{
    float r;
    A()
    {
        this.r=2;
    }
    public double area()
    {
        double b=3.14*r*r;
        return b;
    }
    public double circum()
    {
        return 2*3.14*r;
    }
}
public class Circle {
    public static void main(String[] args)
    {
        A a=new A();
        System.out.println("Radius is : "+a.r);
        System.out.println("Area is : "+a.area());
        System.out.println("Circumference is : "+a.circum());
    }
    
}
