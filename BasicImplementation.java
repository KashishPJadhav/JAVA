import java.util.*;

class BasicImplementation {
    static final int maxsize=100;
    static int[] stack=new int[maxsize];
    static int index=-1;

    public static void pushOP(){
        Scanner sc=new Scanner(System.in);
        if(index==maxsize-1){
            System.out.println("Stack overflow");
        }
        else{
            System.out.println("Enter element in stack");
            int stack_element=sc.nextInt();
            index++;
            stack[index]=stack_element;
        }
    }

    public static void popOp()
    {
        if(index==-1){
            System.out.println("Stack is empty");
        }
        else{
            int n=stack[index];
            index--;
            System.out.println("Element is deleted "+n);
        }
    }
    public static void print()
    {
        if(index==-1)
        {
            System.out.println(" Stack empty");
        }
        else{
        System.out.println("Elements of stack are : ");
            for(int i=index;i>=0;i--)
        {
            System.out.println(stack[i]);
        }
        }
        
    }
    public static void main(String[] args) {
        int ch=0;
        while(ch!=4)
        {
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter : \n1.Push\n2.Pop\n3.Display\n4.Exit");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            pushOP();
            break;

            case 2:
            popOp();
            break;

            case 3:
            print();
            break;

            default:
            System.out.println( "Invalid choice");
            break;
        }
        }
       
    }

}
