package Bitlabs_Collection1_May_14;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElementInArrayList {
    public static void main(String[] args){
        int n;
        String key;
        ArrayList<String>al=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of strings you want to provide");
        n= sc.nextInt();
        for(int i=0;i<n;i++){
            al.add(sc.next());
        }
        System.out.println(al);
        System.out.println("Enter the string element to search");
        key=sc.next();
        if(al.contains(key)){
            System.out.println("The element"+key+" is present in the arraylist");
        }
        else{
            System.out.println("The element"+key+" is not present in the arraylist");
        }


    }
}
