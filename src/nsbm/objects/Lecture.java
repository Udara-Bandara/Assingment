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
public class Lecture extends AccStaff{

	protected String teachSub;
	protected String roomNo;
	
	public Lecture(){}
	
	public void setTeachSub(String s){
		teachSub = s;
	}//set subjects
	public void setRoomNo(String r){
		roomNo = r;
	}//set room number
	public String  getTeachSub(){
		return teachSub;
	}//get teach subjects
	public String getRoomNo(){
		return roomNo;
	}//get room number
	

}//Lectture
    

