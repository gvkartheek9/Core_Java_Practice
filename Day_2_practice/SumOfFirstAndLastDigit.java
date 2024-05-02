package Day_2_practice;//SumOfFirstAndLastDigit


import java.util.Scanner;

class SumOfFirstAndLastDigit
{
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum=0;
        String noOfDigits=String.valueOf(number);
//        System.out.println(noOfDigits.charAt(0)+" "+noOfDigits.charAt(noOfDigits.length()-1));
        int firstDigit = Character.digit(noOfDigits.charAt(0),10);
        int lastDigit = Character.digit(noOfDigits.charAt(noOfDigits.length()-1),10);
        sum= firstDigit + lastDigit;
        System.out.println(sum);
    }
}