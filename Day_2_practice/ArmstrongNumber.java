import java.util.Scanner;

class ArmstrongNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int number1=number;
        String numberString=String.valueOf(number);
        int length=numberString.length();
        int sum=0;
        for(int i=0;i<numberString.length();i++){
            int remainder=number%10;
            sum+=Math.pow(remainder,length);
            number=number/10;
        }
        System.out.println(sum);
        if(sum==number1){
            System.out.println(number1+" is a Armstrong Number");
        }
        else{
            System.out.println(number1+" is not an Armstrong Number");
        }

    }
}