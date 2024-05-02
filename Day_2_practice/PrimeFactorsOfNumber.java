import java.util.Scanner;


class PrimeFactorsOfNumber{
    public static boolean isPrime(int number){
        boolean flag=true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                flag=false;
            }
        }
        if(flag){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find all prime factor sof it");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
            if(number%i==0){
                if(isPrime(i)){
                    System.out.print(i+" ");
                }
            }
        }
    }
}