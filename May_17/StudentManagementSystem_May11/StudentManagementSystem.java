package StudentManagementSystem_May11;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentManagementSystem extends Student implements SearchService
{


    List<Student> arrayList=new ArrayList<>();

    StudentManagementSystem(Student obj) {
        super(obj.getStudentId(), obj.getName(), obj.getGrade(), obj.getAge(), obj.getContactNumber());
    }

    public void addStudent(Student obj){
          arrayList.add(obj);
    }

    public void removeStudent(String studentId){
        Student objectToRemove=null;
        for(Student student:arrayList){
            if(Objects.equals(student.getStudentId(), studentId)){
                objectToRemove=student;
                break;
            }

        }
        arrayList.remove(objectToRemove);
//
    }

    public boolean searchStudent(String studentId){
        for(Student student:arrayList){
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
        for(Student obj:arrayList){
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
          for(Student student:arrayList){
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


//    @Override
//    public ArrayList<String> searchStudentByName(String name) {
//        ArrayList<String> studentFound=new ArrayList<>();
//        for(Student student:arrayList){
//            if(name.equals(student.getName())){
//                studentFound.add(student.getName());
//            }
//        }
//        return studentFound;
//    }

    @Override
    public ArrayList<String> searchStudentByAge(int age) {
        ArrayList<String> studentFound=new ArrayList<>();
        for(Student student:arrayList){
            if(age == student.getAge()){
                studentFound.add(student.getName());
            }
        }
        return studentFound;
    }

    @Override
    public ArrayList<String> searchStudentByGrade(String grade) {
        ArrayList<String> studentFound=new ArrayList<>();
        for(Student student:arrayList){
            if(Objects.equals(grade, student.getGrade()))
            studentFound.add(student.getName());
        }
        return studentFound;
    }


}
