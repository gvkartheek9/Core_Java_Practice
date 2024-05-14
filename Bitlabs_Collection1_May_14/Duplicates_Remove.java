package Bitlabs_Collection1_May_14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicates_Remove {
    public static void main(String[] args){
        int num;
        ArrayList<Integer>al=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many number you want to insert");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the Number "+i);
            num=sc.nextInt();
            al.add(num);
        }
        System.out.println(al);
       // now we need to covert it into a collection which does not have any duplicates.
        Set<Integer> s=new HashSet<>(al);
        System.out.println(s);

    }
}
