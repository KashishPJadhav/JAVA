import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Ass4_2
{
    public static void main(String[] args)
    {
         ArrayList<String> col=new ArrayList<>();
         col.add("Red");
         col.add("Blue");
         col.add("Black");
         col.add("Green");
         col.add("Yellow");
         col.add("Pink");

         System.out.println("List : "+col);
         Collections.sort(col);
         System.out.println("Sorted List : "+col);

    }
}
