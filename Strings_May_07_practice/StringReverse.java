package Strings_May_07_practice;

/*Scenario: You are creating a string utility function.
 The user provides a string, and you need to find its reverse to perform further operations on it.
 */

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String rev="";
        System.out.println("please enter the String to reverse");
        String word=sc.next();
        for(int i=word.length()-1;i>=0;i--){
            rev+=word.charAt(i);
        }

        System.out.println("The reverse of the given stiing is "+rev);
    }
}
