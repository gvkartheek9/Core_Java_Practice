package Day_2_practice;

import java.util.Scanner;

class AllStrongNumbersFrom1ToN{

    public static long factorial(int number){
        int fact =1;
        for(int i=1;i<=number;i++){
            fact*=i;
        }
        return fact;
    }

    public static boolean strongNumber(int number){

        long sum=0;
        int number1=number;
        while(number>0){
            int rem=number%10;
            long resFact=factorial(rem);
            sum+=resFact;
            number/=10;
        }
        if(sum==number1){
           return true;
        }
       return false;
    }

    public static  void main(String []args){
        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();

        for(int i=1;i<=number;i++){
            if(i==1 || i==2){
                continue;
            }
            if (strongNumber(i)) {
                System.out.println(i+" is a Strong Number");
            }
        }


    }
}