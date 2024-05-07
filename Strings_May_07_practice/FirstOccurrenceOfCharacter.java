package Strings_May_07_practice;

/*You are developing a text editor. The user enters a paragraph,
 and you need to find the first occurrence of a particular character to highlight it.
 */
import java.util.Scanner;

public class FirstOccurrenceOfCharacter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int index=0;
        System.out.println("Please Enter the String ");
        String word=sc.nextLine();
        System.out.println("Enter the character to find the first Occurrence");
        char c=sc.nextLine().charAt(0);
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==c){
                index=i;
                break;
            }
        }
        System.out.println("The first Occurence of the character "+c+" is at index "+index);
    }

}
