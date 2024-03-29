package LabAssignment3;

public class Employee {
    private String name;
    private double salary;

    public Employee(){

    }

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    @Override
    public String toString(){
        String result = "Name: " + this.getName()+"\n";
        result += "Yearly Salary: " + this.getSalary() + "\n";
        return result;
    }
}
