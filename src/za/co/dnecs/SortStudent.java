package za.co.dnecs;

import java.util.ArrayList;
import java.util.Comparator;

public class SortStudent {


    /**
     *
     * BUBBLE SORT to sort students by forst names
     *
     * @param studentList
     * @param compareByFirstNames
     * @return
     */
    public ArrayList<Student> sortByFirstName(ArrayList<Student> studentList, Comparator<Student> compareByFirstNames){
        ArrayList<Student> sortedByFirstName = new ArrayList<>(studentList);

        int count = studentList.size();
        boolean swapped;
        Student temp;

        for(int i = 0; i < count - 1; i++ ){
            swapped = false;
            for(int j = 0; j < count - 1 - i; j++){
                if(compareByFirstNames.compare(sortedByFirstName.get(j), sortedByFirstName.get(j+1)) > 0){
                    temp = sortedByFirstName.get(j);
                    sortedByFirstName.set(j, sortedByFirstName.get(j+1));
                    sortedByFirstName.set(j+1, temp);
                    swapped = true;
                }
            }
            // If no swaps were made, the list is already sorted
            if (!swapped) {
                break;
            }
        }
        return sortedByFirstName;
    }



    /**
     *
     *
     * INSERTION SORT to sort students by last names
     * @param studentList
     * @param compareByLastNames
     * @return
     */



    /**
     *
     *
     * SELECTION SORT to sort students by enrolment status
     * @param studentList
     * @param compareByEnrolmentStatus
     * @return
     */



    /**
     *
     *
     * MERGE SORT to sort students by country of origin
     * @param studentList
     * @param compareByCountryOfOrigin
     * @return
     */



    /**
     *
     *
     * QUICK SORT to sort students by registration date
     * @param studentList
     * @param compareByRegistrationDate
     * @return
     */

}
