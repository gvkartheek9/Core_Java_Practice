package Strings_May_07_practice;

import java.util.Scanner;
/*You are building a log analyzer. The user provides a log file,
 and you need to find the last occurrence of a specific character to identify the end of the log.
 */


public class LastOccurenceOfCharacter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int index=0;
        System.out.println("Please Enter the String ");
        String word=sc.nextLine();
        System.out.println("Enter the character to find the Last Occurrence");
        char c=sc.nextLine().charAt(0);
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==c){
                index=i;
            }
        }
        System.out.println("The Last Occurrence of the character "+c+" is at index "+index);
    }
}
