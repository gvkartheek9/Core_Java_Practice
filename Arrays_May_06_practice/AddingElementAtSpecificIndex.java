package Arrays_May_06_practice;


import java.util.Scanner;

public class AddingElementAtSpecificIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,element,position;
        System.out.println("Enter no of elements in ann array");
        n=sc.nextInt();
        int[] a=new int[n];
        int[] res=new int[n+1];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element need to insert");
        element=sc.nextInt();
        System.out.println("Please Enter the specific position for the element to be inserted ");
        position=sc.nextInt();
        if(position>a.length){
            System.out.println("give a position less than the array length");
            return;
        }
        System.out.println("The Elements before Insertion are");
        for(int ele:a){
            System.out.print(ele+" ");
        }
        for(int i=0;i<position;i++){
            res[i]=a[i];
        }
        res[position]=element;
        for(int i=position;i<a.length;i++){
            res[i+1]=a[i];
        }

        System.out.println("The elements after insertion are");
        for(int ele:res){
            System.out.print(ele+" ");
        }

    }
}
