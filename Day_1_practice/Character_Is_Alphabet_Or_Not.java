import java.util.Scanner;

class Character_Is_Alphabet_Or_Not{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(Character.isLetter(a)){
            System.out.println(a+" is a Alphabet");
        }
        else{
            System.out.println(a+" is a digit");
        }
    }
}