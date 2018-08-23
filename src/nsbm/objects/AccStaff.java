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
public class AccStaff extends Person{

	protected String empNo;
	
	public AccStaff(){}
	
	public void setEmpNo(String n){
		empNo = n;
	}//set emp number
	public String getEmpNo(){
		return empNo;
	}//get emp number
}//class accademic staff
    

