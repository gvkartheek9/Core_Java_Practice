//Number_Is_Negative_Or_Positive_Or_Zero

import java.util.Scanner;

class Number_Is_Negative_Or_Positive_Or_Zero{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        if(num1==0){
            System.out.println(num1+" is equals to zero");
        }
        else if(num1>0){
            System.out.println(num1+" is  the positive number ");
        }
        else{
            System.out.println(num1+" is the Negative number");
        }

    }
}