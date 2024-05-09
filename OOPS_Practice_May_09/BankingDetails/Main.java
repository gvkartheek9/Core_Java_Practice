package OOPS_Practice_May_09.BankingDetails;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SavingsAccount sa=new SavingsAccount(123456,5000.0);
        CheckingAccount ca=new CheckingAccount(987654,6000.0,2000.0);
        BankAccount[] bankObj =new BankAccount[4];

        bankObj[0]=new BankAccount(10001,1000);
        bankObj[1]=new BankAccount(10002,1500);
        bankObj[2]=new BankAccount(10003,2000);
        bankObj[3]=new BankAccount(10004,2500);
        int count=1;
        for(BankAccount obj:bankObj){
            System.out.println("the account holder details of "+count+" one");
            System.out.println("The account number is : "+obj.getAccountNumber());
            System.out.println("The account balance is : "+obj.getAccountBalance());
            obj.withDrawl(200);
            obj.deposit(300);
            count++;
            System.out.println("--------------------------------------------");
        }


//        sa.savingBalance();
//        ca.withDrawl(9000.0);
//        ca.withDrawl(5000.0);                        All the methods are working successfully so lets try to build the array
//        sa.withDrawl(2000.0);                        and simulate the real world .
//        System.out.println("---------------");
//        sa.deposit(10000.0);
//        System.out.println("-----------------");
//        ca.deposit(2000.0);
//        System.out.println("_------------------");
//        ca.withDrawl(5000.0);

    }
}
