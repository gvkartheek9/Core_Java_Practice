//PrimeNumbersBetween1ToN


import java.util.*;

class PrimeNumbersBetween1ToN
{

    public static boolean IsPrime(int number){
        boolean flag=true;
        if(number==1 || number==0){
            return false;
        }
        for(int i=2;i<number;i++){
            if(number%i==0)
                flag=false;
        }
        if(flag){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
//        int number1=sc.nextInt();
        int number2=sc.nextInt();
        for(int i=1;i<=number2;i++) {
            if (IsPrime(i)) {
                System.out.print(i + " ");

            }
        }
//        System.out.println("Sum of prime Number between 1toN "+sum);


    }
}