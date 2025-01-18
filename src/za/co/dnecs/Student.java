//package za.co.dnecs;
///**
// * imports
// */
//import java.text.DecimalFormat;
//import java.util.ArrayList;
//import java.util.Date;
//
///**
// * class
// */
//public class Student {
//
//    /**
//     * attributes
//     */
//
//    private String firstName;
//    private String lastName;
//    private int phoneNumber;
//    private String address;
//    private Country country;
//    private Date dateOfBirth;
//    private boolean isInternationalStudent;
//    private Enrolment status;
//    private ArrayList<Student> list ;
//    //private short initialCapacity = 32767;
//
//    private String studentNumber;
//    //private int countStudentNumber;
//    private int startNumber = 1;
//    private int  intakeYear = 2009;
//
//
//
//    public Student(){
//    }
//
//
//    public Student(String firstName, String lastName, Country country, Date dateOfBirth, int phoneNumber, String address, Enrolment status, int intakeYear){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.country = country;
//        this.dateOfBirth = dateOfBirth;
//        this.address = address;
//        this.phoneNumber = phoneNumber;
//        //this.isInternationalStudent = isInternationalStudent;
//        this.status = status;
//        //this.intakeYear = intakeYear;
//
//        //setCountStudentNumber(countStartNumber());
//        //this.counter =  counter();
//        //setStudentNumber(2009);
//        //setCountStudentNumber(this.startNumber);
//
//        // Generate and assign a unique student number
//        this.studentNumber = createStudentNumber(intakeYear);
//
//
//    }
//
//
//    public int getCountStudentNumber() {
//        return countStudentNumber;
//    }
//
//    public void setCountStudentNumber(int countStudentNumber)
//    {
//        this.countStudentNumber = countStudentNumber;
//        //this.countStudentNumber = countStartNumber();
//    }
//
//
//    /**
//     * Getters and setter below
//     *
//     * @return
//     */
//
//
//
//
//    // Getters
//    public String getStudentNumber() {
//        return studentNumber;
//    }
//
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public int getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(int phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public Country getCountry() {
//        return country;
//    }
//
//    public void setCountry(Country country) {
//        this.country = country;
//    }
//
//    public Date getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//    public void setDateOfBirth(Date dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }
//
//
//    public boolean isInternationalStudent() {
//        return checkIfInternational(this.country);
//    }
//
//
//    public void setInternationalStudent(boolean internationalStudent) {
//        isInternationalStudent = internationalStudent;
//    }
//
//
//    public Enrolment getStatus() {
//        return status;
//    }
//
//
//    public void setStatus(Enrolment status) {
//        this.status = status;
//    }
//
//
//    /**
//     * Getters and setter below
//     * @return
//     */
//
//
//    public boolean checkIfInternational(Country country){
//        //String citizen;
//
//        if (country == Country.SOUTH_AFRICA){
//            //citizen = "SOUTH AFRICA";
//            return true;
//        }else{
//            //citizen = "International Student";
//            return false;
//        }
//    }
//
//
//    // check this method
//    public void addStudentToSystem(Student student, ArrayList<Student> list){
//
//        list = new ArrayList<>(this.initialCapacity);
//
//        if(list.size() != this.initialCapacity){
//            list.add(student);
//            System.out.printf("Student %s %s has been added to the system: Student number is : %s ", student.getLastName(), student.getLastName(), student.getStudentNumber());
//        }else{
//            System.out.println("No more intake for academic year ");
//        }
//    }
//
//
//    public static void printAllStudent(ArrayList<Student> list){
//        //System.out.println("Students List are per below: ");
//        System.out.printf("%-15s %-15s %-10s %-15s  %-12s    %-20s %-10s    %-20s%n",
//                "First Name", "Last Name", "Country", "Date of Birth", "Phone Number", "Address", "Status", "International Student");
//        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
//
//        // Print each student in a tabular format
//        for (Student s : list) {
//            System.out.printf("%-15s %-15s %-10s %-15tF  %-12d    %-20s %-10s      %-35s  %-35s %n",
//                    s.firstName, s.lastName, s.country, s.dateOfBirth, s.phoneNumber, s.address, s.status, s.isInternationalStudent(), s.getStudentNumber());
//        }
//    }
//
//
//
//
//    private int countStudentNumber = 0; // Counter for generating student numbers
//    private final int initialCapacity = 10000; // Example starting point for numbers
//
//    public String createStudentNumber(int intakeYear) {
//        // Increment the start number
//        countStudentNumber++;
//
//        // Define the decimal format with leading zeros (e.g., 00001)
//        DecimalFormat df = new DecimalFormat("00000");
//
//        // Format the current counter
//        String formattedNumber = df.format(countStudentNumber);
//
//        // Combine the year and the formatted number
//        return intakeYear + formattedNumber;
//    }
//
//    // Optional method to initialize the start number from external sources if needed
//    public void initializeStartNumber(int startFrom) {
//        this.countStudentNumber = startFrom;
//    }
//
//
//}


package za.co.dnecs;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;

public class Student {

    private String firstName;
    private String lastName;
    private String phoneNumber; // Changed to String for better representation
    private String address;
    private Country country;
    private Date dateOfBirth;
    private boolean isInternationalStudent;
    private Enrolment status;
    private String studentNumber;

    // Static counter shared across all Student instances
    private static int countStudentNumber = 0;

    // Maximum number of students
    private static final int initialCapacity = 32767;

    public Student() {}

    public Student(String firstName, String lastName, Country country, Date dateOfBirth, String phoneNumber, String address, Enrolment status, int intakeYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.status = status;

        // Generate and assign a unique student number
        this.studentNumber = createStudentNumber(intakeYear);
    }

    // Static method to create a unique student number
    public String createStudentNumber(int intakeYear) {
        // Increment the shared counter for all instances
        countStudentNumber++;

        // Define the decimal format with leading zeros (e.g., 00001)
        DecimalFormat df = new DecimalFormat("00000");

        // Format the current counter
        String formattedNumber = df.format(countStudentNumber);

        // Combine the year and the formatted number
        return intakeYear + formattedNumber;
    }

    // Getters
    public String getStudentNumber() {
        return studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public Country getCountry() {
        return country;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Enrolment getStatus() {
        return status;
    }

    public boolean isInternationalStudent() {
        return this.country != Country.SOUTH_AFRICA;
    }

    // Add student to a system
    public static void addStudentToSystem(Student student, ArrayList<Student> list) {
        if (list.size() < initialCapacity) {
            list.add(student);
            System.out.printf("Student %s %s has been added to the system. Student number: %s%n", student.getFirstName(), student.getLastName(), student.getStudentNumber());
        } else {
            System.out.println("No more intake for this academic year.");
        }
    }

    public static void printAllStudent(ArrayList<Student> list){
        //System.out.println("Students List are per below: ");
        System.out.printf("%-15s %-15s %-10s %-15s  %-12s    %-20s %-10s    %-20s%n",
                "First Name", "Last Name", "Country", "Date of Birth", "Phone Number", "Address", "Status", "International Student");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

        // Print each student in a tabular format
        for (Student s : list) {
            System.out.printf("%-15s %-15s %-10s %-15tF  %-12s    %-20s %-10s      %-35s  %-35s %n",
                    s.firstName, s.lastName, s.country, s.dateOfBirth, s.phoneNumber, s.address, s.status, s.isInternationalStudent(), s.getStudentNumber());
        }
    }


    public boolean checkIfInternational(Country country){
        //String citizen;

        if (country == Country.SOUTH_AFRICA){
            //citizen = "SOUTH AFRICA";
            return true;
        }else{
            //citizen = "International Student";
            return false;
        }
   }



}
