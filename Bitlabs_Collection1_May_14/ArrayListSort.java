package Bitlabs_Collection1_May_14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSort {
    public static void main(String[] args){
        ArrayList<Integer>al=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements you want to add");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        Collections.sort(al);
        System.out.println(al);

    }
}
