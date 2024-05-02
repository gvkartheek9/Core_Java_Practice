//Vowel_Or_Consonant.java

import java.util.Scanner;
class Vowel_Or_Consonant{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        char var =sc.next().charAt(0);
        if(var=='a'||var=='e'||var=='i'||var=='o'||var=='u'){
            System.out.println("It is a Vowel");
        }
        else{
            System.out.println("It is a Consonant");
        }
    }
}