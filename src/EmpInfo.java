//Write a program by creating an 'Employee' class having the following methods and print the final salary.
//
//  1 -'getInfo()' which takes the salary, number of hours of work per day of the employee as parameter
// 2 -'AddSal()' which adds $10 to the salary of the employee if it is less than $500.
// 3 -'AddWork()' which adds $5 to the salary of the employee if the number of hours of work per day is more than 6 hours.
import java.lang.*;
import java.util.Scanner;

class Employee{
    //Creating the instance variable.
    float salary,hr,x;

    //1.'getInfo()' which takes the salary, number of hours of work per day of the employee as parameter
    void getInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Salary:");
        salary=sc.nextFloat();
        System.out.print("Enter the Working hour's:");
        hr= sc.nextFloat();
    }

    // 2 -'AddSal()' which adds $10 to the salary of the employee if it is less than $500.
    void AddSal(){
        if (salary<500){
            salary+=10;
        }
    }

    //3.-'AddWork()' which adds $5 to the salary of the employee if the number of hours of work per day is more than 6 hours.
    void AddWork(){
        if (hr>6){
            salary+=5;
        }
    }
}
public class EmpInfo {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.getInfo();
        e1.AddSal();
        e1.AddWork();
        System.out.println("Final Salary of the Employee:\n"+e1.salary);
    }
}
