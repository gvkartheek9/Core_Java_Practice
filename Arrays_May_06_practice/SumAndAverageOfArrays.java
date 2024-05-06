package Arrays_May_06_practice;
import  java.util.Scanner;

//Arrays problem no 1

public class SumAndAverageOfArrays {

    public static int sum(int[] a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in an array");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int total=sum(a);
        double avg= (double) total /n;
        System.out.println("The sum of arrys: "+total+" The average is : "+avg);


    }
}
