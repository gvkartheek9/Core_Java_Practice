import java.util.Scanner;

class Factorial{
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int factorial=1;
        int number=sc.nextInt();
        for(int i=number;i>=1;i--){
            factorial*=i;
        }
        System.out.println(factorial);
    }
}