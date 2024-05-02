import java.util.Scanner;

class AllFactorsOfNumber{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find all factors of it");
        int number=sc.nextInt(); //The number to find the factors

//        int factors[]=new factors[number];//The factors will not be more than the number itself.
        for(int i=1;i<=number;i++){
            if(number%i==0){
                System.out.print(i+" ");
            }
        }
    }
}