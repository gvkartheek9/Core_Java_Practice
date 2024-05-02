import java.util.*;

class PrimeOrNot{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean flag=true;
        for(int i=2;i<number;i++){
            if(number%i==0)
               flag=false;
        }
        if(flag){
            System.out.println(number+" is a prime number");
        }
        else{
            System.out.println(number+" is not a prime number");
        }

    }
}