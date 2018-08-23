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
public class UnderGraduate extends Student{

	protected String Course;
	protected String courseId;
	protected String ALsub1;
        protected String ALsub2;
        protected String ALsub3;
        protected String ALsub4;
	protected String Rank;
        protected String ALsub1result;
        protected String ALsub2result;
        protected String ALsub3result;
        protected String ALsub4result;
	
	public UnderGraduate(){}
	
	public void setCourse(String c){
		Course = c;
	}//set course
	public void setCourseId(String i){
		courseId = i;
	}//set cource id
	public void setALsub1(String r){
		ALsub1 = r;
	}//set AL result subject 1
        public void setALsub2(String r){
		ALsub2 = r;
	}//set AL result subject 2
        public void setALsub3(String r){
		ALsub3 = r;
	}//set AL result subject 3
        public void setALsub4(String r){
		ALsub4 = r;
	}//set AL result subject 4
        public void setALsub1re(String r){
		ALsub1result = r;
	}//set AL result subject 1
        public void setALsub2re(String r){
		ALsub2result = r;
	}//set AL result subject 2
        public void setALsub3re(String r){
		ALsub3result = r;
	}//set AL result subject 3
        public void setALsub4re(String r){
		ALsub4result = r;
	}//set AL result subject 4
	public void setRank(String k){
		Rank = k;
	}//set rank
	
	public String getCourse(){
		return Course;
	}//get course
	public String getCourseId(){
		return courseId;
	}//get cource id
	public String getALsub1(){
		return ALsub1;
	}//get AL result subject1
        public String getALsub2(){
		return ALsub2;
	}//get AL result subject2
        public String getALsub3(){
		return ALsub3;
	}//get AL result subject3
        public String getALsub4(){
		return ALsub4;
	}//get AL result subject4
        public String getALsub1re(){
		return ALsub1result;
	}//get AL result subject1
        public String getALsub2re(){
		return ALsub2result;
	}//get AL result subject2
        public String getALsub3re(){
		return ALsub3result;
	}//get AL result subject3
        public String getALsub4re(){
		return ALsub4result;
	}//get AL result subject4
	public String getRank(){
		return Rank;
	}//get rank
	
}//class undergraduate
    

