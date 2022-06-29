/*  Create a class called Employee having data members emp_id, name, 
department, basic_salary and designation. Use methods input() and 
display() to get the data and view the details of an employee including gross 
salary. The gross salary of the employee is the sum of basic_salary along 
with DA and HRA. DA is 20% and HRA is 16% of the basic_salary

*/

import java.util.Scanner;

class Employee{
    int emp_id;
    double basic_salary;
    String name;
    String department;
    String designation;

   Employee()
    {

    } 
    void input()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a emp_id");
        emp_id=sc.nextInt();
        System.out.println("Enter the name of employee");
        name=sc.next();
        System.out.println("Enter the department");
        department=sc.next();
        System.out.println("Enter the basic salary");
        basic_salary=sc.nextInt();
        System.out.println("Enter the Designation of Employee");
        designation=sc.next();
    }

    void display()
    {
      double da=0.2*basic_salary;
      double hra=0.16*basic_salary;
      double gross=basic_salary+da+hra;
      System.out.println("Employee_ID :"+emp_id);
      System.out.println("Name : "+name);
      System.out.println("Department :"+department);
      System.out.println("Gross Salary is "+gross);
      System.out.println("Designation :"+designation);
    }

}


public class a61 {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.input();
        emp.display();
    }
}


