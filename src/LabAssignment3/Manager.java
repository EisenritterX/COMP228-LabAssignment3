package LabAssignment3;

public class Manager extends Employee{
    private String dept;

    public Manager(){};

    public Manager(String name, double salary, String dept){
        setName(name);
        setSalary(salary);
        this.dept = dept;
    }

    public void setDept(String dept){
        this.dept = dept;
    }

    public  String getDept(){
        return dept;
    }
    @Override
    public String toString() {
        String result = super.toString();
        result += "Department: " +this.getDept()+"\n";
        return result;
    }
}
