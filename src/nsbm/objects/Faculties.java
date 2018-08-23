
package nsbm.objects;

/**
 *
 * @author ubandara
 */
public class Faculties {
    
    protected String Faculty;
    protected String FacultyId;
    
    public Faculties(){}

    public void setFaculty(String Faculty) {
        this.Faculty = Faculty;
    }//set faculty
    public void setFacultyId(String FacultyId) {
        this.FacultyId = FacultyId;
    }//set faculty id

    public String getFaculty() {
        return Faculty;
    }//get faculty
    public String getFacultyId() {
        return FacultyId;
    }//get faculty id
    
}
