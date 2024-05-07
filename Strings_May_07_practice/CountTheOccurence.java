package Strings_May_07_practice;

import java.util.Scanner;
/*Scenario: You are implementing a character counting utility. The user inputs a sentence,
 and you need to count the occurrences of a particular character to provide a usage report.
 */

public class CountTheOccurence {

    static Scanner sc=new Scanner(System.in);
    static int index=0;
    public static void main(String[] args){
        int count=0;
        System.out.println("Please Enter the String ");
        String word=sc.nextLine();
        System.out.println("Enter the character to find the occurrences");
        char c=sc.nextLine().charAt(0);
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==c){
                index=i;
                count++;
                System.out.println("The character '"+c+"' ocuured "+count+" at index "+index);
            }

        }
    }
}
