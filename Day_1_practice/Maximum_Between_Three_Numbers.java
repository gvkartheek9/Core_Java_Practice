import java.sql.SQLOutput;
import java.util.Scanner;

class Maximum_Between_Three_Numbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1+" is the greatest number");
        }
        else if(num2>num3){
            System.out.println(num2+" is the greatest number");
        }
        else{
            System.out.println(num3+" is the greatest number");
        }

    }
}