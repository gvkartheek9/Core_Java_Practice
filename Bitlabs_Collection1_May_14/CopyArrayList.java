package Bitlabs_Collection1_May_14;

import java.util.ArrayList;
import java.util.Scanner;

public class CopyArrayList {
    public static void main(String[] args){
        int num1,num2,num3,num4,num5;
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        ArrayList<Integer> arrayList1=new ArrayList<>();
        System.out.println("Enter the numbers");
        System.out.println("Enter the num1");
        num1=sc.nextInt();
        System.out.println("Enter the num2");
        num2=sc.nextInt();
        System.out.println("Enter the num3");
        num3=sc.nextInt();
        System.out.println("Enter the num4");
        num4=sc.nextInt();
        System.out.println("Enter the num5");
        num5=sc.nextInt();
        arrayList.add(num1);
        arrayList.add(num2);
        arrayList.add(num3);
        arrayList.add(num4);
        arrayList.add(num5);
        for(Integer ele:arrayList){
            System.out.println("The elements are "+ele);
//            arrayList1.add(ele);
        }
        // lets check the == assignment works or not.
        // if we are using the == operation the a signle object another reference is created
        //if I change the arraylist1 that is reflected in the arraylist2 too.
//        System.out.println(arrayList);//[5,6,3,2,1]
//        arrayList1=arrayList;
//        System.out.println(arrayList1);//[5,6,3,2,1]
//        arrayList.remove(0);
//        System.out.println(arrayList);//[6,3,2,1]
//        System.out.println(arrayList1);//[6,3,2,1]
        // so the coorected way of ceating a copy to the arrayList is
        //1. Addall()
        //2. foreach loop iterate and add

        //1. addAll()
        arrayList1.addAll(arrayList);
        System.out.println(arrayList1);
        arrayList.remove(0);
        System.out.println("The original"+arrayList);
        System.out.println("Copy: "+arrayList1);
    }
}
