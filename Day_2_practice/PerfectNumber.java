
import  java.util.Scanner;

class PerfectNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number to find wheather it is a perfect number or not");
        int number=sc.nextInt(); //The number to find the factors

        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        if(sum==number){
            System.out.println(number+" is a perfect number");
        }
        else{
            System.out.println(number+" is not a perfect number");
        }
    }
}