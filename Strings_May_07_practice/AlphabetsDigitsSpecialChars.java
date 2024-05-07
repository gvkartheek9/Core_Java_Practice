package Strings_May_07_practice;

import java.util.Scanner;

/*Scenario: You are developing a program for a password strength checker.
The user inputs a password, and you need to count the total number of
 alphabets, digits, and special characters present in the password to assess its strength.
 */

public class AlphabetsDigitsSpecialChars {
    static int alphaCount=0,digitCount=0,specialCharacterCount=0;
    public static void count(String password){
        char[] chars= password.toCharArray();
        for(char character:chars)
        {
                if(Character.isLetterOrDigit(character)) {
                    if (Character.isLetter(character)) {
    //                    System.out.println(character + " is a Alphabet");
                           alphaCount++;
                    } else {
    //                    System.out.println(password + " is a digit");
                        digitCount++;
                    }
                }
                else{
    //                System.out.println(password+" is a Special Character");
                    specialCharacterCount++;
                }
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter a password: ");
        String password = sc.nextLine();
        count(password);
        System.out.println(alphaCount+" "+digitCount+" "+specialCharacterCount);
        if(password.length()>8 && digitCount>=1 && specialCharacterCount>=1){
            System.out.println("Your given password is strong");
        }
        else{
            System.out.println("Your password is weak");
        }

    }
}
