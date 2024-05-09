package OOPS_Practice_May_09.EmployeeHierarchy;

import Strings_May_07_practice.StringReverse;

public class Employee {

    private int empId;
    private double salary;
    private String name;

    public Employee(int empId, double salary, String name){
        this.empId=empId;
        this.salary=salary;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double amount){
        this.salary=amount;
    }

    public int getEmpId() {
        return empId;
    }

    public void displayEmpDetails(){
        System.out.println("The Employee Id is: "+this.empId);
        System.out.println("The Employee name is: "+this.name);
        System.out.println("The Employee Salary is: "+this.salary);
    }


}
