package za.co.dnecs;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import za.co.dnecs.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        ArrayList<Student> list = new ArrayList<>(32767);

        Student student1 = new Student(
                "John",
                "Doe",
                Country.SWAZILAND,
                new Date(2000 - 1900, Calendar.JANUARY, 15), // Jan 15, 2000
                1234567890,
                "123 Elm Street",
                Enrolment.WAITING_LIST
        );

        Student student2 = new Student(
                "James",
                "Smith",
                Country.SWEDEN,
                new Date(1998 - 1900, Calendar.MAY, 10), // May 10, 1998
                987654321,
                "456 Maple Avenue",
                Enrolment.ACCEPTED
        );

        Student student3 = new Student(
                "James",
                "Potter",
                Country.SOUTH_AFRICA,
                new Date(1998 - 1900, Calendar.DECEMBER, 10), // May 10, 1998
                987654321,
                "456 Maple Avenue",
                Enrolment.ACCEPTED
        );

        //studentList.add(student1);
        //student1.addStudentToSystem(student1);
        //student2.addStudentToSystem(student2);

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(new Student("James", "Potter", Country.LESOTHO, new Date(1998 - 1900, Calendar.JULY, 4),987654321, "456 Maple Avenue", Enrolment.WAITING_LIST));
        list.add(new Student("Mary", "Bush", Country.SOUTH_AFRICA, new Date(1998 - 1900, Calendar.OCTOBER, 22),987654321, "456 Maple Avenue", Enrolment.WAITING_LIST));

        System.out.println(list.contains(student1));
        System.out.println(list.contains(student2));

        Student.printAllStudent(list);

        /// /// SEARCH FOR FIRSTNAME
        SearchStudent studentNames = new SearchStudent();
        String searchByFirstName = "James";

        ArrayList<Student> result = studentNames.searchStudentNames(searchByFirstName,list);
        System.out.println(" ");
        System.out.println("Students with the first name " + "'" + searchByFirstName +"'");
        Student.printAllStudent(result);

        /// SEARCH FOR LASTNAME
        String searchByLastName = "Smith";

        /// SEARCH FOR STUDENTNUMBER
        int searchByStudentNumber = 2009110902;

        /// SEARCH FOR InternationalStatus
        boolean searchByInternationalStatus = true;

        /// SEARCH FOR Registered Students
        Enrolment searchByEnrolmentStatus = Enrolment.REGISTERED;

        /// SEARCH FOR Students in Specific Department
        String searchByDepartment = "Information Technology";

        /// SEARCH FOR Course in Specific Department
        String searchCourseByDepartment = "Information Technology";

        /// SEARCH FOR Course in Specific Department
        int searchByRegisteredYear = Calendar.YEAR;

    }
}