package Arrays_May_06_practice;

import java.util.Scanner;

//14th Array Programs

public class DeleteAnElementAtPosition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in an array");
        int n = sc.nextInt();
        System.out.println("Please Enter the elements here: ");
        int[] a = new int[n];
        int[] res=new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the index position to delete");
        int indexPosition=sc.nextInt();
        for(int i=0;i<indexPosition;i++){
            res[i]=a[i];
        }
        for(int i=indexPosition;i<a.length-1;i++){
            res[i]=a[i+1];
        }
        System.out.println("The elements after deleting the specified position element");
        for(int ele:res){
            System.out.print(ele+" ");
        }


    }
}
