package OOPs_Practice_May_10.EmployeeAbstract;

public class Developer extends Employee{
    double devBonus=1400.0;
    double devSalary;
    public Developer(String name,String empId,double salary){
        super(name,empId,salary);

    }

    public void monthlySalary(){
        devSalary= devBonus+getSalary();
        System.out.println("The manager salary after the caluculation is "+devSalary);
    }
}
