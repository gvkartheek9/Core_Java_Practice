package Strings_May_07_practice;

/*Scenario: You are implementing a word game. The player enters a word, and you need to
 check whether it is a palindrome (reads the same forward and backward) to determine their score.
 */

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Welcome to the word game");
        while(true) {
            System.out.println("give word to reverse or (exit) to quit");
            String word=sc.next();
            if(word=="exit"){
                System.out.println("you asked for the exit");
                return;
            }
            else{

                String rev="";
                for(int i=word.length()-1;i>=0;i--){
                    rev+=word.charAt(i);
                }
                if(rev.equals(word)){
                    count++;
                    System.out.println("Is a palindrome, You got points "+count);
                }
                else{
                    System.out.println("Not palindrome try again");
                }
            }
        }
    }
}
