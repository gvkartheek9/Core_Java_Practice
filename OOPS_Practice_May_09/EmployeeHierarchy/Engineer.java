package OOPS_Practice_May_09.EmployeeHierarchy;

public class Engineer extends Employee{

    private final double BONUS_PERCENTAGE=0.02;
    public Engineer(int empId,double salary,String name){
        super(empId,salary,name);
    }

    public double caluculateEngineerBonus(){
        //        setSalary(percentage);
//        System.out.println("The bonus provided is "+ENG_BONUS);
//        System.out.println("The salary after the bonus added is"+getSalary());
        return getSalary()*BONUS_PERCENTAGE;
    }

}
