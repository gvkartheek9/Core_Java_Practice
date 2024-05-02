package Day_2_practice;

import java.util.Scanner;

class FibonocciSeriesToN{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<number;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}