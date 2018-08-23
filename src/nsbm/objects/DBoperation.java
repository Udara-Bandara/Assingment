
package nsbm.objects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import nsbm.FRAMES.Administrator.Faculty_details;



public class DBoperation {
    
    String url = "jdbc:mysql://localhost/nsbm";
    String username = "phpmyadmin";
    String password = "some_pass";
    Connection con = null;
    PreparedStatement pst = null;
    Statement st;
    
    
    public void addPostgraduate(Postgraduate ps1) throws SQLException{
       
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO postgraduate_Student VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            pst= (PreparedStatement)con.prepareStatement(query);
            pst.setString(1, ps1.getFname());
            pst.setString(2, ps1.getMname());
            pst.setString(3, ps1.getLname());
            pst.setString(4, ps1.getnic());
            pst.setString(5, ps1.getRegNo());
            pst.setString(6, ps1.getBday());
            pst.setInt(7, ps1.getAge());
            pst.setString(8, ps1.getSex());
            pst.setString(9, ps1.getAddressL1());
            pst.setString(10, ps1.getAddressL2());
            pst.setString(11, ps1.getAddressL3());
            pst.setString(12, ps1.getPhone());
            pst.setString(13, ps1.getEmail());
            pst.setString(14, ps1.getCourseId());
            pst.setString(15, ps1.getFacId());
            pst.setString(16, ps1.getRegYear());
            pst.setString(17, ps1.getSemester());
            pst.setString(18, ps1.getQualification());
            pst.setString(19, ps1.getInstitute());
            pst.setString(20, ps1.getYear());
            pst.setString(21, ps1.getSubId1());
            pst.setString(22, ps1.getSubId2());
            pst.setString(23, ps1.getSubId3());
            pst.setString(24, ps1.getSubId4());
            
            pst.execute();
            
            }catch (SQLException ex) {
                throw new SQLException(ex);
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        con.close();
    }//add postgraduate student
    
    public void addUndergraduate(UnderGraduate us1) throws SQLException{
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO undergraduate_Student VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            pst= (PreparedStatement)con.prepareStatement(query);
            pst.setString(1, us1.getFname());
            pst.setString(2, us1.getMname());
            pst.setString(3, us1.getLname());
            pst.setString(4, us1.getnic());
            pst.setString(5, us1.getRegNo());
            pst.setString(6, us1.getBday());
            pst.setInt(7, us1.getAge());
            pst.setString(8, us1.getSex());
            pst.setString(9, us1.getAddressL1());
            pst.setString(10, us1.getAddressL2());
            pst.setString(11, us1.getAddressL3());
            pst.setString(12, us1.getPhone());
            pst.setString(13, us1.getEmail());
            pst.setString(14, us1.getCourseId());
            pst.setString(15, us1.getFacId());
            pst.setString(16, us1.getALsub1() + " - "+ us1.getALsub1re());
            pst.setString(17, us1.getALsub2() + " - "+ us1.getALsub2re());
            pst.setString(18, us1.getALsub3() + " - "+ us1.getALsub3re());
            pst.setString(19, us1.getALsub4() + " - "+ us1.getALsub4re());
            pst.setString(20, us1.getRegYear());
            pst.setString(21, us1.getSemester());
            pst.setString(22, us1.getRank());
            pst.setString(23, us1.getSubId1());
            pst.setString(24, us1.getSubId2());
            pst.setString(25, us1.getSubId3());
            pst.setString(26, us1.getSubId4());
            
            pst.execute();
            
            }catch (SQLException ex) {
               throw new SQLException(ex);
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        con.close();
    }//add undergraduate student
    
     public void addUndergraduateSubject(Subjects s) throws SQLException{
         
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "INSERT Subject VALUES (?,?,?,?,?,?,?,?,?)";
            
            pst= (PreparedStatement)con.prepareStatement(query);
            pst.setString(1, s.getSub_id());
            pst.setString(2, s.getSubject());
            pst.setString(3, s.getFaculty_id());
            pst.setString(4, "Undergraduate");
            pst.setString(5, s.getCredit());
            pst.setString(6, s.getFee());
            pst.setString(7, s.getLec_id());
            pst.setString(8, s.getIns_id());
            pst.setString(9, s.getCourse_id());
            pst.setString(3, s.getFaculty_id());
            
            
            pst.execute();
            
            }catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         con.close();
     }//add undergraduate subject
     
     public void addPostgraduateSubject(Subjects s) throws SQLException{
         
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "INSERT Subject VALUES (?,?,?,?,?,?,?,?)";
            
            pst= (PreparedStatement)con.prepareStatement(query);
            pst.setString(1, s.getSub_id());
            pst.setString(2, s.getSubject());
            pst.setString(3, s.getFaculty_id());
            pst.setString(4, "Postgraduate");
            pst.setString(5, s.getCredit());
            pst.setString(6, s.getFee());
            pst.setString(7, s.getLec_id());
            pst.setString(8, s.getIns_id());
            pst.setString(9, s.getCourse_id());
            
            
            pst.execute();
            
            }catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         con.close();
     }//add Postgraduate subject
     
     public void addUndergraduateCourse(Course c) throws SQLException{
         
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "INSERT Course VALUES (?,?,?,?,?,?)";
            
            pst= (PreparedStatement)con.prepareStatement(query);
            pst.setString(1, c.getCourse_id());
            pst.setString(2, c.getCourse_name());
            pst.setString(3, c.getDuration());
            pst.setString(4, c.getCredit());
            pst.setString(5, c.getFaculty_id());
            pst.setString(6, "Undergraduate");
            
            
            pst.execute();
            
            }catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         con.close();
     
     }//add Undergraduate Course
     
     public void addPostgraduateCourse(Course c) throws SQLException{
         
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "INSERT Course VALUES (?,?,?,?,?,?)";
            
            pst= (PreparedStatement)con.prepareStatement(query);
            pst.setString(1, c.getCourse_id());
            pst.setString(2, c.getCourse_name());
            pst.setString(3, c.getDuration());
            pst.setString(4, c.getCredit());
            pst.setString(5, c.getFaculty_id());
            pst.setString(6, "Postgraduate");
            
            
            pst.execute();
            
            }catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         con.close();
     }//add postgraduate Course
     
     
     public void addUndergraduateEvaluation(Evaluation_details e) throws SQLException{
        /*System.out.println(e.getEvo_id());
        System.out.println(e.getEvo_name());
        System.out.println(e.getEvo_type());
        System.out.println(e.getF_id());
        System.out.println(e.getSub_id());*/
        
         
         
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO Evaluation_detail VALUES (?,?,?,?,?,?)";
            
            pst= (PreparedStatement)con.prepareStatement(query);
           
            pst.setString(1, e.getEvo_id());
            pst.setString(2, e.getEvo_name());
            pst.setString(3, "Undergraduate");
            pst.setString(4, e.getEvo_type());
            pst.setString(5, e.getSub_id());
            pst.setString(6, e.getF_id());
            
            
            pst.execute();
            
            }catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         con.close();
     
     }//add Undergraduate evaluation
     
     public void addPostgraduateEvaluation(Evaluation_details e) throws SQLException{
         
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO Evaluation_detail VALUES (?,?,?,?,?,?)";
            
            pst= (PreparedStatement)con.prepareStatement(query);
            pst.setString(1, e.getEvo_id());
            pst.setString(2, e.getEvo_name());
            pst.setString(3, "Postgraduate");
            pst.setString(4, e.getEvo_type());
            pst.setString(5, e.getSub_id());
            pst.setString(6, e.getF_id());
            
            
            pst.execute();
            
            }catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         con.close();
     
     }//add Postgraduate evaluation
     
     
     
     public void addFaculty(Faculties f) throws SQLException{
        
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "INSERT Faculties VALUES (?,?)";
            
            pst= (PreparedStatement)con.prepareStatement(query);
            pst.setString(1, f.getFacultyId());
            pst.setString(2, f.getFaculty());
            
            pst.execute();
            
            }catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         con.close();
     }//add faculty
     
     public void addFacultyAdmin(Faculty_admin fa) throws SQLException{
         
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "INSERT Faculty_admin VALUES (?,?,?,?)";
            
            pst= (PreparedStatement)con.prepareStatement(query);
            pst.setString(1, fa.getUsername());
            pst.setString(2, fa.getPassword());
            pst.setString(3, fa.getUserId());
            pst.setString(4, fa.getFacultyId());
            
            
            pst.execute();
            
            }catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        con.close(); 
     }//add faculty admin
    
     public void addLecture(Lecture l) throws SQLException{
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO Lecture_details VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            
            pst= (PreparedStatement)con.prepareStatement(query);
            pst.setString(1, l.getFname());
            pst.setString(2, l.getMname());
            pst.setString(3, l.getLname());
            pst.setString(4, l.getnic());
            pst.setString(5, l.getEmpNo());
            pst.setString(6, l.getSex());
            pst.setString(7, l.getBday());
            pst.setString(8, l.getAddressL1());
            pst.setString(9, l.getAddressL2());
            pst.setString(10, l.getAddressL3());
            pst.setString(11, l.getEmail());
            pst.setString(12, l.getPhone());
            
            pst.execute();
            
            }catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         con.close();
     }//add lecture
     
     public void addInstructors(Instructors i) throws SQLException{
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO Instructor_details VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            
            pst= (PreparedStatement)con.prepareStatement(query);
            pst.setString(1, i.getFname());
            pst.setString(2, i.getMname());
            pst.setString(3, i.getLname());
            pst.setString(4, i.getnic());
            pst.setString(5, i.getEmpNo());
            pst.setString(6, i.getSex());
            pst.setString(7, i.getBday());
            pst.setString(8, i.getAddressL1());
            pst.setString(9, i.getAddressL2());
            pst.setString(10, i.getAddressL3());
            pst.setString(11, i.getEmail());
            pst.setString(12, i.getPhone());
            
            pst.execute();
            
            }catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         con.close();
     }//add Instructor
     
     
     
     public boolean chekInfo(String table,String id,String user,String pass) throws SQLException{
         
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "select User,password from "+table+" where f_id='"+id+"' and User='"+user+"';";
            
            pst= (PreparedStatement)con.prepareStatement(query);
            
            ResultSet rs = pst.executeQuery();
            
           rs.first();
           if(rs.getString(2).equals(pass)){
                return true;
            }

            }catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         con.close();
        return false;    
         
     }//chek infomation
     
     
     public ResultSet viewFaculty() throws SQLException{
         ResultSet rs=null;
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "SELECT f_name, f_id  FROM Faculties";
            
            
            st= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(query);
            
             }catch (SQLException ex) {
                //throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }//view faculty
     
     public ResultSet viewFacultyAdmin() throws SQLException{
         ResultSet rs=null;
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "SELECT User AS Faculty, user_id, f_id FROM Faculty_admin";
            
            
            st= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(query);
            
             }catch (SQLException ex) {
                //throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }//view faculty admins
     
     public ResultSet viewLecture() throws SQLException{
         ResultSet rs=null;
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "SELECT F_name, nic, lec_id, Gender, b_date, address_line1, email, phone_no FROM Lecture_details";
            
            
            st= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(query);
            
             }catch (SQLException ex) {
                //throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }//view lecture
     
     
     public ResultSet viewInstructor() throws SQLException{
         ResultSet rs=null;
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "SELECT F_name, nic, Ins_id, Gender, b_date, address_line1, email, phone_no FROM Instructor_details";
            
            
            st= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(query);
            
             }catch (SQLException ex) {
                //throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }//view instructors
     
     
      public ResultSet viewPGstudent(String fac) throws SQLException{
         ResultSet rs=null;
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "SELECT F_name, nic, reg_no, b_date, Age, gender,"
                    + " address_line1, phone_no, email,course_id, registor_year,"
                    + "registor_semestor, Q_type, institute, completion_year, sub1_id,"
                    + " sub2_id,sub3_id, sub4_id  FROM postgraduate_Student WHERE f_id ='"+fac+"'";
            
            
            st= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(query);
            
             }catch (SQLException ex) {
                //throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }//view postgraduate student
      
      
      public ResultSet viewUGstudent(String fac) throws SQLException{
         ResultSet rs=null;
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "SELECT F_name, nic, reg_no, b_date, Age, gender, "
                    + "address_line1, phone_no, email,course_id, AL_sub1, AL_sub2,"
                    + " AL_sub3, AL_sub4, registor_year, registor_semester, i_rank,"
                    + " sub1_id, sub2_id,sub3_id, sub4_id  FROM undergraduate_Student WHERE f_id = '"+fac+"'";
            
            
            st= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(query);
            
             }catch (SQLException ex) {
                //throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }//view under graduatestudent
      
      
      public ResultSet viewPGcourse(String fac) throws SQLException{
         ResultSet rs=null;
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "SELECT course_name , course_id, duration, credit  FROM Course WHERE f_id = '"+fac+"' and Programme = 'Postgraduate'";
            
            
            st= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(query);
            
             }catch (SQLException ex) {
                //throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }//view postgraduate courses
      
      
      public ResultSet viewUGcourse(String fac) throws SQLException{
         ResultSet rs=null;
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "SELECT course_name, course_id, duration, credit  FROM Course WHERE f_id = '"+fac+"' and Programme = 'Undergraduate'";
            
            
            st= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(query);
            
             }catch (SQLException ex) {
                //throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }//view undergraduate courses
      
      
      public ResultSet viewPGsubject(String fac) throws SQLException{
         ResultSet rs=null;
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "SELECT sub_name, sub_id, course_id, credit, fee, lec_id, Ins_id, course_id  FROM Subject WHERE f_id = '"+fac+"'";
            
            
            st= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(query);
            
             }catch (SQLException ex) {
                //throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }//view postgraduate subjects
      
      
      public ResultSet viewUGsubject(String fac) throws SQLException{
         ResultSet rs=null;
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "SELECT sub_name, sub_id, course_id, credit, fee, lec_id, Ins_id, course_id  FROM Subject WHERE f_id = '"+fac+"'";
            
            
            st= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(query);
            
             }catch (SQLException ex) {
                //throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }//view undergraduate subjects
      
      
      public ResultSet viewUGevaluation(String type,String fac) throws SQLException{
         ResultSet rs=null;
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "SELECT evo_name, evo_id, type, sub_id  FROM Evaluation_detail "
                    + "WHERE type='"+type+"' and f_id = '"+fac+"' and Programme = 'Undergraduate'";
            
            
            st= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(query);
            
             }catch (SQLException ex) {
                //throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }//view undergraduate evaluations
      
      
      public ResultSet viewPGevaluation(String type,String fac) throws SQLException{
         ResultSet rs=null;
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "SELECT evo_name, evo_id, type, sub_id  FROM Evaluation_detail "
                    + "WHERE type='"+type+"' and f_id = '"+fac+"' and Programme = 'Postgraduate'";
            
            
            st= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(query);
            
             }catch (SQLException ex) {
                //throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }//view postgraduate evaluations
      
      
      
      public ResultSet viewUGOnestudent(String t) throws SQLException{
         ResultSet rs=null;
         System.out.println(t);
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "SELECT F_name, L_name, nic, reg_no, b_date, gender, address_line3, phone_no, email  FROM undergraduate_Student WHERE reg_no ='"+t+"'";
            
            
            st= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(query);
            
             }catch (SQLException ex) {
                //throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }//view undergraduate one student deatils
      
      public ResultSet viewUGOnestuQulification(String t) throws SQLException{
         ResultSet rs=null;
         System.out.println(t);
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "SELECT AL_sub1, AL_sub2, AL_sub3, AL_sub4, i_rank  FROM undergraduate_Student WHERE reg_no ='"+t+"'";
            
            
            st= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(query);
            
             }catch (SQLException ex) {
                //throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }//view undergraduate one student qualification
       
     public ResultSet viewUGOnestuSubject(String t) throws SQLException{
         ResultSet rs=null;
         System.out.println(t);
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "SELECT registor_year, registor_semester, sub1_id, sub2_id, sub3_id, sub4_id FROM undergraduate_Student WHERE reg_no ='"+t+"'";
            
            
            st= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(query);
            
             }catch (SQLException ex) {System.out.println(ex);
                //throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }//view undergraduate one student subjects
     
     
     
     public void deleteStudent(String table,String id) throws SQLException{
         
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM "+table+" WHERE reg_no = '"+id+"'";
            
            pst= (PreparedStatement)con.prepareStatement(query);
            
            pst.execute();
            

            }catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         con.close();    
     }//delete student
     
     public void deleteEvaluation(String table,String id) throws SQLException{
         
         try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
            String query = "DELETE FROM "+table+" WHERE evo_id = '"+id+"'";
            
            pst= (PreparedStatement)con.prepareStatement(query);
            
            pst.execute();
            

            }catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBoperation.class.getName()).log(Level.SEVERE, null, ex);
        }
         con.close();    
     }//delete student
     
     
     
     
     
     
     
     
}//class

       








    
    