package LabAssignment3;

import java.text.ParseException;
import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
/*	    // write your code here
        Scanner scanner = new Scanner(System.in);
        Employee e = new Employee();
        // Name
        System.out.println("Please Enter the Name of the new Employee:");
        e.setName(scanner.nextLine());
        System.out.println();
        // salary
        System.out.println("Please Enter the new Employee's Yearly Salary:");
        e.setSalary(Double.parseDouble(scanner.nextLine()));
        System.out.println();

        System.out.println(e);*/

        Employee mike = new Employee("Mike", 30000);
        Manager john = new Manager("John",80000,"Fashion");
        System.out.println(mike);
        System.out.println(john);
    }
}
