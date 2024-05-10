package OOPs_Practice_May_10.EmployeeAbstract;

abstract class Employee {
    private String name,empId;
    private double salary;

    Employee(String name,String empId,double salary){
        this.name=name;
        this.empId=empId;
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }

    public void displayEmployInfo(){
        System.out.println("the name of the employ is "+name);
        System.out.println("The empId of the emply is "+empId);
        System.out.println("The salary of the employ is "+salary);
    }


}
