
package nsbm.objects;

/**
 *
 * @author ubandara
 */
public class Evaluation_details {
    
    protected String evo_id;
    protected String evo_name;
    protected String evo_type;
    protected String sub_id;
    protected String f_id;
    
    public Evaluation_details(){}

    public void setEvo_id(String id) {
        this.evo_id = id;
    }//set evalution id
    public void setEvo_name(String name) {
        this.evo_name = name;
    }//set evalution name
    public void setEvo_type(String type) {
        this.evo_type = type;
    }//set evalution type
    public void setSub_id(String subject) {
        this.sub_id = subject;
    }//set subject id
    public void setF_id(String faculty) {
        this.f_id = faculty;
    }//set faculty id

    public String getEvo_id() {
        return evo_id;
    }//get evalution id
    public String getEvo_name() {
        return evo_name;
    }//get evalution name
    public String getEvo_type() {
        return evo_type;
    }//get evalution type
    public String getSub_id() {
        return sub_id;
    }//get subject id
    public String getF_id() {
        return f_id;
    }//get faculty id
    
}
