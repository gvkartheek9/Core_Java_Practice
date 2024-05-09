package OOPS_Practice_May_09.StudentInfromationSystem;

public class StudentInfromationSystem {
    private int studentId,subject1,subject2,subject3;
    private String name;
    public StudentInfromationSystem(int studentId, String name, int subject1,int subject2,int subject3){
        this.studentId=studentId;
        this.name=name;
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }
    public void getStudentDetails(){
        System.out.println("The name of the student is:"+name);
        System.out.println("The Id of the student is : "+studentId);
        System.out.println("The Marks of the student in subject1: "+subject1);
        System.out.println("The Marks of the student in subject2: "+subject2);
        System.out.println("The Marks of the student in subject3: "+subject3);
    }

//    public boolean isEmpty() {
//        if (studentId==null && name=null &&)
//    }
}
