package StudentRegistractionSystem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class StudentRegistration {
    public static void main(String[] args){
        int ch=0;
        String studentId,password,grade;
        StudentCredentials student1 = null;
        StudentCredentials checkStudent=null;
        long mobileNumber=0;
        Scanner sc=new Scanner(System.in);
        ArrayList<StudentCredentials>arrayList=new ArrayList<StudentCredentials>();

        while(true){

            System.out.println("Welcome to the student Registration");
            System.out.println("Enter 1 to signup");
            System.out.println("Enter 2 to signin or login");
            System.out.println("Enter 3 to exit()");
            try {
                ch = Integer.parseInt(sc.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("The number should be given not string ");
                System.out.println("----------------------------------------");
            }
            switch(ch){
                case 1:
                    System.out.println("You Entered the signup portal ");
                    System.out.println("Enter the studentId which is unique");
                    studentId=sc.nextLine();

                    if(arrayList.size()>0) {
                        for (StudentCredentials ele : arrayList) {
                            if (ele.getStudentId().equals(studentId)) {
                                checkStudent = ele;
                            }
                        }

                        if(checkStudent!=null) {
                            HashMap<String, String> map1 = checkStudent.getMap();
                            if (map1.containsKey(studentId)) {
                                System.out.println("The student id " + studentId + " is already present ");
                                System.out.println("Please enter valid id");
                                System.out.println("------------------------------------");
                                break;
                            }
                        }
                    }

                    System.out.println("Enter the mobile no: ");
                    try {
                        mobileNumber = Long.parseLong(sc.nextLine());
                    }
                    catch(NumberFormatException e){
                        System.out.println("the number should be given "+e.getMessage());
                        break;
                    }
                    System.out.println("Enter the grade: ");
                    grade=sc.nextLine();
                    System.out.println("Enter the password");
                    password=sc.nextLine();
                    student1=new StudentCredentials(studentId,password,mobileNumber,grade);
                    arrayList.add(student1);
                     break;
                case 2:
                    System.out.println("Enter to the signin portal");
                    System.out.println("Enter the student Id");
                    studentId=sc.nextLine();
                    System.out.println("Enter the password");
                    password=sc.nextLine();//taking the student id and the password to check

                    //in the arraylist is storing the objects of student Credentials
                    //so when the studentId and the password came
                    // we can traverse throgh every object and if we find any object with the same studentid
                    //then check for the password if password matches get the

                    for(StudentCredentials ele:arrayList){
                        if(ele.getStudentId().equals(studentId)){
                            checkStudent=ele;
                        }
                    }


                    //taking hasMap of tht student Credentials to check the studentId,password match;
                    HashMap<String,String>map=checkStudent.getMap();
                    System.out.println(map+" "+map.get(studentId)+" "+password);
                    if(map.containsKey(studentId)){
                        if(map.get(studentId)==password|| password.equals(map.get(studentId))){
                            System.out.println("login successful");
                            System.out.println("---------------------------------");
                        }
                        else{
                            System.out.println("The password is wrong");
                            System.out.println("---------------------------------");
                        }
                    }
                    else{
                        System.out.println("The student id is wrong ");
                        System.out.println("---------------------------------");
                    }
                    break;
                case 3:
                    System.out.println("You asked to exit the program");
                    System.exit(0);
                default:
                    System.out.println("Invalid input");
                    System.out.println("---------------------------------");
                    break;

            }


        }

    }
}
