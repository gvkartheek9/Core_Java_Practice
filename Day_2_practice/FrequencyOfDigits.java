//FrequencyOfDigits
import java.util.Scanner;

class FrequencyOfDigits{

    public static int[] countOccurence(int number){
        int []digits=new int[10];
        for(int i=0;i<digits.length;i++){
            digits[i]=0;
        }
        while(number>0){
            int rem=number%10;
            digits[rem]+=1;
            number=number/10;
        }
        return digits;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int []k=new int[10];
        k= countOccurence(number);
        for(int i=0;i<10;i++){
            System.out.print(i+" : "+k[i]+" ,");
        }
    }
}