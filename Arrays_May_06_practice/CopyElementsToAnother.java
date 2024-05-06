package Arrays_May_06_practice;

import java.util.Scanner;

public class CopyElementsToAnother {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in an array");
        int n = sc.nextInt();
        System.out.println("Please Enter the elements here: ");
        int[] a = new int[n];
        int[] copy=new int[a.length];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            copy[i]=a[i];
        }
        System.out.print("The copied array elements are: ");
        for(int ele:copy){
            System.out.print(ele+" ");
        }
    }
}
