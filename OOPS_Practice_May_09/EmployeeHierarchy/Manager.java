package OOPS_Practice_May_09.EmployeeHierarchy;

public class Manager extends Employee{

    private final double BONUS_PERCENTAGE=0.05;

    public Manager(int empId, double salary, String name) {
        super(empId, salary, name);
    }

    public double caluculateManagerBonus(){
        //        setSalary(percentage);
//        System.out.println("The bonus provided is "+BONUS);
//        System.out.println("The salary after the bonus added is"+getSalary());
         return getSalary()*BONUS_PERCENTAGE;
    }

}
