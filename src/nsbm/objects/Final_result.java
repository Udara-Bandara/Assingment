
package nsbm.objects;

/**
 *
 * @author ubandara
 */
public class Final_result {
    
    protected String reg_no;
    protected String sub_id;
    protected String grade;
    
    public Final_result(){}

    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }//set reg number
    public void setSub_id(String sub_id) {
        this.sub_id = sub_id;
    }//set sub id
    public void setGrade(String grade) {
        this.grade = grade;
    }//set grade

    public String getReg_no() {
        return reg_no;
    }//get reg number
    public String getSub_id() {
        return sub_id;
    }//get sub id
    public String getGrade() {
        return grade;
    }//get grade

}
