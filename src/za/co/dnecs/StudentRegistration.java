package za.co.dnecs;

import java.util.Date;
import java.util.LinkedHashMap;

public class StudentRegistration extends Student {

    private int studentNumber;
    private Department department;
    private Enrolment status;
    private LinkedHashMap<Integer, Student> studentRegister = new LinkedHashMap<>(32767);

    StudentRegistration(){
       super();
    }

    public StudentRegistration(String firstName, String lastName, String country, Date dateOfBirth, String phoneNumber, String address, int studentNumber, Department department, Enrolment status) {
        super(firstName, lastName, Country.valueOf(country), dateOfBirth, phoneNumber, address, department, status);
        this.studentNumber = studentNumber;
        this.department = department;
        this.status = status;
    }

//    public String getStudentNumber() {
//        return studentNumber;
//    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Enrolment getStatus() {
        return status;
    }

    public void setStatus(Enrolment status) {
        this.status = status;
    }
}
