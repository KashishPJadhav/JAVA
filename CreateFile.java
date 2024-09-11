import java.io.*;
import java.util.Scanner;
class createFile {
    public static void main(String[] args)
    {
        File f=new File("D:\\22uai036\\abc.txt");
        try{
            if(f.createNewFile())
            {
                System.out.println("Successfully created.");
            }
            else
            {
                System.out.println("File Already Exists.");
            }
        }
        catch(IOException i)
        {
            System.out.println("Exception Caught");
        }
       try(FileWriter w=new FileWriter(f)) 
       {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Data to be written");
        String s=sc.nextLine();
        w.write(s);
        System.out.println("Successfully Written.");
       }
      catch(IOException i)
      {
        System.out.println("Exception Caught.");
      }
      try(BufferedReader r=new BufferedReader(new FileReader(f)))
    {
        String l;
        l=r.readLine();
        System.out.println("Content of file : ");
        System.out.println(l);
    }
    catch(IOException i)
    {
        System.out.println("Exception Caught");
    }
    if (f.delete()) {
        System.out.println("File deleted successfully.");
    } else {
        System.out.println("File could not be deleted.");
    }

    // Checking if the file still exists
    if (f.exists()) {
        System.out.println("File not deleted.");
    } else {
        System.out.println("File deletion confirmed.");
    }
    }
}
