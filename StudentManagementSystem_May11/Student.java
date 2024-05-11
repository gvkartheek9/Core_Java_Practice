package StudentManagementSystem_May11;

public class Student {
    private  String studentId,name,grade;
    private int age;
    private  long contactNumber;

    Student(String studentId,String name,String grade,int age,long contactNumber){
        this.studentId=studentId;
        this.name=name;
        this.grade=grade;
        this.age=age;
        this.contactNumber=contactNumber;
    }
    Student(String name,String grade,int age,long contactNumber){
        this.name=name;
        this.grade=grade;
        this.age=age;
        this.contactNumber=contactNumber;
    }

    public String getStudentId(){
        return studentId;
    }
    public String getName(){
        return name;
    }
    public String getGrade(){
        return grade;
    }
    public int getAge(){
        return age;
    }
    public long getContactNumber(){
        return  contactNumber;
    }

    //setter methods inn java


    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }
}
