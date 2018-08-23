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
public class Postgraduate extends Student{

	protected String Qualification;
	protected String Institute;
	protected String Year;
	
	public Postgraduate(){}
	
	public void setQualification(String q){
		Qualification = q;
	}//set Qualification
	public void setInstitute(String i){
		Institute = i;
	}//set Institute
	public void setYear(String y){
		Year = y;
	}//set Year
	
	public String getQualification(){
		return Qualification;
	}//get Qualification
	public String getInstitute(){
		return Institute;
	}//get Institute
	public String getYear(){
		return Year;
	}//get Year
	
}//class Postgraduate
    

