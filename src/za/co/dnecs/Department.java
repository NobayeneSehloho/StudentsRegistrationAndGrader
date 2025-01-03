package za.co.dnecs;

import java.util.Arrays;
import java.util.List;

public enum Department {
    COMPUTER_SCIENCE(Arrays.asList("Data Structures", "Algorithms", "Operating Systems", "Databases")),
    ELECTRICAL_ENGINEERING(Arrays.asList("Circuit Analysis", "Electromagnetics", "Power Systems", "Control Systems")),
    MECHANICAL_ENGINEERING(Arrays.asList("Thermodynamics", "Fluid Mechanics", "Machine Design", "Manufacturing Processes")),
    CIVIL_ENGINEERING(Arrays.asList("Structural Analysis", "Geotechnical Engineering", "Transportation Engineering", "Construction Management")),
    BUSINESS_ADMINISTRATION(Arrays.asList("Accounting", "Finance", "Marketing", "Organizational Behavior"));

    private final List<String> courses;

    // Constructor
    Department(List<String> courses) {
        this.courses = courses;
    }

    // Getter for courses
    public List<String> getCourses() {
        return courses;
    }
}
