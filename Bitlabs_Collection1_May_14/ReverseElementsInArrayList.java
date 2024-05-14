package Bitlabs_Collection1_May_14;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseElementsInArrayList {
    public static void main(String[] args){
        int n,num1;
        ArrayList<Integer>al=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many numbers do you want");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the number"+i);
            al.add(sc.nextInt());
        }
        System.out.println(al);
        System.out.println("The reverse of the array list will be");
        for(int i=al.size()-1;i>=0;i--){
            System.out.print(al.get(i)+" ");
        }

    }
}
