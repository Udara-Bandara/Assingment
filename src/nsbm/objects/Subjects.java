
package nsbm.objects;

/**
 *
 * @author ubandara
 */
public class Subjects {
    
    protected String subject;
    protected String sub_id;
    protected String programme;
    protected String credit;
    protected String Fee;
    protected String lec_id;
    protected String Ins_id;
    protected String course_id;
    protected String faculty_id;
    
    public Subjects(){}

    public void setSubject(String subject) {
        this.subject = subject;
    }//set subject name
    public void setSub_id(String sub_id) {
        this.sub_id = sub_id;
    }//set subject id
    public void setProgramme(String programme) {
        this.programme = programme;
    }//set programme
    public void setCredit(String credit) {
        this.credit = credit;
    }//set credt
    public void setFee(String Fee) {
        this.Fee = Fee;
    }//set fee
    public void setLec_id(String lec_id) {
        this.lec_id = lec_id;
    }//set lecture id
    public void setIns_id(String Ins_id) {
        this.Ins_id = Ins_id;
    }//set instructor id
    public void setCourse_id(String cource_id) {
        this.course_id = cource_id;
    }//set course id
    public void setFaculty_id(String faculty_id) {
        this.faculty_id = faculty_id;
    }//set faculty id

    public String getSubject() {
        return subject;
    }//get subject
    public String getSub_id() {
        return sub_id;
    }//get subject id
    public String getProgramme() {
        return programme;
    }//get programme
    public String getCredit() {
        return credit;
    }//get credit
    public String getFee() {
        return Fee;
    }//get fee
    public String getLec_id() {
        return lec_id;
    }//get lecture id
    public String getIns_id() {
        return Ins_id;
    }//get instruator id
    public String getCourse_id() {
        return course_id;
    }//get corse id
    public String getFaculty_id() {
        return faculty_id;
    }//get faculty id
    
       
}
