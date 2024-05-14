package Bitlabs_Collection1_May_14;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEmpCode {
    public static void main(String[] args){
        HashMap<Integer,String> hm=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter the Employee code : ");
            int empCode = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Employee Name: ");
            String empName = sc.nextLine();

            hm.put(empCode, empName);

            System.out.println("Enter another employee (y/n)?");
            ch = sc.next().charAt(0);
        }
            while(ch=='y'||ch=='Y');

        System.out.println("EmpNames: ");
        for(String name:hm.values()){
            System.out.println(name);
        }

    }
}
