//Character_Is_Uppercase_Or_Lowercase_Alphabet.java

import java.util.Scanner;

class Character_Is_Uppercase_Or_Lowercase_Alphabet{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        char var=sc.next().charAt(0);
        if(Character.isUpperCase(var)){
            System.out.println(var+" is a UpperCase Character");
        }
        else{
            System.out.println(var+" is a LowerCase Character");
        }
    }
}