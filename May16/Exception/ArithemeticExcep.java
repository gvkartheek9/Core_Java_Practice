package Exception;

import java.util.Scanner;

public class ArithemeticExcep {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you what to 100 to divide with");
        int num=sc.nextInt();
        try{
            double res=100/num;
        }
        catch (ArithmeticException e){
            System.out.println("The arithemetic exception "+e);
        }
        finally{
            System.out.println("Program is done");
        }

    }
}
