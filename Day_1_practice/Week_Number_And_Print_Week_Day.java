import  java.util.Scanner;

class Week_Number_And_Print_Week_Day{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0 && num<=5){
            System.out.println(num+" is a week day");
        }
        else{
            System.out.println(num+" is not a week day");
        }
    }
}