package Strings_May_07_practice;

import java.util.Scanner;

/*You are building a data compression program. The user inputs a sentence,
and you need to find the character with the lowest frequency to use it as a delimiter for compression.
 */

public class LowestFrequencyCharacter {

    public static char lowestFrequency(int[] fr,String word){
        int min=fr[0];
        int index=0;
        for(int i=0;i<fr.length;i++){
            if(min>fr[i] && fr[i]!=-1){
                min=fr[i];
                index=i;
            }
        }
//        System.out.println("The min frequency is"+min);
        return word.charAt(index);
    }

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
//        for(int ele:fr){
//            System.out.print(ele+" ");
//        }
        System.out.println("The lowest frequency character is "+lowestFrequency(fr,word));
    }
}
