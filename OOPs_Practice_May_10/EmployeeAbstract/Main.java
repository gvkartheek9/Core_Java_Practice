package OOPs_Practice_May_10.EmployeeAbstract;

public class Main {
    public static void main(String[] args) {
        Manager manager=new Manager("manager1","101",15000.0);
        Developer dev=new Developer("dev1","102",12000.0);
        manager.monthlySalary();
        dev.monthlySalary();
        System.out.println("---------------------------------------");
        manager.displayEmployInfo();
        System.out.println("----------------------------------------");
        dev.displayEmployInfo();
        System.out.println("--------------------------------------");

        Employee emp=new Manager("manager3","103",15000.0);
//        emp.monthlySalary();

    }
}
