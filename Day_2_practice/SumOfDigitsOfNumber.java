import java.util.Scanner;

class SumOfDigitsOfNumber
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum=0;
        while(number>0){
            int remainder=number%10;
            sum+=remainder;
            number=number/10;

        }
        System.out.println(sum);
    }
}