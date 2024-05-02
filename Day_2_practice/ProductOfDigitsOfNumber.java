//ProductOfDigitsOfNumber

import java.util.Scanner;

class ProductOfDigitsOfNumber
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int product=1;
        while(number>0){
            int remainder=number%10;
            product*=remainder;
            number=number/10;

        }
        System.out.println(product);
    }
}