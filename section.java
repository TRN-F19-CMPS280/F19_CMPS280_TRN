package CMPS280;

//this class inherits from Course and Student Classes  

public class section implements Course {
	
	String name;
	int secNum;  
	
	section (){
		
	}

	
//Overriding constructor 
	public section (String name, int secNum) {
		this.name = name;  
		this.secNum = secNum;
	}
	
		
//These methods get the name of the course. 
	public String getCourseName() {
		return this.name;
	}
	
	
	public void setCourseName(String name) {
		this.name = name; 
	}
	
//These methods get the course section 
	public int getSectionNumber () {
		return this.secNum;
	}
	
	public void setSectionNumber (int secNum) {
		this.secNum = secNum;  
	}	
	
	
	
}//End section class 
	
	


	
	
	
	


