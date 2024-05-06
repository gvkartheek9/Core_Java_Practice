package Arrays_May_06_practice;

import java.util.Scanner;

//16th program of arrays


public class LeftRotationOfArrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rotations;
        System.out.println("Enter number of elements in array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter no of rotations ");
        rotations=sc.nextInt();
        System.out.println("The array elements before rotation");
        for(int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println();
        rotations%=a.length;
        int[] temp =new int[rotations];

        //storing the values in temp array
        for(int i=0;i<rotations;i++){
            temp[i]=a[i];
        }
        //lets shift the array
        for(int i=rotations;i<a.length;i++){
            a[i-rotations]=a[i];
        }
        //lets add the remaining temp elements to the last

        for(int i=0;i<rotations;i++){
            a[a.length-rotations+i]=temp[i];
        }
        System.out.println("After rotation the elements are");
        for(int ele:a){
            System.out.print(ele+" ");
        }
    }
}
