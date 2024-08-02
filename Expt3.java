
//Calculating the rasie salary of the empoyee by 10% from his salary..!
import java.util.Scanner;
//Employee class declaration..!
class Employee{
      private String name;
      private double salary;
   
      public Employee(String Name,double Salary){
        name= Name;
        salary= Salary;

      }
      //set the data..!
      public void SetData(String Name,double Salary){
        name= Name;
        salary= Salary;    
      }
      //print the data..!
      public void GetData(){
        System.out.println("The name of the Employee is: "+ name);  
        System.out.println("The salary of the Employee is: "+ salary);  
      }
      //calculating the raise salary..!
      public void SalaryCalculation(double Salary){
        salary+=Salary*0.10;
      }
      

}


// Main function..!
public class Expt3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee name : ");
        String Name = sc.nextLine();
        System.out.println("Enter the employee salary: ");
        double Salary = sc.nextDouble();
        //object creation..!
        Employee e = new Employee(Name,Salary);
        e.SetData(Name,Salary);
        e.GetData();
        e.SalaryCalculation(Salary);
        e.GetData();
    }
}