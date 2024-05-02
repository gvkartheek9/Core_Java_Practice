package Day_2_practice;

import  java.util.Scanner;

class AllPerfectNumbersFrom1ToN{

    public static boolean isPerfectNumber(int number){
         int sum=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        if(sum==number){
            return true;
        }
        return false;
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number to find weather it is a perfect number or not");
        int number=sc.nextInt(); //The number to find the factors

        for(int i=1;i<=number;i++){
            if(isPerfectNumber(i)){
                System.out.print(i+" ");
            }
        }


    }
}