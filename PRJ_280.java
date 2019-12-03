package CMPS280;
import java.util.Scanner;

/*SOME COMMENTS WILL BE DELETED PRIOR TO SUBMISSION  
 */

public class PRJ_280 {
	public static void main (String [] args) {
	

		int num = 0; 
	
//call the scanner object 
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
		
//ask the user for the class name and section number
	section courseInfo = new section(); 

	System.out.print("Please enter the name of your course: " + " " );
		courseInfo.name = (input.nextLine());
		
	System.out.print("Please enter your section number: " + " ");
		courseInfo.secNum = (input.nextInt());
		

//use the exception handling for counting the students 	
try {
		System.out.print("How many students are in " + courseInfo.name + "?");
		num = input.nextInt(); 
		
		{
			throw new StudentNumberException ("Incorrect Input. Please re enter the number of students ");
		}
	
	}catch (StudentNumberException ex) {
		for (int x = 0; x < 2; x++) {
			if (num < 0) {
				System.out.print(ex.getMessage());	
				num = input.nextInt();
			
			}

		}
	
}//end the exception handling   

Scanner input1 = new Scanner (System.in);

//get the student name
System.out.print("Whose grades would you like to see? Please enter a first and last name " + "\n");
String name = input1.nextLine();

studentExtended student1 = new studentExtended();
student1.setFullName(name);

//get the grade for the student

System.out.println("What is the students grade? Please enter an integer.");

int studentGrade = input1.nextInt();

Grades grade1 = new Grades();
grade1.getstudentGrade(studentGrade);

//output		
System.out.print("Out of " + num + " students in class " + courseInfo.name + " for section " + courseInfo.secNum  + "\n" );
System.out.print(student1.fullName + " has a " + studentGrade + grade1.courseGrade );
	
	}//end the program 
}//end the class

