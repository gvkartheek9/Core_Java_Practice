package StudentManagementSystem_May11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String id,name,grade;
        int age;
        long contact;
        Student obj1=new Student("101","somesh","X",16,1234567890);
        Student obj2=new Student("102","tomesh","XI",17,1234567891);
        Student obj3=new Student("103","uomesh","XII",18,1234567892);
        Student obj4=new Student("104","vomesh","XIII",19,1234567893);
        Student obj5=new Student("105","womesh","XIIII",20,1234567894);

        StudentManagementSystem sm=new StudentManagementSystem(obj1);
        sm.addStudent(obj1);
        sm.addStudent(obj2);
        sm.addStudent(obj3);
        sm.addStudent(obj4);
        sm.addStudent(obj5);
//        System.out.println("The collection before the remove operation ");
//      sm.displayAllStudents();//  the addition operation is successfull
//      sm.removeStudent(obj5);
//        System.out.println("The collection after the remove opertaion");
//        System.out.println();
//        //the removal operation is also successful
//      sm.displayAllStudents();
//
//      // the search operation is successful
//
//      if(sm.searchStudent("102")){
//          System.out.println("The student object is present in the collection");
//      }
//      else{
//          System.out.println("The student object is not there in the collection");
//      }
//
//      // lets test the update operation  its successfully getting updated.
//
//        Student student11=new Student("Natesh","XII",45,123456987);
////        Student student11=new Student();
////        System.out.println(student11.getStudentId()+" "+student11.getName());
//        sm.updateStudent("101",student11);
//
//      sm.displayAllStudents();
          Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to student management system");
        while(true){
            System.out.println("Enter 1 to add a new student");
            System.out.println("Enter 2 to search for the student with the student id");
            System.out.println("Enter 3 to Update the student details ");
            System.out.println("Enter 4 to remove a student");
            System.out.println("Enter 5 to display all the student info");
            System.out.println("Enter 6 to Exit a program ");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the student id,name,grade,age,contact number line by line ");
                     id=sc.next();
                     name=sc.next();
                     grade=sc.next();
                     age=sc.nextInt();
                    contact=sc.nextLong();
                    Student obj=new Student(id,name,grade,age,contact);
                    sm.addStudent(obj);
                    System.out.println("The student is successfully added");
                    break;
                case 2:
                    System.out.println("Enter the student id to search");
                    id=sc.next();
                    boolean k=sm.searchStudent(id);
                    if(k){
                        System.out.println("The student if is present in the collection");
                    }
                    else{
                        System.out.println("There us no student with that student id");
                    }
                    break;
                case 3:
                    System.out.println("Enter student details to update");
                     id=sc.next();
                    name=sc.next();
                    grade=sc.next();
                    age=sc.nextInt();
                    contact=sc.nextLong();
                    Student s=new Student(name,grade,age,contact);
                    sm.updateStudent(id,s);
                    break;
                case 4:
                    System.out.println("Enter the id of the stduent to remove");
                    id=sc.next();
                    sm.removeStudent(id);
                    break;
                case 5:
                    System.out.println("The details of all the students are");
                    sm.displayAllStudents();
                    break;
                case 6:
                    System.out.println("You asked to exit the program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("You entered the invalid choice ");
                    break;


            }

        }

    }

}
