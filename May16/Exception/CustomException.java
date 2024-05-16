//package Exception;

import java.lang.Exception;

import java.util.Scanner;

class AgeNotEligibleException extends Exception{
    String message;
        AgeNotEligibleException(String message){
            super(message);
            this.message=message;//keep in mind that the super() method should be called in the first
            //line of the code.
        }
}

public class CustomException {

    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of person to check Eligibility");
        int age=sc.nextInt();
        try{
            if(age>18)
                System.out.println("Eligible to vote");
            else
                throw new AgeNotEligibleException("Not eligible to vote play aside");
        }
        catch (AgeNotEligibleException e){
            System.out.println(e.message+"this is catch");
        }
        finally{
            System.out.println("The custom exception is being done");
        }

    }
}
