class B{
    float s;
    B()
    {
        this.s=2;
    }
    public double area()
    {
       return s*s;
    }
    public double per()
    {
        return 4*s;
    }
}
public class Square {
    public static void main(String[] args)
    {
        B a=new B();
        System.out.println("Side is : "+a.s);
        System.out.println("Area is : "+a.area());
        System.out.println("Perimeter is : "+a.per());
    }
    
}