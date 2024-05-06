package Arrays_May_06_practice;
import java.util.Scanner;

//3 Arrays Program

public class SortWithInput {

    public static int[] Sort(int[] a,int op){
        switch(op){
            case 1:
                for(int i=0;i<a.length;i++){
                    for(int j=i+1;j<a.length;j++){
                        if(a[i]>a[j]){
                            int temp=a[i];
                            a[i]=a[j];
                            a[j]=temp;
                        }
                    }
                }
                return a;
            case 2:
                for(int i=0;i<a.length;i++){
                    for(int j=i+1;j<a.length;j++){
                        if(a[i]<a[j]){
                            int temp=a[i];
                            a[i]=a[j];
                            a[j]=temp;
                        }
                    }
                }
                return a;
            default:
                System.out.println("The given operator is not mentioned anywhere");

        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in an array");
        int n = sc.nextInt();
        System.out.println("Please Enter the elements here: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter 1 to get Ascending order of elements");
        System.out.println("Enter 2 to get Descending order of elements");
        int operator=sc.nextInt();
        int[] res=Sort(a,operator);

        for(int ele:res){
            System.out.print(ele+" ");
        }

    }

}
