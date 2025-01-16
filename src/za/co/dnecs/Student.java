package za.co.dnecs;
/**
 * imports
 */
import java.util.ArrayList;
import java.util.Date;

/**
 * class
 */
public class Student {

    /**
     * attributes
     */
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String address;
    private Country country;
    private Date dateOfBirth;
    private boolean isInternationalStudent;
    private Enrolment status;
    private ArrayList<Student> list ;
    private short initialCapacity = 32767;
    private int studentNumber = 0;

    private Date intakeYear;


    public Student(){
    }


    public Student(String firstName, String lastName, Country country, Date dateOfBirth, int phoneNumber, String address, Enrolment status){
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        //this.isInternationalStudent = isInternationalStudent;
        this.status = status;
    }


    /**
     * Getters and setter below
     * @return
     */
    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isInternationalStudent() {
        return checkIfInternational(this.country);
    }

    public void setInternationalStudent(boolean internationalStudent) {
        isInternationalStudent = internationalStudent;
    }

    public Enrolment getStatus() {
        return status;
    }

    public void setStatus(Enrolment status) {
        this.status = status;
    }

    /**
     * Getters and setter below
     * @return
     */

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

    // check this method
    public void addStudentToSystem(Student student, ArrayList<Student> list){

        list = new ArrayList<>(this.initialCapacity);

        if(list.size() != this.initialCapacity){
            list.add(student);
            System.out.printf("Student %s %s has been added to the system: Student number is : %s ", student.getLastName(), student.getLastName(), student.getStudentNumber());
        }else{
            System.out.println("No more intake for academic year ");
        }
    }


    public static void printAllStudent(ArrayList<Student> list){
        //System.out.println("Students List are per below: ");
        System.out.printf("%-15s %-15s %-10s %-15s  %-12s    %-20s %-10s    %-20s%n",
                "First Name", "Last Name", "Country", "Date of Birth", "Phone Number", "Address", "Status", "International Student");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

        // Print each student in a tabular format
        for (Student s : list) {
            System.out.printf("%-15s %-15s %-10s %-15tF  %-12d    %-20s %-10s      %-35s %n",
                    s.firstName, s.lastName, s.country, s.dateOfBirth, s.phoneNumber, s.address, s.status, s.isInternationalStudent());
        }
    }


    public String createStudentNumber(Date intakeYear){

        String studentNumber = "";

        return studentNumber;
    }
}
