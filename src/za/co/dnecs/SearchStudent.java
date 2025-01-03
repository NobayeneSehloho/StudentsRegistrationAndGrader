package za.co.dnecs;

import com.oracle.webservices.internal.api.EnvelopeStyle;

import java.util.ArrayList;

public class SearchStudent {

    /**
     *
     * Working
     * @param firstName
     * @param studentList
     * @return
     */
    public ArrayList<Student> searchStudentByFirstName(String firstName, ArrayList<Student> studentList) {
        ArrayList<Student> names = new ArrayList<>();

        for (Student student : studentList) {
            if (student.getFirstName().equals(firstName)) {
                names.add(student);
            }
        }
        if (names.isEmpty()) {
            System.out.println("Student with first name \"" + firstName + "\" does not exist.");
        }

        return names;
    }

    /**
     *
     * working
     * @param lastName
     * @param studentList
     * @return
     */
    public ArrayList<Student> searchStudentByLastName(String lastName, ArrayList<Student> studentList) {
        ArrayList<Student> names = new ArrayList<>();

        for (Student student : studentList) {
            if (student.getLastName().equals(lastName)) {
                names.add(student);
            }
        }

        if (names.isEmpty()) {
            System.out.println("Students with Last Name \"" + lastName + "\" do not exist.");
        }

        return names;
    }

    /**
     *  Not tested
     * @param studentNumber
     * @param studentsList
     * @return
     */
    public ArrayList<Student> searchStudentByStudentNumber(int studentNumber, ArrayList<Student> studentsList) {
        ArrayList<Student> names = new ArrayList<>();

        for (Student student : studentsList) {
            if (student.getStudentNumber() == studentNumber) {
                names.add(student);
            }
        }

        if (names.isEmpty()) {
            System.out.println("Students with Student Number \"" + studentNumber + "\" do not exist.");
        }

        return names;
    }

    /**
     *
     * Working
     * @param enrolment
     * @param studentsList
     * @return
     */
    public ArrayList<Student> searchStudentByEnrolmentStatus(Enrolment enrolment, ArrayList<Student> studentsList) {
        ArrayList<Student> names = new ArrayList<>();

        for(Student student : studentsList){
            if (student.getStatus().equals(enrolment)) {
                names.add(student);
            }
        }

        if (names.isEmpty()) {
            System.out.println("Students with Enrolment Status of \"" + enrolment + "\" do not exist.");
        }

        return names;
    }

/*public ArrayList<Student> searchByStudentNumber(int studentNumber, ArrayList<Student> students){
    ArrayList<Student> names = new ArrayList<>();
    return names;
}*/

/*public ArrayList<Student> searchByStudentNumber(int studentNumber, ArrayList<Student> students){
    ArrayList<Student> names = new ArrayList<>();
    return names;
}*/

}

