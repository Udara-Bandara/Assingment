
package nsbm.objects;

/**
 *
 * @author ubandara
 */
public class Evaluation_result {
    
    protected String reg_no;
    protected String grade;
    protected String evo_id;
    
    public Evaluation_result(){}

    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }//set reg number
    public void setGrade(String grade) {
        this.grade = grade;
    }//set grade
    public void setAss_id(String id) {
        this.evo_id = id;
    }//set assingment id

    public String getReg_no() {
        return reg_no;
    }//get reg number
    public String getGrade() {
        return grade;
    }//get gradde
    public String getAss_id() {
        return evo_id;
    }//get assingment id
    
    
    
    
}
