package LabAssignment3;

public class Executive extends Manager {
    private double yearlyBonus;

    public Executive(){};
    public Executive(String name, double salary, String dept, double yearlyBonus){
        setName(name);
        setSalary(salary);
        setDept(dept);
        setYearlyBonus(yearlyBonus);
    }

    public double getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }
}
