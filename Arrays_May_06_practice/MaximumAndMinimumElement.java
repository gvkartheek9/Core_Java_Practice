package Arrays_May_06_practice;

import java.util.Scanner;

//Arrays 5th problem

public class MaximumAndMinimumElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in an array");
        int n = sc.nextInt();
        System.out.println("Please Enter the elements here: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max_Ele=a[0];
        int min_Ele=a[0];
        for(int ele:a) {
            if(ele<min_Ele){
                min_Ele = ele;
            }
            if(ele>max_Ele){
                max_Ele = ele;
            }
        }

        System.out.println("The maximum ele is: "+max_Ele+" The min element is : "+min_Ele);

    }
}
