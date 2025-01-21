import java.lang.*;
class Complex
{
    int img;
    int real;
    public void init(int a,int b)
    {
        img=a;real=b;
    }
}
public class three{
    public static void main(String[] args)
    {
       int i=Integer.parseInt(args[0]);
       int r=Integer.parseInt(args[1]); 
       Complex c=new Complex();
       c.init(i,r);
       System.out.println("Complex number is : "+i+"i+"+r);
    }
}