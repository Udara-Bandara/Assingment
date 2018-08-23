
package nsbm.objects;

/**
 *
 * @author ubandara
 */
public class Course {
    
    protected String Course_name;
    protected String course_id;
    protected String faculty_id;
    protected String duration;
    protected String credit;
    
    public Course(){}

    public void setCourse_name(String Course_name) {
        this.Course_name = Course_name;
    }//set course name
    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }//set course id
    public void setFaculty_id(String faculty_id) {
        this.faculty_id = faculty_id;
    }//set faculty id
    public void setDuration(String duration) {
        this.duration = duration;
    }//set duration
    public void setCredit(String credit) {
        this.credit = credit;
    }//set credit

    public String getCourse_name() {
        return Course_name;
    }//get course name
    public String getCourse_id() {
        return course_id;
    }//get corse id
    public String getFaculty_id() {
        return faculty_id;
    }//get faculty id 
    public String getDuration() {
        return duration;
    }//grt duration
    public String getCredit() {
        return credit;
    }//get credit
    
}
