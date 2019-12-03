package CMPS280;


public class Grades {
	
	public int studentGrade;
	char courseGrade;
	
//constructor 
	public Grades() {
		
	}
	
	public char getstudentGrade(int studentGrade) {
				

		if(studentGrade >= 90) {
			return courseGrade = 'A';
		}else if (studentGrade >= 80 && studentGrade < 90) {
			return courseGrade = 'B';
		}else if (studentGrade >= 70 && studentGrade < 80) {
			 return courseGrade = 'C';

		}else if (studentGrade >= 60 && studentGrade < 70) {
			 return courseGrade = 'D';
			
		}else if (studentGrade >= 50 && studentGrade < 60) {
			return courseGrade = 'F';

		} else 
		
			return courseGrade;
		}
		
	}//end the grades class 


	
	
	

