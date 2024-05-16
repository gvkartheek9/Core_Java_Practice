package StudentRegistractionSystem;

import java.util.HashMap;

public class StudentCredentials {

    HashMap<String,String>map = new HashMap<>();
    private final String studentId;
    private String password;
    private long mobileNumber;
    private String grade;

    public StudentCredentials( String studentId,String password, long mobileNumber, String grade) {
        this.password = password;
        this.studentId = studentId;
        map.put(studentId,password);
        this.mobileNumber = mobileNumber;
        this.grade = grade;
    }

    public long getMobileNo() {
        return mobileNumber;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getPassword() {
        return password;
    }

    public String getGrade() {
        return grade;
    }

    public HashMap<String, String> getMap() {
        return map; // Return a copy of the HashMap (optional)
    }

    //Setter methods
    public void setPassword(String password) {
        this.password = password;
    }


}
