package Strings_May_07_practice;

/*Scenario: You are developing a secure
messaging application where users can send messages to  each other.
To add a fun twist to the messages, you decide to implement a feature that converts
the case of the message in a unique way. For every message sent, you want to reverse the
case of each character, i.e., convert uppercase letters to lowercase and lowercase letters to uppercase,
 while leaving special characters unchanged.
Write a Java program that takes an input string, applies the reverse case conversion to it,
and displays the transformed message to the user.
Sample Input: "Hello, World!" Sample Output: "hELLO, wORLD!"
 */

import java.util.Scanner;

public class CaseConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String here");
        String s=sc.nextLine();
        String newString ="";
        System.out.println("The string before conversion is: "+s);
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                newString+=Character.toLowerCase(s.charAt(i));
            }
            else{
                newString+=Character.toUpperCase(s.charAt(i));
            }
        }
        System.out.println("The string after conversion is: "+newString);
    }
}
