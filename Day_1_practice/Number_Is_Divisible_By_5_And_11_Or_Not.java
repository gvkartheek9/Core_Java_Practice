//Number_Is_Divisible_By_5_And_11_Or_Not.java

import java.util.Scanner;

class Number_Is_Divisible_By_5_And_11_Or_Not{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        if(num1%5==0 && num1%11==0){
            System.out.println(num1+" is divisible by 5 and 11");
        }
        else{
            System.out.println(num1+" is not divisible by 5 and 11");
        }

    }
}