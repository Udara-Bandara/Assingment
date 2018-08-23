
package nsbm.objects;

/**
 *
 * @author ubandara
 */
public class Person {
    	protected String fName;
        protected String mName;
        protected String lName;
	protected String NIC;
	protected String B_date;
	protected String Sex;
	protected String e_mail;
	protected int Age;
        protected String addressL1;
        protected String addressL2;
        protected String addressL3;
        protected String phone;
	
	public Person(){}
	
	
	public void setfName(String n){
		fName = n;  
	}//set first name
        public void setmName(String n){
		mName = n;  
	}//set middle name
        public void setlName(String n){
		lName = n;  
	}//set last name
	public void setNic(String i){
		NIC = i;  
	}//set nic
	public void setBday(String d){
		B_date = d;
	}//set b date
	public void setSex(String s){
		Sex = s;
	}//set gender
	public void setEmail(String e){
		e_mail = e;
	}//set e mail
	public void setAge(int a){
		Age = a;
	}//set age
        public void setAddressL1(String a){
                addressL1 = a;
        }//set address line 1
         public void setAddressL2(String a){
                addressL2 = a;
        }//set address line 1
          public void setAddressL3(String a){
                addressL3 = a;
        }//set address line 1
        public void setPhone(String p){
                phone = p;
        }//set phone num
        
        
	public String getFname(){
		return fName;
	}//get middle name
        public String getMname(){
		return mName;
	}//get middle name
        public String getLname(){
		return lName;
	}//get last name
	public String getnic(){
		return NIC;
	}//get nic
	public String getBday(){
		return B_date;
	}//get b date
	public String getSex(){
		return Sex;
	}//get sex
	public String getEmail(){
		return e_mail;
	}//get email
	public int getAge(){
		return Age;
	}//get Age 
        public String getAddressL1(){
                return addressL1;
        }//get address line 1
        public String getAddressL2(){
                return addressL2;
        }//get address line 2
        public String getAddressL3(){
                return addressL3;
        }//get address line 3
        public String getPhone(){
                return phone;
        }//get phone num
	
}//class person
    

