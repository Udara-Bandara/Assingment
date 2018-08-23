
package nsbm.objects;

/**
 *
 * @author ubandara
 */
public class Faculty_admin {
    
    protected String Username;
    protected String FacultyId;
    protected String UserId;
    protected String password;
    
    public Faculty_admin(){}
    
    public void setUsername(String Username) {
        this.Username = Username;
    }//set user name
    public void setFacultyId(String FacultyId) {
        this.FacultyId = FacultyId;
    }//set faculty id
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }//set user id
    public void setPassword(String password) {
        this.password = password;
    }//set password

    public String getUsername() {
        return Username;
    }//get user name
    public String getFacultyId() {
        return FacultyId;
    }//get faculty id
    public String getUserId() {
        return UserId;
    }//get user id
    public String getPassword() {
        return password;
    }//get password
    

}
