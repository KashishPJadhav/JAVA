public class string
{
    private String s;
    public void sets(String a)
    {
        if(a.length>80)
        {
            throw new ExceptionLineTooLong(s);
        }
        this.s=a;
    }
    public String gets()
    {
        return s;
        ystem.out.println("Message : "+e.getMessage());
    }
}
