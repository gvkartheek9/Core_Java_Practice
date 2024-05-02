package Day_2_practice;

import java.util.Scanner;


class NumberIsPalindromeOrNot
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String numberString=String.valueOf(number);
        String reverse="";
        for(int i=numberString.length()-1;i>=0;i--){
            reverse+=numberString.charAt(i);
        }
        System.out.println(reverse);
        if(numberString.equals(reverse)) {
            System.out.println(numberString + " is a palindrome");
        }
        else {
            System.out.println(numberString+" is not a palindrome");
        }
    }
}