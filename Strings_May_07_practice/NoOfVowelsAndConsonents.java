package Strings_May_07_practice;

/*You are building a word analysis tool. The user enters a sentence,
and you need to count the total number of vowels and consonants present
 in the sentence to provide insights into its composition.
 */

import java.util.Scanner;

public class NoOfVowelsAndConsonents {

    static int vowelCount=0,consonentCount=0;

    public static void vowelAndConsonent(String sentence){
        for(int i=0;i<sentence.length();i++){
            char var=sentence.charAt(i);
            if(var==' '){
                continue;
            }
            else{
                if(var=='a'||var=='e'||var=='i'||var=='o'||var=='u'){
//                    System.out.println("It is a Vowel");
                    vowelCount++;
                }
                else{
//                    System.out.println("It is a Consonant");
                    consonentCount++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence to analyze how many vowels and Consonents are there.");
        String sentence=sc.nextLine();
        vowelAndConsonent(sentence);
        System.out.println("The vowels in sentence : "+vowelCount);
        System.out.println("The consonents in sentence : "+consonentCount);
    }
}
