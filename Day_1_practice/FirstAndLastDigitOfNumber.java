import java.util.Scanner;

class FirstAndLastDigitOfNumber{
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String noOfDigits=String.valueOf(number);
        System.out.println(noOfDigits.charAt(0)+" "+noOfDigits.charAt(noOfDigits.length()-1));
    }
}