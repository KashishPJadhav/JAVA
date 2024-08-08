import java.util.Scanner;
interface  Stack
{
    public void push();
    public void pop();
    public void disps();
}
interface Queue
{
    public void enqueue();
    public void dequeue();
    public void dispq();
}
public class List implements Stack,Queue
{
    int s[];
    int q[];
    int top=-1;
    int f=-1;
    int r=-1;
    int size;
    public List(int sa)
    {
        this.size=sa;
        s=new int[size];
        q=new int[size];
    }
    public void enqueue()
    {
       if(r==size-1)
       {
        System.out.println("Queue Overflow");
       }
       else
       {
        System.out.print("Enter element : ");
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        r++;
        q[r]=e;
        if (f == -1) f = 0; // Initializing front of queue
        System.out.println("\nQueued Successfully");
       }
    }
    public void dequeue()
    {
        if(f==-1|| f>r)
        {
            System.out.println("Queue Underflow");
        }
        else
        {
            int t=q[f];
            System.out.println("Dequeued element is : "+t);
            f++;
            if(f>r)
            {
                f=-1;
                r=-1;
            }
        }
    }
    public void dispq()
    {
        System.out.println("Queue Status : ");
        if(f==-1)
        {
            System.out.println("Queue Empty");
        }
        else
        {
            for(int i=f;i<=r;i++)
            {
                System.out.print(q[i]+" ");
            }
        };
    }
    public void push()
    {
        if(top==size-1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            System.out.print("Enter element : ");
            Scanner sc=new Scanner(System.in);
            int e=sc.nextInt();
            top++;
            s[top]=e;
            System.out.println("\nPushed Succesfully");
        }
    }
    public void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            int t;
            t=s[top];
            top--;
            System.out.println("Poped element is : "+t);
        }
    }
    public void disps()
    {
        System.out.println("Stack Status : ");
        if(top==-1)
        {
            System.out.println("Stack Empty");
        }
        else
        {
            for(int i=0;i<=top;i++)
            {
                System.out.print(s[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter size : ");
        int size =sc.nextInt();
        System.out.println("\n1.Stack \n2.Queue \nEnter Choice : ");
        int c=sc.nextInt();
        if(c==1)
        {
            Stack a=new List(size);
        int ch=0;

        while(ch!=4)
        {
        System.out.println("\n1.Push \n2.Pop \n3.Display \n4.exit \nEnter choice : ");
        ch=sc.nextInt();
        if(ch==1)
        {
            a.push();
        }
        else if(ch==2)
        {
            a.pop();
        }
        else if(ch==3)
        {
            a.disps();
        }
        else
        {
            System.out.println("Invalid choice");
        }
        }
        }
        else if(c==2)
        {
            Queue a=new List(size);
            int ch=0;
    
            while(ch!=4)
            {
            System.out.println("\n1.Enqueue \n2.Dequeue \n3.Display \n4.exit \nEnter choice : ");
            ch=sc.nextInt();
            if(ch==1)
            {
                a.enqueue();
            }
            else if(ch==2)
            {
                a.dequeue();
            }
            else if(ch==3)
            {
                a.dispq();
            }
            else
            {
                System.out.println("Invalid choice");
            }
            }
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
}
