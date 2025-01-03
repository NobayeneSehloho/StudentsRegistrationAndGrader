package za.co.dnecs;

import java.util.ArrayList;

public class SearchStudent {

    public ArrayList<Student> searchStudentNames(String firstName, ArrayList<Student> students){
        ArrayList<Student> names = new ArrayList<>();

        for (Student student : students) {
            if (student.getFirstName().equals(firstName)) {
                names.add(student);
            }
        }
        if(names.isEmpty()){
            System.out.println("Student with first name \"" + firstName + "\" does not exist.");
        }

        return names;
    }
}

/*public ArrayList<Student> searchByLastName(int studentNumber, ArrayList<Student> students){
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

/*public ArrayList<Student> searchByStudentNumber(int studentNumber, ArrayList<Student> students){
    ArrayList<Student> names = new ArrayList<>();
    return names;
}*/
