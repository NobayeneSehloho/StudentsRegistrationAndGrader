package za.co.dnecs;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        ArrayList<Student> list = new ArrayList<>(32767);

        Student student1 = new Student(
                "John",
                "Doe",
                Country.SWAZILAND,
                new Date(2000 - 1900, Calendar.JANUARY, 15), // Jan 15, 2000
                "+27123456789",
                "123 Elm Street",
                Enrolment.WAITING_LIST
        );


        Student student2 = new Student(
                "James",
                "Smith",
                Country.SWEDEN,
                new Date(1998 - 1900, Calendar.MAY, 10), // May 10, 1998
                "+27123456789",
                "456 Maple Avenue",
                Enrolment.ACCEPTED
        );

        Student student3 = new Student(
                "James",
                "Potter",
                Country.SOUTH_AFRICA,
                new Date(1998 - 1900, Calendar.DECEMBER, 10), // May 10, 1998
                "+27123456789",
                "456 Maple Avenue",
                Enrolment.ACCEPTED
        );

        //studentList.add(student1);
        //student1.addStudentToSystem(student1);
        //student2.addStudentToSystem(student2);

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(new Student("James", "Potter", Country.LESOTHO, new Date(1998 - 1900, Calendar.JULY, 4),"+27123456789", "456 Maple Avenue", Enrolment.WAITING_LIST));
        list.add(new Student("Mary", "Bush", Country.SOUTH_AFRICA, new Date(1998 - 1900, Calendar.OCTOBER, 22),"+27123456789", "456 Maple Avenue", Enrolment.WAITING_LIST));

        list.add(new Student("Noby", "Bush", Country.SOUTH_AFRICA, new Date(1998 - 1900, Calendar.OCTOBER, 22),"+27123456789", "456 Maple Avenue", Enrolment.WAITING_LIST));
        list.add(new Student("Anne", "Belleck", Country.GERMANY, new Date(1982 - 1900, Calendar.JULY, 3),"+27123456789", "456 Orange Road", Enrolment.ACCEPTED));


        System.out.println(list.contains(student1));
        System.out.println(list.contains(student2));

        Student.printAllStudent(list);

        /// /// SEARCH FOR FIRSTNAME
        SearchStudent studentNames = new SearchStudent();
        String searchByFirstName = "James";

        ArrayList<Student> result = studentNames.searchStudentByFirstName(searchByFirstName,list);
        System.out.println(" ");
        System.out.println("Students with the first name " + "'" + searchByFirstName +"'");
        Student.printAllStudent(result);

        /// SEARCH FOR LASTNAME
        String searchByLastName = "Smith";
        ArrayList<Student> lastNameResults = studentNames.searchStudentByLastName(searchByLastName,list);
        System.out.println(" ");
        System.out.println("Students with the last name " + "'" + searchByLastName +"'");
        Student.printAllStudent(lastNameResults);


        /// SEARCH FOR STUDENTNUMBER
        String searchByStudentNumber = "200900001";

        ArrayList<Student> studentNumberResults = studentNames.searchStudentByStudentNumber(searchByStudentNumber,list);
        System.out.println(" ");
        System.out.println("Students with the student number  " + "'" + searchByStudentNumber +"'");
        Student.printAllStudent(studentNumberResults);



        /// SEARCH FOR InternationalStatus
        boolean internationalStatus = true;
        ArrayList<Student> citizenshipResults = studentNames.searchStudentByCitizensOrNot(internationalStatus,list);
        System.out.println(" ");
        System.out.println("Students with the last name " + "'" + internationalStatus +"'");
        Student.printAllStudent(citizenshipResults);


        /// SEARCH FOR Registered Students
        Enrolment searchByEnrolmentStatus = Enrolment.ACCEPTED;
        String status = String.valueOf(Enrolment.valueOf(String.valueOf(searchByEnrolmentStatus)));
        ArrayList<Student> enrolmentStatusResults = studentNames.searchStudentByEnrolmentStatus(Enrolment.valueOf(status),list);
        System.out.println(" ");
        System.out.println("Students with the Enrolement status of " + "'" + searchByEnrolmentStatus +"'");
       Student.printAllStudent(enrolmentStatusResults);


        /// SEARCH FOR all Students from Specific Country
        Country searchByCountry = Country.SOUTH_AFRICA;
        String country = String.valueOf(Country.valueOf(String.valueOf(searchByCountry)));
        ArrayList<Student> countryResults = studentNames.searchStudentByCountry(Country.valueOf(country),list);
        System.out.println(" ");
        System.out.println("Students with the Enrolment status of " + "'" + searchByCountry +"'");
        Student.printAllStudent(countryResults);


        ///SORT STUDENTS BY FIRSTNAME
        // Comparator to compare by first name
        Comparator<Student> compareByFirstNames = Comparator.comparing(Student::getFirstName);

        // Use the SortStudent class to sort the list by first name
        SortStudent sortFirstName = new SortStudent();
        ArrayList<Student> sortedListByFirst = sortFirstName.sortByFirstName(list, compareByFirstNames);

        // Print the sorted list
        System.out.println(" ");
        System.out.println("Sort students by their first names:");
        Student.printAllStudent(sortedListByFirst);


        /// SEARCH FOR Students in Specific Department
        String searchByDepartment = "Information Technology";

        /// SEARCH FOR Course in Specific Department
        String searchCourseByDepartment = "Information Technology";

        /// SEARCH FOR Course in Specific Department
        int searchByRegisteredYear = Calendar.YEAR;

    }
}