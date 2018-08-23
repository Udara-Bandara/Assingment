/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm.objects;

/**
 *
 * @author ubandara
 */
public class Student extends Person{

	protected String RegNo;
        protected String regYear;
        protected String semester;
        protected String courseId;
        protected String facId;
        protected String subId1;
        protected String subId2;
        protected String subId3;
        protected String subId4;
	
	public Student(){}
	
	public void setRegNo(String n){
		RegNo = n;
	}//set room number
        public void setRegYear(String y){
                regYear = y;
        }//set reg year
        public void setSemester(String s){
                semester = s;
        }//set semester
        public void setCourseId(String i){
                courseId = i;
        }//set course id
        public void setFacId(String f){
                facId = f;
        }//set faculty id
        public void setSubId1(String s){
                subId1 = s;
        }//set subject 1
        public void setSubId2(String s){
                subId2 = s;
        }//set subject 2
        public void setSubId3(String s){
                subId3 = s;
        }//set subject 3
        public void setSubId4(String s){
                subId4 = s;
        }//set subject 4
        
        
	public String  getRegNo(){
		return RegNo;
	}//get teach subjects
        public String getRegYear(){
                return regYear;
        }//get reg year
        public String getSemester(){
                return semester;
        }//get semester
        public String getCourseId(){
                return courseId;
        }//get course id
        public String getFacId(){
                return facId;
        }//get faculty id
        public String getSubId1(){
                return subId1;
        }//get subject1 id
         public String getSubId2(){
                return subId2;
        }//get subject2 id
          public String getSubId3(){
                return subId3;
        }//get subject3 id
           public String getSubId4(){
                return subId4;
        }//get subject4 id
        
        

}//class Student
    
