
import java.util.Scanner;

class Basic_Salary_And_Gross_Salary {
    public static  double percentage(int value,int total){
        return (value/100.0)*total;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int basicSalary=sc.nextInt();
        int HRA,DA;
        double grossSalary;
        if(basicSalary<=10000){
            HRA=20;
            DA=80;
            grossSalary=basicSalary+percentage(HRA,basicSalary)+percentage(DA,basicSalary);
//            System.out.println(grossSalary);
        }
        else if(basicSalary<=20000){
            HRA=25;
            DA=90;
            grossSalary=basicSalary+percentage(HRA,basicSalary)+percentage(DA,basicSalary);
        }
        else{
            HRA=30;
            DA=95;
            grossSalary=basicSalary+percentage(HRA,basicSalary)+percentage(DA,basicSalary);
        }
        System.out.println(grossSalary);
//        System.out.println(percentage(20,10000));
//        System.out.println((20/100.0)*10000);
    }
}