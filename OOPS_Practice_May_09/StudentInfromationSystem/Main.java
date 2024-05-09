package OOPS_Practice_May_09.StudentInfromationSystem;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int studentId,sub1,sub2,sub3;
        String name;
         StudentInfromationSystem[] students=new StudentInfromationSystem[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the student id,name,marks in line by line ");

        // if only sc.nextInt() is given then the integer input only taken by it. but
        //(\n) character leaved by the function . and then sc.nextLine() will read the input
        //till (\n) as it encountered the (\n) first it ends there and return empty which creates
        //Input mismatch Exception

        studentId=Integer.parseInt(sc.nextLine());
        name=sc.nextLine();
        sub1=sc.nextInt();
        sub2=sc.nextInt();
        sub3=sc.nextInt();
        StudentInfromationSystem student1=new StudentInfromationSystem(studentId,name,sub1,sub2,sub3);
        StudentInfromationSystem student2=new StudentInfromationSystem(23,"Rakesh",100,150,250);
        StudentInfromationSystem student3=new StudentInfromationSystem(175,"somesh",sub1,sub2,sub3);
        students[0]=student1;
        students[1]=student2;
        students[2]=student3;
//        students[0].getStudentDetails();
//        System.out.println();
//        students[1].getStudentDetails();
//        System.out.println();
//        students[2].getStudentDetails();
        int count=1;
        for(StudentInfromationSystem obj:students){
            if(obj==null){
                System.out.println("there are only"+(count-1)+" student objects stored in array");
                return;
            }
            System.out.println(" this is the student "+count);
            obj.getStudentDetails();
            System.out.println("---------------------------------------------------");
            count++;
        }

    }
}
