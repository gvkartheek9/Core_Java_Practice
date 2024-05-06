package Arrays_May_06_practice;

import java.util.Scanner;

//7th program in Arrays

public class TotalNoOfNegativeElements {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int neg_Count=0;
        System.out.println("Enter number of elements in an array");
        int n=sc.nextInt();
        System.out.println("Please Enter the elements here: ");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("The Negative Elements are: ");
        for(int ele:a){
            if(ele<0){
                neg_Count++;
            }
        }
        System.out.println("the total no of negative elements in array are : "+neg_Count);


    }
}
