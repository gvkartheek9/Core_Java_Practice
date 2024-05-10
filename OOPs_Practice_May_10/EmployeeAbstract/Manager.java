package OOPs_Practice_May_10.EmployeeAbstract;

public class Manager extends Employee{

    double managerBonus=1400.0;
    double managerSalary;
    public Manager(String name,String empId,double salary){
        super(name,empId,salary);

    }

    public void monthlySalary(){
        managerSalary= managerBonus+getSalary();
        System.out.println("The manager salary after the caluculation is "+managerSalary);
    }
}
