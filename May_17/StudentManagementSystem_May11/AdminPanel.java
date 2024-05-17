package StudentManagementSystem_May11;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AdminPanel extends Student {

    List<Student> studentList=new ArrayList<>();

    AdminPanel(Student obj) {
        super(obj.getStudentId(), obj.getName(), obj.getGrade(), obj.getAge(), obj.getContactNumber());
    }


    public void addStudent(Student obj){
        studentList.add(obj);
    }

    public void removeStudent(String studentId){
        Student objectToRemove=null;
        for(Student student:studentList){
            if(Objects.equals(student.getStudentId(), studentId)){
                objectToRemove=student;
                break;
            }

        }
        studentList.remove(objectToRemove);
        System.out.println("The student with studentId "+studentId+" is successfully removed");
    }

    public boolean searchStudent(String studentId){
        for(Student student:studentList){
            if(Objects.equals(student.getStudentId(), studentId)){
                return true;
            }

        }
        return false;
//        if(arrayList.contains(obj)){
//            return true;
//        }
//        else{
//            return false;
//        }
    }

    public void displayAllStudents(){
        for(Student obj:studentList){
            System.out.println("the studentId :"+obj.getStudentId());
            System.out.println("The student name : "+obj.getName());
            System.out.println("The student grade : "+obj.getGrade());
            System.out.println("The student age : "+obj.getAge());
            System.out.println("The student contactNumber : "+obj.getContactNumber());
            System.out.println("-----------------------------------------");
        }
    }

    public void updateStudent(String studentId,Student updatedStudent){
        Student studentToUpdate=null;
        for(Student student:studentList){
            if(Objects.equals(student.getStudentId(), studentId)){
                studentToUpdate = student;
                break;
            }
        }
        if(updatedStudent!=null){
            studentToUpdate.setName(updatedStudent.getName());
            studentToUpdate.setAge(updatedStudent.getAge());
            studentToUpdate.setGrade(updatedStudent.getGrade());
            studentToUpdate.setContactNumber(updatedStudent.getContactNumber());
            System.out.println("the student details updated successfully");
        }
        else{
            System.out.println("The student with studentId"+studentId+" is not found");
        }
    }


}
