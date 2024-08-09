import java.util.Scanner;

class Employee {
   private String fname;
   private String lname;
   private double msal;

   Employee(String a, String b, double c) {
      this.fname = a;
      this.lname = b;
      this.msal = c;
   }

   public void setfname(String a) {
      this.fname = a;
   }

   public void setlname(String a) {
      this.lname = a;
   }

   public void setmsal(double a) {
      this.msal = a;
   }

   public String getfname() {
      return fname;
   }

   public String getlname() {
      return lname;
   }

   public double getmsal() {
      return msal;
   }

   public double raise() {
      double tot = msal * 12;
      System.out.println("Total Salary is : " + tot);
      tot = tot + (tot * 0.1);
      return tot;
   }
}

public class SalaryRaise {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Employee e = new Employee(null, null, 0);
      System.out.println(
            " First Name : " + e.getfname() + " Last Name : " + e.getlname() + " Monthly Salary : " + e.getmsal());
      System.out.print("Enter First Name : ");
      String a = sc.next();
      e.setfname(a);
      System.out.print("\nEnter Last Name : ");
      String b = sc.next();
      e.setlname(b);
      System.out.print("\nEnter Monthly Salary : ");
      double c = sc.nextDouble();
      e.setmsal(c);
      sc.close();
      System.out.println(
            " First Name : " + e.getfname() + " Last Name : " + e.getlname() + " Monthly Salary : " + e.getmsal());
      System.out.println("Salary after raise is : " + e.raise());
   }
}
