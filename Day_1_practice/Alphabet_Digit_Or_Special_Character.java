import java.util.Scanner;

class Alphabet_Digit_Or_Special_Character{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(Character.isLetterOrDigit(a)) {
            if (Character.isLetter(a)) {
                System.out.println(a + " is a Alphabet");
            } else {
                System.out.println(a + " is a digit");
            }
        }
        else{
            System.out.println(a+" is a Special Character");
        }

    }
}