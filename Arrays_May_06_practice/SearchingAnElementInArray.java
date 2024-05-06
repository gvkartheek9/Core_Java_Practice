package Arrays_May_06_practice;

import java.util.Scanner;

//15th program on Arrays

public class SearchingAnElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key;
        boolean flag=false;
        System.out.println("Enter number of elements in an array");
        int n = sc.nextInt();
        System.out.println("Please Enter the elements here: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the Key element to search");
        key=sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                flag=true;
                System.out.println("The element "+key+" is found at "+i+"th position");
            }
        }
        if(!flag){
            System.out.println("The key is not found in the array");
        }
    }
}
