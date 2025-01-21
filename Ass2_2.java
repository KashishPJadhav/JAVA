public class Ass2_2
{
    public static void main(String[] args)
    {
        int[][] arr=new int [5][5];
        int var=1;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                arr[i][j]=var;
                var++;
            }
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Output 1: ");
        int k=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(arr[j][k]+" ");
            }
            k++;
            System.out.print("\t");
        }
        System.out.println("\nOutput 2: ");
        k=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(arr[k][j]+" ");
            }
            k++;
            System.out.print("\t");
        }
        System.out.println("\nOutput 2: ");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i==j)
                {
                    System.out.print(arr[i][j]+" ");
                }    
            }
        }
        System.out.print("\t");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i==5-j-1)
                {
                    System.out.print(arr[i][j]+" ");
                }    
            }
        }
    }
}