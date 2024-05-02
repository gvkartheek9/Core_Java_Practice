//ArmstrongNumberInRange


import java.util.Scanner;

class ArmstrongNumberInRange
{
    public static boolean IsArmstrong(int number){
        boolean flag=true;
        int number1=number;
        String numberString=String.valueOf(number);
        int length=numberString.length();
        int sum=0;
        for(int i=0;i<numberString.length();i++){
            int remainder=number%10;
            sum+=Math.pow(remainder,length);
            number=number/10;
        }
//        System.out.println(sum);
        if(sum==number1){
//            System.out.println(number1+" is a Armstrong Number");
            return true;
        }
        return  false;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        for(int i=number1;i<=number2;i++){
            if(i<10){
                continue;
            }
            if(IsArmstrong(i)){
                System.out.println(i+" is a armstrong number");
            }
        }

    }
}