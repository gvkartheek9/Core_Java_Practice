import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;


class ThirdLargestNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements in array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements of the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int ele:a){
            System.out.print(ele+" ");

        }
        System.out.println();
        System.out.println("The third largest element is :"+a[a.length-3]);
    }
}