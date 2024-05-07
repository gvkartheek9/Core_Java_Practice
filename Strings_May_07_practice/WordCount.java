package Strings_May_07_practice;

import java.util.Scanner;

/*
Scenario: You are developing a word count application.
The user inputs a paragraph, and you need to count the total number
of words in the paragraph to help them with their writing.
 */

public class WordCount {

    public static boolean hasCharacters(String line) {
        return !line.isEmpty() && !line.trim().isEmpty();
    }

    public static int wordCount(String paragraph){

        String[] word = paragraph.split("\\s+");
        return word.length;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String paragraph="";
        //taking paragraph as input
        System.out.println("Please enter your paragraph we will find how many words does paragraph had.");
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            if(!hasCharacters(line)){
                break;
            }
            paragraph+=line+'\n';
        }

        int words=wordCount(paragraph);
        System.out.println("The paragraph had "+words+" number of words");
//        System.out.println(paragraph);
    }
}
