import java.util.Scanner;

class NumberOfDigits{
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String noOfDigits=String.valueOf(number);
        System.out.println(noOfDigits.length());
    }
}