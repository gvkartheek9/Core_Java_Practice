package Strings_May_07_practice;

import java.util.Scanner;

/*Scenario: You are implementing a text analysis tool for language processing. The user enters a paragraph,
and you need to count the frequency of each character to generate a statistical analysis of the text
 */

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the String ");
        String word=sc.nextLine();
        int[] fr=new int[word.length()];
        int visited=-1;
        for(int i=0;i<word.length()-1;i++){
            int count=1;
            for(int j=i+1;j<word.length();j++){
                if(word.charAt(i)==word.charAt(j)){
                    fr[j]=visited;
                    count++;
                }
            }
            if(fr[i]!=visited){
                fr[i]=count;
            }
        }
        for(int ele:fr){
            System.out.print(ele+" ");
        }
    }
}
