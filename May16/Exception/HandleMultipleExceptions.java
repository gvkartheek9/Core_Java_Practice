package Exception;

import java.util.Scanner;

public class HandleMultipleExceptions {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you wnt the 100 to be divided with");
        try{
            int num=Integer.parseInt(sc.nextLine());
            double res=100/num;
            System.out.println("The result is: "+res);
        }
        catch (ArithmeticException e){
            System.out.println("The number can't be divided by zero : "+e.getMessage()+" "+e.getLocalizedMessage());
        }
        catch (NumberFormatException e){
            System.out.println("The number should only contain the digits : "+e.getLocalizedMessage()+" "+e.getMessage());
        }

    }
}
