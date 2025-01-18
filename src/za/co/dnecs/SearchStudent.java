package za.co.dnecs;

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
            if (student.getStudentNumber().equals(studentNumber)) {
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

    /**
     *
     * Working
     * @param country
     * @param studentsList
     * @return
     */
    public ArrayList<Student> searchStudentByCountry(Country country, ArrayList<Student> studentsList){
        ArrayList<Student> names = new ArrayList<>();

        for(Student student : studentsList){
            if (student.getCountry().equals(country)) {
                names.add(student);
            }
        }

        if (names.isEmpty()) {
            System.out.println("Students from Country \"" + country + "\" do not exist.");
        }

        return names;
    }

    /**
     *
     * Working
     * @param international
     * @param studentsList
     * @return
     */
    public ArrayList<Student> searchStudentByCitizensOrNot(boolean international, ArrayList<Student> studentsList){
    ArrayList<Student> names = new ArrayList<>();

        for(Student student : studentsList){
            if (student.checkIfInternational(student.getCountry()) == international) {
                names.add(student);
            }
        }

        if (names.isEmpty()) {
            System.out.println("Students with International Status of \"" + international + "\" do not exist.");
        }

    return names;
}

}

