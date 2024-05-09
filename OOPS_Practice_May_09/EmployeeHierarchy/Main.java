package OOPS_Practice_May_09.EmployeeHierarchy;

public class Main {
    public static void main(String[] args) {

        //Managers
        Manager manager1=new Manager(101,10000.0,"manager1");
        Manager manager2=new Manager(102,12000.0,"manager2");

        //Engineer
        Engineer engineer1=new Engineer(103,14000.0,"Employ3");
        Engineer engineer2=new Engineer(103,14000.0,"Employ4");

        Employee[] emp={manager1,manager2,engineer1,engineer2};

        for(Employee obj:emp){
            if(obj instanceof Manager){
                Manager manager=(Manager) obj;
                double bonus=manager.caluculateManagerBonus();
                System.out.println("the Bonus of the "+manager.getName()+" is: "+bonus);
            } else if (obj instanceof Engineer) {
                Engineer engineer=(Engineer) obj;
                double bonus=engineer.caluculateEngineerBonus();
                System.out.println("The Bonus of the "+engineer.getName()+" is: "+bonus);
            }
        }


    }
}
