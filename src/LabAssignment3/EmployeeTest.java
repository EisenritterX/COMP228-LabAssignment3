package LabAssignment3;

import java.text.ParseException;
import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        // write your code here
        System.out.println("This is a test run with hardcoded data" + "\n");
        TestRunHardcodedData();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you adding a new employee, manager or executive?" + "\n" +
                "Type Employee for employee, Manager for manager, and Executive for executive" +"\n");

        boolean validationFlag = false;
        while (!validationFlag) {
            switch (scanner.nextLine().toLowerCase()) {
                case "employee":
                    validationFlag=true;
                    CreateEmployee();
                    break;
                case "manager":
                    validationFlag=true;
                    CreateManager();
                    break;
                case "executive":
                    validationFlag=true;
                    CreateExecutive();
                    break;
                default:
                    System.out.println("Input is invalid, please check for typos and reenter.");
                    validationFlag=false;
                    break;
            }
        }
    }

    private static void CreateEmployee(){
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

        System.out.println(e);
    }

    private static void CreateManager(){
        Scanner scanner = new Scanner(System.in);
        Manager m = new Manager();
        // Name
        System.out.println("Please Enter the Name of the new Manager:");
        m.setName(scanner.nextLine());
        System.out.println();
        // salary
        System.out.println("Please Enter the new Manager's Yearly Salary:");
        m.setSalary(Double.parseDouble(scanner.nextLine()));
        System.out.println();
        // department
        System.out.println("Please Enter the new Manager's Department:");
        m.setDept(scanner.nextLine());
        System.out.println();

        System.out.println(m);
    }

    private static void CreateExecutive(){
        Scanner scanner = new Scanner(System.in);
        Executive e = new Executive();
        // Name
        System.out.println("Please Enter the Name of the new Executive:");
        e.setName(scanner.nextLine());
        System.out.println();
        // salary
        System.out.println("Please Enter the new Executive's Yearly Salary:");
        e.setSalary(Double.parseDouble(scanner.nextLine()));
        System.out.println();
        // department
        System.out.println("Please Enter the new Executive's Department:");
        e.setDept(scanner.nextLine());
        System.out.println();
        // yearly bonus
        System.out.println("Please Enter the new Executive's Yearly Bonus:");
        e.setYearlyBonus(Double.parseDouble(scanner.nextLine()));
        System.out.println();

        System.out.println(e);
    }

    private static void TestRunHardcodedData() {
        Employee mike = new Employee("Mike", 30000);
        Manager john = new Manager("John", 80000, "Fashion");
        Executive lucy = new Executive("Lucy", 100000, "Marketing", 20000);
        System.out.println(mike);
        System.out.println(john);
        System.out.println(lucy);
    }
}
