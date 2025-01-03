package za.co.dnecs;

import java.util.ArrayList;

public class SearchStudent {

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


    public ArrayList<Student> searchStudentByLastName(String lastName, ArrayList<Student> studentList) {
        ArrayList<Student> names = new ArrayList<>();

        for(Student student : studentList){
            if(student.getLastName().equals(lastName)){
                names.add(student);

            }
        }

        if(names.isEmpty()){
            System.out.println("Students with Last Name \"" + lastName + "\" do not exist.");
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

/*public ArrayList<Student> searchByStudentNumber(int studentNumber, ArrayList<Student> students){
    ArrayList<Student> names = new ArrayList<>();
    return names;
}*/

/*public ArrayList<Student> searchByStudentNumber(int studentNumber, ArrayList<Student> students){
    ArrayList<Student> names = new ArrayList<>();
    return names;
}*/

}