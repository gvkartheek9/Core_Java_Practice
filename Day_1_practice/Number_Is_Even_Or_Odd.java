
import java.util.Scanner;

class Number_Is_Even_Or_Odd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        if(num1%2==0){
            System.out.println(num1+" is Even");
        }
        else{
            System.out.println(num1+" is Odd");
        }

    }
}