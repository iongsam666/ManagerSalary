/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tinh_Luong;

/**
 *
 * @author Admin
 */
public class Staff extends Person{
    private String department;
    private double coefficientSalary;
    private int seniority;
    private double bassicSalary;
    protected double salary;

    public Staff() {
    }

    public Staff(String department, double coefficientSalary, int seniority, double bassicSalary, double salary) {
        this.department = department;
        this.coefficientSalary = coefficientSalary;
        this.seniority = seniority;
        this.bassicSalary = bassicSalary;
        this.salary = salary;
    }

    public Staff(String department, double coefficientSalary, int seniority, double bassicSalary, double salary, String name, int birthOfDay, int birthOfMonth, int birthOfYear, String address, boolean gender) {
        super(name, birthOfDay, birthOfMonth, birthOfYear, address, gender);
        this.department = department;
        this.coefficientSalary = coefficientSalary;
        this.seniority = seniority;
        this.bassicSalary = bassicSalary;
        this.salary = salary;
    }

    Staff(String hi, int i, int i0, int i1, String sam, int i2, int i3, int i4, String hano, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public double getCoefficientSalary() {
        return coefficientSalary;
    }
    public void setCoefficientSalary(double coefficientSalary) {
        this.coefficientSalary = coefficientSalary;
    }

    public int getSeniority() {
        return seniority;
    }
    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public double getBassicSalary() {
        return bassicSalary;
    }
    public void setBassicSalary(double bassicSalary) {
        this.bassicSalary = bassicSalary;
    }

    public double getSalary() {
        return salary = (bassicSalary * coefficientSalary)*(1 + seniority / 100);
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "Staff{" + "department=" + department + ", coefficientSalary=" + coefficientSalary + ", seniority=" + seniority + ", bassicSalary=" + bassicSalary + ", salary=" + salary + '}';
    }
    
    
}
