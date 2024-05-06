package Arrays_May_06_practice;
import java.util.Scanner;

public class TotalEvenAndOddElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_Even=0;
        int total_Odd=0;
        System.out.println("Enter number of elements in an array");
        int n = sc.nextInt();
        System.out.println("Please Enter the elements here: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int ele:a){
            if(ele==0){
                continue;
            }
            if(ele%2==0){
                total_Even++;
            }
            else{
                total_Odd++;
            }
        }
        System.out.println("The total even numbers in array: "+total_Even);
        System.out.println("The total Odd numbers in array: "+total_Odd);

    }
}
