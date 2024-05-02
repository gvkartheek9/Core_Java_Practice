import java.util.Scanner;

class ReverseANumber
{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String numberString=String.valueOf(number);
        String reverse="";
        for(int i=numberString.length()-1;i>=0;i--){
            reverse+=numberString.charAt(i);
        }
        System.out.println(reverse);
    }
}