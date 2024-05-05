import java.util.Scanner;


class RemoveDuplicates{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements in an array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements of an array");
        for(int k=0;k<n;k++){
            a[k]=sc.nextInt();
        }
        for(int i=0;i<a.length-1;i++){
            int temp=a[i];
            for(int j=i+1;j<a.length;j++){
                if(temp==0)
                    break;
                if(a[j]==temp){
                    a[j]=0;
                }
            }
        }
        //lets display the array
        for(int ele:a){
            System.out.print(ele+" ");
        }
    }
}